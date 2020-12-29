import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restrain restrain = new Restrain();
        FileMenu filemenu = new FileMenu();
        int pointMenu;
        do {
            System.out.println("1: Меню");
            System.out.println("2: Заказать столик");
            System.out.println("3:Просмотр статуса столиков");
            System.out.println("4: Запись в файл");
            System.out.println("5: Чтение из файла");
            System.out.println("6:Выход");
            pointMenu = sc.nextInt();
            sc.nextLine();
            switch (pointMenu) {
                case 1:
                    for (Menu menu : restrain.getMenu()) {
                        System.out.println(menu);
                    }
                    break;
                case 2: {
                    System.out.println("Выбор столика" + " \n  1, 2, 3");
                    String tableName = sc.nextLine();
                    for (Table table : restrain.getTables()) {
                        if (table.getNameTable().equals(tableName)) {
                            table.setStatus(TableStatus.RESERVED);
                        }
                    }
                    System.out.println("Выбор блюда");
                    for (Menu menu : restrain.getMenu()) {
                        System.out.println(menu);
                    }
                    System.out.println("Название блюда ");
                    String m = sc.nextLine();
                }
                break;
                case 3: {
                    for (Table tables : restrain.getTables()) {
                        System.out.println(tables);
                    }
                    break;
                }
                case 4: {
                    filemenu.SerelizeFile();

                }break;
                case 5:{
                    filemenu.SerFile();
                }break;



            }
        } while (pointMenu != 6);


    }

}

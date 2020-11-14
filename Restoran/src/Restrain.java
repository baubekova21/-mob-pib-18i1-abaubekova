public class Restrain {
    private final Menu[] menu;
    private final Table[] tables;

    public Restrain() {
        this.menu = new Menu[]{
                new Menu(1,"Устрицы", 1500.00),
                new Menu(2,"Роллы", 1200.00),
                new Menu(3,"Пицца", 1000.00),
                new Menu(4,"Бургеры",800.00),
                new Menu(5,"Цезарь", 600.00)
        };
        this.tables = new Table[]{
                new Table("1",1000),
                new Table("2", 2000),
                new Table("3", 3000)
        };
    }
    public Menu[] getMenu() {
        return menu;
    }

    public Table[] getTables() {
        return tables;
    }
}


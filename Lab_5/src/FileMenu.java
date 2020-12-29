import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileMenu {
    public void SerelizeFile() {
        Restrain rest = new Restrain();
        try (FileWriter writer = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\Restoran\\menu.txt")) {
            for (Menu menu : rest.getMenu()) {
                String name = menu.getName();
                String price = String.valueOf(menu.getPrice());


                writer.write(name + " " + price + File.separator);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void SerFile() {
        try (FileInputStream menu = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\Restoran\\menu.txt")) {
            System.out.printf("File size: %d bytes \n", menu.available());
            int i = -1;
            while ((i = menu.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
import javax.sound.sampled.Line;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int att=0; // Накопитель количество верно указанных путей.
        while(true){ // Бесконечный цикл, запрашивает путь к файлу. Если путь не верный - цикл повторяется
            System.out.println("Укажите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file=new File(path);
            boolean fileExists=file.exists();
            boolean isDirectory=file.isDirectory();
            boolean isFile=file.isFile();
            if(fileExists&&isDirectory){
                System.out.println("Путь указан верно");
            }
            else if(isFile){
                System.out.println("Путь указан верно. Файл по данному пути присутствует");
                att++;
                System.out.println("Этот файл номер "+att);
            }else System.out.println("Путь указан неверно");
        }

    }
}

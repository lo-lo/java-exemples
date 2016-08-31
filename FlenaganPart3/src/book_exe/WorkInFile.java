package book_exe;
/**
 * Класс использует методы, описанные в утилитном классе FileWorker
 */

import java.io.FileNotFoundException;

public class WorkInFile {

    private static String text = "This new text \nThis new text2 \nThis new text3 \n";
    //private static String text = "";
    private static String fileName = "C:\\Nastya\\Java\\JavaVPrimerakh\\FlenaganPart3\\src\\Files\\codesDel6.txt";

    public static void main(String[] args) throws FileNotFoundException{
        //запись в файл
        FileWorker.write(fileName, text);

        //попытка прочитать не существующий файл
        //FileWorker.read("no_file.txt");

        //чтение файла
        String textFromFile = FileWorker.read(fileName);
        System.out.println(textFromFile);


        //обновление файла
        FileWorker.update(fileName, "This new text after update file");

        //снова чтение файла после обновления
        textFromFile = FileWorker.read(fileName);
        System.out.println(textFromFile);

        //удаление файла
        FileWorker.delete(fileName);


    }
}

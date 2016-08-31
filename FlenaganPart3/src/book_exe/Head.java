package book_exe;

import java.io.*;
import java.io.File;

/**
 * программа распечатывает первые 10 строк каждого заданного в командной строке файла
 * Отображение текстового файла, содеожимое которого требуется просмотреть
 */


public class Head {

    public static void main(String[] args) {

        //убеждаемся, что аргументы командной строки заданы, т.е. длмна массива не должна быть == 0, иначе
        if (args.length == 0) {
            System.out.println("Usage: ShowFile File");
            return;
        } else {

            for (int ifin = 0; ifin < args.length; ifin++) {
                try {
                    System.out.print("Введите количество строк для вывода > ");
                    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                    String count = in.readLine();
                    int countString = Integer.parseInt(count);
                    System.out.println(args[ifin] + " > ");

                    showHead(args[ifin], countString);
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }

            }
        }

    }


    public static void showHead(String file_name, int countString) throws IOException {
        int countStr = countString;

        File file_in = new File("C:\\Nastya\\Java\\JavaVPrimerakh\\FlenaganPart3\\src\\Files",file_name); //из объекта строка получаем объект файл

        /*
        // проверяем, что файл существует
        if(!file_name.exists())
            abort("нет такого файла > " + file_name);
        if(!file_name.canRead()){
            abort("файл не доступен для чтения >" + file_name);
        }
        */


        //BufferedReader in = new BufferedReader(new InputStreamReader());
        // String line = in.readLine();
        //FileInputStream fin = null; //поток для чтения

        //try(FileInputStream fin = new FileInputStream(file_in)){
        // try (BufferedReader inLine = new BufferedReader(new FileReader(file_in));){
        // BufferedReader inLine = new BufferedReader(new InputStreamReader(fin));
        // Buffer6edReader inLine = new BufferedReader(new FileReader(file_name));


        try{
        BufferedReader inLine = new BufferedReader(new FileReader(file_in));
        while (countStr > 0 && file_in != null) {
            String line = inLine.readLine();
            if(line!=null) {
                System.out.println(line);
                //countStr -= 1;
            }
            countStr -= 1;
        }
        }catch (IOException exc){System.out.println("I/O Error: "+exc);}
        // System.out.println();

    }
}



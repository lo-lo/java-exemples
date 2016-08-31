package book_exe;
import java.io.*;

/**
 * Класс содержит методы для работы с файлами. Запись, чтение, обновление, удаление файла.
 */

public class FileWorker {

    //Запись в файл
    public static void write(String fileName, String text) throws FileNotFoundException {
        //Определяем файл
        File file = new File(fileName);
        try{
            //проверяем, существует ли файл. Если нет, то создаем его
            if(!file.exists()){
                file.createNewFile();
            }
            //PrintWriter обеспечит возможность записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                //записываем текст в файл
                out.print(text);
            }finally {
                //должны закрыть файл, иначе он не запишется
                out.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Чтение файла
    public static String read(String fileName) throws FileNotFoundException {
        //создаем объект для построения строки
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        if(!file.exists()){
            throw new FileNotFoundException(file.getName());
        }

        //exists(fileName);

        try {
            //создаем объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //закрываем файл
                in.close();
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
            //возвращаем считанный текст файла
        return sb.toString();
        }

    //метод проверяет существование файла
    private static void exists(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        if(!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }

    //метод перезаписывает файл
    public static void update(String nameFile, String newText) throws FileNotFoundException{
        exists(nameFile);
        StringBuilder sb = new StringBuilder();
        String oldFile = read(nameFile);
        sb.append(oldFile);
        sb.append(newText);
        write(nameFile, sb.toString());
    }

    //метод удаляет файл
    public static void delete(String nameFile) throws FileNotFoundException{
        exists(nameFile);
        new File(nameFile).delete();
    }



}



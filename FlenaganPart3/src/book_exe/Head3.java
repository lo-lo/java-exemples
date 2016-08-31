package book_exe;

import java.io.*;

/**
 * программа выводит все строки файла, а не указанное количество!!
 */
public class Head3 {

    public static void main(String[] args) {

        //String dir = System.getProperty("user.dir");

        //убеждаемся, что аргументы командной строки заданы, т.е. длмна массива не должна быть == 0, иначе
        if (args.length == 0) {
            System.out.println("Usage: ShowFile File");
            return;
        } else {

            for (int ifin = 0; ifin < args.length; ifin++) {
                try{
                    System.out.print("Введите количество строк для вывода > ");
                    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                    String count = in.readLine();
                    int countString = Integer.parseInt(count);
                    System.out.println(args[ifin]+" > ");

                    showHead(args[ifin], countString); }
                catch (IOException e){System.err.println(e.getMessage());}


            }
        }

    }


    public static void showHead(String file_name, int countString)throws IOException
    {
        int countStr = countString;
        if((file_name==null)||(file_name.length()==0)) return;

         //из объкта строка получаем объект файл
        File file_in = new File("C:\\Nastya\\Java\\JavaVPrimerakh\\FlenaganPart3\\src\\Files", file_name);
//twr
        try(FileReader in = new FileReader(file_in)){
            char[] buffer = new char[4096];
       int len;
       while ((len = in.read(buffer))!= -1 && (countStr>0)) {

            String s = new String(buffer, 0, len);
            System.out.println(s);
            countStr--;
        }
        }catch (IOException exc){
            System.out.println("I/O Error: "+exc);
        }


    }
}



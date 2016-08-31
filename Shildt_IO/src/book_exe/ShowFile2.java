package book_exe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * В этой версии программы отображения текстового файла код, открывающий файл и получающий к нему доступ,
 * заключается в единый блок try, а закрывается файл в блоке finally
 *
 */
public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        //
        if(args.length !=1){
            System.out.println("Usage: ShowFile File");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do{
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            } while (i != -1);
        }
        // исключение FileNotFoundException является подклассом исключения IOException, и поэтому
        // его не нужно перехватывать отдельно
       /* catch (FileNotFoundException exc){
            System.out.println("File Not Found");
            return;
        }
        */
        catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        }
        finally {
            try {
                if(fin != null) fin.close();
            }
            catch (IOException exc){
                System.out.println("Error closing file.");
            }
        }

    }
}



package book_exe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * В этой версии программы используется оператор try с ресурсами. Демонстрируется управление двумя ресурсами
 */

public class CopyFile2 {
    public static void main(String[] args) throws IOException {

        int i;
        if(args.length != 2){
            System.out.println("USAGE: CopyFile From To");
            return;
        }
        //
        try(FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            }while (i != -1);
        }
        catch (IOException exc){
            System.out.println("I/O Error: "+exc);
        }
    }
}

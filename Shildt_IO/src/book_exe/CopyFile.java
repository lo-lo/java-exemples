package book_exe;

import java.io.*;

/**
 * Копирование текстового файла. При вызове этой программы следует указать
 * имя исходного и целевого файлов:
 * java CopyFile FIRST.TXT SECOND.TXT
 */

public class CopyFile {
    public static void main(String[] args) {

        int i;
        FileInputStream fin;
        FileOutputStream fout;

        if(args.length != 2){
            System.out.println("USAGE: CopyFile From To");
            return;
        }
        //
        try {
            fin = new FileInputStream(args[0]);
        }catch (FileNotFoundException exc){
            System.out.println("Input File Not Found");
            return;
        }
        //
        try {
            fout = new FileOutputStream(args[1]);
        }catch (FileNotFoundException exc){
            System.out.println("Error Opening Output File");
            //
            try {
            fin.close();
            }catch (IOException exc2){
                System.out.println("Error closing input file.");
            }
            return;
        }
        //
        try {
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            }while (i != -1);
            }catch (IOException exc){
            System.out.println("File Error");
        }
        try {
            fin.close();
        }catch (IOException exc){
            System.out.println("Error closing input file.");
        }

        try {
            fout.close();
        }catch (IOException exc){
            System.out.println("Error closing output file.");
        }

    }
}

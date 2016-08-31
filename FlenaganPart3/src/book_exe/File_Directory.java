package book_exe; /**
 * распечатка дерева данного каталога
 */


import java.util.*;
import java.io.*;
public class File_Directory {
    //main procedure
    public static void main (String[] arg){
        Scanner scanner=new Scanner (System.in);

        System.out.println("Enter directory: ");
        String Path=scanner.nextLine();
        printTreeFiles(Path);
    }

    public static void printTreeFiles(String Path){
        File Directory = new File (Path);

        if (Directory.exists()){
            getContent(Directory,0);
        }
        else System.out.println("Directory is not found...");
    }
    //recursive procedure for finding the contents of a directory
    public static void getContent(File Directory,int Indents)
    {
        for (int i=0;i<Indents;i++) System.out.print("\t");

        if (Directory.isFile()) System.out.println(Directory.getName());
        else {
            System.out.println(Directory.getName());
            File[] SubDirectory = Directory.listFiles();
            for (File SubWay:SubDirectory)
                getContent(SubWay,Indents+1);
        }
    }
}

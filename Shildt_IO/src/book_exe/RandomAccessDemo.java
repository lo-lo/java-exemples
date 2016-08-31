package book_exe;

/**
 * Произвольный доступ к файлам. Значение занимает 8 байтов. На позиции нулевого байта - первое числовое значение,
 * на позиции 8-го байта - второе числовое значение и т.д.
 */

import java.io.*;
public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        try(RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++){
                raf.writeDouble(data[i]);
            }

            raf.seek(0);                        //найти первое значение
            d = raf.readDouble();
            System.out.println("First value is: "+d);

            raf.seek(8);                        //найти второе зачение
            d = raf.readDouble();
            System.out.println("Second value is: "+d);

            raf.seek(8*3);                      //найти четвертое значение
            d = raf.readDouble();
            System.out.println("Fourth value is: "+d);

            System.out.println();

            System.out.println("Here is every other value: ");
            for (int i = 0; i < data.length; i += 2){
                raf.seek(8*i);                     //найти i+1 значение (начинается с 0, т.е. 1-е значение 0+1, где 0 - это i
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch (IOException exc){
            System.out.println("I/O Error: "+ exc);
        }
    }
}

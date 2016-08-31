package book_exe;

import sun.nio.cs.KOI8_R;

/**
 * Создание кириллических строк.
 */
public class StringTest {
    public static void main(String[] args) {
        String winLikeWin = null, winLikeDOS = null, winLikeUNIX = null;
        String dosLikeWin = null, dosLikeDOS = null, dosLikeUNIX = null;
        String unixLikeWin = null, unixLikeDOS = null, unixLikeUNIX = null;
        String msg = null;
        byte[] byteCp1251 = {(byte)0xD0, (byte)0xEE, (byte)0xF1, (byte)0xF1, (byte)0xE5, (byte)0xFF};
        byte[] byteCp866 = {(byte)0x90, (byte)0xAE, (byte)0xE1, (byte)0xE1, (byte)0xA8, (byte)0xEF};
        byte[] byteCpKOISR = {(byte)0xF2, (byte)0xCF, (byte)0xD3, (byte)0xD3, (byte)0xC9, (byte)0xD1};
        char[] c = new char[]{'Р', 'о', 'с', 'с', 'и', 'я'};
        //char[] c = {'Р', 'о', 'с', 'с', 'и', 'я'};
        String s1 = new String(c);  //создание строки из массива символов
        String s2 = new String(byteCp866);   // для консоли MS Windows строка создается из массива байтов Ср866
        String s3 = "Россия";  //  создается ссылка на строку-константу
        System.out.println();
        try{
            //Сообщение в Cp866 для вывода на консоль MS Windows. В консольное окно ОС текст выводится в кодровке СР866
            // Чтобы это учесть, слова "\"Россия\" в" преобразованы в массив байтов, содержащий символы в кодировке
            //         СР866, а затем переведены в строку msg.
            msg = new String("\"Россия\" в ".getBytes("Cp866"), "Cp1251");

            //String(массив байтов в соответсвующей кодировке, кодировка)
            winLikeWin = new String(byteCp1251, "Cp1251");   //правильно
            winLikeDOS = new String(byteCp1251, "Cp866");
            winLikeUNIX = new String(byteCp1251, "KOI8-R");

            dosLikeWin = new String(byteCp866, "Cp1251");    //ДЛЯ КОНСОЛИ
            dosLikeDOS = new String(byteCp866, "Cp866");     //правильно
            dosLikeUNIX = new String(byteCp866, "KOI8-R");

            unixLikeWin = new String(byteCpKOISR, "Cp1251");
            unixLikeDOS = new String(byteCpKOISR, "Cp866");
            unixLikeUNIX = new String(byteCpKOISR, "KOI8-R");  //правильно

            System.out.print(msg + "Cp1251: ");
            System.out.write(byteCp1251);
            System.out.println();

            System.out.print(msg + "Cp866: ");
            System.out.write(byteCp866);
            System.out.println();

            System.out.print(msg + "KOI8-R: ");
            System.out.write(byteCpKOISR);
            System.out.println();

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
        System.out.println();
        System.out.println(msg + "char array           : " + s1);
        System.out.println(msg + "default encoding     : " + s2);
        System.out.println(msg + "string constant      : " + s3);
        System.out.println();

        //правильные символы Unicode кириллицы получаются, если использовать ту же кодовую таблицу,
        //в которой записан исходный массив байтов.
        System.out.println(msg + "Cp1251 -> Cp1251: " + winLikeWin);
        System.out.println(msg + "Cp1251 -> Cp866:  " + winLikeDOS);
        System.out.println(msg + "Cp1251 -> KOI8-R: " + winLikeUNIX);
        System.out.println();
        System.out.println(msg + "Cp866 -> Cp1251: " + dosLikeWin);
        System.out.println(msg + "Cp866 -> Cp866:  " + dosLikeDOS);
        System.out.println(msg + "Cp866 -> KOI8-R: " + dosLikeUNIX);
        System.out.println();
        System.out.println(msg + "KOI8-R -> Cp1251: " + unixLikeWin);
        System.out.println(msg + "KOI8-R -> Cp866:  " + unixLikeDOS);
        System.out.println(msg + "KOI8-R -> KOI8-R: " + unixLikeUNIX);
        System.out.println();

    }
}

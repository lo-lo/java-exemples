package book_exe;

/**
 * программа записывает в поток байтовое значение
 */

public class WriteDemo {
    public static void main(String[] args) {
        int b;
        b = 'S';
        System.out.write(b);
        System.out.write('\n');
    }
}

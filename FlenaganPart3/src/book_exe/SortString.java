package book_exe;

/**
 * выполняется пузырьковая сортировка массива строк. Программа выдает отсортированный в алфавитном порядке список строк.
 */

public class SortString {

    static String arr[] = {"now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of", "their", "country"};

    public static void main(String[] args) {

        for (int j = 0; j < arr.length; j++) {
            for (int i = j+1; i < arr.length; i++) {

                if (arr[i].compareTo(arr[j])<0){
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }

            }
            System.out.println(arr[j]);

        }
    }
}

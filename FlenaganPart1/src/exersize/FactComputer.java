package exersize;

/**
 * Эта программа вычисляет и отображает факториал числа, заданного в командной строке.
 * При помощи оператора try/catch в ней обрабатываются возможные ошибки пользоватльского ввода.
 **/

public class FactComputer {
    public static void main(String[] args) {
        //Попробуем вычислить факториал. Если что-то оказывается не в порядке,
        //обрабатываем исключения при помощи секции catch.
        try {
            int x = Integer.parseInt(args[0]); // преобразуем строку символов в число
            System.out.println(x + "! = " + Factorial4.factorial(x));
        }
        //Пользователь забыл задать аргумент
        //Исключение возникает, если args[0] остается неопределенным
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Вы должны задать аргумент");
            System.out.println("Формат: java FactComputer <число>");
        }
        //Аргумент не является числом. Выдается методом Integer.parseInt()
        catch (NumberFormatException e) {
            System.out.println("Задаваемый аргумент должен быть целым числом");
        }
        //Аргумент < 0. Выдается методом Factorial4.factorial()
        catch (IllegalArgumentException e) {
            //Отображает сообщение, выданное методом factorial()
            System.out.println("Плохой аргумент: " + e.getMessage());
        }
    }

}

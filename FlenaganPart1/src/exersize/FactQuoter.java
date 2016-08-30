package exersize;
import  java.io.*; // Импортируем все классы пакета java.io., избавляя себя от лишнего набора

/**
 * Эта программа отображает факториалы чисел, вводимых пользователем в интерактивном режиме
 **/


public class FactQuoter {
    public static void main(String[] args) throws IOException {
        //Так подготавливается чтение строк, вводимых пользователем
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        //Бесконечный цикл
        for(;;) {
            //Отображается подсказка для пользователя
            System.out.print("FactQuoter > ");
            //Считывается введенная пользователем строка
            String line = in.readLine();
            //Если считан конец файла или пользователь набрал quit, то конец
            if ((line == null) || line.equals("quit")) break;
            //вычисляем факториал
            try {
                int x = Integer.parseInt(args[0]); // преобразуем строку символов в число
                System.out.println(x + "! = " + Factorial4.factorial(x));
            }
            //Если что-то не в порядке, отображается общее сообщение об ошибке
            catch (Exception e) {
                System.out.println("Invalid Input");
            }
        }
    }
}

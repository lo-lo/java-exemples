package exersize;

/**
 * Этот класс не определяет метод main() и поэтому не является самостоятельной программой.
 * Он определяет полезный метод, который можно использовать в других программах.
 * Факториал целого числа получается как произведение этого числа на все положительные целые,
 * которые меньше него.
 **/
public class Factorial {

    public static int factorial(int x){
        if (x<0) throw new IllegalArgumentException("x должен быть >= 0");
        int fact = 1;
        for(int i = 2; i<=x; i++)
            fact *= i;
        return  fact;
    }
}

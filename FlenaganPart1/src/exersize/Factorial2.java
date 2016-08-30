package exersize;

/**
 * Этот класс демонстрирует рекурсивный способ вычисления факториалов. Этот метод многократно
 * вызывает сам себя, основываясь на формуле n! = n*(n-1)!
 **/

public class Factorial2 {
    public static long factorial(long x){
        if (x<0) throw new IllegalArgumentException("х должен быть >= 0");
        if (x<=1) return 1;
        else return x*factorial(x-1); // шаг рекурсии - вызов самого себя
    }
}

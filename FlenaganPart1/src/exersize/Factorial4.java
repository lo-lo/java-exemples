package exersize;
//Импортируем классы, которые намереваемся использовать в программе.
//Импортировав класс, мы уже не обязаны называть его полным именем
import java.math.BigInteger;
import java.util.*;         //импортируем все классы (включая ArrayList) пакета java.util

/**
 * В этой версии программы применяются целые числа произвольно большого размера,
 * поэтоу вычисляемые значения не ограничены сверху. Для кэширования вычсленных значений
 * в ней применяется объект ArrayList вместо массивов фиксированного размера. Он похож на массив, но может
 * разрастаться до любого размера.
 * Метод factorial объявлен как "synchronized", поэтому его можно смело использовать
 * в многопоточных программах.
 *
 **/

public class Factorial4 {
    protected static ArrayList table = new ArrayList(); //Создаем кэш
    static {
        //Первый элемент кэша инициализируется значением 0! = 1
        table.add(BigInteger.valueOf(1));
    }
    /**
     * Метод factorial(), использующий объекты BigInteger, сохраняемые в ArrayList
     */
    public static synchronized BigInteger factorial(int x){
        if (x<0) throw new IllegalArgumentException("х должен быть неотрицательным. ");
        for(int size = table.size(); size <= x; size++){
            BigInteger lastfact = (BigInteger)table.get(size-1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
            table.add(nextfact);
        }
        return (BigInteger) table.get(x);
    }
    /**
     * Метод main() можно использовать в качестве самостоятельной тестирующей программы
     * для метода factorial().
     **/
    public static void main(String[] args) {
        for(int i = 0; i <= 50; i++)
            System.out.println(i + "! = " + factorial(i));
    }
}

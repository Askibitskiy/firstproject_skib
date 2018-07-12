
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;
//здесь импортируются два класса scanner и println

/**
 * skibs java class
 */
public class Base {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first value/Введите первое число:");//вывод на экран строки с предложением ввести первое число
        double a = scan.nextDouble();//ввод первого числа и присваивание значения переменной "а"
        System.out.println("Input second value/Введите второе число:");//вывод на экран строки с предложением ввести второе число
        double b = scan.nextDouble();  //ввод второго числа и присваивание значения переменной "а"
        double c = a + b; //сложение чисел
        String str = String.format("Результат=  %.4f", c); //присваивание переменной str форматированного значения переменной "с"
        println(str); //печать строки с результатоm
        scan.close();
    }
}

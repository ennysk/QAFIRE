import java.util.Scanner;

/**
 * Created by enny on 21.09.20.
 */
public class MyFirstClass {
    public static void  main(String[] args){
        int a, b, c;
        String s1, s2;
        System.out.println("Введіть 2 числа");
        a= new Scanner(System.in).nextInt();
        b= new Scanner(System.in).nextInt();
        c=a+b;

        System.out.println("Сума ваших чисел рівна" +" " +c);

    }

}

import java.io.Console;
import java.util.Scanner;

public class Main {
    private static int a,b;
    public static void main(String[] args) {
        try {
            //Ввод с консоли
            if (args.length < 2) {
                Scanner scn = new Scanner(System.in);
                System.out.print("Первое число: ");
                a = scn.nextInt();
                System.out.print("Второе число: ");
                b = scn.nextInt();
            }
            //Ввод аргументов коммандной строки
            else{
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }

            //Сравнение переменых
            if(a>b){
                System.out.println(a + " > " + b);
            }
            else if(a<b){
                System.out.println(a + " < " + b);
            }
            else if(a == b){
                System.out.println(a + " = " + b);
            }
            else {
                System.out.println("Неверные данные!");
            }

            //Операции над переменными
            System.out.println(a+b +" - результат сложения");
            System.out.println(a-b +" - результат вычитания");
            System.out.println(a*b +" - результат умножения");
            System.out.println(Float.parseFloat(String.valueOf(a))/Float.parseFloat(String.valueOf(b)) +" - результат деления");

        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
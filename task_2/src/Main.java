import java.util.Scanner;

public class Main {
    private static String a,b;
    public static void main(String[] args) {
        try {
            //Ввод с консоли
            if (args.length < 2) {
                Scanner scn = new Scanner(System.in);
                System.out.print("Первая строка: ");
                a = scn.next();
                System.out.print("Второя строка: ");
                b = scn.next();
            }
            //Ввод аргументов коммандной строки
            else{
                a = args[0];
                b = args[1];
            }

            //Сравнение строк
            if (a.equals(b)){
                System.out.println("Строки идентичны");
            }
            else {
                System.out.println("Строки неидентичны");
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
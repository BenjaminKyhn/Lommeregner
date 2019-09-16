import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lommeregner lommeregner = new Lommeregner();
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast to integers, som du vil lægge sammen: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(lommeregner.addition(a,b));

        System.out.println("Indtast to integers, som du vil trække fra hinanden: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(lommeregner.subtraction(a,b));

        System.out.println("Indtast to integers, som du vil gange: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(lommeregner.multiplication(a,b));

        System.out.println("Indtast to integers, som du vil dividere: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(lommeregner.division(a,b));

        System.out.println("Indtast to integers for a og b, som indsættes i regnestykket (2*a*a)+(b/2)-(a*b): ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println(lommeregner.secret(a,b));
    }
}

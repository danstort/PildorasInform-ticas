import java.util.Scanner;

public class RaizScanner {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un número");
        int a;
        a=tec.nextInt();
        double b;
        b = Math.sqrt(a);
        System.out.println("La raíz cuadrada de "+a+" es "+b);


    }
}


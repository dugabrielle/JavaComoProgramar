
import java.util.Scanner;
public class Impar_ou_Par {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número:");
        numero = input.nextInt();

        if (numero % 2 == 0)
            System.out.print("O número " + numero + " é par!");

        else
            System.out.print("O número " + numero + " é ímpar!");
    }
}

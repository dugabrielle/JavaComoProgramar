import java.util.Scanner;

public class ProdutoInteiro {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.println("Insira o primeiro inteiro:");
        x = input.nextInt();

        System.out.println("Insira o segundo inteiro:");
        y = input.nextInt();

        System.out.println("Insira o terceiro inteiro:");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("%s%d", "Valor: ", result);
    }
}

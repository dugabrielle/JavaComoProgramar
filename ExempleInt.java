import java.lang.Integer;
import javax.swing.JOptionPane;

public class ExempleInt {

    public static void main (String[] args){

        String x;
        String y;
        String z;
        int n1, n2, n3, result;

        x = JOptionPane.showInputDialog("Insira o primeiro número");
        y = JOptionPane.showInputDialog("Insira o segundo número");
        z = JOptionPane.showInputDialog("Insira o terceiro número");

        n1 = Integer.parseInt(x);
        n2 = Integer.parseInt(y);
        n3 = Integer.parseInt(z);

        result = n1 * n2 * n3;

        JOptionPane.showMessageDialog(null, "O resultado é: " + result);
    }
}
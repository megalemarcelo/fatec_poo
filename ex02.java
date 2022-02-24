//02) Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o resultado.
import javax.swing.JOptionPane;
public class ex02 {
        public static void main(String[] args) {
        
        //declaração de variáveis
        double n1, n2, n3, n4, calculo;

        //entrada de dados
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número"));

        //processamento
        calculo = (n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4);
        
        //saída de dados
        String s = String.format(
            "A soma dos quadrados dos números digitados é %.2f",
            calculo
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
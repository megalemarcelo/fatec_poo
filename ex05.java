//05) Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
import javax.swing.JOptionPane;
public class ex05 {
        public static void main(String[] args) {
        
        //declaração de variáveis
        int base, altura, area;

        //entrada de dados
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do retângulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retângulo"));

        //processamento
        area = base * altura;
        
        //saída de dados
        String s = String.format(
            "A área do retângulo é %sm².",
            area
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
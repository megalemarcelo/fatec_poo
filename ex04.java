//04) Ler um valor inteiro e exibir seu antecessor.
import javax.swing.JOptionPane;
public class ex04 {
        public static void main(String[] args) {
        
        //declaração de variáveis
        int n, ant;

        //entrada de dados
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        //processamento
        ant = n - 1;
        
        //saída de dados
        String s = String.format(
            "O antecessor de %s é %s.",
            n, ant
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
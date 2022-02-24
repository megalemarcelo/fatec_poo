//05) Ler a idade de uma pessoa expressa em anos e exibir expressa em dias (considere que um ano tem 365 dias
import javax.swing.JOptionPane;
public class ex06 {
        public static void main(String[] args) {
        
        //declaração de variáveis
        int idadeanos, idadedias;

        //entrada de dados
        idadeanos = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));

        //processamento
        idadedias = idadeanos * 365;
        
        //saída de dados
        String s = String.format(
            "Você já viveu %s dias.",
            idadedias
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
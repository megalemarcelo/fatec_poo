//07) Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
import javax.swing.JOptionPane;
public class ex07 {
        public static void main(String[] args) {
        
        //declaração de variáveis
        int idadeanos, idademeses, idadedias, calculo;

        //entrada de dados
        idadeanos = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade em anos"));
        idademeses = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade em meses"));
        idadedias = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade em dias"));

        //processamento
        calculo = (idadeanos * 365) + (idademeses * 30) + idadedias;
        
        //saída de dados
        String s = String.format(
            "Você já viveu %s dias.",
            calculo
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
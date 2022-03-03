//09) Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e exibir o valor do novo salário.
import javax.swing.JOptionPane;
public class ex09 {
        public static void main(String[] args) {
        
        //declaração de variáveis
        double salarioatual, novosalario;
        int preajuste;

        //entrada de dados
        salarioatual = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário atual do funcionário"));
        preajuste = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual a ser reajustado"));

        //processamento
        novosalario = salarioatual + (salarioatual * (preajuste*0.01));
        
        //saída de dados
        String s = String.format(
            "O salário reajustado será de R$%.2f.",
            novosalario
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
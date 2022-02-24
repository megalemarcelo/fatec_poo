//01) Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o resultado.
import javax.swing.JOptionPane;
public class ex01 {
        public static void main(String[] args) {
        
        //declaração de variáveis
        double cotacao, qtde, conversao;

        //entrada de dados
        cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar"));
        qtde = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o valor em dólares a ser convertido para reais"));

        //processamento - conversão
        conversao = cotacao * qtde;
        
        //saída de dados
        String s = String.format(
            "US$%.2f equivalem a R$%.2f.",
            qtde, conversao
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
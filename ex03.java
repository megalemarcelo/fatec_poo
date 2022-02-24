//03) Calcular o pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e que você tem os seguintes dados: preço unitário da peça e quantidade vendida.
import javax.swing.JOptionPane;
public class ex03 {
        public static void main(String[] args) {
        
        //declaração de variáveis
        double precounitario, qtde, comissao;

        //entrada de dados
        precounitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de cada peça vendida"));
        qtde = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas peças foram vendidas"));

        //processamento
        comissao = (precounitario * qtde) * 0.05;
        
        //saída de dados
        String s = String.format(
            "A comissão será de R$%.2f.",
            comissao
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
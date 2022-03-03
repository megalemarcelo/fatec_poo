//10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
import javax.swing.JOptionPane;
public class ex10 {
    public static void main(String[] args) {
        
        //declaração de variáveis
        double custofabrica, custofinal;

        //entrada de dados
        custofabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica do carro"));

        //processamento
        custofinal = custofabrica + (custofabrica*0.28) + (custofabrica*0.45);
        
        //saída de dados
        String s = String.format(
            "O custo final do carro será de R$%.2f.",
            custofinal
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
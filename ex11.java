//11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Ler o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcular e exibir o salário final do vendedor.
import javax.swing.JOptionPane;
public class ex11 {
        public static void main(String[] args) {
        
        //declaração de variáveis
        int numcarrosvendidos;
        double valortotalvendas, salariofixo, valorporcarro, salariofinal;

        //entrada de dados
        salariofixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario fixo do vendedor"));
        numcarrosvendidos = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos carros foram vendidos"));
        valorporcarro = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto o vendedor recebe por carro vendido"));
        valortotalvendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total das vendas"));

        //processamento
        salariofinal = salariofixo + (valorporcarro * numcarrosvendidos) + (valortotalvendas * 0.05);
        
        //saída de dados
        String s = String.format(
            "O salario final será de R$%.2f.",
            salariofinal
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
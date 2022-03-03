//08) Ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
import javax.swing.JOptionPane;
public class ex08 {
        public static void main(String[] args) {
        
        //declaração de variáveis
        int totaleleitores, brancos, nulos, validos, pbrancos, pnulos, pvalidos;

        //entrada de dados
        totaleleitores = Integer.parseInt(JOptionPane.showInputDialog("Digite o número total de eleitores do município"));
        brancos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos brancos"));
        nulos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos nulos"));
        validos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de votos válidos"));

        //processamento
        pbrancos = (100*brancos)/totaleleitores;
        pnulos = (100*nulos)/totaleleitores;
        pvalidos = (100*validos)/totaleleitores;
        
        //saída de dados
        String s = String.format(
            "No total há %s eleitores.\nOs votos brancos foram %s%%.\nOs votos nulos foram %s%%.\nOs votos válidos foram %s%%.",
            totaleleitores, pbrancos, pnulos, pvalidos
        );
        JOptionPane.showMessageDialog(null, s);
    }
}
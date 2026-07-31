import javax.swing.JOptionPane;

public class CalculadorIMC {
    public static void main(String[] args) {
        

        while (true) {
            try {
                double imc = 0;
                double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura:"));
                double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso:"));

                double resultado = calcular(altura, peso, imc);


                if (resultado < 18.5) {
                    String html = String.format(
    "<html>Altura: %.2f<br>Peso: %.2f<br>IMC: <font color='#2563eb'><b>%.2f</b></font></html>",
    altura, peso, resultado
);
                JOptionPane.showMessageDialog(null, html, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else if (resultado > 18.5 & resultado < 24.9) {
                    String html = String.format(
    "<html>Altura: %.2f<br>Peso: %.2f<br>IMC: <font color='#11fa1d'><b>%.2f</b></font></html>",
    altura, peso, resultado
);
                
                JOptionPane.showMessageDialog(null, html, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else if (resultado > 24.9 & resultado < 29.9) {
                    String html = String.format(
    "<html>Altura: %.2f<br>Peso: %.2f<br>IMC: <font color='#f87a03'><b>%.2f</b></font></html>",
    altura, peso, resultado
);
                
                JOptionPane.showMessageDialog(null, html, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String html = String.format(
    "<html>Altura: %.2f<br>Peso: %.2f<br>IMC: <font color='#f80c0c'><b>%.2f</b></font></html>",
    altura, peso, resultado
);
                
                JOptionPane.showMessageDialog(null, html, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
                

            } catch (NumberFormatException e) {
                // Divisão por zero → janela de erro (requisito da task).
                JOptionPane.showMessageDialog(null, "Não é possível calcular com zero!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            }

            
        }
    }

    // Método estático que concentra a lógica das 4 operações.
    static double calcular(double altura, double peso, double imc) {
        return imc = peso / (altura * altura);
    }
}
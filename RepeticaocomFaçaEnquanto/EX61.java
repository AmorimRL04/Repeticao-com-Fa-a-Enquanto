package Exercicios.RepeticaocomFaçaEnquanto;

import javax.swing.*;

public class EX61 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX61 - Mostre na tela a seguinte contagem usando a estrutura 'faça enquanto':" +
                "\n0 3 6 9 12 15 18 21 24 27 30 Acabou!");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis necessárias.");
        int contador = 0;
        String contagem = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Executar a contagem utilizando a estrutura 'faça enquanto'.");
        do {
            JOptionPane.showMessageDialog(null, "2º Passo - Concatenar o valor atual do contador na string de contagem.");
            contagem += contador + " ";

            JOptionPane.showMessageDialog(null, "2º Passo - Incrementar o contador em 3 unidades.");
            contador += 3;
        }
        while (contador <= 30);

        JOptionPane.showMessageDialog(null, "2º Passo - Adicionar a palavra 'Acabou!' ao final da contagem.");
        contagem += "Acabou!";

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir a contagem final na tela.");
        JOptionPane.showMessageDialog(null, contagem);
    }
}

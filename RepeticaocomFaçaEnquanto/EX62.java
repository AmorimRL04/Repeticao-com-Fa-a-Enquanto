package Exercicios.RepeticaocomFaçaEnquanto;

import javax.swing.*;

public class EX62 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX62 - Faça um programa usando a estrutura “faça enquanto” que leia a" +
                "\nidade de várias pessoas. A cada laço, você deverá perguntar para o" +
                "\nusuário se ele quer ou não continuar a digitar dados. No final," +
                "\nquando o usuário decidir parar, mostre na tela:" +
                "\n• Quantas idades foram digitadas" +
                "\n• Qual é a média entre as idades digitadas" +
                "\n• Quantas pessoas tem 21 anos ou mais.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis necessárias.");
        int totalIdades = 0;
        int somaIdades = 0;
        int pessoas21OuMais = 0;
        boolean continuar = true;

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar as idades e utilizar a estrutura 'faça enquanto' para processar as idades.");
        JOptionPane.showMessageDialog(null, "3º Passo - Acumular as variáveis necessárias.");
        do {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa:"));

            JOptionPane.showMessageDialog(null, "3º Passo - Incrementar o total de idades digitadas e à soma total das idades.");
            totalIdades++;
            somaIdades += idade;

            if (idade >= 21) {
                JOptionPane.showMessageDialog(null, "3º Passo - Verifica se a idade é 21 ou mais. Se a idade for 21 ou mais, incrementa a variável pessoas21OuMais.");
                pessoas21OuMais++;
            }

            JOptionPane.showMessageDialog(null, "4º Passo - Perguntar se o usuário deseja continuar.");
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar digitando idades?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "4º Passo - Se o usuário escolher \"não\", o laço será interrompido. E atualiza a variável 'continuar' para false, saindo do laço");
                continuar = false;
            }

        } while (continuar);
        JOptionPane.showMessageDialog(null, "4º Passo - Laço continua enquanto a variável 'continuar' for true.");

        JOptionPane.showMessageDialog(null, "5º Passo - Calcular a média das idades.");
        double mediaIdades = totalIdades > 0 ? (double) somaIdades / totalIdades : 0;

        JOptionPane.showMessageDialog(null, "6º Passo - Exibir os resultados.");
        JOptionPane.showMessageDialog(null, "Total de idades digitadas: " + totalIdades);
        JOptionPane.showMessageDialog(null, "Média das idades: " + String.format("%.2f", mediaIdades));
        JOptionPane.showMessageDialog(null, "Pessoas com 21 anos ou mais: " + pessoas21OuMais);
    }
}

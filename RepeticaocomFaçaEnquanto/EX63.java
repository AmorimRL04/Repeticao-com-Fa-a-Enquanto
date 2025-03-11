package Exercicios.RepeticaocomFaçaEnquanto;

import javax.swing.*;

public class EX63 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX63 - Faça um programa usando a estrutura 'faça enquanto' que leia vários números. A cada laço, você deverá perguntar para o usuário se ele quer ou não continuar. No final, mostre na tela:" +
                "\n• O somatório entre todos os valores" +
                "\n• Qual foi o menor valor digitado" +
                "\n• A média entre todos os valores" +
                "\n• Quantos valores são pares.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar as variáveis necessárias.");
        int soma = 0;
        int menorValor = Integer.MAX_VALUE;
        int totalValores = 0;
        int valoresPares = 0;
        boolean continuar = true;

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar os números e utilizar a estrutura 'faça enquanto'.");
        JOptionPane.showMessageDialog(null, "3º Passo - Acumular as variáveis necessárias.");
        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

            soma += numero;
            totalValores++;

            if (numero < menorValor) {
                JOptionPane.showMessageDialog(null, "3º Passo - Se o número digitado for menor que o menor valor atual, atualiza o menor valor.");
                menorValor = numero;
            }

            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "3º Passo - Se o número for PAR, incrementa o contador de valores pares.");
                valoresPares++;
            }

            JOptionPane.showMessageDialog(null, "4º Passo - Perguntar se o usuário deseja continuar.");
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar digitando números?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "4º Passo - Se a resposta for 'Não', a variável 'continuar' é setada para false, e o laço será interrompido.");
                continuar = false;
            }

        } while (continuar);JOptionPane.showMessageDialog(null, "4º Passo - Se a resposta for 'Sim', a variável 'continuar' continua verdadeira, e volta para o laço.");

        JOptionPane.showMessageDialog(null, "5º Passo - Calcular a média entre os valores.");
        double media = totalValores > 0 ? (double) soma / totalValores : 0;

        JOptionPane.showMessageDialog(null, "6º Passo - Exibir os resultados.");
        JOptionPane.showMessageDialog(null, "Somatório de todos os valores: " + soma);
        JOptionPane.showMessageDialog(null, "Menor valor digitado: " + menorValor);
        JOptionPane.showMessageDialog(null, "Média entre todos os valores: " + String.format("%.2f", media));
        JOptionPane.showMessageDialog(null, "Quantidade de valores pares: " + valoresPares);
    }
}

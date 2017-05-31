/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_pi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kelly.fsantos8
 */
public class JogoDaVelha {

    public static int jogadaMaquina(String posicao) {
        Random jogador2 = new Random();
        for (int jg = 1; jg <= 3; jg++) {
            System.out.println(jogador2.nextInt(9));
        }
        switch (posicao) {
            case "1":
                jogodavelha[0][0] = "x";
                break;
            case "2":
                jogodavelha[0][1] = "x";
                break;
            case "3":
                jogodavelha[0][2] = "x";
                break;
            case "4":
                jogodavelha[1][0] = "x";
                break;
            case "5":
                jogodavelha[1][1] = "x";
                break;
            case "6":
                jogodavelha[1][2] = "x";
                break;
            case "7":
                jogodavelha[2][0] = "x";
                break;
            case "8":
                jogodavelha[2][1] = "x";
                break;
            case "9":
                jogodavelha[2][2] = "x";
                break;

        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[][] jogodavelha = new String[3][3];
        String playerO = "O";
        String playerX = "X";
        //RANDOM PARA A JOGADA DA MÁQUINA
        Random jogador2 = new Random();
        boolean trigger = true;
        
        for (int jg = 1; jg <= 3; jg++) {
            Random randomizer = new Random();

            int linha2 = randomizer.nextInt(3);
            int coluna2 = randomizer.nextInt(3);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (!jogodavelha[i][j].equals(playerX) && trigger==true) {
                        jogodavelha[linha2][coluna2] = playerO;
                        trigger =false;
                    } 
                }

                if(i ==2 ){
                    trigger = true;
                }

            }
        }

        //LAÇO PARA PEDIR A POSIÇÃO PARA O USUÁRIO        
        System.out.println("Você é o X!");
        for (int p = 1; p <= 3; p++) {
            String s = playerO;
            System.out.println("Informe a posição desejada de 1 a 9: ");
            String posicao = leitor.next();

            //DECISÃO DA IMPRESSÃO CONFORME A POSIÇÃO
            switch (posicao) {
                case "1":
                    jogodavelha[0][0] = "x";
                    break;
                case "2":
                    jogodavelha[0][1] = "x";
                    break;
                case "3":
                    jogodavelha[0][2] = "x";
                    break;
                case "4":
                    jogodavelha[1][0] = "x";
                    break;
                case "5":
                    jogodavelha[1][1] = "x";
                    break;
                case "6":
                    jogodavelha[1][2] = "x";
                    break;
                case "7":
                    jogodavelha[2][0] = "x";
                    break;
                case "8":
                    jogodavelha[2][1] = "x";
                    break;
                case "9":
                    jogodavelha[2][2] = "x";
                    break;

            }

            //COMANDOS DO TABULEIRO
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (jogodavelha[i][j] == null) {
                        jogodavelha[i][j] = "-";
                    }

                    System.out.print(jogodavelha[i][j] + " ");

                }
                System.out.println("");

            }

        }
    }
}

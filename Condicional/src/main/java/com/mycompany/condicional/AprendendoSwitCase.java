/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author ArthurAquino
 */
public class AprendendoSwitCase {
    public static void main(String[] args) {
        
       //Sistema de agendamento de Servicos Pet
       String nomePet, racaPet;
       int idadePet, opcaoServico;
       
       
       
       Scanner entradaTexto = new Scanner(System.in);
       Scanner entradaNumero = new Scanner(System.in);
       
       // solicitar dados
       
        System.out.println("Ola, para iniciarmos digite o nome do pet");
        nomePet = entradaTexto.nextLine();
        System.out.println("Bem vindo(a) "+nomePet+", qual a sua raca?");
        racaPet = entradaTexto.nextLine();
        System.out.println("Agora que sabemos a sua raca, "
                + "nos diga a sua idade");
        idadePet = entradaNumero.nextInt();
        System.out.println("Escolha um de nossos servicos");
        System.out.println("1-Tosa\n2-Banho\n3-banho e Tosa\n4=Veterinario");
        opcaoServico = entradaNumero.nextInt();
        
        // analisando o servico com Switch Case
        
        switch (opcaoServico){
            case 1:
                System.out.println(nomePet+" voce possui "+idadePet+
                " anos de idade, e da raca "+racaPet+
                " e escolheu o servico Tosa.");
                break;
            case 2:
                System.out.println(nomePet+" voce possui "+idadePet+
                "anos de idade, e da raca "+racaPet+
                " e escolheu o servico banho.");
                break;
            case 3:
                System.out.println(nomePet+" voce possui "+idadePet+
                "anos de idade, e da raca "+racaPet+
                " e escolheu o servico banho e Tosa.");
                break;
            case 4:
                System.out.println(nomePet+" voce possui "+idadePet+
                "anos de idade, e da raca "+racaPet+
                " e escolheu o servico Veterinario.");
                break;
            default:
                System.out.println("A opcao escolhida e invalida!");
                break;
        
        
        }// fim do switch 
    
        
        
        
        }
}

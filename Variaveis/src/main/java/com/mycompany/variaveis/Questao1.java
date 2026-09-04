/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

/**
 *
 * @author ArthurAquino
 */


public class Questao1 {
  
   public static void main (String[] args) {
       //criar variavel
       String nome;
       
       // chamar o scanner
       Scanner entradaTexto = new Scanner (System.in);
       
       //solicitar os dados para ususario
       System.out.println("Digite o seu nome:");
       nome = entradaTexto.nextLine();
       
       System.out.println("Ola, "+nome+"! Seja bem-vindo(a) ao Java.");
   }

}

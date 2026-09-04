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
public class CalculosBasicos {
    
    public static void main(String[] args) {
        //trabalhar com calculo de soma
        int numero1, numero2;
        double resultadoSoma, resultadoSubtracao , 
        resultadomultiplicacao, resultadodivisao;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro:");
        numero1 = entradaNumero.nextInt();
        
       System.out.println("Digite outro valor inteiro:");
        numero2 = entradaNumero.nextInt();
        
        // SOMA
        resultadoSoma = numero1 + numero2;
        
        System.out.println ("a soma dos numeros e:"+resultadoSoma);
        
        //SUBTRACAO
        
        resultadoSubtracao = numero1 - numero2;
        System.out.println("A subtracao dos numero e:"+resultadoSubtracao);
        
        // MULTIPLICACAO
        resultadoMultiplicacao = numero1 * numero2;
        
        System.out.println("A multiplicacao do numero e:"+resultadoMultiplicacao);
    }
    
} 

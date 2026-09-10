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
public class Exemplo2 {
    public static void main(String[] args) {
        
        // variaveis
        int quantidadeMiojo, quantidadeSalada;
        
        // Scanner
        Scanner entradaNumero= new Scanner(System.in);
        
        //solicitar os dados para o usuario
        System.out.println("A quantos dias voce nao come miojo?");
        quantidadeMiojo = entradaNumero.nextInt();
        System.out.println("A quantos dias voce nao come salada?");
        quantidadeSalada = entradaNumero.nextInt();
        
        /*SE QUANTIDADE DE MIOJO FOR MENOR QUE 2
                          OU
        QUANTIDADE DE SALADA FOR MAIOR QUE 7
                 POUCO SAUDAVEL
        */
        if(quantidadeMiojo<2 || quantidadeSalada>7){
            System.out.println("Pouco saudavel!");
        }
        if(quantidadeMiojo>=2 || quantidadeSalada<7){
            System.out.println("Saudavel");
        }
    
    
    
    
    
    }
    
}

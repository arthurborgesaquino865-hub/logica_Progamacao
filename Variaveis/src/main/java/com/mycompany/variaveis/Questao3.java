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
public class Questao3 {
    public static void main(String[] args) {
        double n1;
        double n2;
        double media;
        
        Scanner entradaNumero = new Scanner (System.in);
        
        System.out.println("Informe o valor 1");
        n1= entradaNumero.nextDouble();
        
        System.out.println("Informe o valor 2");
        n2= entradaNumero.nextDouble();
        
        media = (n1 + n2)/2;
        System.out.println("A media e:"+ media);
    }
    
}

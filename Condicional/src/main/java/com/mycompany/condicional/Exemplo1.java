package com.mycompany.condicional;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ArthurAquino
 */
public class Exemplo1 {
    public static void main(String[] args) {
        //variaveis
        double altura, peso, imc;
        String nome;
        
        //Scanner
        Scanner entradaNumero= new Scanner (System.in);
        Scanner entradaTexto= new Scanner (System.in);
        
        // solicitar os dados ao usuario
        System.out.println("Digite seu nome:");
        nome = entradaTexto.nextLine ();
        System.out.println("Digite sua altura:");
        altura = entradaNumero.nextDouble ();
        System.out.println("Digite seu peso:");
        peso = entradaNumero.nextDouble ();
        
        //CALCULAR O IMC
        imc = peso / (altura*altura);
        
        // analisando o imc
        
        if(imc<=16.9){
        System.out.println("Muito abaixo do peso");
        
        }if(imc>=17 && imc<=18.4){
        System.out.println("Abaixo do peso!");
        
        }if(imc>=18.5 && imc<=24.9){
        System.out.println("peso normal!");
        
        }if(imc>=25 && imc<=29.9){
        System.out.println("acima do peso!");
        
        }if(imc>=30 && imc<=34.9){
        System.out.println("obesidade grau 1!");
        
        }if(imc>=35 && imc<=40){
        System.out.println("obesidade grau 2!");
        }else{
            System.out.println("obesidade grau 3");
            }
    }
    
}

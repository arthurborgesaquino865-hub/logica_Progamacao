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
public class Desafio {
    public static void main(String[] args) {
        
    String nome,ingresso;
    int idade;
    boolean autorizacao = false;
    
    
    Scanner entradaTexto= new Scanner(System.in);
    Scanner entradaNumero= new Scanner(System.in);
    Scanner entradaLogica= new Scanner(System.in);
    
        System.out.println("Digite sua idade");
        idade = entradaNumero.nextInt();
        
        System.out.println("Qual o seu tipo de ingresso?");
        ingresso = entradaTexto.nextLine();
        
        System.out.println("voce possui Autorizacao?"
                + "true para sim ou false para nao");
        autorizacao = entradaLogica.nextBoolean();
        
        System.out.println("Digite sua Nome");
        nome = entradaTexto.nextLine();
        
        if(idade >=18 && ingresso.equals ("Vip") ){
            System.out.println("Acesso vip liberado!");
        }
             else if(idade >=18 && ingresso.equals ("Comum")){
        System.out.println("acesso comum liberado!");
        }
            else if((idade >=16 && idade<=17) && autorizacao == true){
        System.out.println("acesso com autoizacao!");
        }
            else if(ingresso.equals("Professor") || ingresso.equals("Funcionario")){
        System.out.println("acesso especial liberado!");
        }
            else{
                System.out.println("Acesso negado!");
                
               
            }
        System.out.println("seu nome e"+nome);
        System.out.println("sua idade e"+idade);
    }
}

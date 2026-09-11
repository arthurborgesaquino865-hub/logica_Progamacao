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
public class DesafioSwitchCase {
    public static void main(String[] args) {
        
        int numeroP, quantidadeP ;
        double valortotal;
        
        
        Scanner entradaNumero= new Scanner(System.in);
        Scanner entradaLogica= new Scanner(System.in);
        Scanner entradaTexto= new Scanner(System.in);
        
        System.out.println("Bem vindo! Escolha o seu pedido: ");
        System.out.println("1 - Hamburger R$ 15,00\n2 - pizza R$ 25,00\n3 - Cachorro quente  R$ 12,00\n4 - Refrigerante  R$ 6,00\n5 - Suco R$ 8,00");
        numeroP = entradaNumero.nextInt();
        System.out.println("qual a quantidade desejada?");
        quantidadeP = entradaNumero.nextInt();
        
        switch(numeroP){
            case 1:
                valortotal = 15*quantidadeP;
                System.out.println("Produto escolhido: Hamburguer\nQuantidade: "+quantidadeP+"\nPreco unitario: R$ 15,00\nValor Total: "+valortotal);
                break;
        
            case 2:
                valortotal = 25*quantidadeP;
                System.out.println("Produto escolhido: Pizza\nQuantidade: "+quantidadeP+"\nPreco unitario: R$ 25,00\nValor Total: "+valortotal);
                break;
                
            case 3:
                valortotal = 12*quantidadeP;
                System.out.println("Produto escolhido: Cachorro-quente\nQuantidade: "+quantidadeP+"\nPreco unitario: R$ 12,00\nValor Total: "+valortotal);
                break;
                
            case 4:
                valortotal = 6*quantidadeP;
                System.out.println("Produto escolhido: Refrigerante\nQuantidade: "+quantidadeP+"\nPreco unitario: R$ 6,00\nValor Total: "+valortotal);
                break;
                
            case 5:
                valortotal = 8*quantidadeP;
                System.out.println("Produto escolhido: Suco\nQuantidade: "+quantidadeP+"\nPreco unitario: R$ 8,00\nValor Total: "+valortotal);
                break;
                
            default:System.out.println("A opcao escolhida e invalida");
            break;
        
        }
        
        
        
    }
}

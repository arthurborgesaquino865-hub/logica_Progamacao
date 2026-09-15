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
public class Matriz {
    public static void main(String[] args) {
        
        String [][] alunos= new String[11][2];
        
        alunos[0][0]="Jordana";
        alunos[1][0]="Geovanna";
        alunos[2][0]="kauwan";
        alunos[3][0]="Kaleb";
        alunos[4][0]="Arthur m.";
        alunos[5][0]="Antonio";
        alunos[7][0]="Enzo";
        alunos[9][0]="Pedro";
        
        alunos[0][1]="Rogerio";
        alunos[1][1]="Israel";
        alunos[2][1]="Arthur B.";
        alunos[3][1]="Cleiciane";
        alunos[4][1]="Samara";
        alunos[5][1]="Maria";
        alunos[6][1]="Vitor";
        alunos[9][1]="Daniel";
        alunos[10][1]="Raniely";
        
        int coluna, numeroL;
        
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Digite o numero da linha");
        numeroL = entradaNumero.nextInt();
        System.out.println("Digite o numero da coluna");
        coluna = entradaNumero.nextInt();
        System.out.println(alunos[numeroL][coluna]);
        
    }
    
}

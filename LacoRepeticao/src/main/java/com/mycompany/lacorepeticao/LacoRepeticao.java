 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacorepeticao;

import java.util.Scanner;

/**
 *
 * @author ArthurAquino
 */
public class LacoRepeticao {

    public static void main(String[] args) {
        // progama para preencher lista de convidados
        
        Scanner entradaTexto = new Scanner (System.in);
        String [] listaConvidados = new String[20];
        
        //SOLICITAR QUE A DONA DA FESTA PREENCHA A LISTA
        
        for(int cont=0;cont<=19;cont++){
            System.out.println("Digite o nome do convidado:");
            listaConvidados[cont]=entradaTexto.nextLine();
            
        }
        
        //IMPRIMIR A LISTA DE CONVIDADOS
        for(int cont=0;cont<=19;cont++){
            System.out.println("Convidado "+cont+" :"
            +listaConvidados[cont]);
        }
        
        ;
    }
}

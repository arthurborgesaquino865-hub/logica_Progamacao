/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author ArthurAquino
 */
public class Condicional {

    public static void main(String[] args) {
      /*Condicional e o codigo utilizado para
       avaliar dados, e se for verdadeiro realiza uma
       acao, e se for falso realiza outra acao.
       SEB- IF
       SENAO -ELSE

       TABELA LOGICA:
       > MAIOR QUE
       < MENOR QUE
       >= MAIOR OU IGUAL
       <= MENOR OU IGUAL
       == IGUAL
       =!DIFERENTE
       /*
         
        */
      
      //variavel
      int idade;
      
      //variavel de entrada de dados
      Scanner entradaNumero = new Scanner(System.in);
      //solicitacao para o usuario
        System.out.println("Digite sua idade:");
        idade = entradaNumero.nextInt ();
        
        //analise da idade
        if(idade >=18){
            System.out.println("voce e maior de idade");
        }else{
            System.out.println("voce e menor de idade");
            }//fim do else
}
}

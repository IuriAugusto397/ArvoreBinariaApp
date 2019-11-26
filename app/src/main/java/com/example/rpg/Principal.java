/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.rpg;

/**
 *
 * @author alessandro.alves
 */


import java.util.Scanner;

public class Principal {
    
    public static void GO () {
        
       		String opcao;
                Scanner scan = new Scanner(System.in);
		do {
			System.out.println("########  RPG - CRIAÇÃO DE PERSONAGEM   ########");
                        System.out.println("Para o uso correto, siga na ordem abaixo!\n");
			System.out.println("1 - Cria árvore. Insere os Dados");
			System.out.println("2 - Iniciar Questionário");
			System.out.println("3 - Sair");
			opcao = scan.next();

			switch (opcao) {
			case "1":
				System.out.println("Dados inseridos com sucesso!");
				Execucao.Dados();
				break;
			case "2":
				System.out.println( "############ Let's GO!! ############");
				No.Iniciaprograma(No.raiz);	
				break;
			case "3":
				System.out.println("############### Espero que tenhamos ajudado em sua escolha! ##################!\n");
				break;
			
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (!(opcao.equals("3")));
        
        
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.rpg;

import java.util.Scanner;

public class No {

    int id; // valor nó, com esse valor podemos posicionar o nó na posição correta da árvore
    String conteudo; // texto a ser exibido
    No esquerda = null; // Apontador para o nó da esquerda
    No direita = null; // Apontador para o nó da direita
    public static No raiz;
    private static Scanner scan;

    public String getConteudo() {
        return conteudo;
    }

    public No getNoEsquerdo() {
        return this.esquerda;
    }

    public No getNoDireito() {
        return this.direita;
    }

    public No() {
    }

    public No(int valor) {
        this.id = valor;
    }

    public No(int valor, String info) {
        this.id = valor;
        this.conteudo = info;
    }

    public static void inserir(int valor, String info) {

        inserir(raiz, valor, info);
    }
//FUnção aue recebe o conteúdi digitado e organiza a árvore
    //Essa função recebe um id e seu conteúdo e organiza sua posição na árvore

    public static void inserir(No node, int valor, String info) {
        if (node == null) {	//inicializa a árvore preenchendo o ID do nó e seu conteúdo
            raiz = new No(valor, info);
        } else {
            if (valor < node.id) {
                if (node.esquerda != null) {
                    inserir(node.esquerda, valor, info);
                } else {
                    if (node.id == valor) {
                        System.out.println("Nó já inserido!");
                    } else {
                        node.esquerda = new No(valor, info);
                    }
                }
            } else {
                if (node.direita != null) {
                    inserir(node.direita, valor, info);
                } else {
                    if (node.id == valor) { // checa apenas se o nó atual já
                        // contém o mesmo valor
                        System.out.println("Nó já inserido!");
                    } else {
                        node.direita = new No(valor, info);
                    }
                }
            }
        }
    }

    public static boolean proximoNo() {
        scan = new Scanner(System.in);
        String option = scan.next();
        switch (option.toUpperCase()) {
            case "1":
                return false;
            case "2":
                return true;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                return false;
        }
    }

    //função para inicializar o programa
    public static void Iniciaprograma(No node) {
        if (node.esquerda == null && node.direita == null) // teste se o nó é folha, sendo assim resposta final
        {
            System.out.println(node.conteudo);

        } else {
            System.out.println(node.conteudo);
            if (proximoNo()) {
                Iniciaprograma(node.direita);
            } else {
                Iniciaprograma(node.esquerda);
            }
        }
    }

    public static No programa(No node, boolean esc) {
        if (node.esquerda == null && node.direita == null) // teste se o nó é folha, sendo assim resposta final
        {
            return node;

        } else {
            System.out.println(node.conteudo);
            if (esc) {
                return (node.direita);
            } else {
                return (node.esquerda);
            }
        }
    }

}

/**
 *
 * @author alessandro.alves
 */

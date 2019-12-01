/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.rpg;

/**
 *
 * @author iuri augusto
 */
public class Execucao {
    
    public static void Dados() {
        
        //Pergunta Raiz
        No.inserir(8, "(Você prefere) \n (1)Ataque Físico \n " + "(2) Ataque Mágico?");// SE 1 GO Nó 4 || Se 2 GO Nó 12
        
        //Segundo nível da árvore
        // Resposta Nó 8
        No.inserir(4, "(Você prefere) \n (1) luta  Corpo a Corpo \n " + "(2) combate à distância?");//- Para 1 GO Nó 2 || Se 2 GO Nó 6
        
        // Resposta Nó 4
        No.inserir(2, "(1) Ataque ou \n(2) Defesa?");//Para 1 GO Nó 1 || Para 2 GO Nó 3
        No.inserir(6, "(1) Ataque ou \n(2) Defesa?"); //Para 1 GO Nó 5 || Para 2 GO Nó 7
        
        //Resposta Nó 2
        No.inserir(1, "Seu personagem é: Guerreiro ou Ferreiro.\n São exímios lutadores marciais, sempre prontos para o combate. Possuem extremas habilidades de combate\n");
        No.inserir(3, "Seu personagem é: Paladino\n. Paladinos geralmente seguem um forte código de conduta, \n que apesar das variações de acordo com a divindade, sempre tem como base ajudar os fracos, \n  promover o bem, manter a ordem e destruir o mal.");
        
        // Resposta Nó 6
        No.inserir(5, "Seu personagem é: Ranger\n. Podem ser bons ou maus. Enquanto alguns servem como guardas florestais \n, guiando aqueles que passam pelo ambiente que guardam, outros não se importarão de matar com o pretexto de proteger o local. ");
        No.inserir(7, "Seu personagem é: Bardo\n. São cantores e contadores de histórias natos. Também são valiosíssimas fontes de informação");
        
        //Resposta Nó 8        
        No.inserir(12, "Você pefere \n luta (1) Corpo a Corpo ou \n (2) à distância?");// Para 1 GO Nó 10 || Para 2 GO Nó 14
        // Resposta Nó 12
        No.inserir(10, "(1) Ataque ou \n(2) Defesa?");//Para 1 GO Nó 9 || Para 2 GO Nó 11
        No.inserir(14, "(1) Ataque ou \n(2) Defesa?"); //Para 1 GO Nó 13 || Para 2 GO Nó 15
        
        // Resposta Nó 10
        No.inserir(9, "Seu personagem é: Monge\n. Monges podem ser bons ou maus, \n dependendo da linha filosófica adotada por sua ordem ou monastério (ou possível juramento)");
        No.inserir(11,"Seu personagem é: Alquimista\n. Responsável pela criação de toda sorte de poções e compostos,\n desde poções de cura, entre outras finalidades" );
        
        
       // Resposta Nó 14
        No.inserir(13, "Seu personagem é: Mago\n. O Mago se vale basicamente de seu uso de poderio arcano em combate.");
        No.inserir(15, "Seu personagem é: Clérigo\n. na maioria das vezes, são o terror das forças malignas.\n Também podem trazer da morte (reviver) outros personagens, da mesma forma que pode os levar à mesma,\n sem o matar antes. Seu poder baseia-se em fé e, portanto, utiliza da magia divina. ");
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilhas;

import java.util.Stack;

/**
 * 2. Com recurso ao uso da pilha, fazer um programa que converte um nr inteiro no correspondente
    no sistema binario;
 *
 * @author Ivo
 */
public class ExerPilha {
    public static void main(String[] args) {
        imprimirResult(14); 
        imprimirResult(17);
        imprimirResult(20);
    }
    
    public static void imprimirResult(int numero){
        System.out.println(numero + " em binario: " +decimalBinar(numero));
    }
    
     /*Recebe o numero decimal*/
    public static String decimalBinar(int numero){ 
       
     
        pilhas.Pilha pilha = new pilhas.Pilha();

        String numBinario = "";/*Numero a ser retornado | inicializado com vazio*/
        int resto;
        
        while (numero > 0){ /*enquanto o nr escrito for > 0 sera feita as divisoes*/
            resto = numero % 2;
            pilha.push(resto);
            numero = numero / 2;
        }
        
        /*enqnto a pilha nao estiver vazia | comeca a desimpilhar e colocar na string*/
        while (!pilha.empty()){ 
           numBinario += pilha.pop(); /*desimpilhar = pop*/
        }
        
        
        /*retorna o numero binario*/
        return numBinario; 
    }
    
}

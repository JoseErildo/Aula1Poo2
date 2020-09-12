/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;



public class Fibonacci {
    private int anterior = 0;
    private int atual = 1;
    
    public Fibonacci(){
        
    }
    
    public Fibonacci(int termo){
        for(int i = 0; i< termo; i++){
            proximo();
        }
    }
    
    public void proximo(){
        int proximo = anterior + atual;
        anterior = atual;
        atual = proximo;
    }
    
    public int getAtual(){
        return this.atual;
    }
}

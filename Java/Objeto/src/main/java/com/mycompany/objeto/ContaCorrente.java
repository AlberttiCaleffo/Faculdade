/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.objeto;

/**
 *
 * @author ALBERTTICALEFFO
 */
public class ContaCorrente {
    //atributos
    String nome;
    double saldo;
    int numConta;
    
    ContaCorrente(String n, double s, int num){
        nome = n;
        saldo = s;
        numConta = num;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Clodoaldo", 550.0, 3350);
        System.out.println("Nome: " + cc.nome);
        System.out.println("Saldo: " + cc.saldo);
        System.out.println("Numero da Conta: " + cc.numConta);
    }
    
}

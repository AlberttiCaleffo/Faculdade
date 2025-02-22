/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.objeto;

/**
 *
 * @author ALBERTTICALEFFO
 */
public class Poupanca {
    //atributos
    String nome;
    float saldo;
    float juros;
    char tipo;
    
    Poupanca(String n, float s, float j, char t){
        nome = n;
        saldo = s;
        juros = j;
        tipo = t;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poupanca poupa = new Poupanca("Vitor", 1000.0f, 1.10f, 'c');
        System.out.println("Nome: " + poupa.nome);
        System.out.println("Saldo: " + poupa.saldo);
        System.out.println("Juros: " + poupa.juros + "%");
        System.out.println("Tipo de conta: " + poupa.tipo);
        
        Poupanca poupa1 = new Poupanca("João", 1100.0f, 1.10f, 'c');
        System.out.println("Nome: " + poupa1.nome);
        System.out.println("Saldo: " + poupa1.saldo);
        System.out.println("Juros: " + poupa1.juros + "%");
        System.out.println("Tipo de conta: " + poupa1.tipo);
    }
    
}

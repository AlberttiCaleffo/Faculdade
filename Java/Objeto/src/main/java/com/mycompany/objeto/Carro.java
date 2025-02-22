/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.objeto;

/**
 *
 * @author ALBERTTICALEFFO
 */
public class Carro {
    //Atributos
    String marca;
    String modelo;
    int ano;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro meuCarro = new Carro();
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Argo";
        meuCarro.ano = 2024;
        meuCarro.exibirDetalhes();
    }
    //Metodo
    public void exibirDetalhes(){
        System.out.println("Marca " + marca + " modelo " + modelo + " ano " + ano);
    }
    
}

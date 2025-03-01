/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aulaprojeto;
import javax.swing.JOptionPane;

/**
 *
 * @author ALBERTTICALEFFO
 */
public class Idade {
    // CRIAÇÃO DE ATRIBUTOS
    int idade;
    float altura;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CRIAÇÃO DE OBJETO
        Idade idade1 = new Idade();
        // Entrada da idade
        int suaIdade = Integer.parseInt(JOptionPane.showInputDialog("Entre com sua idade: "));
        idade1.idade = suaIdade;
        //Entrada da altura
        float suaAltura = Float.parseFloat(JOptionPane.showInputDialog("Entre com sua idade: "));
        idade1.altura = suaAltura;
        //Chamada da função
        idade1.verificaCond();
    }
    public void verificaCond(){
        if(idade > 18 && altura > 1.80){
            JOptionPane.showMessageDialog(null, "Pode competir!");
        }else{
            JOptionPane.showMessageDialog(null, "Não pode competir!");
        }
    }
    
}

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
public class Condicao1 {
    //CRIAÇÃO DE ATRIBUTO
    int idade;
    public void exibiridade(){
        if(idade > 18){
            JOptionPane.showMessageDialog(null, "Maior de idade");
        }
        else{
            JOptionPane.showMessageDialog(null, "Menor de idade");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CRIAÇÃO DO OBJETO
        Condicao1 idade1 = new Condicao1();
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano de nascimento: "));
        idade1.idade = 2025 - anoNascimento;
        idade1.exibiridade();
    }
    
}

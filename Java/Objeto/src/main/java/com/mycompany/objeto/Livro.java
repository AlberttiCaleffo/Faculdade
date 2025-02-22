/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.objeto;

import javax.swing.JOptionPane;

/**
 *
 * @author ALBERTTICALEFFO
 */
public class Livro {
    String titulo;
    String autor;
    int paginas;
    /**
     * @param args the command line arguments
     */
    public void exibirLivro(){
        JOptionPane.showMessageDialog(null, "Titulo: " + titulo + "\nAutor: " + autor + "\nPaginas: " + paginas);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Livro livro1 = new Livro();
        livro1.titulo = "Harry Potter";
        livro1.autor = "Holling";
        livro1.paginas = 300;
        livro1.exibirLivro();
    }
    
}

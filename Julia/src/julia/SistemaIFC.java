/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package julia;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class SistemaIFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudante camada = new Estudante();
        camada.getNome();
        camada.obterIdade (new Date ());
        camada.genero = 'm';
        
        System.out.println("hello world");
        
    }
    
}

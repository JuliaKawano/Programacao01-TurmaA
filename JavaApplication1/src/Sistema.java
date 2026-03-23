
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author suporte
 */
public class Sistema {
    
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


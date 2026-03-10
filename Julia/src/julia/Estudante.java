/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package julia;
import java.util.Date;

public class Estudante {
    public String nome;
    public Date dataNascimento;
    public String cpf;
    public char genero;
    public String matricula;
    public String email;
   
    public Estudante(){
        this.nome = "Nobody";
    }
   
    public int obterIdade (Date hoje) {
        int idade =0;
        // Lógica para calcular idade.
        return idade;
    }
    public String getNome(){
        obterIdade (new Date());
        return this.nome;
    }
    
    public void setNome (String _nome){
        this.nome=_nome;
    }
}


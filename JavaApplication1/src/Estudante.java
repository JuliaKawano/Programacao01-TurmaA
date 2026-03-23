
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Estudante {

    public String cpf;
    public String nome;
    public Date dataNascimento;
    public char genero;
    public int matricula;
    public String email;
    public int telefone;
    public int anoDeIngresso;
    public int semestreIngresso;
    public String situacaoAcademica; 

    public Estudante(){
        this.nome = "Nobody";
    }
       
    public int obterIdade(Date hoje) {
    int idade = 0;
    return idade;
    }
    public String getNome (){
        return this.nome;
    }
           
    public void setNome (String _nome){
        this.nome = _nome;
    }
           
    public Date getDate (){
        return this.dataNascimento;
    }
           
    public void setDate (Date _dataNascimento){
        this.dataNascimento = _dataNascimento;
    }
   
    public String getCpf (){
        return this.cpf;
    }
           
    public void setCpf (String _cpf){
        this.cpf = _cpf;
    }
   
    public char getGenero (){
        return this.genero;
    }
           
    public void setGenero (char _genero){
        this.genero = _genero;
    }
   
    public int getMatricula (){
        return this.matricula;
    }
           
    public void setMatricula (int _matricula){
        this.matricula = _matricula;
    }
   
    public String getEmail (){
        return this.email;
    }
    
    public void setEmail(String _email){
        this.email = _email;
        
    }
            
    public int getTelefone () {
        return this.telefone;
    }
    
    public void setTelefone (int _telefone){
        this.telefone = _telefone;
    }
    
    public int getAnoDeIngresso() {
        return this.anoDeIngresso;
    }

    public void setAnoDeIngresso(int _anoDeIngresso) {
        this.anoDeIngresso = _anoDeIngresso;
    }

    public int getSemestreIngresso() {
        return this.semestreIngresso;
    }

    public void setSemestreIngresso(int _SemestreIngresso) {
        this.semestreIngresso = _SemestreIngresso;
    }
    
    public String getsituacaoAcademica() {
        return this.situacaoAcademica;
    }

    public void setsituacaoAcademica(String _situacaoAcademica) {
        this.situacaoAcademica = _situacaoAcademica;
    }

    
    
}
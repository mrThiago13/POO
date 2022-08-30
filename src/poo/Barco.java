/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author thiago.silva14
 */
public class Barco {
    String modelo;
    String cor;
    String captao;
    String nome;
    int ano;
    
    void ImprimeDadosDobarco(){
        
        System.out.println("--------NAVIO--------");
        System.out.println("Modelo: "+modelo);
        System.out.println("Cor: "+cor);
        System.out.println("Captão: "+captao);
        System.out.println("Nome: "+nome);
        System.out.println("Ano: "+ano);
    }
    
    
    public String getModelo(){
    return modelo;
    
}

public void setModelo (String modelo){
    this.modelo=modelo;
}
        public String getCor(){
    return cor;
    
}

public void setCor (String cor){
    this.cor=cor;
}
public String getCaptao(){
    return captao;
    
}

public void setCaptao (String captao){
    this.captao=captao;
    
}
public String getNome(){
return nome;    
}
public void setNome (String nome){
    this.nome=nome;
}
public int getAno(){
    return ano;
    
}

public void setAno (int ano){
    this.ano=ano;
}
}

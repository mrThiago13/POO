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
public class Pessoa {
    
    String nome;
    String corDoCabelo;
    String bioTipo;
    int idade;
    
    public String getNome(){
    return nome;
    
}

public void setTipo (String nome){
    this.nome=nome;
}
        public String getCorDoCabelo(){
    return corDoCabelo;
    
}

public void setCorDoCabelo (String corDoCabelo){
    this.corDoCabelo=corDoCabelo;
}
public String getBioTipo(){
    return bioTipo;
    
}

public void setBioTipo (String bioTipo){
    this.bioTipo=bioTipo;
    
}

public int getIdade(){
    return idade;
    
}

public void setIdade (int idade){
    this.idade=idade;
}
}

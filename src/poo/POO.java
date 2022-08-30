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
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        
        meuCarro.setCor("azul");
        meuCarro.setNumPortas(4);
        meuCarro.setPlaca("RMTH-1616");
        meuCarro.setTipo("fusca");
        
        System.out.println("--------CARRO--------");
        System.out.println("cor: "+meuCarro.getCor());
        System.out.println("quantidade de Portas: "+meuCarro.getNumPortas());
        System.out.println("Placa: "+meuCarro.getPlaca());
        System.out.println("Modelo: "+meuCarro.getTipo());
               
        Barco meuBarco = new Barco();
        
        
        meuBarco.setModelo("Couraçado");
        meuBarco.setCor("cinza");
        meuBarco.setCaptao("Kniaz Potemkin Tavricheskiy");
        meuBarco.setNome("URSS-Dvenadsat Apostolov");
        meuBarco.setAno(1893);
        
        
        System.out.println("--------NAVIO--------");
        System.out.println("Modelo: ");
        System.out.println("Cor: ");
        System.out.println("Captão: ");
        System.out.println("Nome: ");
        System.out.println("Ano: ");
        
        Pessoa meuPessoa = new Pessoa();
        
        meuPessoa.setTipo("Raissa Marchioro");
        meuPessoa.setCorDoCabelo("Loira");
        meuPessoa.setBioTipo("Magra");
        meuPessoa.setIdade(16);
        
        System.out.println("--------PESSOA--------");
        System.out.println("nome: "+meuPessoa.getNome());
        System.out.println("Cor do cabelo: "+meuPessoa.getCorDoCabelo());
        System.out.println("Biotipo: "+meuPessoa.getBioTipo());
        System.out.println("idade: "+meuPessoa.getIdade());
    }
    
}

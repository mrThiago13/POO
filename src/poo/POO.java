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
               
    }
    
}

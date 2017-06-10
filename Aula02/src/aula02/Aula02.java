/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author KELSILVA-WINDOWS7
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo= "caneta c1";
        c1.cor= "azul";
        c1.carga= 5;
        c1.ponta= 0.5f;
        c1.tampada= false;
        c1.status();
        c1.rabiscar();
        System.out.println("-----------------");
        
        
        Caneta c2 = new Caneta ();
        c2.modelo = "caneta c2 ";
        c2.cor= "verde";
        c2.carga = 10;
        c2.ponta = 0.12f;
        c2.tampada = true;
        c2.status();
        c2.rabiscar();
        
        
    }
    
}

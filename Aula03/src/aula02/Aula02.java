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
        c1.modelo= "BIC cristal ";
        c1.cor = "azul";
       // c1.ponta = 12;
        c1.carga = 80;
        //c1.tampada= true;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        
    }
    
}

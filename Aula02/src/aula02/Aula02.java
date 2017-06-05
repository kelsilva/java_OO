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
        c1.modelo=" primeira caneta";
        c1.cor= "azul";
        c1.ponta= 0.5f;
        c1.tampar();// aki referencia a atributos
        //c1.status();// aki referencia a metodos
        c1.rabiscar();
       
        
        
        Caneta c2 = new Caneta();
        c2.modelo= "segunda caneta";
        c2.cor= "verde";
        c2.destampar();
       // c2.status();
        c2.rabiscar();
        
       
        
    }
    
}

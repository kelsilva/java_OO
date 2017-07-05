/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author KELSILVA-WINDOWS7
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Videos v[]= new Videos[3];
       v[0] = new Videos("Aula 1 de POO");
       v[1] = new Videos("Aula 12 de POO");
       v[2] = new Videos ("Aula de html5");
       System.out.println(v[0].toString());
       
       Gafanhoto g[]= new Gafanhoto[2];
       g[0]= new Gafanhoto("jubileu", 22, "M","juba");
       g[1]= new Gafanhoto("creuza", 13, "F","creuzita");
       
       
          System.out.println(g[0].toString());
        
    }
    
}

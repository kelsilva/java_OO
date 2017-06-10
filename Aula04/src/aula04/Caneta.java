/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author KELSILVA-WINDOWS7
 */
public class Caneta {

    public String modelo;
    private Float ponta;

    public String getModelo() {
        return this.modelo;
    } 
      public void setModelo(String m){
        this.modelo = m ;
        
      }
      public float getPonta(){
         return this.ponta;
      }
       public void setPonta(float p){
           this.ponta=p;
       }
       public void status(){
           System.out.println("Sobre a Caneta");
           System.out.println("Modelo "+ this.modelo);
           System.out.println("Ponta "+ this.ponta);
       
       }

}

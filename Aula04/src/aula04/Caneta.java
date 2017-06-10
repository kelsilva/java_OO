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
    private boolean tampada;
    private String cor;
    
    public  Caneta(String m,String c,float p){// este e o metodo construtor
      this.modelo= m;
      this.cor= c;
      this.ponta = p;
      this.tampar();
    
    }

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
       
       public void tampar(){
       tampada= true;
              
       }
       public void destampar(){
        
         tampada= false;  
       }
       
       public void status(){
           System.out.println("Sobre a Caneta");
           System.out.println("Modelo "+ this.modelo);
           System.out.println("Ponta "+ this.ponta);
           System.out.println("cor  " + this.cor);
           System.out.println("tampada  "+ this.tampada);
           
       
       }

}

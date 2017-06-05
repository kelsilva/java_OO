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
public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
         System.out.println("uma caneta modelo " + this.modelo);
         System.out.println("ponta " + this.ponta);
         System.out.println("carga " + this.carga);
         System.out.println("cor " + this.cor);
         System.out.println("esta tampada " + this.tampada);
    } 
    
    void rabiscar(){
    if (tampada == true){
        System.out.println("ERRO! Nao posso rabiscar");
    }else{
      System.out.println("estou rabiscando");
    
    }
    
    }
    void tampar(){
    this.tampada = true;
    }
    
    void destampar(){
       this.tampada= false;
    
    }
    
}

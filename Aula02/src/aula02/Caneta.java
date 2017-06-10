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

    void status() {
        System.out.println("caneta modelo; " + this.modelo);
        System.out.println("caneta cor; " + this.cor);
        System.out.println("caneta ponta; " + this.ponta);
        System.out.println("caneta carga; " + this.carga);
        System.out.println("caneta tampada; " + this.tampada);

    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO a caneta esta tampada nao se pode rabiscar");
        } else {
            System.out.println("Pode Rabiscar"); 
        }
        
    }
    void tampar(){
        this.tampada = true;
        
    }
    void destampada(){
        this.tampada = false;
    }

}

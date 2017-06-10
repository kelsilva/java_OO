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

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("caneta modelo; " + this.modelo);
        System.out.println("caneta cor; " + this.cor);
        System.out.println("caneta ponta; " + this.ponta);
        System.out.println("caneta carga; " + this.carga);
        System.out.println("caneta tampada; " + this.tampada);

    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO a caneta esta tampada nao se pode rabiscar");
        } else {
            System.out.println("Pode Rabiscar");
        }

    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampar() {
        this.tampada = false;
    }

}

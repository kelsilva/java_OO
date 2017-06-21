/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author KELSILVA-WINDOWS7
 */
public class ControleRemoto implements Controlador {
    // atributos
     private int volume;
     private boolean ligado;
     private boolean tocando;
     // construtor
     public ControleRemoto(){
      
         this.volume  = 50;
         this.ligado  = true;
         this.tocando = false;
                 
     // getter e setter
     }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    // metodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---MENU---" );
        System.out.println("esta ligado? " + this.getLigado());
        System.out.println("Esta tocando? " + this.getTocando());
        System.out.print ("Volume? "+ this.getVolume());
        for (int i=0; i <=this.getVolume();i+=10){
            System.out.print("[] ");
            System.out.print("\n");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
         this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("imposivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
          this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("imposivel diminuir volume");        
        }
    }

    @Override
    public void ligarMudo() {
        
        if (this.getLigado()  &&  this.getVolume()>0)
            this.setVolume(0);
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado()&& this.getVolume()==0){
        
        this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado()&& !(this.getTocando())){
           this.setTocando(true);
        }else{
            System.out.println("Nao consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado()&& this.getTocando()){
          this.setLigado(false);
        }else{
            System.out.println("Nao conseguir pausar");
        }
    }
    
    
}

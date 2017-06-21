/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author KELSILVA-WINDOWS7
 */
public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    

     
    //metodos personalizados
    
    public void estadoAtual(){
       System.out.println("--------------------------");
        System.out.println("conta :"+ this.getNumConta());
        System.out.println("tipo :"+ this.getTipo());
        System.out.println("dono :"+ this.getDono());
        System.out.println("saldo: "+ this.getSaldo());
        System.out.println("status " + this.getStatus());
    }
    
    
public void abrirConta(String t){
     this.setTipo(t);
     this.setStatus (true);
     if (t == "CC") {
        this.setSaldo (50);
    } else if (t== "CP"){
         this.setSaldo (150);
    }
     System.out.println("Conta aberta com Sucesso");
}     
public void fecharConta(){
      
     if (this.getSaldo() < 0) {
         System.out.println("Conta nao pode ser fechada pois tem dinheiro");
        
    } else if (this.getSaldo()> 0) {
         System.out.println("Conta nao pode ser fechada pois tem debito");
    }else{
    this.setStatus(false);
         System.out.println("Conta fechada com sucesso");
    }

}
public void depositar(float v){
  if (this.getStatus()){
    //this.saldo= this.saldo+v;  
    this.setSaldo(this.getSaldo() + v) ;
      System.out.println("deposito realizado  na conta " + this.getDono());
  }else {
      System.out.println("IMposivel depositar em uma conta fechada");
}
}
public void sacar(float v){
    if (this.getStatus()){
    
         if (getSaldo()>= v){
         this.setSaldo(this.getSaldo()-v);
             System.out.println("saque realizado na conta " + this.getDono());
         }else{
             System.out.println("Saldo insuficiente para saque");
         }
    
    }else {
        System.out.println("imposivel sacar de uma conta fechada");
    }

}
public void pagarMesnsal(){

 int v=0;
    if (this.getTipo()=="CC") {
        v= 12;
        
        
    } else if(this.getTipo()=="CP") {
        v=20;
    }
    if (this.getStatus()){
       this.setSaldo(this.getSaldo()-v);
        System.out.println("Mensalidade paga com sucesso " + this.getDono());
    }else {
        System.out.println("Imposivel pagar uma conta fechada");
    
    }
}
//metodos especiais construtor
public void ContaBanco(){
        
   this.saldo  = 0;
   this.status = false;
  }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
  
  
   

  
} 

    
    


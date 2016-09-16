/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author SP
 */
public class CafeteraDeAlbin { 
 private int capacidadlimite;private int capacidadestandar; 

    public CafeteraDeAlbin() { 
      this.capacidadestandar=0; 
      this.capacidadlimite=1000;
    } 

    public CafeteraDeAlbin(int capacidadlimite, int capacidadestandar) {
       this.capacidadestandar=capacidadestandar; 
       if(capacidadlimite<capacidadestandar){ 
         this.capacidadestandar=capacidadestandar;
       }else{ 
         this.capacidadestandar=capacidadlimite;
       }
        
    } 

    public int getCapacidadlimite() {
        return capacidadlimite;
    }

    public void setCapacidadlimite(int capacidadlimite) {
        this.capacidadlimite = capacidadlimite;
    }

    public int getCapacidadestandar() {
        return capacidadestandar;
    }

    public void setCapacidadestandar(int capacidadestandar) {
        this.capacidadestandar = capacidadestandar;
    }
    public CafeteraDeAlbin agregarcafe(int cantidad){ 
      CafeteraDeAlbin agg; 
      if(cantidad<capacidadlimite){ 
       this.capacidadestandar=this.capacidadestandar + cantidad;
      }else{ 
        this.capacidadestandar=this.capacidadlimite;
      } 
      agg=new CafeteraDeAlbin(this.capacidadlimite,this.capacidadestandar); 
      return agg;
    } 
    public String llenarcafetera(){ 
     String llenado; 
     this.capacidadestandar=this.capacidadlimite; 
     llenado="Cafetera llenada exitosamente !Puede Continuar!"; 
     return llenado;
    } 
    public CafeteraDeAlbin servircafe(int capacidad){ 
     CafeteraDeAlbin servir; 
     if(capacidad<this.capacidadestandar){ 
      this.capacidadestandar=this.capacidadestandar - capacidad;
     }else{ 
      this.capacidadestandar=0;
     } 
     servir=new CafeteraDeAlbin(this.capacidadlimite,this.capacidadestandar); 
     return servir;
    } 
    public CafeteraDeAlbin vaciarcafetera(){ 
    CafeteraDeAlbin vaciar; 
    this.capacidadestandar=0; 
    vaciar=new CafeteraDeAlbin(this.capacidadlimite,this.capacidadestandar); 
    return vaciar;
      
    }
    
    
    
 
    
}

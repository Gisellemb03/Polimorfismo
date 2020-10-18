/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

/**
 *
 * @author gi_mb
 */
public abstract class FigurasGeometricas {
    protected double base;
    protected double altura;
    
     public FigurasGeometricas(){
        
    }

    public FigurasGeometricas(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
    public abstract double calcularArea(); 
    
    public abstract double calcularPerimetro();
    
}

    


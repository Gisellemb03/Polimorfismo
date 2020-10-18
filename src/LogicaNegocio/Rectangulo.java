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
public class Rectangulo extends FigurasGeometricas {

    public Rectangulo() {
        super();
    }
    
    public Rectangulo(double base, double altura) {
        super(base, altura);
        
    }
    
    
    

    @Override
    public double calcularArea() {
        return (base * altura);
    }
    
    @Override
    public double calcularPerimetro(){
        return((base*2)+(altura*2));
    }

}

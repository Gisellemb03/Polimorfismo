/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import LogicaNegocio.FigurasGeometricas;
import LogicaNegocio.TrianguloEquilatero;

/**
 *
 * @author gi_mb
 */
public class GUITrianguloEquilatero extends GUIFiguras {

    public GUITrianguloEquilatero() {
        this.setTitle("TRIANGULO EQUILATERO");
    }
    

    @Override
    protected void calcularArea() {
        double base = Double.parseDouble(txtBase.getText()); //obtenemos
        double altura = Double.parseDouble(txtAltura.getText()); //obtenemos
        FigurasGeometricas triangulo = new TrianguloEquilatero(base,altura); //instanciamos el radio
        double area= triangulo.calcularArea();
        txtArea.setText((String.valueOf(area)));
        
        
    }

    @Override
    protected void calcularPerimetro() {
        double base = Double.parseDouble(txtBase.getText()); //obtenemos
        double altura = Double.parseDouble(txtAltura.getText()); //obtenemos
        FigurasGeometricas triangulo = new TrianguloEquilatero(base,altura); //instanciamos el radio
        double perimetro= triangulo.calcularPerimetro();
        txtPerimetro.setText((String.valueOf(perimetro)));
        
    } 
}

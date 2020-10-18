/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import LogicaNegocio.FigurasGeometricas;
import LogicaNegocio.Rectangulo;

/**
 *
 * @author gi_mb
 */
public class GUIRectangulo extends GUIFiguras{

    public GUIRectangulo() {
        this.setTitle("RECTANGULO");
    }
    

    @Override
    protected void calcularArea() {
        double base = Double.parseDouble(txtBase.getText()); //obtenemos
        double altura = Double.parseDouble(txtAltura.getText()); //obtenemos
        FigurasGeometricas rectangulo = new Rectangulo(base,altura); //instanciamos el radio
        double area= rectangulo.calcularArea();
        txtArea.setText((String.valueOf(area)));
        
    }

    @Override
    protected void calcularPerimetro() {
        double base = Double.parseDouble(txtBase.getText()); //obtenemos
        double altura = Double.parseDouble(txtAltura.getText()); //obtenemos
        FigurasGeometricas rectangulo = new Rectangulo(base,altura); //instanciamos el radio
        double perimetro= rectangulo.calcularPerimetro();
        txtPerimetro.setText((String.valueOf(perimetro)));
        
    }
    
}

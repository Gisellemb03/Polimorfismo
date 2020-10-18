/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import LogicaNegocio.Circulo;
import LogicaNegocio.FigurasGeometricas;
import java.text.DecimalFormat;

/**
 *
 * @author gi_mb
 */
public class GUICirculo extends GUIFiguras{
    DecimalFormat formato = new DecimalFormat("0.00");
    
    

    @Override
    protected void calcularArea() {
        double radio = Double.parseDouble(txtBase.getText()); //obtenemos
        FigurasGeometricas circulo = new Circulo(radio); //instanciamos el radio
        double area= circulo.calcularArea();
        txtArea.setText((String.valueOf(formato.format(area))));
        
    }

    public GUICirculo() {
        
        this.jLabel1.setText("Radio");
        this.jLabel2.setVisible(false);
        this.txtAltura.setVisible(false);
        this.setTitle("CIRCULO");
    }

    @Override
    protected void calcularPerimetro() {
        double radio = Double.parseDouble(txtBase.getText()); //obtenemos
        FigurasGeometricas circulo = new Circulo(radio); //instanciamos el radio
        double perimetro= circulo.calcularPerimetro();
        txtPerimetro.setText(String.valueOf(formato.format(perimetro)));
        
        
       
    }
    
}

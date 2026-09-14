/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaherenciasupervivencia;

/**
 *
 * @author GZ TIENDA
 */
public class clsArma extends clsItem{
    
    private String tipoMunicion;
    private double danio;
    
    public clsArma (String nombre, int espacioOcupado, String tipoMunicion, double danio)
    {
        super(nombre, espacioOcupado);
                
        this.tipoMunicion = tipoMunicion;
        this.danio = danio;
    }
    
    @Override 
    public String usarItem()
    { 
       String mensaje = "Disparando con " + danio + " puntos de impacto";
       return mensaje; 
    }
    
    @Override
    public boolean esCombinable()
    {
      return false;
    }
}

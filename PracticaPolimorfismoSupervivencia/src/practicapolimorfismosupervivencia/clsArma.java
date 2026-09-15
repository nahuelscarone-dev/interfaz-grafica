/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapolimorfismosupervivencia;

/**
 *
 * @author GZ TIENDA
 */
public class clsArma extends clsItem implements Recargable{
    
    private String tipoMunicion;
    private double danio;
    private int municionActual;
    
    public clsArma (String nombre, int espacioOcupado, EstadoDurabilidad estado ,String tipoMunicion, double danio, int municionActual)
    {
        super(nombre, espacioOcupado, estado);
                
        this.tipoMunicion = tipoMunicion;
        this.danio = danio;
        this.municionActual = municionActual;
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

    @Override
    public String aplicarRecarga(int cantMunicion)
    {
        municionActual = municionActual + cantMunicion;    
        return "El arma " + getNombre() + " realizó una recarga de " + municionActual;
    }
}

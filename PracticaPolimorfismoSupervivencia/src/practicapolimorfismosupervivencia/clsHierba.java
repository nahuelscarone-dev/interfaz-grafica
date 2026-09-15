/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapolimorfismosupervivencia;

/**
 *
 * @author GZ TIENDA
 */
public class clsHierba extends clsItem {
    
    private String color;
    private int puntosCuracion;
    
    public clsHierba (String nombre, int espacioOcupado, EstadoDurabilidad estado ,String color, int puntosCuracion)
    {
        super(nombre, espacioOcupado, estado);
                
        this.color = color;
        this.puntosCuracion = puntosCuracion;
    }
    
     @Override 
    public String usarItem()
    { 
       String mensaje = "Te has curado " + puntosCuracion + " de salud";
       return mensaje; 
    }
    
    @Override
    public boolean esCombinable()
    {
      return true;
    }
}

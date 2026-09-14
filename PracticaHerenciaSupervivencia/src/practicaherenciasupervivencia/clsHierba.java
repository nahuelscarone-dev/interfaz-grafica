/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaherenciasupervivencia;

/**
 *
 * @author GZ TIENDA
 */
public class clsHierba extends clsItem {
    
    private String color;
    private int puntosCuracion;
    
    public clsHierba (String nombre, int espacioOcupado, String color, int puntosCuracion)
    {
        super(nombre, espacioOcupado);
                
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

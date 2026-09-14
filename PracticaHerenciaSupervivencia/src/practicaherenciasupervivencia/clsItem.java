/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaherenciasupervivencia;

/**
 *
 * @author GZ TIENDA
 */
public abstract class clsItem {
    
    private String nombre;
    private int espacioOcupado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    public void setEspacioOcupado(int espacioOcupado) {
        this.espacioOcupado = espacioOcupado;
    }
    
    public clsItem (String nombre, int espacioOcupado)
    {
        this.nombre = nombre;
        this.espacioOcupado = espacioOcupado;   
    }
    
    public void mostrarInfoBasica()
    {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El espacio que ocupa es: " + espacioOcupado);
    }
    
    public abstract String usarItem();
    
    public abstract boolean esCombinable();
}

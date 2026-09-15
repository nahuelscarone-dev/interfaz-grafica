/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapolimorfismosupervivencia;

/**
 *
 * @author GZ TIENDA
 */
public abstract class clsItem {
    
    private String nombre;
    private int espacioOcupado;
    private EstadoDurabilidad estado;
    
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
    
    public EstadoDurabilidad getEstado() {
        return estado;
    }

    public void setEstado(EstadoDurabilidad estado) {
        this.estado = estado;
    }
    
    public clsItem (String nombre, int espacioOcupado, EstadoDurabilidad estado)
    {
        this.nombre = nombre;
        this.espacioOcupado = espacioOcupado;
        this.estado = estado;
    }
    
    public void mostrarInfoBasica()
    {
        System.out.println("El nombre es: " + nombre);
        System.out.println("El espacio que ocupa es: " + espacioOcupado);
    }
    
    public abstract String usarItem();
    
    public abstract boolean esCombinable();

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapolimorfismosupervivencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GZ TIENDA
 */
public class PracticaPolimorfismoSupervivencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
       
        clsArma arma1 = new clsArma("ametralladora", 4, EstadoDurabilidad.DESGASTADO, "balas pesadas", 65.7, 50);
        clsHierba hierba1 = new clsHierba("Romero", 2, EstadoDurabilidad.DESTRUIDO, "verde", 80);
        clsHierba hierba2 = new clsHierba("Orégano", 1, EstadoDurabilidad.DESGASTADO, "marron", 50);
        
        
        boolean entradaValida = false;
        ArrayList<clsItem> listaItems = new ArrayList<>();
        
        listaItems.add(arma1);
        listaItems.add(hierba1);
        listaItems.add(hierba2);
        
        System.out.println("SISTEMA DE CARGA DE INVENTARIO");
        while(!entradaValida)
        {
            System.out.println("¿Cuántos ítems desea extraer del baúl");
            String entradaUsuario = scanner.nextLine();
            
            try{
                entradaValida = true;
                int cantidadPedida = Integer.parseInt(entradaUsuario);
                
                    for(int i = 0; i < cantidadPedida && i < listaItems.size(); i++)
                    {
                        clsItem item = listaItems.get(i);
                        if(item.getEstado() != EstadoDurabilidad.DESTRUIDO)
                        {
                            if(item instanceof Recargable r)
                            {
                                System.out.println("El ítem es recargable." + r.aplicarRecarga(50));
                            }else
                            {
                                System.out.println("El item " + item.getNombre() + " no es recargable.");
                            }
                        }
                    }
                }
            catch(NumberFormatException e){
                System.out.println("ERROR: Ingrese únicamente números enteros. Intentando nuevamente. \n ");
            }
        }
        
    }
    
}

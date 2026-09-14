
package practicaherenciasupervivencia;

import java.util.ArrayList;

/**
 *
 * @author GZ TIENDA
 */
public class PracticaHerenciaSupervivencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        clsArma arma1 = new clsArma("ametralladora", 4, "balas pesadas", 65.7);
        clsHierba hierba1 = new clsHierba("Romero", 2, "verde", 80);
        clsHierba hierba2 = new clsHierba("Orégano", 1, "marron", 50);
        
        ArrayList<clsItem> listaItems = new ArrayList<>();
        
        listaItems.add(arma1);
        listaItems.add(hierba1);
        listaItems.add(hierba2);
        
        // Forma de agregar todos los objetos a una lista.
        //listaItems.addAll(List.of(arma1, arma2, arma3, arma4, hierba1, hierba2));
        
        for(clsItem item : listaItems)
        {
            // Mostramos la infoBasica por item;
            item.mostrarInfoBasica();
            System.out.println("Acción: " + item.usarItem());
            
            if(item.esCombinable())
            {
                System.out.println("ADVERTENCIA: El item seleccionado puede combinarlo");
            }
            
            System.out.println(("-----------------"));
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicajava.pkg2;

/**
 *
 * @author GZ TIENDA
 */
public class clsMetodosVoid {
    
    public void saludar(){
        
        System.out.println("Hola, bienvenido al sistema");
        
    }
//    2.        Crear un método imprimirLinea() que imprima 30 guiones. Llamarlo para separar secciones.
    
    public void imprimirLinea()
    {
        for (int i=0; i<30; i++)
        {
            System.out.print("Imprimiendo línea N°: " + i + " -");
        }
        System.out.println("");
    }
    
    //3.        Crear un método saludarPersona(String nombre) que imprima un saludo personalizado.
    
    public void saludarPersona(String nombre)
    {
        System.out.println("Buenas tardes señor " + nombre);
    }
    
    //4.        Crear un método mostrarTabla(int numero) que imprima la tabla de multiplicar completa de ese número.
    
    public void mostrarTabla(int numero)
    {
        System.out.println("Tabla del número" + numero);
        for (int i=1; i<=10; i++)
        {
            int producto = numero *i;
            
            System.out.println(numero + "x" + i + "=" + producto);
        }
    }
    
    // 5.        Crear un método mostrarArray(int[] arr) que imprima todos los elementos entre corchetes en una línea.

    public void mostrarArray(int[] arr)
    {   
        System.out.print("[");
      for (int n : arr)
      {
          System.out.print(n + " ");
      }
        System.out.println("]");
    }
    
    // 6.        Crear un método contarHasta(int n) que imprima los números del 1 al n usando un ciclo for.
    
    public void contarHasta(int n)
    {
        for (int i=1; i<=n; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    //7.        Crear un método mostrarPares(int limite) que imprima todos los números pares desde 2 hasta el límite.
    
    public void mostrarPareSinModulo(int limite)
    {
        System.out.println("Imprimiendo los números pares desde 2 hasta " + limite);
        
        for (int i = 2; i<=limite; i+=2)
        {   
            System.out.println(i);
        }
    }
    
    public void mostrarParesconModulos(int limite)
    {
        for(int i= 2; i<=limite; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }   
    }
}

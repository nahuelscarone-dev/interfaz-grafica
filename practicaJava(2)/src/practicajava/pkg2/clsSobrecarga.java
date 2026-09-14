/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicajava.pkg2;

/**
 *
 * @author GZ TIENDA
 */
public class clsSobrecarga {
    
    //1.        Crear dos versiones de imprimirLinea(): una sin parámetros (30 guiones fijos) y otra con int largo que imprime esa cantidad.
    
    public void imprimirLinea()
    {
        System.out.println("Impresión de líneas");
        
        for(int i = 1; i<=30; i++)
        {
            System.out.print("Imprimiendo línea N°: " + i + " -");
        }
        
        System.out.println();
    }
    
    public void imprimirLinea(int n)
    {
      System.out.println("Impresión de " + n +" líneas");
      
      for(int i= 1; i<=n; i++)
      {
          System.out.print("Imprimiendo línea N°: " + i + " -");
      }
        System.out.println();
    }
    
    
   //2.        Crear tres versiones de area(): una recibe el radio (círculo), otra recibe base y altura (triángulo), otra recibe dos lados (rectángulo).
    
    public double area(double radio)
    {
       double calculoRadio = Math.PI * Math.pow(radio,2);
       
       return calculoRadio;
    }
    
    public double area(double base, double altura)
    {
        double calculoArea = (base * altura) / 2;
        
        return calculoArea;
    }
    
    public double area(int lado1, int lado2)
    {
        double calculoArea = lado1*lado2;
        
        return calculoArea;
    }
    
    //3.        Crear tres versiones de imprimir(): una para int, una para double y una para String. Cada una debe aclarar el tipo en el mensaje.
    
    public void imprimir(String valor)
    {
        System.out.println("Imprimiendo el texto: " + valor);
    }
    
    public void imprimir(int valor)
    {
        System.out.println("Imprimiendo el número entero " + valor);
    }
    
    public void imprimir(double valor)
    {
        System.out.println("Imprimiendo el número decimal " + valor);
    }
    
   //4.        Crear dos versiones de saludar(): una sin parámetros ('Hola, usuario') y otra con String nombre que usa el nombre recibido.
    
    public void saludar()
    {
        System.out.println("Hola, usuario");
    }
    
    public void saludar(String usuario)
    {
        System.out.println("Hola, " + usuario);
    }
   
    //5.	Crear dos versiones de mayor(): una que recibe dos int y otra que recibe tres int y devuelve el mayor de los tres.
    
    // Versión 2 parámetros
    public int mayor(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }
    
    // Versión 3 parámetros (Usando la herramienta nativa de Java)
    public int mayor(int a, int b, int c) {
        // Compara 'a' contra el ganador de comparar 'b' y 'c'
        return Math.max(a, Math.max(b, c));
    }
}

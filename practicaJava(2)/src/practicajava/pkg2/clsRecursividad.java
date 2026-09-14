/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicajava.pkg2;

/**
 *
 * @author GZ TIENDA
 */
public class clsRecursividad {
    
    //1.        Crear un método factorial(int n) que calcule el factorial de n de forma recursiva. Probarlo para n = 0 a 10.
    
    public int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        
        return n * factorial (n-1);
    }    
    
    public void factorial010()
    {
        for(int i= 0; i<=10; i++)
        {
            System.out.println("Factorial de "+ i + "= "+ factorial(i));
        }
    }
    
    // Repasar definición...
    
    //2.        Crear un método fibonacci(int n) que devuelva el n-ésimo número de Fibonacci. Imprimir los primeros 10 términos.
    
    public int fibonacci(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n ==1)
        {
            return 1;
        }
        return fibonacci(n-1) + fibonacci (n-2);
    }
    
    public void imprimirFibonacci()
    {
        System.out.println("Imprimir los primeros 10 números de Fibonacci");
        for(int i=0; i<=10; i++)
        {
            System.out.println(fibonacci(i) + " ");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicajava.pkg2;

/**
 *
 * @author GZ TIENDA
 */
public class clsMetodosRetorno {
    
  //    1.        Crear un método sumar(int a, int b) que devuelva la suma. Usarlo en el main para imprimir resultados.  
        public int sumar(int a, int b)
        {
           return a + b;
        }    
        
  //    2.        Crear un método promedio(int[] numeros) que devuelva el promedio como double.
        public double promedio(int[] numeros)
        {
            int suma = 0;
            
            for (int num : numeros)
            {
                suma = suma + num;
            }
            double resultadoPromedio = (double) suma / numeros.length;
            
            return resultadoPromedio;
        }
  //    3.        Crear un método mayor(int a, int b) que devuelva el mayor de los dos.
        public double numeroMayor(int a, int b)
        {
            if(a>b)
            {
                System.out.println("el número " + a + " es mayor que " + b);
                return a;
            }else if(a < b)
            {
                System.out.println("el número " + b + " es mayor que " + a);
                return b;
            }else
            {
                System.out.println(a + " es igual a " + b);
                return a;
            }
        }
  //    4.        Crear un método esPar(int n) que devuelva true si el número es par, false si no.
        public boolean esPar(int n)
        {
            if(n % 2 == 0)
            {
                return true;
            }else
            {
                return false;
            }
        }
   //5.        Crear un método calificar(double nota) que devuelva 'Aprobado', 'Regular' o 'Desaprobado' según la nota.
        public String calificar(double nota)
        {
            if(nota>=7)
            {
                return "Aprobado";
                
            }else if (nota >=4 && nota <7)
            {
                return "Regular";
            }else 
            {
                return "Desaprobado";
            }
        }
        
  //6.         Crear un método mayorDelArray(int[] arr) que devuelva el mayor elemento del array.
        public int mayorDelArray(int [] arr)
        {
            // Suponemos que el primer elemento es el mayor
            int mayor = arr[0];
            
            // Recorremos el array
            for(int numero : arr)
            {
                // Comparamos el numer actual con nuestro numero mayor
                if(numero>mayor)
                {
                    // Si ese numero es el mayor, asignamos que el mayor es dicho numero
                    mayor = numero;
                }
            }
            return mayor;
        }
        
        
  //7.        Crear un método contarPares(int[] arr) que devuelva cuántos números pares hay en el array.
        
        public int contarPares(int [] arr)
        {
            int contadorPares = 0;
            
            for(int numero : arr)
            {
                if(numero % 2 == 0)
                {
                    contadorPares++;
                }
            }
            return contadorPares;
        }
        
  //8.        Crear un método esPrimo(int n) que devuelva true si el número es primo. Usarlo para imprimir todos los primos entre 1 y 50.
   
        private boolean esPrimo(int n)
        {
            // Aseguramos que los negativos y 0 no sean primos, y el 1 tampoco cuenta por definición (n es primo si n es divisible por 1 y por n, n=! 1)
            if(n<=1)
            {
                return false;
            }
            for(int i = 1; i<=n; i++)
            {
                if(n % 2 == 0)
                {
                    return false;
                }
            }
            return true;
        }
        
        public void imprmirPrimosHasta50()
        {
            System.out.println("Números primos entre 1 y 50:");
            
            for(int i = 1; i<=50; i++)
            {
                if(esPrimo(i))
                {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
}


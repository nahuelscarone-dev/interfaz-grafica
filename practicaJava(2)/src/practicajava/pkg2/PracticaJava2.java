package practicajava.pkg2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author GZ TIENDA
 */
public class PracticaJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*   
        // METODOS VOID
        clsMetodosVoid herramientas = new clsMetodosVoid();
        
        herramientas.saludar();
        
        herramientas.imprimirLinea();
        
        herramientas.mostrarTabla(4);
        
        int [] listaNumeros = {2,3,5,1,3};
        herramientas.mostrarArray(listaNumeros);
        
        herramientas.contarHasta(20);
        
        herramientas.mostrarPareSinModulo(40);
        herramientas.mostrarParesconModulos(20);
        
        System.out.println(" ");
        
        // METODOS CON RETURN
        
        clsMetodosRetorno mr = new clsMetodosRetorno();
        int resultado = mr.sumar(3,4);
        System.out.println(resultado);
        
        int [] numerosEnteros = {2,4,6,8};
        System.out.println(mr.promedio(numerosEnteros));
        
        mr.numeroMayor(50, 51);
        
        System.out.println(mr.esPar(120));
        
        System.out.println(mr.calificar(2.8));
        
        System.out.println(mr.mayorDelArray(numerosEnteros));
        
        
        int [] numerosEnteros2 = {2,4,6,45,45,9765,348,21423,122,65,213785,1};
        System.out.println(mr.contarPares(numerosEnteros2));
        
        mr.imprmirPrimosHasta50();
        
        
        
        // METODOS CON SOBRECARGA
        
        clsSobrecarga s = new clsSobrecarga();
        
        s.imprimirLinea();
        
        s.imprimirLinea(50);
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese radio del círculo: ");
            double radioCirculoIngresado = Double.parseDouble(sc.nextLine()); 
        
            System.out.println("El área de círculo con radio " + radioCirculoIngresado +" es: " + s.area(radioCirculoIngresado));
        
        System.out.println("Ingrese base del triángulo: ");
            double baseTriangulo = Double.parseDouble(sc.nextLine());
        System.out.println("Intrese altura del triángulo: ");
            double alturaTriangulo = Double.parseDouble(sc.nextLine()); 
                  
                System.out.println("El área del triángulo con base " + baseTriangulo + " y altura " + alturaTriangulo + " es: " + s.area(baseTriangulo, alturaTriangulo));
        
        System.out.println("Ingrese lado 1 del rectángulo: ");
            double lado1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese lado 2 del rectángulo: ");
            double lado2 = Integer.parseInt(sc.nextLine());
        
                System.out.println("El área del rectángulo con lado " + lado1 + " y lado " + lado2 + " es:" + s.area(lado1, lado2));
                
                
                
        System.out.println("Ingrese el valor del número entero que desea imprimir");
            int imprimirNumero = Integer.parseInt(sc.nextLine());
                s.imprimir(imprimirNumero);
                
        System.out.println("Ingrese el valor del número decimal que desea imprimir ");
            double decimalIngresado = Double.parseDouble(sc.nextLine());
                s.imprimir(decimalIngresado);
                
        System.out.println("Ingrese el texto que desea imprimir ");
            String textoIngresado = sc.nextLine();
                s.imprimir(textoIngresado);
                
        clsSobrecarga s = new clsSobrecarga();

        Scanner sc = new Scanner(System.in);
        s.saludar();
        
        System.out.println("Ingrese el nombre de usuario que se va a saludar");
            String nombreIngresado = sc.nextLine();
                s.saludar(nombreIngresado);
        
        s.mayor(9, 43);
        
        s.mayor(6546, 324342, 345634);
    */    
        
    /*    clsRecursividad rec = new clsRecursividad();
        
        rec.factorial010();
        rec.imprimirFibonacci();
      */  
      clsAnimal perro = new clsAnimal("Pelusa", "Guau guau", 2, "Casas");
      clsAnimal gato = new clsAnimal("Tom", "Miau Miau", 10, "Calle");
      clsAnimal loro = new clsAnimal("Zazoo", "CHUC CHUC", 32, "Sabana");
      clsAnimal elefante = new clsAnimal("Dumbo", "Fuuu", 5, "Sabana");
      
      perro.hacerSonido();
      gato.hacerSonido();
      
      perro.presentarse();
      gato.presentarse();
      loro.presentarse();
      
    
    //3.        Crear un array de 4 objetos Animal. Recorrerlo con for-each y llamar hacerSonido() en cada uno.
      clsAnimal [] animales = {perro, gato, loro, elefante};
     
        System.out.println("Los animales realizan el siguiente sonido");
        for( clsAnimal animal : animales)
        {
            animal.hacerSonido();
        }
        
    //  perro.cumplirAnios();
    //  perro.cumplirAnios();
      
    //5.        Crear dos objetos Animal con el mismo nombre. Modificar el nombre de uno con punto (perro.nombre = 'Nuevo'). Verificar que el otro no cambia.
      
        clsAnimal delfin = new clsAnimal("Wally", "piii piii", 23, "Oceano");
        clsAnimal oso = new clsAnimal("Wally", "GRUAAAA", 34, "Bosque");
        
        delfin.setNombre("Juanito");
        delfin.presentarse();
        oso.presentarse();
        
    // METODO EN LA CLASE   
        System.out.println("¿ " + perro.getNombre() +" es joven?");
        System.out.println(perro.esJoven());
        
        System.out.println(perro);
        System.out.println(delfin);
    
    //3.        Crear un ArrayList<Animal>. Agregar al menos 5 animales distintos. Recorrerlo e imprimir solo los que tienen edad mayor a 2.
    
        ArrayList<clsAnimal> zoo  = new ArrayList<>();
        zoo.add(perro);
        zoo.add(gato);
        zoo.add(oso);
        zoo.add(delfin);
        zoo.add(loro);
        zoo.add(elefante);
        
       System.out.println("--- Animales mayores de 2 años ---");
         for (clsAnimal animalActual : zoo) {
            if (animalActual.getEdad() > 2) {
     
                System.out.println(animalActual); 
            }
        }    
    // Llamamos a la herramienta pasándole nuestro ArrayList llamado 'zoo'
        clsAnimal reyDelZoo = obtenerAnimalMasViejo(zoo);
    
    // Imprimimos al ganador aprovechando el toString()
        System.out.println("--- El animal más viejo del zoológico es ---");
        System.out.println(reyDelZoo);
    }    
    
    //4.        Crear un método (fuera de la clase Animal, en el main o como método estático) que reciba un ArrayList<Animal> y devuelva el animal de mayor edad. Probarlo con una lista de 5 animales. 
    
    public static clsAnimal obtenerAnimalMasViejo(ArrayList<clsAnimal> listaAnimales)
    {
        clsAnimal animalMasViejo = listaAnimales.get(0);

        for(clsAnimal animalActual : listaAnimales)
        {
            if(animalActual.getEdad() > animalMasViejo.getEdad())
            {
                animalMasViejo = animalActual;
            }
        }
        return animalMasViejo;
    }
}
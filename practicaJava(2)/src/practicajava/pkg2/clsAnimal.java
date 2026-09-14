/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicajava.pkg2;

/**
 *
 * @author GZ TIENDA
 */
public class clsAnimal {
    
    //1.        Crear la clase Animal con tres atributos: nombre (String), sonido (String) y edad (int). Agregar el constructor y un método hacerSonido() que imprima 'nombre dice: sonido'. En el main, crear dos objetos Animal distintos y llamar hacerSonido() en cada uno.
    private String nombre;
    private String sonido;
    private int edad;
    private String habitat;

    public String getNombre() {
        return nombre;
    }

    public String getSonido() {
        return sonido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   
   public clsAnimal(String nombre, String sonido, int edad, String habitat)
   {
       this.nombre= nombre;
       this.sonido = sonido;
       this.edad = edad;
       this.habitat = habitat;
   }
    public void hacerSonido()
    {
        System.out.println("El animal " + this.nombre + " hace el sonido " + this.sonido);
    }
       
    //2.        Agregar a la clase Animal el método presentarse() que imprima el nombre, la edad y el hábitat. Crear tres objetos con datos distintos y llamar presentarse() en cada uno.

    public void presentarse()
    {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Habitat: " + this.habitat);
    }
    
    //3.        Crear un array de 4 objetos Animal. Recorrerlo con for-each y llamar hacerSonido() en cada uno.
    
    //Hecho en main
    
   //4.        Agregar el método cumplirAnios() que incremente la edad en 1 e imprima un mensaje. Crear un Animal, hacerlo cumplir años dos veces y verificar que la edad se actualiza correctamente.
    
    public void cumplirAnios()
    {
        this.edad++;
        System.out.println("¡Feliz cumpleaños " + this.nombre + "! Ahora tengo " + this.edad + " años.");
    }
   //5.        Crear dos objetos Animal con el mismo nombre. Modificar el nombre de uno con punto (perro.nombre = 'Nuevo'). Verificar que el otro no cambia.
    
    // Hecho en main
    
    
  // METODOS EN LA CLASE
    
  //1.        Agregar a Animal el método esJoven() que devuelva true si la edad es menor a 3, false si no. Usarlo en el main para imprimir un mensaje distinto según el resultado.
    
    public boolean esJoven()
    {
        return  this.edad < 3;
    }
    
    //2.       Agregar el método toString() que devuelva un String con toda la información del animal. Verificar que System.out.println(animal) imprime bien.
    
    @Override // Esta etiqueta le avisa al compilador que estás reemplazando el método original
    public String toString() 
    {
        return "Nombre: " + this.nombre + " | Edad: " + this.edad + " | Hábitat: " + this.habitat;
    }
}


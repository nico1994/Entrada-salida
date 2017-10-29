/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosentrada.salida;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Ejercicio {
    
   
    
   
    /**
     * se debe mostrar el siguiente mensaje: "esto funciona de maravilla".
     */
    public static void Numero1()
    {
        System.out.println("esto funciona de maravilla");
        
    }
    
    
    
    
    
    /**
     * Se debe pedir un nombre y se debe mostrar el mismo nombre
     */
    public static void Numero2()
    {
        String nombre;
        Scanner miscanner= new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = miscanner.nextLine();
        System.out.println("El nombre ingresado es:  " +nombre);
    
    }
    
    
    
    
    
    /**
     * Se debe pedir el nombre y el apellido, 
     * luego mostrarlo en el siguiente mensaje:
     * Su nombre es xxx y xxx es su apellido
     */
    public static void Numero3()
    {
        String nombre;
        String apellido;
        Scanner misc= new Scanner (System.in);
        System.out.println("Cual es su nombre?  ");
        nombre= misc.nextLine();
        System.out.println("Cual es su apellido? ");
        apellido= misc.nextLine();
        System.out.println("Su nombre es "+nombre+" y su apellido es "+apellido );
    
    }
    
    
    
    
    /**
     * Al ingresar una edad y el nombre se debe mostrar el siguiente mensaje 
     * Usted se llama xxx y tiene xxx años de edad 
     */
    public static void Numero4()
    {
      int edad;
      String nombre;
      Scanner misc= new Scanner(System.in);
      System.out.println("Cual es su nombre?");
      nombre= misc.nextLine();
      System.out.println("Cual es su edad?");
      edad = misc.nextInt();
      System.out.println("Su nombre es "+nombre+" y su edad es "+edad);  
    
    }
    
    
    
    
    public static void Numero5()
    {
        
    
    }
    
    
    
    
    /**
     * Se piden tres numeros y se informa el promedio.
     */
    public static void Numero6()
    {
        int numero1;
        int numero2;
        int numero3;
        int Promedio;
        
        Scanner misc= new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numero1= misc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2= misc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        numero3= misc.nextInt();
        Promedio= (numero1+numero2+numero3) / 3;
        System.out.println("Su promedio es: "+Promedio);
    
    }
    
    
    
    
    /**
     * Se pide la base de un cuadrado y se informa el perimetro
     */
    public static void Numero7()
    {
       int cuadrado;
       int perimetro;
       
       Scanner misc= new Scanner(System.in);
       System.out.println("Cual es la base del cuadrado? ");
       cuadrado= misc.nextInt();
       perimetro= (cuadrado)*4 ;
       System.out.println("El perimetro es: "+perimetro); 
    
    }
    
    
    
    
    /**
     * Se piden el largo y el ancho de un terreno y se
     * informa la superficie del mismo
     */
    public static void Numero8()
    {
        int largo;
        int ancho;
        int superficie;
        
        Scanner misc= new Scanner(System.in);
        System.out.println("Indique el largo del terreno: ");
        largo= misc.nextInt();
        System.out.println("Indique el ancho del terreno: ");
        ancho= misc.nextInt();
        superficie= largo * ancho;
        System.out.println("La superficie del terreno es: "+superficie);
    
    }
    
    
    
    
    /**
     * Se ingresa la cantidad y el precio de un producto y se
     * informa el total a pagar
     */
    public static void Numero9()
    {
        String datoAux;
        Integer cantidad;
        Double Precio;
        Double total;
      
        Scanner misc= new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad del producto: ");    
        datoAux= misc.next();
        cantidad= Integer.parseInt(datoAux);
        
        System.out.println("Ingrese el precio del producto: ");
        datoAux= misc.next();
        Precio= Double.parseDouble(datoAux);
        
        total= (cantidad)*(Precio);
        System.out.println("El total a pagar es: "+total);  
    
    }
    
    
    
    
    
    /**
     * Se ingresa la cantidad de ganadores de la loteria nacional y el 
     * monto total del premio,informar cuando dinero le corresponde a cada uno
     */
    public static void Numero10()
    {
        int ganadores;
        int premio;
        int dinero;
       
        Scanner misc= new Scanner(System.in);
        System.out.println("Cantidad de ganadores: ");
        ganadores= misc.nextInt();
        System.out.println("Monto total del premio; ");
        premio= misc.nextInt();
        dinero= (premio)/(ganadores);
        System.out.println("A cada persona que gano le corresponde: "+dinero+" pesos.");  
    
    }
    
    
    
    
    
    
    /**
     * Se pide el valor de la hora de trabajo de un empleado y
     * la cantidad de horas trabajadas,informar cuanto le corresponde de sueldo
     * restandole el 15% de sus aportes
     */
    public static void Numero11()
    {
        String datoAux;
        Integer cantidad;
        Double valorhora;
        Double total;
        Scanner misc= new Scanner(System.in);
        
        System.out.println("Horas trabajadas: ");
        datoAux= misc.next();
        cantidad= Integer.parseInt(datoAux);
        
        System.out.println("Valor de la hora trabajada: ");
        datoAux= misc.next();
        valorhora= Double.parseDouble(datoAux);
        
        total= cantidad - (valorhora - (valorhora* 0.85));
        System.out.println("El sueldo que le corresponde es : "+total);
    
    }
    
    
    
    
    /**
     * Se ingresa el importe de un producto importado y se le 
     * debe agregar el 35% de impuestos internos
     */
    public static void Numero12()
    {
        String datoAux;
        Double precio;
        Double preciofinal;
        
        Scanner misc= new Scanner(System.in);
        
        System.out.println("Ingrese el importe del producto: ");
        datoAux= misc.next();
        precio= Double.parseDouble(datoAux);
    
        preciofinal= precio +(precio*35) / 100;
        System.out.println("El valor es: "+preciofinal);
    
    }
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

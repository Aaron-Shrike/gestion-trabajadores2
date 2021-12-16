
package cap_presentacion;

import cap_logica.Trabajador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sh
 */
public class Colecciones {

        
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        
        do{
            opcion = menu();
            
            switch (opcion){
                case 1: registrarTrabajador(trabajadores);
                    break;
                case 2: buscarDni(trabajadores);
                    break;
                case 3: listadoPlanilla(trabajadores);
                    break;
                case 4: listadoPlanillaSegunArea(trabajadores);
                    break;
                case 5:                
                    break;
                default: System.out.println("*Opcion incorrecta");
            }
        }while(opcion != 5 );
    }
    
    private static int menu (){
        Scanner leer = new Scanner(System.in);
        
        int op;
        
        System .out.println("\n\n\n\n-- MENU --");
        System .out.println("[1] Registrar trabajador");
        System .out.println("[2] Buscar trabajador x DNI");
        System .out.println("[3] Listado de planilla");
        System .out.println("[4] Total de planilla en un area determinada");
        System .out.println("[5] Salir");
        
        do{
            System.out.print("Ingrese opcion: ");
            op = leer.nextInt();
        }while(op<1 || op>5);
        
        return op;
    }

    private static void registrarTrabajador(ArrayList<Trabajador> auxList) {      
        Trabajador trab = new Trabajador();
        
        trab.leer();
        
        auxList.add(trab);
    }
    
    private static void buscarDni(ArrayList<Trabajador> auxList){
        Scanner leer = new Scanner(System.in);
        
        Iterator<Trabajador> elemento;
        
        System.out.print("Ingrese DNI a buscar: ");
        String auxDni = leer.next();
               
        elemento = auxList.iterator();
        
        System.out.println("\n\n *TRABAJADOR CON DNI("+auxDni+")*");
        
        while(elemento.hasNext()){
            Trabajador t = elemento.next();
            
            if(t.getDni().equals(auxDni)){
                System.out.println(t.getTrabajador());
            }
        }
    }

    private static void listadoPlanilla(ArrayList<Trabajador> auxList) {
        Iterator<Trabajador> elemento;
        
        elemento = auxList.iterator();
        
        System.out.println("\n\n *LISTADO DE PLANILLA*");
            
        while(elemento.hasNext()){
            System.out.println(elemento.next().getTrabajador());
        }
    }

    private static void listadoPlanillaSegunArea(ArrayList<Trabajador> auxList) {
        Scanner leer = new Scanner(System.in);
        
        int auxArea ;
        
        Iterator<Trabajador> elemento;
        
        System.out.println(" 1. Compras");
        System.out.println(" 2. Ventas");
        System.out.println(" 3. Personal");
        System.out.println(" 4. Logistica");
        do{
            System.out.print("Ingrese Área: ");
            auxArea = leer.nextInt();
        }while(auxArea < 1 || auxArea > 4);
               
        elemento = auxList.iterator();
        
        System.out.println("\n\n *PLANILLA SEGÚN ÁREA*");
        
        while(elemento.hasNext()){
            Trabajador t = elemento.next();
            
            if(t.getArea() == auxArea){
                System.out.println(t.getTrabajador());
            }
        }
    }
    
}

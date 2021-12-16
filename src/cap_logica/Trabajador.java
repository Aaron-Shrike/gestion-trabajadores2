
package cap_logica;

import java.util.Scanner;

/**
 *
 * @author Sh
 */
public class Trabajador {
    private String dni;
    private String nombre;
    private int area;
    private double sueldo;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int are) {
        this.area = are;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void leer(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese DNI: ");
        dni = leer.next();
        
        System.out.print("Ingrese nombre: ");
        nombre = leer.next();
        
        System.out.println(" 1. Compras");
        System.out.println(" 2. Ventas");
        System.out.println(" 3. Personal");
        System.out.println(" 4. Logística");
        do{
            System.out.print("Ingrese Área: ");
            area = leer.nextInt();
        }while(area < 1 || area > 4);
        
        System.out.print("Ingrese Sueldo: ");
        sueldo = leer.nextFloat();
    }
    
    public String getTrabajador(){
        return getNombre() + " - " + getDni() + "(S/." + getSueldo() + ")";
    }
}


import java.util.Scanner;

public class Utilidades {
    Scanner sc = new Scanner (System.in);
    

    public objrepuestos [][] Llenarmatriz(objrepuestos[][] m){
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                objrepuestos o = new objrepuestos();
                System.out.println("Ingrese el Nombre del repuesto");
                o.setNombre(sc.next());
                System.out.println("Ingrese la Descripcion del repuesto");
                o.setDescripcion(sc.next());
                System.out.println("Ingrese el Precio del repuesto");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese el inventario del repuesto");
                o.setStock(sc.nextInt());
                m[i][j]= o;
            }
            
        }
        
    return m;
    }

    public objrepuestos [][] Disponibilidad (objrepuestos[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(m[i][j].getStock()>0){
                    m[i][j].setMensaje("!ESTÁ DISPONIBLE¡");

                }
                else{
                    m[i][j].setMensaje("!NO HAY EXISTENCIAS¡");
                }
            }
        }
        return m;
    }

    public void mostrarmatriz(objrepuestos[][]m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Nombre del repuesto: " + m[i][j].getNombre());
                System.out.println("Descripcion del repuesto" + m[i][j].getDescripcion());
                System.out.println("Precio del repuesto: " +m[i][j].getPrecio());
                System.out.println("Disponibilidad: " + m[i][j].getMensaje());
                System.out.println("Existencias: " + m[i][j].getStock());
                System.out.println("-------------------------------------------------------");
            }
        }

    }
}

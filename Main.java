
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt = 0;
        Utilidades U = new Utilidades();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz que va a llenar");
        opt = sc.nextInt();

        objrepuestos [][] m = new objrepuestos[opt][opt];

        U.Llenarmatriz(m);
        U.Disponibilidad(m);
        U.mostrarmatriz(m);


    }
    
}

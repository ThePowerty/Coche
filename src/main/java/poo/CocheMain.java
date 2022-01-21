package poo;
import java.util.Scanner;

public class CocheMain {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Coche Renault = new Coche();
        pedirDatos(Renault);
        System.out.println(Renault.getDatos());
    }
    
    public static void pedirDatos(Coche coche){
        String color;
        String asientos;
        String climatizador;
        System.out.println("Introduzca el color de su coche: ");
        color = sc.nextLine();
        coche.setColor(color);
        System.out.println("¿Quiere asientos de cuero?"+"\nSi o no");
        asientos = sc.nextLine();
        coche.setAsientos(asientos);
        System.out.println("¿Quiere climatizador?"+"\nSi o no");
        climatizador = sc.nextLine();
        coche.setClimatizador(climatizador);
    }
}

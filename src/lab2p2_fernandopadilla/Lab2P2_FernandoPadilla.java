package lab2p2_fernandopadilla;

import java.util.Scanner;


public class Lab2P2_FernandoPadilla {

    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        String userI = "";
        String passI = "";
        int opcion = 0;
        while (!passI.equals("g3r$nt0") && !userI.equals("gerente")) {
            System.out.println("Ingrese el nombre de usuario: ");
            userI = read.next();
            System.out.println("Ingrese la contraseña: ");
            passI = read.next();
            if (!passI.equals("g3r$nt0") && !userI.equals("gerente")) {
                System.out.println("Contraseña o nombre de usuario incorrecto");
            } else {
                System.out.println("Bienvenido gerente");
            }
        }
        do {
            System.out.println("------------Menu------------\n"
                    + "1)Crear\n"
                    + "2)Listar\n"
                    + "3)Modificar\n"
                    + "4)Eliminar");
        } while (opcion != 5);
    }
    
}

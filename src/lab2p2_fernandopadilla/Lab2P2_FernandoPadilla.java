package lab2p2_fernandopadilla;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_FernandoPadilla {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Chefs> chefs = new ArrayList();
        ArrayList<Meseros> meseros = new ArrayList();
        ArrayList<Bartenders> bartenders = new ArrayList();
        ArrayList<Mesas> mesas = new ArrayList();
        String passC = "g3r$nt0";
        String userI = "";
        String passI = "";
        int contCM = 0;
        int contCV = 0;
        int contMM = 0;
        int contMV = 0;
        int contBM = 0;
        int contBV = 0;
        int contmesas = 0;
        int opcion = 0;
        int opcion2 = 0;
        while (!passI.equals(passC) || !userI.equals("gerente")) {
            System.out.println("Ingrese el nombre de usuario: ");
            userI = read.next();
            System.out.println("Ingrese la contraseña: ");
            passI = read.next();
            if (!passI.equals("g3r$nt0") || !userI.equals("gerente")) {
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
                    + "4)Eliminar\n"
                    + "5)Salir");
            opcion = read.nextInt();
            read = new Scanner(System.in);
            switch (opcion) {
                case 1:
                    System.out.println("Que desea crear?\n"
                            + "1)Chef\n"
                            + "2)Mesero\n"
                            + "3)Bartender\n"
                            + "4)Mesa");
                    opcion2 = read.nextInt();
                    switch (opcion2) {
                        case 1:
                            if (contCM <= 7 && contCV <= 7) {
                                int turno = 0;
                                String turnoS = "";
                                System.out.println("Ingrese el nombre del chef: ");
                                read.nextLine();
                                String nombre = read.nextLine();
                                read = new Scanner(System.in);
                                System.out.println("Ingrese la edad del chef: ");
                                int edad = read.nextInt();
                                while (turno < 1 || turno > 2) {
                                    System.out.println("Ingrese el turno del chef (1.Matutino/2.Vespertino)");
                                    turno = read.nextInt();
                                    if (turno == 1) {
                                        turnoS = "Matutino";
                                        contCM++;
                                    } else if (turno == 2) {
                                        turnoS = "Vespertino";
                                        contCV++;
                                    }
                                }
                                System.out.println("Ingrese el numero de estrellas Michelin: ");
                                int estrellas = read.nextInt();
                                System.out.println("Ingrese el sueldo del chef: ");
                                int sueldo = read.nextInt();
                                if (turno == 1) {
                                    if (contCM <= 7 && turno == 1) {
                                        chefs.add(new Chefs(nombre, edad, turnoS, estrellas, sueldo));
                                        System.out.println("Agregado con exito");
                                    } else {
                                        System.out.println("Turno matutino lleno");
                                    }
                                } else if (turno == 2) {
                                    if (contCV <= 7 && turno == 2) {
                                        chefs.add(new Chefs(nombre, edad, turnoS, estrellas, sueldo));
                                        System.out.println("Agregado con exito");
                                    } else {
                                        System.out.println("Turno vespertino lleno");
                                    }
                                }
                            } else {
                                System.out.println("Numero maximo de chefs alcanzado");
                            }
                            break;
                        case 2:
                            if (contMM <= 4 && contMV <= 4) {
                                int turno = 0;
                                String turnoS = "";
                                System.out.println("Ingrese el nombre del mesero: ");
                                read.nextLine();
                                String nombre = read.nextLine();
                                read = new Scanner(System.in);
                                System.out.println("Ingrese la edad del mesero: ");
                                int edad = read.nextInt();
                                while (turno < 1 || turno > 2) {
                                    System.out.println("Ingrese el turno del mesero (1.Matutino/2.Vespertino)");
                                    turno = read.nextInt();
                                    if (turno == 1) {
                                        turnoS = "Matutino";
                                        contCM++;
                                    } else if (turno == 2) {
                                        turnoS = "Vespertino";
                                        contCV++;
                                    }
                                }
                                System.out.println("Ingrese el sueldo del mesero: ");
                                int sueldo = read.nextInt();
                                System.out.println("Ingrese la propina del mesero: ");
                                int propina = read.nextInt();
                                if (turno == 1) {
                                    if (contCM <= 4 && turno == 1) {
                                        meseros.add(new Meseros(nombre, edad, turnoS, sueldo, propina));
                                        System.out.println("Agregado con exito");
                                    } else {
                                        System.out.println("Turno matutino lleno");
                                    }
                                } else if (turno == 2) {
                                    if (contCV <= 4 && turno == 2) {
                                        meseros.add(new Meseros(nombre, edad, turnoS, sueldo, propina));
                                        System.out.println("Agregado con exito");
                                    } else {
                                        System.out.println("Turno vespertino lleno");
                                    }
                                }
                            } else {
                                System.out.println("Numero maximo de meseros alcanzado");
                            }
                            break;
                        case 3:
                            if (contBM <= 2 && contBV <= 2) {
                                int turno = 0;
                                String turnoS = "";
                                System.out.println("Ingrese el nombre del bartender: ");
                                read.nextLine();
                                String nombre = read.nextLine();
                                read = new Scanner(System.in);
                                System.out.println("Ingrese la edad del bartender: ");
                                int edad = read.nextInt();
                                while (turno < 1 || turno > 2) {
                                    System.out.println("Ingrese el turno del bartender (1.Matutino/2.Vespertino)");
                                    turno = read.nextInt();
                                    if (turno == 1) {
                                        turnoS = "Matutino";
                                        contCM++;
                                    } else if (turno == 2) {
                                        turnoS = "Vespertino";
                                        contCV++;
                                    }
                                }
                                System.out.println("Ingrese el sueldo del bartender: ");
                                int sueldo = read.nextInt();
                                System.out.println("Ingrese el numero de licores del bartender: ");
                                int numL = read.nextInt();
                                if (turno == 1) {
                                    if (contBM <= 2 && turno == 1) {
                                        bartenders.add(new Bartenders(nombre, edad, turnoS, sueldo, numL));
                                        System.out.println("Agregado con exito");
                                    } else {
                                        System.out.println("Turno matutino lleno");
                                    }
                                } else if (turno == 2) {
                                    if (contBV <= 2 && turno == 2) {
                                        bartenders.add(new Bartenders(nombre, edad, turnoS, sueldo, numL));
                                        System.out.println("Agregado con exito");
                                    } else {
                                        System.out.println("Turno vespertino lleno");
                                    }
                                }
                            } else {
                                System.out.println("Numero maximo de bartenders alcanzado");
                            }
                            break;
                        case 4:
                            if (contmesas <= 10) {
                                System.out.println("Ingrese el numero de platos en la mesa: ");
                                int platos = read.nextInt();
                                System.out.println("Ingrese el numero de utensilios en la mesa: ");
                                int utensilios = read.nextInt();
                                System.out.println("Ingrese el precio total: ");
                                int precio = read.nextInt();
                                mesas.add(new Mesas(platos, utensilios, precio));
                                System.out.println("Mesa agregada con exito");
                            } else {
                                System.out.println("Numero maximo de mesas alcanzado");
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Que desea listar?\n"
                            + "1)Chef\n"
                            + "2)Mesero\n"
                            + "3)Bartender\n"
                            + "4)Mesa");
                    opcion2 = read.nextInt();
                    String lista = "";
                    switch (opcion2) {
                        case 1:
                            for (Chefs t : chefs) {
                                lista += chefs.indexOf(t) + ".- " + t+"\n";
                            }
                            System.out.println(lista);
                            break;
                        case 2:
                            for (Meseros t : meseros) {
                                lista += meseros.indexOf(t) + ".- " + t+"\n";
                            }
                            System.out.println(lista);
                            break;
                        case 3:
                            for (Bartenders t : bartenders) {
                                lista += bartenders.indexOf(t) + ".- " + t+"\n";
                            }
                            System.out.println(lista);
                            break;
                        case 4:
                            for (Mesas t : mesas) {
                                lista += mesas.indexOf(t) + ".- " + t+"\n";
                            }
                            System.out.println(lista);
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Que desea modificar?\n"
                            + "1)Chef\n"
                            + "2)Mesero\n"
                            + "3)Bartender\n"
                            + "4)Mesa");
                    opcion2 = read.nextInt();
                    System.out.println("Ingrese el indice a modificar: ");
                    int index = read.nextInt();
                    switch (opcion2) {
                        case 1:
                            if (index >= 0 && index < chefs.size()) {
                                int turno = 0;
                                String turnoS = "";
                                System.out.println("Ingrese el nombre del chef: ");
                                read.nextLine();
                                String nombre = read.nextLine();
                                read = new Scanner(System.in);
                                System.out.println("Ingrese la edad del chef: ");
                                int edad = read.nextInt();
                                while (turno < 1 || turno > 2) {
                                    System.out.println("Ingrese el turno del chef (1.Matutino/2.Vespertino)");
                                    turno = read.nextInt();
                                    if (turno == 1) {
                                        turnoS = "Matutino";
                                        contCM++;
                                    } else if (turno == 2) {
                                        turnoS = "Vespertino";
                                        contCV++;
                                    }
                                }
                                System.out.println("Ingrese el numero de estrellas Michelin: ");
                                int estrellas = read.nextInt();
                                System.out.println("Ingrese el sueldo del chef: ");
                                int sueldo = read.nextInt();
                                chefs.remove(index);
                                chefs.add(index, new Chefs(nombre, edad, turnoS, estrellas, sueldo));
                                System.out.println("Modificado con exito");
                            } else {
                                System.out.println("Fuera de rango");
                            }
                            break;
                        case 2:
                            if (index >= 0 && index < meseros.size()) {
                                int turno = 0;
                                String turnoS = "";
                                System.out.println("Ingrese el nombre del mesero: ");
                                read.nextLine();
                                String nombre = read.nextLine();
                                read = new Scanner(System.in);
                                System.out.println("Ingrese la edad del mesero: ");
                                int edad = read.nextInt();
                                while (turno < 1 || turno > 2) {
                                    System.out.println("Ingrese el turno del mesero (1.Matutino/2.Vespertino)");
                                    turno = read.nextInt();
                                    if (turno == 1) {
                                        turnoS = "Matutino";
                                        contCM++;
                                    } else if (turno == 2) {
                                        turnoS = "Vespertino";
                                        contCV++;
                                    }
                                }
                                System.out.println("Ingrese el sueldo del mesero: ");
                                int sueldo = read.nextInt();
                                System.out.println("Ingrese la propina del mesero: ");
                                int propina = read.nextInt();
                                meseros.remove(index);
                                meseros.add(index, new Meseros(nombre, edad, turnoS, sueldo, propina));
                                System.out.println("Modificado con exito ");
                            } else {
                                System.out.println("Fuera de rango");
                            }
                            break;
                        case 3:
                            if (index >= 0 && index < bartenders.size()) {
                                int turno = 0;
                                String turnoS = "";
                                System.out.println("Ingrese el nombre del bartender: ");
                                read.nextLine();
                                String nombre = read.nextLine();
                                read = new Scanner(System.in);
                                System.out.println("Ingrese la edad del bartender: ");
                                int edad = read.nextInt();
                                while (turno < 1 || turno > 2) {
                                    System.out.println("Ingrese el turno del bartender (1.Matutino/2.Vespertino)");
                                    turno = read.nextInt();
                                    if (turno == 1) {
                                        turnoS = "Matutino";
                                        contCM++;
                                    } else if (turno == 2) {
                                        turnoS = "Vespertino";
                                        contCV++;
                                    }
                                }
                                System.out.println("Ingrese el sueldo del bartender: ");
                                int sueldo = read.nextInt();
                                System.out.println("Ingrese el numero de licores del bartender: ");
                                int numL = read.nextInt();
                                bartenders.remove(index);
                                bartenders.add(index, new Bartenders(nombre, edad, turnoS, sueldo, index));
                                System.out.println("Modificado con exito");
                            } else {
                                System.out.println("Fuera de rango");
                            }
                            break;
                        case 4:
                            if (index >= 0 && index < mesas.size()) {
                                System.out.println("Ingrese el numero de platos en la mesa: ");
                                int platos = read.nextInt();
                                System.out.println("Ingrese el numero de utensilios en la mesa: ");
                                int utensilios = read.nextInt();
                                System.out.println("Ingrese el precio total: ");
                                int precio = read.nextInt();
                                mesas.add(new Mesas(platos, utensilios, precio));
                                System.out.println("Mesa agregada con exito");
                                mesas.remove(index);
                                mesas.add(index, new Mesas(platos, utensilios, precio));
                                System.out.println("Modificado con exito");
                            } else {
                                System.out.println("Fuera de rango");
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Que desea eliminar?\n"
                            + "1)Chef\n"
                            + "2)Mesero\n"
                            + "3)Bartender\n"
                            + "4)Mesa");
                    opcion2 = read.nextInt();
                    System.out.println("Ingrese el indice a eliminar: ");
                    index = read.nextInt();
                    switch (opcion2) {
                        case 1:
                            if (index >= 0 && index < chefs.size()) {
                                if (chefs.get(index).getTurno().equals("Matutino")) {
                                    contCM--;
                                }else{
                                    contCV--;
                                }
                                chefs.remove(index);
                                System.out.println("Eliminado con exito");
                            }
                            break;
                        case 2:
                            if (index >= 0 && index < meseros.size()) {
                                if (meseros.get(index).getTurno().equals("Matutino")) {
                                    contMM--;
                                }else{
                                    contMV--;
                                }
                                meseros.remove(index);
                                System.out.println("Eliminado con exito");
                            }
                            break;
                        case 3:
                            if (index >= 0 && index < bartenders.size()) {
                                if (bartenders.get(index).getTurno().equals("Matutino")) {
                                    contBM--;
                                }else{
                                    contBV--;
                                }
                                bartenders.remove(index);
                                System.out.println("Eliminado con exito");
                            }
                            break;
                        case 4:
                            if (index >= 0 && index < mesas.size()) {
                                mesas.remove(index);
                                contmesas--;
                                System.out.println("Eliminado con exito");
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    break;
                case 5:
                    opcion = 5;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }

}

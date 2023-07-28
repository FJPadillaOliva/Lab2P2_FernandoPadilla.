
package lab2p2_fernandopadilla;


public class Chefs {
    private String nombre;
    private int edad;
    private String turno;
    private int numEstrellas;
    private int sueldo;

    public Chefs() {
    }

    public Chefs(String nombre, int edad, String turno, int numEstrellas, int sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.numEstrellas = numEstrellas;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNumEstrellas() {
        return numEstrellas;
    }

    public void setNumEstrellas(int numEstrellas) {
        this.numEstrellas = numEstrellas;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
}

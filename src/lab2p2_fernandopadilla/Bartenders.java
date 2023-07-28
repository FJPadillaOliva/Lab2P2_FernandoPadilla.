
package lab2p2_fernandopadilla;


public class Bartenders {
 private String nombre;
 private int edad;
 private String turno;
 private int sueldo;
 private int licores;

    public Bartenders() {
    }

    public Bartenders(String nombre, int edad, String turno, int sueldo, int licores) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.sueldo = sueldo;
        this.licores = licores;
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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getLicores() {
        return licores;
    }

    public void setLicores(int licores) {
        this.licores = licores;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", edad=" + edad + ", turno=" + turno + ", sueldo=" + sueldo + ", numero de licores=" + licores;
    }
 
 
}

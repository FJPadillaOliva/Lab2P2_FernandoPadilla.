
package lab2p2_fernandopadilla;


public class Meseros {
   private String nombre;
   private int edad;
   private String turno;
   private int sueldo;
   private int propina;

    public Meseros() {
    }

    public Meseros(String nombre, int edad, String turno, int sueldo, int propina) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.sueldo = sueldo;
        this.propina = propina;
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

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", edad=" + edad + ", turno=" + turno + ", sueldo=" + sueldo + ", propina=" + propina;
    }
   
   
}

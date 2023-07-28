
package lab2p2_fernandopadilla;


public class Mesas {
    private int platos;
    private int utensilios;
    private int precioT;

    public Mesas() {
    }

    
    public Mesas(int platos, int utensilios, int precioT) {
        this.platos = platos;
        this.utensilios = utensilios;
        this.precioT = precioT;
    }

    public int getPlatos() {
        return platos;
    }

    public void setPlatos(int platos) {
        this.platos = platos;
    }

    public int getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(int utensilios) {
        this.utensilios = utensilios;
    }

    public int getPrecioT() {
        return precioT;
    }

    public void setPrecioT(int precioT) {
        this.precioT = precioT;
    }
    
    
}

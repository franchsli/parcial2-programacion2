public class Arma {
    private String nombre;
    private int dañoBase;

    public Arma(String nombre, int dañoBase) {
        this.nombre = nombre;
        this.dañoBase = dañoBase;
    }

    public int getDañoBase() {
        return dañoBase;
    }

    // Sobreescribe para que Java
    // use el nombre en cadenas de texto y demas
    // ej: "Guerrero ataca con" + arma
    @Override
    public String toString() {
        return nombre;
    }
}

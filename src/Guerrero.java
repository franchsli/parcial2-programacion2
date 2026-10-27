public class Guerrero extends Criatura {
    private String arma;
    
    public Guerrero(String nombre, int salud, int fuerza, String arma) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }

    @Override 
    public void atacar(Criatura objetivo){
        int daño = getFuerza();
        System.out.println(getNombre() + " ataca con " + arma + " a "
                + objetivo.getNombre() + " (" + daño + " de daño)");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        int dañoReal = daño / 2;
        setSalud(getSalud() - dañoReal);
        System.out.println(getNombre() + " se cubre con el escudo y recibe " + dañoReal);
    }

    
}

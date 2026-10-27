
public class Mago extends Criatura {
    private String hechizos;

    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza();
        System.out.println(getNombre() + " lanza " + hechizos + " a " + objetivo.getNombre()
                + " (" + daño + " de daño)");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        // El mago es frágil: recibe el daño completo
        setSalud(getSalud() - daño);
        System.out.println(getNombre() + " no tiene armadura y recibe " + daño);
    }
}
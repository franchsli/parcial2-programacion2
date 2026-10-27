public abstract class Criatura {
    private String nombre;
    private int salud;
    private int fuerza;
    
    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    /**
     * Método que permite a una criatura atacar a la criatura
     * dada.
     * @param objetivo La criatura a atacar
     */
    public abstract void atacar(Criatura objetivo);

    /**
     *  Método que permite a una criatura defenderse de un ataque
     * @param daño El daño recibido de otra criatura.
     */
    public abstract void defender(int daño);

    /**
     * Devuelve si la criatura está viva o no.
     * @return true si la criatura está viva, false
     * en el caso contrario.
     */
    public boolean estaViva(){
        return salud > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

}

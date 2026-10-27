public class Dragon extends Criatura {
    // Atributo específico exigido en el diagrama UML para el Dragón[cite: 2]
    private String escamas;

    // Constructor que inicializa los atributos heredados y el propio
    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
    }

    // Implementación del método abstracto atacar (El dragón tiene un ataque más fuerte: fuerza * 2)[cite: 1]
    @Override
    public void atacar(Criatura objetivo) {
        int daño = getFuerza() * 2; 
        System.out.println("¡" + getNombre() + " (Dragón) ataca con sus garras y colmillos flamígeros!");
        objetivo.defender(daño);
    }

    // Habilidad especial única del Dragón (Llamarada Infernal con mayor impacto)[cite: 1]
    public void habilidadEspecial(Criatura objetivo) {
        int dañoEspecial = getFuerza() * 3; 
        System.out.println("🔥 ¡HABILIDAD ESPECIAL! " + getNombre() + " invoca una devastadora 'Llamarada Infernal'.");
        objetivo.defender(dañoEspecial);
    }

    // Implementación del método abstracto defender (Forma única usando las escamas)[cite: 1, 2]
   @Override
    public void defender(int daño) {
        int dañoReducido = Math.max(1, daño / 2); // Sus escamas reducen el daño
        setSalud(getSalud() - dañoReducido);
        System.out.println(getNombre() + " se protege con sus escamas (" + escamas + 
                           "), reduciendo el daño a " + dañoReducido + ". Salud restante: " + getSalud());
    }

    // Getters y Setters
    public String getEscamas() {
        return escamas;
    }

    public void setEscamas(String escamas) {
        this.escamas = escamas;
    }
}
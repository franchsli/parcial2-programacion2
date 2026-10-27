public class Main {

    public static void simularBatalla(Criatura c1, Criatura c2) {
        System.out.println("=== " + c1.getNombre() + " vs " + c2.getNombre() + " ===");
        int ronda = 1;

        while (c1.estaViva() && c2.estaViva()) {
            System.out.println("\n--- Ronda " + ronda++ + " ---");

            c1.atacar(c2);
            if (!c2.estaViva()) break;

            c2.atacar(c1);

            System.out.println("Salud -> " + c1.getNombre() + ": " + c1.getSalud()
                    + " | " + c2.getNombre() + ": " + c2.getSalud());
        }

        Criatura ganador = c1.estaViva() ? c1 : c2;
        System.out.println("\n>>> Ganador: " + ganador.getNombre() + " <<<\n");
    }

    public static void main(String[] args) {
        Criatura dragon = new Dragon("Ignis", 120, 30, "Escamas de Obsidiana");
        Criatura mago = new Mago("Gandalf", 80, 20, "Rayo de Luz");
        Arma espada = new Arma("Espada Bastarda", 15);
        Criatura guerrero = new Guerrero("Thorin", 100, 25, espada);

        simularBatalla(dragon, mago);
        simularBatalla(guerrero, dragon);
        simularBatalla(mago, guerrero);
    }
}
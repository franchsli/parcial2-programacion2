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
        System.out.println("El ganador triunfó con " + ganador.getSalud() + " puntos de salud");
    }

    public static void main(String[] args) {
        // Se usan nuevos objetos en cada ronda
        // para que las simulaciones no tengan peleadores desgastados.

        // Batalla 1
        simularBatalla(
            new Dragon("Ignis", 120, 30, "Escamas de Obsidiana"),
            new Mago("Gandalf", 80, 20, "Rayo de Luz"));

        // Batalla 2
        Arma espada = new Arma("Espada Bastarda", 15);
        simularBatalla(
            new Guerrero("Thorin", 100, 25, espada),
            new Dragon("Ignis", 120, 30, "Escamas de Obsidiana"));

        // Batalla 3
        simularBatalla(
            new Mago("Gandalf", 80, 20, "Rayo de Luz"),
            new Guerrero("Thorin", 100, 25, espada));
    }
}
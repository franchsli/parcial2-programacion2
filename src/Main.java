import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Criatura> criaturas = new ArrayList<>();
        Arma espada = new Arma("Espada Bastarda", 15);
        
        criaturas.add(new Dragon("Ignis", 120, 30, "Escamas de Obsidiana"));
        criaturas.add(new Guerrero("Thorin", 100, 25, espada));
        criaturas.add(new Mago("Gandalf", 80, 20, "Rayo de Luz"));

        System.out.println("--- ESTADO INICIAL ---");
        for (Criatura c : criaturas) {
            System.out.println(c.getNombre() + " - Salud: " + c.getSalud() + " - Fuerza: " + c.getFuerza());
        }

        System.out.println("\n--- COMBATE ---");
        Criatura atacante = criaturas.get(0);
        Criatura objetivo1 = criaturas.get(1);
        Criatura objetivo2 = criaturas.get(2);

        atacante.atacar(objetivo1);

        if (atacante instanceof Dragon) {
            ((Dragon) atacante).habilidadEspecial(objetivo2);
        }

        System.out.println("\n--- ESTADO FINAL ---");
        for (Criatura c : criaturas) {
            System.out.println(c.getNombre() + " - Salud restante: " + c.getSalud());
        }
    }
}
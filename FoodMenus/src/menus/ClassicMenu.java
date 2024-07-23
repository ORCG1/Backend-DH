package menus;

public class ClassicMenu extends Menu {

    @Override
    protected String assemble() {
        return displayInstructions() + "\n" + "Armando menú clásico.";
    }

    @Override
    protected String calculatePrice() {
        int basePrice = 40;

        return String.format("El precio del menú clásico es: $%.2f", (double) basePrice);
    }
}

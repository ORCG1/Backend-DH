package menus;

public class ChildMenu extends Menu {
    private final int toysIncluded;

    public ChildMenu(int toysIncluded) {
        this.toysIncluded = toysIncluded;
    }

    @Override
    protected String assemble() {
        return displayInstructions() + "\n" + "Armando menú infantil con " + toysIncluded + " juguetes.";
    }

    @Override
    protected String calculatePrice() {
        int basePrice = 50;
        int toysCharge = toysIncluded * 3;
        double totalPrice = basePrice + toysCharge;

        return String.format("El precio del menú infantil es: $%.2f", totalPrice);
    }
}

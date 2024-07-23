package menus;

public class VegetarianMenu extends Menu {

    private final int spiceAmount;
    private final int sauceAmount;

    public VegetarianMenu(int spiceAmount, int sauceAmount) {
        this.spiceAmount = spiceAmount;
        this.sauceAmount = sauceAmount;
    }

    @Override
    protected String assemble() {
        return displayInstructions() + "\n" + "Armando menú vegetariano con " + spiceAmount + " especias y " + sauceAmount + " salsas.";
    }

    @Override
    protected String calculatePrice() {
        int basePrice = 60;
        double spiceCharge = basePrice * spiceAmount * 0.01;
        int sauceCharge = sauceAmount * 2;
        double totalPrice = basePrice + spiceCharge + sauceCharge;

        return String.format("El precio del menú vegetariano es: $%.2f", totalPrice);
    }
}

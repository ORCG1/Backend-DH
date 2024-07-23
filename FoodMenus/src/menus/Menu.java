package menus;

public abstract class Menu {

    public final String assembleAndCalculatePrice() {
        return assemble() + "\n" + calculatePrice();
    }

    protected abstract String assemble();

    protected abstract String calculatePrice();

    protected String displayInstructions() {
        return "Instrucciones para armar el menú:";
    }
}

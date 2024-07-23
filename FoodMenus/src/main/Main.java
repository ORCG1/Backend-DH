package main;

import menus.ChildMenu;
import menus.VegetarianMenu;
import menus.ClassicMenu;
import menus.Menu;

public class Main {

    public static void main(String[] args) {
        Menu childMenu = new ChildMenu(2);
        Menu vegetarianMenu = new VegetarianMenu(2,1);
        Menu classicMenu = new ClassicMenu();

        System.out.println("--- Menú Infantil ---");
        System.out.println(childMenu.assembleAndCalculatePrice());

        System.out.println("\n--- Menú Vegetariano ---");
        System.out.println(vegetarianMenu.assembleAndCalculatePrice());

        System.out.println("\n--- Menú Clásico ---");
        System.out.println(classicMenu.assembleAndCalculatePrice());
    }
}

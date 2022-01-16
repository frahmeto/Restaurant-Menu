package restaurant;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        ArrayList<MenuItem> menu = new ArrayList<>();

        MenuItem item = new MenuItem(3.0, "burger", "main course", LocalDate.of(2022, 1, 12));
        MenuItem itemTwo = new MenuItem(6.0, "salad", "appetizer", LocalDate.of(2021, 12, 28));
        MenuItem itemThree = new MenuItem(5, " cake", "dessert", LocalDate.of(2020,8, 17));

        menu.add(item);
        menu.add(itemTwo);
        menu.add(itemThree);

        for(MenuItem i: menu) {
            System.out.println("price: " + i.getPrice());
            System.out.println("Description: " + i.getDescription());
            System.out.println("Category: " + i.getCategory());
            System.out.println("LocaleDate: " + i.getDate());
        }

    }
}

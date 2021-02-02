package org.example;

import com.codecool.sirazad.Bookshelf;
import com.codecool.sirazad.HardcoverBook;
import com.codecool.sirazad.PaperbackBook;

import java.util.Arrays;

public class App {

    public static void main(String[] args ) {
        Bookshelf favourites = new Bookshelf();
        favourites.addBook(new HardcoverBook("Uprooted", "Naomi Novik", 1998, 300));
        favourites.addBook(new PaperbackBook("Spinning Silver", "Naomi Novik", 2018, 250));
        favourites.addBook(new PaperbackBook("Isteni Balhé", "J. Goldmann", 1998, 240));

        System.out.println("Books issued in 1998");
        favourites.getBooks(1998).stream().forEach(v -> System.out.println(v.toString()));

        System.out.println("\nLightest author's book");
        System.out.println(favourites.getLightestAuthor().toString());

    }


}

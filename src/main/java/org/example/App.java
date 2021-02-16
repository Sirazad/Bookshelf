package org.example;

import com.codecool.sirazad.Bookshelf;
import com.codecool.sirazad.model.*;
import com.codecool.sirazad.model.bookentity.Genre;
import com.codecool.sirazad.model.bookentity.HardcoverBook;
import com.codecool.sirazad.model.bookentity.PaperbackBook;

public class App {

    public static void main(String[] args ) {
        Bookshelf favourites = new Bookshelf();
        favourites.addBook(new HardcoverBook("Uprooted", "Naomi Novik", 1998, 300, Genre.FANTASY));
        favourites.addBook(new PaperbackBook("Spinning Silver", "Naomi Novik", 2018, 250, Genre.FANTASY));
        favourites.addBook(new PaperbackBook("Isteni Balhé", "J. Goldmann", 1998, 240, Genre.FANTASY));

        System.out.println("Books issued in 1998");
        favourites.getBooks(1998).stream().forEach(v -> System.out.println(v.toString()));

        System.out.println("\nLightest author's book");
        System.out.println(favourites.getLightestAuthor());

        System.out.println("\n Author of the longest book is: "+favourites.getAuthorOfMostWrittenPages());
    }

}

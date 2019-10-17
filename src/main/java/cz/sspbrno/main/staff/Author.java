package cz.sspbrno.main.staff;

import cz.sspbrno.main.Data;
import cz.sspbrno.main.Market;
import cz.sspbrno.main.books.Book;
import cz.sspbrno.main.interfaces.Genre;
import cz.sspbrno.main.interfaces.ReadableContent;

public class Author extends Person {
    private int releaseBooks = 0;
    public static final String[] BOOK_NAMES = new String[]{"HA","HHH", "HMMMM", "HCH"};

    public Author(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    public ReadableContent releaseRandomBook(Market market){
            String bookName = BOOK_NAMES[random.nextInt(BOOK_NAMES.length)];
            if(!market.isBookOnMarket(bookName)) {
                Genre genre = Genre.values()[random.nextInt(Genre.values().length)];
                return new Book(bookName, genre, random.nextInt(Data.MAX_BOOK_PAGES) + 1,this, random.nextBoolean());
            }
        return null;
    }

    public ReadableContent releaseBook(String name, Genre genre) {
        
        return null;
    }
}

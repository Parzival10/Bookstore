package cz.sspbrno.main;

import cz.sspbrno.main.interfaces.ReadableContent;
import cz.sspbrno.main.interfaces.Economical;
import cz.sspbrno.main.interfaces.Genre;
import cz.sspbrno.main.staff.ShopAssistent;

import java.util.ArrayList;

public class Store implements Economical {
    private int soldBooks;
    private ArrayList<ReadableContent> owned;
    private ShopAssistent salesman;

    @Override
    public ArrayList<ReadableContent> buyByGenre(Genre genre) {
        return null;
    }

    @Override
    public ReadableContent buyByName(String name) {
        return null;
    }

    @Override
    public int sell(ReadableContent book) {
        return 0;
    }
}

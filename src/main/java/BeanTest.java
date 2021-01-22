import models.Album;
import models.Author;
import models.Quote;


import java.util.ArrayList;

public class BeanTest {
    public static void main (String [] args){
        Album album = new Album();
        album.setId(1);
        album.setName("Southernplayalisticadillacmuzik");
        album.setArtist("Outkast");
        album.setGenre("HipHop");
        album.setReleaseDate(1994);
        album.setSales(715000);

        System.out.println("album.getName() = " + album.getName());
        System.out.println("album.getArtist() = " + album.getArtist());

        Author author = new Author();
        author.setId(1L);
        author.setFirstName("Caleb");
        author.setLastName("Wardlaw");

        Quote firstQuote = new Quote();
        firstQuote.setId(1L);
        firstQuote.setAuthor(author);
        firstQuote.setContent("If you like it I love it.");

        Quote secondQuote = new Quote();
        secondQuote.setId(2L);
        secondQuote.setAuthor(author);
        secondQuote.setContent("If 50 cents breaks the bank we don't need to be in here.");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(firstQuote);
        quotes.add(secondQuote);

        for (Quote q: quotes) {
            System.out.println("quote.getContent() = " + q.getContent());
            System.out.println("quote.getAuthor().getFirstName() = " + q.getAuthor().getFirstName());
            System.out.println("quote.getAuthor().getLastName() = " + q.getAuthor().getLastName());
        }



    }
}

package classwork.Library;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
   public static void main(String[] args) {
      Book book1 = new Book("Buratino", "Odessa", 2020, 50, Cover.glance, State.new_, "A.Tolstoy");
      System.out.println(book1);

      Book book2 = new Book("Bukvar'", "BuratinoOdessa", 2019, 80, Cover.soft, State.good, "Author1", "Author2", "Authort3");
      System.out.println(book2);
//      ArrayList <String> authors = book2.getAuthors();
      ArrayList<String> authors = (ArrayList<String>) book2.getAuthors().clone();
      authors.remove(2);

      Book book3 = new Book("Bukvar2'", authors, "Odessa", 2021, 80, Cover.hard, State.bad);
      System.out.println(book3);

      System.out.println();
      Library library = new Library();
      library.addBook(book1);
      library.addBook(book2);
      library.addBook(book2);
      library.addBook(book3);
      System.out.println(library);

      System.out.println();
      System.out.println("Removed: " + library.removeBook(1));
      System.out.println(library);

      System.out.println();
      System.out.println(library.searchBook("Odessa"));

      Library searchInLibrary = library.searchBooks("Bukvar");
      System.out.println();
      System.out.println(searchInLibrary);

      System.out.println("\nBUR byTitle: " + library.searchBooksBy("BUR", ByWhat.byTitle));
      System.out.println("\nOd byPublisher: " + library.searchBooksBy("Od", ByWhat.byPublisher));
      System.out.println("\nTol byAuthor: " + library.searchBooksBy("Tol", ByWhat.byAuthor));
      System.out.println("\n2019 byYear: " + library.searchBooksBy("2019", ByWhat.byYear));
      System.out.println("\n2021 byYear: " + library.searchBooksbyYear(2021));
      System.out.println("\nburatiNO byAll: " + library.searchBooksBy("buratiNO", ByWhat.byAll));

// Date and Time processing
      Calendar currentDate = Calendar.getInstance();
      System.out.println(currentDate.getTime().toGMTString());

      Calendar calendar = new GregorianCalendar(2020, 3, 10);
      System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "." + calendar.get(Calendar.MONTH) + "." + calendar.get(Calendar.YEAR));
      System.out.println(calendar.getTime().toGMTString());

      calendar.add(Calendar.MONTH, -1);
      System.out.println(calendar.getTime().toGMTString());
   }
}

package classwork.Library;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
   private final ArrayList<Book> books;

   public Library() {
      books = new ArrayList<>();
   }

   public ArrayList<Book> getBooks() {
      return (ArrayList<Book>) books.clone();
   }

   public void addBook(Book book) {
      books.add(book);
   }

   public Book removeBook(int index) {
      Book tempBook = null;

      if (index >= 0 && index < books.size()) {
         try {
            tempBook = books.get(index).clone();
            books.remove(index);
         } catch (CloneNotSupportedException e) {
            e.printStackTrace();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

      return tempBook;
   }

   @Override
   public String toString() {
      return "Library:\n" + books;
   }

   public Book searchBook(String text) {
      Book tempBook = null;

      for (Book book : this.books) {
         if (book.getTitle().toLowerCase().contains(text.toLowerCase()) ||
                 book.getPublisher().toLowerCase().contains(text.toLowerCase())) {
            return book;
         } else {
            for (String author : book.getAuthors()) {
               if (author.toLowerCase().contains(text.toLowerCase()))
                  return book;
            }
         }
      }

      return tempBook;
   }

   public Library searchBooks(String text) {
      Library tempLibrary = new Library();

      for (Book book : this.books) {
         if (book.getTitle().toLowerCase().contains(text.toLowerCase()) ||
                 book.getPublisher().toLowerCase().contains(text.toLowerCase())) {
            tempLibrary.addBook(book);
         } else {
            for (String author : book.getAuthors()) {
               if (author.toLowerCase().contains(text.toLowerCase()))
                  tempLibrary.addBook(book);
            }
         }
      }

      return tempLibrary;
   }

   public Library searchBooksbyYear(int year) {
      Library tempLibrary = new Library();

      for (Book book : this.books) {
         if (book.getYear() == year)
            tempLibrary.addBook(book);
      }

      return tempLibrary;
   }

   public Library searchBooksBy(String text, ByWhat byWhat) {
      Library tempLibrary = new Library();

      for (Book book : this.books) {
         switch (byWhat) {
            case byAuthor:
               if (Arrays.toString(book.getAuthors().toArray()).toLowerCase().contains(text.toLowerCase())) {
                  tempLibrary.addBook(book);
               }
               break;
            case byTitle:
               if (book.getTitle().toLowerCase().contains(text.toLowerCase())) {
                  tempLibrary.addBook(book);
               }
               break;
            case byPublisher:
               if (book.getPublisher().toLowerCase().contains(text.toLowerCase())) {
                  tempLibrary.addBook(book);
               }
            case byAll:
               return searchBooks(text);
            case byYear:
               return searchBooksbyYear(Integer.parseInt(text));
         }
      }

      return tempLibrary;
   }
}
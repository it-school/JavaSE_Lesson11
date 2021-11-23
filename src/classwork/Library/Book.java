package classwork.Library;

import java.util.ArrayList;

public class Book {
   private String title;
   private ArrayList<String> authors;
   private String publisher;
   private int year;
   private int pages;
   private Cover coverType;
   private State currentState;

   public Book(String title, ArrayList<String> authors, String publisher, int year, int pages, Cover coverType, State currentState) {
      this.setTitle(title);
      this.setPublisher(publisher);
      this.setYear(year);
      this.setPages(pages);
      this.setCoverType(coverType);
      this.setCurrentState(currentState);
      this.setAuthors(authors);
   }

   public Book(String title, String publisher, int year, int pages, Cover coverType, State currentState, String... authors) {
      this.setTitle(title);
      this.setPublisher(publisher);
      this.setYear(year);
      this.setPages(pages);
      this.setCoverType(coverType);
      this.setCurrentState(currentState);
      this.authors = new ArrayList<String>();
      for (String author : authors) {
         this.authors.add(author);
      }
   }

   @Override
   protected Book clone() throws CloneNotSupportedException {
      return new Book(this.title, (ArrayList<String>) this.authors.clone(), this.publisher, this.year, this.pages, this.coverType, this.currentState);
   }

   @Override
   public String toString() {
      return "Book{" +
              "title='" + title + '\'' +
              ", authors=" + authors +
              ", publisher='" + publisher + '\'' +
              ", year=" + year +
              ", pages=" + pages +
              ", coverType=" + coverType +
              ", currentState=" + currentState +
              "}\n";
   }

   public ArrayList<String> getAuthors() {
      return authors;
   }

   public void setAuthors(ArrayList<String> authors) {
      this.authors = authors;
   }

   public String getPublisher() {
      return publisher;
   }

   public void setPublisher(String publisher) {
      this.publisher = publisher;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public int getPages() {
      return pages;
   }

   public void setPages(int pages) {
      this.pages = pages;
   }

   public Cover getCoverType() {
      return coverType;
   }

   public void setCoverType(Cover coverType) {
      this.coverType = coverType;
   }

   public State getCuurentState() {
      return currentState;
   }

   public void setCurrentState(State currentState) {
      this.currentState = currentState;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }
}

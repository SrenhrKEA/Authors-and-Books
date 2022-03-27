public class Book {
  private final String title;
  private final Author author;
  private final int numPages;

  public Book(String title, Author author, int numPages) {
    this.title = title;
    this.author = author;
    this.numPages = numPages;
  }

  public String getTitle() {
    return title;
  }

  public Author getAuthor() {
    return author;
  }

  public int getNumPages() {
    return numPages;
  }
}


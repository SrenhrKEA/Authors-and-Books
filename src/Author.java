import java.util.ArrayList;
import java.util.List;

public class Author {
  private final String name;
  private final char gender;
  private String email;
  private final List<Book> books = new ArrayList<>();

  public Author(String name, char gender, String email) {
    this.name = name;
    this.gender = gender;
    this.email = email;
  }

  //Getters
  public String getName() {
    return name;
  }

  public char getGender() {
    return gender;
  }

  public String getEmail() {
    return email;
  }

  public List<Book> getBooks() {
    return books;
  }

  //Setters
  public void setEmail(String email) {
    this.email = email;
  }

  //Add book
  public void addBook(Book book) {
    books.add(book);
  }


}

public class Test {
  Author hpl = new Author("H.P. Lovecraft", 'm', "HPsauce@cthulhu.com");
  Book coc = new Book("The Call of Cthulhu", hpl, 20);
  Book soi = new Book("The Shadow over Innsmouth", hpl, 30);
  Book coos = new Book("The Colour Out of Space", hpl, 24);

  Author stk = new Author("Stephen King", 'm', "hereis@johnny.com");
  Book tsh = new Book("The Shining", stk, 447);
  Book mist = new Book("The Mist", stk, 176);
  Book it = new Book("It", stk, 1138);

  Author tpr = new Author("Terry Pratchett", 'm', "unseen@university.edu.com");
  Book tcom = new Book("The Colour of Magic", tpr, 277);
  Book gg = new Book("Guards! Guards!", tpr, 416);
  Book gpo = new Book("Going Postal", tpr, 416);
  Book maa = new Book("Men at Arms", tpr, 416);

  public void authorsAndBooksListed(Author author) {
    System.out.printf("\n%-20s %-5s %s", author.getName(), author.getGender(), author.getEmail());
    for (int i = 0; i < author.getBooks().size(); i++) {
      System.out.printf("\n%-5s %-40s %d","", author.getBooks().get(i).getTitle(), author.getBooks().get(i).getNumPages());
    }
  }

  void runProgram() {
    hpl.addBook(coc);
    hpl.addBook(soi);
    hpl.addBook(coos);

    stk.addBook(tsh);
    stk.addBook(mist);
    stk.addBook(it);

    tpr.addBook(tcom);
    tpr.addBook(gg);
    tpr.addBook(gpo);
    tpr.addBook(maa);

    System.out.print("AUTHORS AND BOOKS:");
    authorsAndBooksListed(hpl);
    authorsAndBooksListed(stk);
    authorsAndBooksListed(tpr);
  }

  public static void main(String[] args) {
    new Test().runProgram();
  }
}

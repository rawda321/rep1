package tr.edu.maltepe.oop;

import java.util.Vector;

public class Library {

    private Vector books;
    public Library (){
        books =new Vector();

    }


    public void add_book (Javabook ajavabook){
        books.add(ajavabook);
    }

    void List_books() {
        System.out.println("\nname of the books");
        for ( int i = 0; i<books. size();i++) {
            Javabook temp=(Javabook) books.get(i);
            System.out.println(temp.getbookname());
        }
    }

    void lendBook(Javabook bb, Person p){
        p.addbook(bb);
        books.remove(bb);
    }
    void returnBook(Javabook bb , Person p){
        p.removeBook(bb);
        books.add(bb);
    }

    public void lendBook() {
    }
}
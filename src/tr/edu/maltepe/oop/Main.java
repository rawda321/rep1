package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args, int n) {

    }

    {
        int x;
        Student s1,s2;
        Javabook ajavabook, anotherjavabook, Javabook3;
        Library mylib ;

        s1 = new Student();
        mylib= new Library();

        ajavabook = new Javabook(  "essential java", 500);
        anotherjavabook= new Javabook("intro java programming",  300);
        Javabook3 = new Javabook("Java3",  200);



        mylib.add_book(ajavabook);
        mylib.add_book(anotherjavabook);


        mylib.List_books();
        mylib.lendBook();

        s1=new Student();
        s1.readBook(ajavabook);
        mylib.lendBook();
        mylib.lendBook();
        s1.addbook(ajavabook);

    }
}
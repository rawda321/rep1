package tr.edu.maltepe.oop;

public class Javabook {
    private String bookname;
    private int number_of_pages;


    public Javabook(String name, int n) {

        bookname = name;
        number_of_pages = n;
    }


    public void pageNo(int pno) {
        System.out.println("read page" + pno);
    }

    String getbookname() {
        return bookname;
    }
}
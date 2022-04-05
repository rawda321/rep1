package tr.edu.maltepe.oop;

import java.util.Vector;

public class Person {

    private String name;
    private int Id;
    private String do_sport;
    Vector mybooks = new Vector();

    public int getId(){

        return Id;
    }
    public String getName(){

        return name;
    }
    public String getDo_sport(){

        return do_sport;
    }

    void addbook(Javabook b){
        mybooks.add(b);
    }
    void speak(){
        System.out.printf("Person can swim");
    }

    void removeBook(Javabook b){
        mybooks.remove(b);
    }

}
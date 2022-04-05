package maltepe.ede.tr.oop;

import maltepe.ede.tr.oop.Person;
import maltepe.ede.tr.oop.do_sport;

public class Student extends Person implements do_sport {

    public Student() {

    }
    private int stu_ID;


    public void setstu_ID (int si) {

        stu_ID = si;
    }
    public int getstu_ID() {
        return stu_ID;


    }

    @Override
    void speak() {
        super.speak();
        System.out.println("student can also swim");
    }
}
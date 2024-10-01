package ClassBased;

public class Student implements Comparable<Student> {

    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassBased.Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
    public int compareTo( Student that) {
//        if(this.rollno>that.rollno)
//        {
//            return 1;
//        }
//        else {
//            return -1;
//        }
        return this.rollno- that.rollno;

    }
}

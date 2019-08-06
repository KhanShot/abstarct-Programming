public class Student implements Comparable {
    String name;
    double gpa;
    public Student(String s, double g){
        name= s;
        gpa = g;
    }
    @Override
    public String toString() {
        return name + " " + gpa;
    }

    public int compareTo(Object o){
        Student s = (Student) o;
        if(this.gpa > s.gpa) return 1;
        else if(this.gpa == s.gpa) return 0;
        else return -1;
    }
}

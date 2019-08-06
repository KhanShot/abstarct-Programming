import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
        int a[] = {1,6,78,-8,0};
        Arrays.sort(a);
        for (int i: a) {
            System.out.println(i);
        }
        Student s[] = new Student[4];
        s[0] = new Student("Askar", 3.4);
        s[1] = new Student("Assem", 3.1);
        s[2] = new Student("Beknur", 2.7);
        s[3] = new Student("Maksat", 3.5);

        Arrays.sort(s);
        for (Student student:s) System.out.println(student);
    }

}
//}
//abstract class Game{
//    final void templateMethod(){
//        init();
//        startGame();
//        endGame();
//    }


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " " + score;
    }
}

public class LearnLambdaExpressionComparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Alice", 10));
        list.add(new Student("Jacob", 9));
        list.add(new Student("Bob", 7));
        list.add(new Student("Dave", 8));
        list.add(new Student("Dave", 10));
        list.add(new Student("Bob", 10));

        for (Student student : list) {
            System.out.print(student.toString() + " || ");
        }
        System.out.println();

        // sort by score
        // If x.score - y.score < 0 => x will be placed before y, and vice versa
        list.sort((x, y) -> x.score - y.score);
        for (Student student : list) {
            System.out.print(student.toString() + " || ");
        }
        System.out.println();

        // sort by name
        list.sort((x, y) -> x.name.compareTo(y.name));
        for (Student student : list) {
            System.out.print(student.toString() + " || ");
        }
        System.out.println();

        // sort by score, then by name (ascending)
        list.sort(Comparator.comparingInt((Student s) -> s.score).thenComparing(s -> s.name));
        for (Student student : list) {
            System.out.print(student.toString() + " || ");
        }
        System.out.println();

        // sort by score, then by name (descending score)
        list.sort(Comparator.comparingInt((Student s) -> s.score).reversed().thenComparing(s -> s.name));
        for (Student student : list) {
            System.out.print(student.toString() + " || ");
        }
        System.out.println();

        // Another way for lambda expression
        list.sort((x, y) -> {
            return x.score < y.score ? -1 : 1;
        });
        for (Student student : list) {
            System.out.print(student.toString() + " || ");
        }
        System.out.println();
    }
}

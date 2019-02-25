import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    Double age;
    Double score;
    String name = "";

    public Student(String name, Double age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;

    }

    @Override
    public String toString() {
        return this.name + " " + this.age +
                " " + this.score;
    }
}

class SortbyScoreOrName implements Comparator<Student> {
    int i;

    @Override
    public int compare(Student a, Student b) {
        if ((a.score.compareTo(b.score)) == 0) {
            i = a.name.compareTo(b.name);
        } else {
            i = a.score.compareTo(b.score);
        }
        return i;
    }
}

class Sort {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("ayush", 25.00, 65.00));
        list.add(new Student("amrendra", 25.00, 65.00));
        list.add(new Student("arjti", 25.00, 85.00));
        Collections.sort(list, new SortbyScoreOrName());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
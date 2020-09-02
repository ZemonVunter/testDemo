import java.util.ArrayList;
import java.util.List;

class Student{
    public String name;
    public String classes;
    public   double grade;

    public Student(String name, String classes, double grade) {
        this.name = name;
        this.classes = classes;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", grade=" + grade +
                '}';
    }
}
public class test1 {


    public static void main(String[] args) {
        Student student1=new Student("张三","二班",99.9);
        Student student2=new Student("李四","三班",87);
        Student student3=new Student("王五","六班",88);

        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        System.out.println(list);

    }
}

package collection;

// класс может наследовать Comparable<T> только один раз
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // переопределяем compareTo - студенты будут сравниваться по имени и по возрасту
    @Override
    public int compareTo(Student student){
        final int nameComparison = String.CASE_INSENSITIVE_ORDER.compare(this.name, student.name);
        if (nameComparison != 0){
            return nameComparison;
        } else {
            return Integer.compare(this.age, student.age);
        }
    }

    @Override
    public String toString(){
        return "Student{" + "name='" + name + '\'' +
                ", age=" + age + '}';
    }
}

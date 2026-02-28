package collection;

public class Puppy {
    public final String name;
    public final int age;

    public Puppy(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Puppy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

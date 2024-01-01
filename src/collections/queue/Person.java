package collections.queue;

public class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.getName());
//        -return this.name.compareTo(otherPerson.getName());  reverse order
    }
}

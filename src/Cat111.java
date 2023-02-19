import java.util.ArrayList;

public class Cat {
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void nameMethod(ArrayList<Cat> cats, String name){
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getName().equals(name)){
                System.out.println(cats.get(i));
            }
        }

    }
    public void ageMethod(ArrayList<Cat> arrayList, int age){
        for (Cat cat: arrayList) {
            if (cat.getAge() == age){
                System.out.println(cat);
            }
        }
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

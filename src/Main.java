import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Cat> cats = new ArrayList<>();
//        Cat cat = new Cat();
//        cats.add(new Cat("Tom", 4));
//        cats.add(new Cat("Coty", 2));
//        cats.add(new Cat("Oli", 3));
//        cats.add(new Cat("Jei", 2));
//
//        cat.nameMethod(cats, "Tom");
//        cat.ageMethod(cats, 3);

        ///////////////////////////////////////////////


        LinkedList<Animal> animals = new LinkedList<>();
        int catId = 1;
        int dogId = 1;
        int mouseId = 1;
        Random random = new Random();
        for (int i = 1; i < 5; i++) {
            animals.add(new Cat(catId, random.nextInt(1,10)));
            animals.add(new Dog(dogId, random.nextInt(1,10)));
            animals.add(new Mouse(mouseId, random.nextInt(1,10)));
        }
       LinkedList<Animal> sortAnimal = new LinkedList<>();
        for (Animal animal: animals){
            if (animal instanceof Cat){
                sortAnimal.addFirst(animal);
            } else if (animal instanceof Dog) {
                sortAnimal.addLast(animal);
            }
        }
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Mouse){
                sortAnimal.addLast(animals.get(i));
            }
        }
        for (Animal animal: sortAnimal) {
            System.out.println(animal);
        }

    }

}
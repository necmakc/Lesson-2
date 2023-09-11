
public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
                 new Cat("Barsik", 5),
                 new Cat("Murka", 10),
                 new Cat("Semka", 70),
                 new Cat("Vasya", 14),
                 new Cat("Patron", 20),
        };

        Plate plate = new Plate(100);

        plate.info();
        for (Cat cat: cats) {
            cat.eat(plate);
            cat.info();
        }


//            plate.setFood(plate.getFood() - cat.getAppetite());

        plate.info();
        plate.addFood(50);
        plate.info();
    }
}
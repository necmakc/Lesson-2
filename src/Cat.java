public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;//сытость

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }
    public void eat(Plate plate) {
        if (satiety == true && plate.decreaseFood(appetite) == true) {
            satiety = false;
        }
    }

    void info() {
        System.out.println("\n"+name + " аппетит " + appetite + ".\n" + name + " кушает.");
        String isHungry = !satiety ? " сытый и довольный" : " голодный - недовольный";
        System.out.println(name + isHungry);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
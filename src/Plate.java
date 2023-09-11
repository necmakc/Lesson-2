public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("\nВ тарелке: " + food+"ед.");
    }

    public boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;
        food -= n;
        return true;
    }

    public void addFood(int food){
        System.out.printf("Добавили %d ед. еды в тарелку",food);
        this.food = this.food + food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
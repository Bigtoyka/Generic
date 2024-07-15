import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {

    private List<T> fruits;

    public Basket() {
        this.fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void remove(T fruit) {
        fruits.remove(fruit);
    }

    public double getWeight() {
        double sum = 0;
        for (T fruit : fruits) {
            sum += fruit.weight;
        }
        return sum;
    }

    public int compare(Basket<? extends Fruit> other) {
        // return Double.compare(this.getWeight(), other.getWeight()); тоже самое, что и снизу
        if (this.getWeight() > other.getWeight()) {
            return 1;
        } else if (this.getWeight() < other.getWeight()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static <U extends Fruit> void transfer(Basket<? extends U> src, Basket<? super U> dst) {
        dst.fruits.addAll(src.fruits);
        src.fruits.clear();
    }
}

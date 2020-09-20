import java.util.Arrays;

public class Customer {
    //Properties
private String name;
private Clothing[] clothingItems;
private char size;

//default constructor
    public Customer() {
    }

    //constructor
    public Customer(String name, Clothing[] clothingItems, char size) {
        this.name = name;
        this.clothingItems = clothingItems;
        this.size = size;
    }

//Methods
    public char getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
    public Clothing[] getClothingItems(){
        return clothingItems;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", clothingItems=" + Arrays.toString(clothingItems) +
                ", size=" + size +
                '}';
    }
}

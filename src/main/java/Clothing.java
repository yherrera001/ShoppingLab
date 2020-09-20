public class Clothing {
    private String description;
    private double price;
    private char size;

    //default constructor
    public Clothing(String description, double price, char size){
        this.description = description;
        this.price = price;
        this.size = size;
    }

    //Methods
    public double getPrice(){
        return price;
    }
    public boolean isAFit(Customer customerInput){
        if(customerInput.getSize() == size){
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}

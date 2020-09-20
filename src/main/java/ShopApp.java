public class ShopApp {

    public double calcTotal(Clothing[] items){
        double total = 0;
        for(int itemNum = 0; itemNum <items.length; itemNum++){
            total += items[itemNum].getPrice();
        }
        return total;
    }
    public char measure(Customer customerMeasure){

       char customerNameSize = customerMeasure.getSize();
       return customerNameSize;
    }
    public double employeePriceAfterDisc(Employee employee) {
        Clothing[] employItem = employee.getClothingItems();
        double result = 0;
        for (int item = 0; item < employItem.length; item++) {
            result += employItem[item].getPrice();
        }
        return result = result - (result * employee.getDiscount());
    }
}

public class CheckoutCounter {

    public static ShopApp shopApp = new ShopApp();
    public static Clothing[] shoppingBag = new Clothing[1];
    public static Clothing[] employeeBag = new Clothing[1];
    public static Customer[] shopper = new Customer[2];

    public static void main(String[] args){

        Clothing leatherCoat = new Clothing("black", 120, 'S');
        shoppingBag[0] = leatherCoat;

        Customer customer = new Customer("lilBibby", shoppingBag, 'L');

        Clothing socks = new Clothing("red", 10, 'S');
        employeeBag[0] = socks;

        Employee employee = new Employee("Dexter", employeeBag, 'L');


        shopper[0] = customer;
        shopper[1] = employee;

        for(int customers = 0; customers< shopper.length; customers++) {
            System.out.println(shopper[customers].getName());
            if (shopper[customers] == customer) {
                System.out.println(customer.toString());
                System.out.println("Customer's size: " + customer.getSize());
                System.out.println("Fit ?: " + leatherCoat.isAFit(customer));
                System.out.println(shopApp.calcTotal(shoppingBag));
                System.out.println(":::::::Thank you - Come Again!::::::");
            } else{
            System.out.println(employee.toString());
            System.out.println("Customer's size: " + employee.getSize());
            System.out.println("Fit ?: " + leatherCoat.isAFit(employee));
            System.out.println(shopApp.calcTotal(shoppingBag));
            System.out.println(":::::::Thank you - Come Again!::::::");
            }
        }
    }
}

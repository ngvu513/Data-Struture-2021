package OOPReview;

public class Main {
    public static void main(String[] args) {
        Service service1 = new Internet60();
        Service service2 = new Internet100();
        Service service3 = new LandlineDomestic();
        Service service4 = new LandlineInternational();
        Customer customer = new Customer();
        customer.addService(service1);
        customer.addService(service2);
        customer.addService(service3);
        customer.addService(service4);
    }
}

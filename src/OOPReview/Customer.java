package OOPReview;

import java.util.ArrayList;

public class Customer {
    // "has a/many" relationship
    // aggregation relationship
    private ArrayList<Service> services;

    public void addService(Service service) {
        services.add(service);
        // write to the file service.txt
    }
}

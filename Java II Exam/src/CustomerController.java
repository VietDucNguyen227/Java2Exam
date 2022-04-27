
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerController {
    public List<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(String name, String email, String phone){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setPhoneNumber(phone);
        customers.add(customer);
    };
    public void findCustomerByName(String name){
        for(int i = 0; i < customers.size();i++){
            if(Objects.equals(name, customers.get(i).getName())){
                System.out.println(customers.get(i));
            }else if(i == (customers.size()-1)){
                System.out.println("Customer Not Found !");
            }
        }
    };
    public void displayAll(){
        for(Customer customer: customers){
            System.out.println(customer);
        }
    };
}
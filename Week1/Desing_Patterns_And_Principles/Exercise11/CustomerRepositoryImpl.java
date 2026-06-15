public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        // Simulating database access
        if (id == 101) {
            return "Dinesh Babu";
        } else if (id == 102) {
            return "Rahul Kumar";
        }

        return "Customer not found";
    }
}
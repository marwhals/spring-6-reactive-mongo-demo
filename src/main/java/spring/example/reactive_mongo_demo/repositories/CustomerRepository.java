package spring.example.reactive_mongo_demo.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import spring.example.reactive_mongo_demo.domain.Customer;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}

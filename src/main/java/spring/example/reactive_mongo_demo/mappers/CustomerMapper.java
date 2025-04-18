package spring.example.reactive_mongo_demo.mappers;

import org.mapstruct.Mapper;
import spring.example.reactive_mongo_demo.domain.Customer;
import spring.example.reactive_mongo_demo.model.CustomerDTO;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
}

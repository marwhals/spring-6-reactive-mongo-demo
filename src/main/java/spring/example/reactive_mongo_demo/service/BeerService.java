package spring.example.reactive_mongo_demo.service;

import reactor.core.publisher.Mono;
import spring.example.reactive_mongo_demo.model.BeerDTO;

public interface BeerService {

    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);

    Mono<BeerDTO> getById(String beerId);

}

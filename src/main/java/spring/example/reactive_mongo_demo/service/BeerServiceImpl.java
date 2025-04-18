package spring.example.reactive_mongo_demo.service;

import reactor.core.publisher.Mono;
import spring.example.reactive_mongo_demo.model.BeerDTO;

public class BeerServiceImpl implements BeerService {
    @Override
    public Mono<BeerDTO> saveBeer(BeerDTO beerDTO) {
        return null;
    }

    @Override
    public Mono<BeerDTO> getById(String beerId) {
        return null;
    }
}

package spring.example.reactive_mongo_demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import spring.example.reactive_mongo_demo.mappers.BeerMapper;
import spring.example.reactive_mongo_demo.model.BeerDTO;
import spring.example.reactive_mongo_demo.repositories.BeerRepository;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {
    private final BeerMapper beerMapper;
    private final BeerRepository beerRepository;

    @Override
    public Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDto) {
        return beerDto.map(beerMapper::beerDtoToBeer)
                .flatMap(beerRepository::save)
                .map(beerMapper::beerToBeerDto);
    }

    @Override
    public Mono<BeerDTO> getById(String beerId) {
        return null;
    }
}
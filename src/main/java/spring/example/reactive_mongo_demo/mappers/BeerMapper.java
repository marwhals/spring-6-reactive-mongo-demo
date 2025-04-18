package spring.example.reactive_mongo_demo.mappers;

import org.mapstruct.Mapper;
import spring.example.reactive_mongo_demo.domain.Beer;
import spring.example.reactive_mongo_demo.model.BeerDTO;

@Mapper
public interface BeerMapper {
    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}

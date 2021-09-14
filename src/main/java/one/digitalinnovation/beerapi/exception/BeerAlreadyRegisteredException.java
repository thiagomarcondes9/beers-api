package one.digitalinnovation.beerapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerAlreadyRegisteredException extends Exception{

    public BeerAlreadyRegisteredException(String beerName) {
        super(String.format("Cerveja com nome %s já cadastrada no sistema.", beerName));
    }
}

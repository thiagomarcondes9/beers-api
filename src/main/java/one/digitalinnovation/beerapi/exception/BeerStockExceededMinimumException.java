package one.digitalinnovation.beerapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockExceededMinimumException extends Exception {

    public BeerStockExceededMinimumException(Long id, int quantityToDecrement) {
        super(String.format("Cerveja com id %s para decremento informado excede a capacidade mínima de estoque: %s", id, quantityToDecrement));
    }
}

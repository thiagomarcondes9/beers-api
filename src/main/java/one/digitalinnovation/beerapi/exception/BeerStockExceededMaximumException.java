package one.digitalinnovation.beerapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockExceededMaximumException extends Exception {

    public BeerStockExceededMaximumException(Long id, int quantityToIncrement) {
        super(String.format("Cerveja com id %s para incremento informado excede a capacidade máxima de estoque: %s", id, quantityToIncrement));
    }
}

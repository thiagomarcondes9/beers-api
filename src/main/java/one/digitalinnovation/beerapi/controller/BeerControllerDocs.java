package one.digitalinnovation.beerapi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import one.digitalinnovation.beerapi.dto.BeerDTO;
import one.digitalinnovation.beerapi.exception.BeerAlreadyRegisteredException;
import one.digitalinnovation.beerapi.exception.BeerNotFoundException;
import one.digitalinnovation.beerapi.dto.QuantityDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Api("Gerenciar estoque de cerveja")
public interface BeerControllerDocs {

    @ApiOperation(value = "Operação de criação de cerveja")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Cerveja criada com sucesso!"),
            @ApiResponse(code = 400, message = "Campos obrigatórios ausentes ou incorretos!")
    })
    BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException;

    @ApiOperation(value = "Retorna cerveja encontrada por um determinado nome")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cerveja encontrada com sucesso no sistema!"),
            @ApiResponse(code = 404, message = "Cerveja com o nome informado não encontrada!")
    })
    BeerDTO findByName(@PathVariable String name) throws BeerNotFoundException;

    @ApiOperation(value = "Retorna uma lista de todas as cervejas cadastradas no sistema")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Lista de todas as cervejas cadastradas no sistema!"),
    })
    List<BeerDTO> listBeers();

    @ApiOperation(value = "Excluir uma cerveja encontrada por um determinado ID válido")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Cerveja excluída com sucesso do sistema!"),
            @ApiResponse(code = 404, message = "Cerveja com o id informado não encontrada!")
    })
    void deleteById(@PathVariable Long id) throws BeerNotFoundException;
}

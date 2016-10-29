package br.com.unipam.spring.api.rest.controller;

import br.com.unipam.spring.api.rest.request.PessoasRequest;
import br.com.unipam.spring.api.rest.response.PessoasResponse;
import br.com.unipam.spring.api.rest.service.PessoasService;
import br.com.unipam.spring.api.rest.service.util.SortEnum;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;


@RestController
public class PessoasController{
	@Autowired
	PessoasService pessoasService;
	private static final String PATH = "/pessoas";
	private static final String API_VERSION_ONE = "/v1";
	private static final String API_VERSION_TWO = "/v2";

	@RequestMapping(path = API_VERSION_TWO + PATH, method = RequestMethod.GET)
	public List<PessoasResponse> getPessoasWithDateAfterActualDate(@RequestParam(required = false) SortEnum sort, @RequestParam Integer maxDays){
		return pessoasService.getValidPessoas(sort, maxDays);
	}

	@RequestMapping(path = API_VERSION_ONE + PATH, method = RequestMethod.GET)
	public List<PessoasResponse> getPessoas(@RequestParam(required = false) SortEnum sort){
		return pessoasService.getPessoas(sort);
	}

	@RequestMapping(path = API_VERSION_ONE + PATH, method = RequestMethod.POST)
	public void createPessoa(@RequestBody @Valid PessoaRequest request){
		pessoasService.savePessoa(request);
	}

	@RequestMapping(path = API_VERSION_ONE+PATH+"/{id}", method = RequestMethod.PUT)
	public void updatePessoa(@PathVariable Long id, @RequestBody @Valid PessoaRequest request) throws NotFoundException{
		pessoasService.updatePessoa(id,request);
	}

	@RequestMapping(path = API_VERSION_ONE+PATH+"/{id}", method = RequestMethod.DELETE)
	public void deletePessoa(@PathVariable Long id){
		pessoasService.deletePessoa(id);
	}

}
package br.com.unipam.spring.api.rest.repository;

import br.com.unipam.spring.api.rest.domain.Pessoa;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Repository
public interface PessoaRepository extends PagingAndSortingRepository<Pessoa, Long>{
	List<Pessoa> findall (Sort sort);
//Dei control C+V
	List<Product> findAllByDateBetween(@Temporal(TemporalType.TIMESTAMP) Date startDate, @Temporal(TemporalType.TIMESTAMP) Date endDate, Sort sort);
}
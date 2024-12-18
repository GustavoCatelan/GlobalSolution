package br.com.fiap.GlobalSolution.datasource;

import br.com.fiap.GlobalSolution.domainmodel.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneRepositoy extends JpaRepository<Telephone, Long> {
}

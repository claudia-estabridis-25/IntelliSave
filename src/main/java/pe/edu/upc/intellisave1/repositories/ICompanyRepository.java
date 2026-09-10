package pe.edu.upc.intellisave1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.intellisave1.entities.Company;

public interface ICompanyRepository extends JpaRepository<Company, Long> {

}

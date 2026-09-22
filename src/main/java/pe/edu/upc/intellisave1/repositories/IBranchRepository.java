package pe.edu.upc.intellisave1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.intellisave1.entities.Branch;

@Repository
public interface IBranchRepository extends JpaRepository<Branch, Long> {

}

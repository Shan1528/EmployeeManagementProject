package employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import employee.entity.Postm;
@Repository
public interface PostRepo extends JpaRepository<Postm, Integer> {

}

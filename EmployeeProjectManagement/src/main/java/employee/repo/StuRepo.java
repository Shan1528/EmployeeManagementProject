package employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee.entity.DateOB;
@Repository
public interface StuRepo extends JpaRepository<DateOB, Integer>{

}

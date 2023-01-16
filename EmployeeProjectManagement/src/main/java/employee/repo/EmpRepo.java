package employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import employee.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer> {

	

}

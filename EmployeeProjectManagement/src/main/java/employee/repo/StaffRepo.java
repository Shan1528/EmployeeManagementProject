package employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee.entity.Staff;
@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer> {

}

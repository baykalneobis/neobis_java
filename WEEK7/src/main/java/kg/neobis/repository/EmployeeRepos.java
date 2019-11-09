package kg.neobis.repository;

import kg.neobis.Entity.Employee;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepos extends CrudRepository<Employee, Integer> {

}
package kg.neobis.Controller;
import kg.neobis.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import kg.neobis.repository.EmployeeRepos;

@Controller
@RequestMapping(path="/pr")
public class EmployeeController {

    @Autowired
    private EmployeeRepos employeeRepository;
    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewEmployee (@RequestParam String name
            , @RequestParam String address,@RequestParam double salary,@RequestParam int age,@RequestParam String position) {

        Employee employee = new Employee();
        employee.setName(name);
        employee.setAddress(address);
        employee.setSalary(salary);
        employee.setAge(age);
        employee.setPosition(position);
        employeeRepository.save(employee);
        return "Saved";
    }
    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        return employeeRepository.findById(id)
                .map(record -> {
                    employeeRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Employee> update(@PathVariable("id") int id,
                                           @RequestBody Employee employee) {
        return employeeRepository.findById(id)
                .map(record -> {
                    record.setName(employee.getName());
                    record.setAddress(employee.getAddress());
                    record.setSalary(employee.getSalary());
                    record.setAge(employee.getAge());
                    record.setPosition(employee.getPosition());
                    Employee updated = employeeRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
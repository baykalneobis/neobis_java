import Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Main {
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        Main runner = new Main();
        System.out.println("Adding employee's records to the DB");
        runner.addEmployee("Bazarbay", "Bishkek", 200000.0,24,"seller");
        runner.addEmployee("Asan", "Osh", 2900000.0,35,"seller");
        runner.addEmployee( "Askar", "Naryn", 2456700.0,24,"merchindaser");
        System.out.println("List of developers");
        /**
         * List Employee
         */
        List employeeList = runner.listEmployee();
        for (Object employee: employeeList) {
            System.out.println(employee);
        }
        System.out.println("===================================");
        System.out.println("Removing Some Employee and updating");
        /**
         * Update and Remove developers
         */
        runner.updateEmployee(7, 300);
        runner.removeEmployee(8);

        System.out.println("Final list of employee");
        /**
         * List developers
         */
        employeeList = runner.listEmployee();
        for (Object employee: employeeList) {
            System.out.println(employee);
        }
        System.out.println("===================================");

    }

    public void addEmployee( String name, String address, Double salary, Integer age, String position) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Employee employee = new Employee(name,address,salary,age,position);
        session.save(employee);
        transaction.commit();
        session.close();
    }

    public List listEmployee() {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List developers = session.createQuery("FROM Employee").list();

        transaction.commit();
        session.close();
        return developers;
    }

    public void updateEmployee(int Id, double salary) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Employee employee = (Employee) session.get(Employee.class, Id);
        employee.setSalary(salary);
        session.update(employee);
        transaction.commit();
        session.close();
    }

    public void removeEmployee(int Id) {
        Session session = this.sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Employee employee = (Employee) session.get(Employee.class,Id);
        session.delete(employee);
        transaction.commit();
        session.close();
    }

}




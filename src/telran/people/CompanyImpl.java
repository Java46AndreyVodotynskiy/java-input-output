package telran.people;
import java.util.*;
public class CompanyImpl implements Company {

	private HashMap<Long, Employee> employees = new HashMap<>();
	private TreeMap<Integer, List<Employee>> employeesSalary = new TreeMap<>();
	private HashMap<String, List<Employee>> employeesDepartment = new HashMap<>();
	private static final long serialVersionUID = 1L;
	private CompanyImpl() {
		
	}
	public static Company CreateCompany(String fileName) throws Exception {
		//TODO
		//if file exists it restore Company from file, otherwise returns empty CompanyImpl object
		return null;
	}

	@Override
	public Iterable<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployee(Employee empl) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(String filePath) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterable<Employee> getEmployeesDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Employee> getEmployeesSalary(int salaryFrom, int salaryTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

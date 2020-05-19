package in.rahilbalar98.springbootbackend.bproject1.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImp implements EmployeeDAO {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> get() {
		Session currSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		Session currSession = entityManager.unwrap(Session.class);
		Employee emp = currSession.get(Employee.class, id);
		return emp;
	}

	@Override
	public void save(Employee employee) {

		Session currSession = entityManager.unwrap(Session.class);
		currSession.saveOrUpdate(employee);
	}

	@Override
	public void delete(int id) {
		Session currSession = entityManager.unwrap(Session.class);
		Employee emp = currSession.get(Employee.class, id);
		currSession.delete(emp);
	}
}

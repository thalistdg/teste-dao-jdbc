package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Teste 1: dep findById ===");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n=== Teste 2: dep findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department d: list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== Teste 3: dep insert ===");
		dep = new Department(null, "marketing");
		departmentDao.insert(dep);
		System.out.println("Inserted! new id: " + dep);
		
		System.out.println("\n=== Teste 4: dep update===");
		dep = departmentDao.findById(8);
		dep.setName("RH");
		departmentDao.update(dep);
		System.out.println("update completed");
		
		System.out.println("\n=== Teste 5: dep delete===");
		departmentDao.deleteById(7);
		System.out.println("Delete completed");
	}

}

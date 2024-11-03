package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("--- TEST 1: department insert ---");
		Department newDep = new Department(10, "Music");
		departmentDao.insert(newDep);
		
		System.out.println("Inserted! New id = " + newDep.getId());

		
		
		
		sc.close();
	}

}

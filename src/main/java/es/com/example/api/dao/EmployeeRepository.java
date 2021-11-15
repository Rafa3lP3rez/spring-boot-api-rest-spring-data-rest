package es.com.example.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.com.example.api.entity.Employee;

@RepositoryRestResource(path = "api")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

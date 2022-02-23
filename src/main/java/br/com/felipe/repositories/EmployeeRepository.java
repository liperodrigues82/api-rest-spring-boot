package br.com.felipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.felipe.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

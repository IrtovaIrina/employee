package com.example.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Long> {
    //Вывести максимальную и среднюю зарплату (salary) по каждому отделу, имеющему больше одного сотрудника.
}

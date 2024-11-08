package com.oatthaphon.studentmanagement.repsitory;

import com.oatthaphon.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student, Long> {
}

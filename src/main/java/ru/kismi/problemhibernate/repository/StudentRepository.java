package ru.kismi.problemhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kismi.problemhibernate.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("from Student s join fetch s.classroom")
    List<Student> findAll();
}
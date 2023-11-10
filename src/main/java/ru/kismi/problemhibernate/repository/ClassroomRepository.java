package ru.kismi.problemhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kismi.problemhibernate.entity.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}

package ru.kismi.problemhibernate.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kismi.problemhibernate.entity.Classroom;
import ru.kismi.problemhibernate.entity.Student;
import ru.kismi.problemhibernate.repository.ClassroomRepository;
import ru.kismi.problemhibernate.repository.StudentRepository;

import java.util.HashSet;

@Service
@Transactional
@RequiredArgsConstructor
public class ProblemHibernateService {

    private final StudentRepository studentRepository;
    private final ClassroomRepository classroomRepository;

    public void test1() {
        classroomRepository.findAll()
                .stream()
                .flatMap(classroom -> classroom.getStudents().stream())
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public void test2() {
        studentRepository.findAll();
    }

    public void test3() {
        classroomRepository.findAll()
                .forEach(System.out::println);
    }

    public void test4() {
        var classroom = new Classroom().setName("4E");
        var classrooms = new HashSet<Classroom>();
        classrooms.add(classroom);

        classroomRepository.save(classroom);
        System.out.println(classrooms.contains(classroom));
    }

    @Transactional(readOnly = true)
    public void test5() {
        classroomRepository.findAll();
        studentRepository.findAll();
    }

    @Transactional
    public void test6() {
        studentRepository.findById(1L).orElseThrow()
                .getClassroom().getName();
    }
}
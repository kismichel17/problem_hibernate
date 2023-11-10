package ru.kismi.problemhibernate.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Data
@Entity
@Accessors(chain = true)
public class Classroom {

    @Id
    @EqualsAndHashCode.Exclude
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    @ToString.Exclude
    @Fetch(FetchMode.SUBSELECT)
    @JoinColumn(name = "classroom_id")
    private List<Student> students;
}
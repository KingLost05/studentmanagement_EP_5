package com.oatthaphon.studentmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="students")
public class Student{
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;
    private String firstName;
    private String lastName;
    @Column(nullable = false,unique = true)
    private String email;

        }



package com.endeymus.schoolweb.models.tables;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@ToString
@Table(name = "teacher")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "teacher_id")
    private int id;

    private String name;

    @Column(name = "class")
    private int class_id;

//    @Column(name = "class")
    @OneToMany
//    @JoinColumn(name = "class_id")
    private List<ClassSchool> classid;


}

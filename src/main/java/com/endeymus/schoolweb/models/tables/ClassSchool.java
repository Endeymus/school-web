package com.endeymus.schoolweb.models.tables;

import lombok.*;

import javax.persistence.*;
//import java.util.List;
import java.util.Set;

@Entity
@ToString
@Table(name = "class_school")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassSchool {

    @Id
    @Column(name= "class_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany
    @JoinColumn(name = "children_id")
    private Set<Children> childrens;


}

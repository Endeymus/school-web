package com.endeymus.schoolweb.models.tables;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@Table(name = "children")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Children {

    @Id
    @Column(name= "children_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name="class"/*, insertable = false, updatable = false*/)
    private String class_name;

//    @ManyToOne
//    @JoinColumn(name= "class")
//    private ClassSchool classSchoolId;

}

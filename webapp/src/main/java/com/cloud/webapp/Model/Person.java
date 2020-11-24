package com.cloud.webapp.Model;


import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String surname;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

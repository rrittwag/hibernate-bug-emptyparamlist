package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

    @Id
    public Long id;

    protected Department() {
    }

    public Department(Long id) {
        this.id = id;
    }
}

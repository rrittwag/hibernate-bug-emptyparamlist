package com.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "userr")
public class User {
        @Id
        public Long id;

        @Column(length = 256, nullable = false)
        public String name;

        @ManyToOne
        @JoinColumn(name = "id_department")
        public Department department;

        protected User() {
        }

        public User(Long id, String name, Department department) {
                this.id = id;
                this.name = name;
                this.department = department;
        }

        @Override
        public String toString() {
                return "User{" + "id=" + id + '}';
        }
}

package com.example.deploy.spring_deploy.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tab_user")
public class User {

    @Id
    private String login;

    private String name;
}

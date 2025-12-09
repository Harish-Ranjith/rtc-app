package com.project.identity_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users") // Renames table in SQL to 'users'
@Data // Lombok: Auto-generates Getters, Setters, toString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;

    private String username;
    private String email;
    private String password;
}

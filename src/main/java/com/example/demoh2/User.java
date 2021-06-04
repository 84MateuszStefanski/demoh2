package com.example.demoh2;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String password;

    private LocalDateTime lastLoginDate;

    public User(String login, String password, LocalDateTime lastLoginDate) {
        this.login = login;
        this.password = password;
        this.lastLoginDate = lastLoginDate;
    }
}

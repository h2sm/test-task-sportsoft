package com.h2sm.testtasksportsoft.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Builder
@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;
    @Column(name = "user_full_name")
    private String userFullName;
    @Column(name = "user_login")
    private String login;
    @Column(name = "user_password")
    private String password;

    public Users(String userFullName, String login, String password){
        this.login = login;
        this.userFullName = userFullName;
        this.password = password;
    }
}

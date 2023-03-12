package com.h2sm.testtasksportsoft.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;
    private String userFullName;
    private String login;
    private String password;

    public UserEntity(String userFullName, String login, String password){
        this.login = login;
        this.userFullName = userFullName;
        this.password = password;
    }
}

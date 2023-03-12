package com.h2sm.testtasksportsoft.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "authors")
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private long authorId;
    @Column(name = "author_full_name")
    private String authorFullName;
    @Column(name = "author_description")
    private String authorDescription;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_of_entity", referencedColumnName = "user_id")
    private UserEntity ownerOfEntity;
    @Column(name = "path_to_picture")
    private String pathToPicture;
    //largeObject;
}

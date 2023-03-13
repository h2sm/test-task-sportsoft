package com.h2sm.testtasksportsoft.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table(name = "genres")
@AllArgsConstructor
@NoArgsConstructor
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private long genreId;
    @Column(name = "genre_name")
    private String genreName;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_of_entity", referencedColumnName = "user_id")
    private Users ownerOfEntity;
}

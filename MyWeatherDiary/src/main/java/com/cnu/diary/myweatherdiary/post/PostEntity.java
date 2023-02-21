package com.cnu.diary.myweatherdiary.post;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@ToString
@Entity(name = "posts")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostEntity {
    @Id
    @Column(nullable = false, unique = true)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private UUID id;
    @Column(nullable = false, unique = true)
    private UUID user_id;

    @Column
    private String post_comment;

    @Column
    private int feelings;

    @Column
    private Timestamp post_date;

    @Column
    private Timestamp reg_date;

    @Column
    private Timestamp mod_date;


    public PostEntity(UUID user_id) {
        this.user_id = user_id;
    }
}

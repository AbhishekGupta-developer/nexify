package com.myorganisation.nexify.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "posts")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String imageUrl;
    private String imageKey;
    private String imageMimeType;
    private Long imageSize;
}

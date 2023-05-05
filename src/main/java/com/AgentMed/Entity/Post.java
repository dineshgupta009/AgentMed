package com.AgentMed.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "content")
    private String content;

    @Column(name = "posted_at")
    private Date postedAt = new Date();

    @Column(name = "last_updated_at")
    private Date lastUpdatedAt = new Date();

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "post_tags",
            joinColumns = {
                    @JoinColumn(name = "post_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "tag_id")
            })
    private Set< Tag > tags = new HashSet< >();
}

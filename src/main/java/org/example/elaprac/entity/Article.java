package org.example.elaprac.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "article_tb")
@Data
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int articleCodePk;
    private String articleTitle;
    private String articleContent;
    private Date articleCreatedDate;
    private Date articleLastUpdatedDate;
    private int userCodeFk;
    private int articleCategory;
    private int articleViewCount;
}

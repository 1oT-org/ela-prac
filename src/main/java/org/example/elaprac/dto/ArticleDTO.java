package org.example.elaprac.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ArticleDTO {
    private int articleCodePk;
    private String articleTitle;
    private String articleContent;
    private Date articleCreatedDate;
    private Date articleLastUpdatedDate;
    private int userCodeFk;
    private int articleCategory;
    private int articleViewCount;
}

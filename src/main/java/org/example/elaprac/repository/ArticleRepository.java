package org.example.elaprac.repository;

import org.example.elaprac.dto.ArticleDTO;
import org.example.elaprac.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}

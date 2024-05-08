package org.example.elaprac.service;

import org.example.elaprac.dto.ArticleDTO;
import org.example.elaprac.entity.Article;
import org.example.elaprac.repository.ArticleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final ModelMapper mapper;

    @Autowired
    public ArticleService(ArticleRepository articleRepository, ModelMapper mapper) {
        this.articleRepository = articleRepository;
        this.mapper = mapper;
    }

    public ArticleDTO findArticleByArticleCode(int articleCode) {
        Article selectedArticle = articleRepository.findById(articleCode).orElseThrow(IllegalArgumentException::new);
        return mapper.map(selectedArticle, ArticleDTO.class);
    }
}

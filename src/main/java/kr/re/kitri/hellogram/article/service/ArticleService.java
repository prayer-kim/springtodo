package kr.re.kitri.hellogram.article.service;

import kr.re.kitri.hellogram.article.model.Article;

public interface ArticleService {
    // 전체조회
    String getAllArticles();

    // 상세조회
    String getArticleById(String articleId);

    // 글 등록
    String writeArticle(Article article);
}


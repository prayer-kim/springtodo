package kr.re.kitri.hellogram.article.service;

import kr.re.kitri.hellogram.article.model.Article;
import org.springframework.stereotype.Service;
import kr.re.kitri.hellogram.article.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    /*
    * 전체 글 보기
    * */
    @Override
    public String getAllArticles(){
        return articleRepository.selectArticles();
    }

    // 글 상세보기
    @Override
    public String getArticleById(String articleId){
        return articleRepository.selectArticleById(articleId);
    }

    @Override
    public String writeArticle(Article article) {
        return articleRepository.insertArticle(article);
    }
    // 글 수정
    // 좋아요
    // 글 등록
    // 글 삭제
}

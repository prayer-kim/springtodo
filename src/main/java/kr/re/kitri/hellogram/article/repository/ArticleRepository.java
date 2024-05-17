package kr.re.kitri.hellogram.article.repository;

import kr.re.kitri.hellogram.article.model.Article;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleRepository {
    /*
     * 전체 글 보기
     * */
    public String selectArticles(){
        return "글 목록 조회";
    }

    // 글 상세보기
    public String selectArticleById(String articleId){
        return "글 상세 조회";
    }

    // 글 등록
    public String insertArticle(Article article) {
        return "글 등록 =>" + article;
    }
    // 글 수정
    // 좋아요

    // 글 삭제
}

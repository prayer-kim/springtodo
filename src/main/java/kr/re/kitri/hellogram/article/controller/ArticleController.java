package kr.re.kitri.hellogram.article.controller;

import kr.re.kitri.hellogram.article.model.Article;
import kr.re.kitri.hellogram.article.service.ArticleService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    /*
    * 글 목록 조회
    * */
    @GetMapping("/articles")
    public String articles(){
        // 글 목록 조회
        return articleService.getAllArticles();
    }

    /*
    * 글 상세 보기
    * */
    @GetMapping("/articles/{articleId}")
    public String articleDetails(@PathVariable String articleId){

        return articleService.getArticleById(articleId);
    }

    /*
    * 글 등록
    * */
    @PostMapping(value="/articles")
    public String writeArticles(@RequestBody Article article){
        System.out.println(article);
        return articleService.writeArticle(article);


    }
}

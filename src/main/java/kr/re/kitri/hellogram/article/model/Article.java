package kr.re.kitri.hellogram.article.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Article {

    private long articleId;
    private String title;
    private String body;
    private String author;
    private int likes;

}

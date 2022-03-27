package plus.ldl.model.mess.admin;


import plus.ldl.model.article.pojos.ApArticleConfig;
import plus.ldl.model.article.pojos.ApArticleContent;
import plus.ldl.model.article.pojos.ApAuthor;
import lombok.Data;

@Data
public class AutoReviewClNewsSuccess {
    private ApArticleConfig apArticleConfig;
    private ApArticleContent apArticleContent;
    private ApAuthor apAuthor;

}

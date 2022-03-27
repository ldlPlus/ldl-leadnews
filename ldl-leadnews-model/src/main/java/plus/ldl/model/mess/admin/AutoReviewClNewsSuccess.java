package plus.ldl.model.mess.admin;


import lombok.Data;
import plus.ldl.model.article.pojos.ApArticleConfig;
import plus.ldl.model.article.pojos.ApArticleContent;
import plus.ldl.model.article.pojos.ApAuthor;

/**
 * @author ldl
 */
@Data
public class AutoReviewClNewsSuccess {
    private ApArticleConfig apArticleConfig;
    private ApArticleContent apArticleContent;
    private ApAuthor apAuthor;

}

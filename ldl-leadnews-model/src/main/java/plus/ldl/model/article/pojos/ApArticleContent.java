package plus.ldl.model.article.pojos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

/**
 * @author ldl
 */
@Data
public class ApArticleContent {
    private Integer id;
    @IdEncrypt
    private Integer articleId;
    private String content;

}

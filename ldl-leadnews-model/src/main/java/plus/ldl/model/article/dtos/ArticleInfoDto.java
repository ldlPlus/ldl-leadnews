package plus.ldl.model.article.dtos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

/**
 * @author ldl
 */
@Data
public class ArticleInfoDto {

    /**
     * 设备ID
     */
    @IdEncrypt
    Integer equipmentId;
    /**
     * 文章ID
     */
    @IdEncrypt
    Integer articleId;
    /**
     * 作者ID
     */
    @IdEncrypt
    Integer authorId;

}

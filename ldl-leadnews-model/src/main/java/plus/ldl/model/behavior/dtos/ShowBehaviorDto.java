package plus.ldl.model.behavior.dtos;


import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;
import plus.ldl.model.article.pojos.ApArticle;

import java.util.List;

/**
 * @author ldl
 */
@Data
public class ShowBehaviorDto {

    /**
     * 设备ID
     */
    @IdEncrypt
    Integer equipmentId;
    List<ApArticle> articleIds;

}

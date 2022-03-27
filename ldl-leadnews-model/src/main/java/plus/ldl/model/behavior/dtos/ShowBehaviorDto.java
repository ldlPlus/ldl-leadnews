package plus.ldl.model.behavior.dtos;


import plus.ldl.model.annotation.IdEncrypt;
import plus.ldl.model.article.pojos.ApArticle;
import lombok.Data;

import java.util.List;

@Data
public class ShowBehaviorDto {

    // 设备ID
    @IdEncrypt
    Integer equipmentId;
    List<ApArticle> articleIds;

}

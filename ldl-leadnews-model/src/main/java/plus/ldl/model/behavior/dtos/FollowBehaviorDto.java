package plus.ldl.model.behavior.dtos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

/**
 * @author ldl
 */
@Data
public class FollowBehaviorDto {
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
    @IdEncrypt
    Integer followId;
}

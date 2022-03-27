package plus.ldl.model.behavior.dtos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

/**
 * @author ldl
 */
@Data
public class UnLikesBehaviorDto {
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
     * 不喜欢操作方式
     * 0 不喜欢
     * 1 取消不喜欢
     */
    Short type;

}

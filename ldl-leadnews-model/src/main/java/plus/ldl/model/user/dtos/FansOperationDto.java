package plus.ldl.model.user.dtos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

/**
 * @author ldl
 */
@Data
public class FansOperationDto {
    @IdEncrypt
    private Integer fansId;

    /**
     * true 开   false 关
     */
    private Boolean switchState;
}

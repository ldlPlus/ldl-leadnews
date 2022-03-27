package plus.ldl.model.user.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import plus.ldl.model.common.dtos.PageRequestDto;

/**
 * @author ldl
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserFansPageReqDto extends PageRequestDto {
    private String fansName;
    private Short level;
}

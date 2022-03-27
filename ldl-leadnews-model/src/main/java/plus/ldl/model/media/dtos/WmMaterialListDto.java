package plus.ldl.model.media.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import plus.ldl.model.common.dtos.PageRequestDto;

/**
 * @author ldl
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmMaterialListDto extends PageRequestDto {
    /**
     * 1 查询收藏的
     */
    Short isCollected;
}

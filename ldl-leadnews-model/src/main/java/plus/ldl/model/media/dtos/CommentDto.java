package plus.ldl.model.media.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import plus.ldl.model.common.dtos.PageRequestDto;

/**
 * @author ldl
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CommentDto extends PageRequestDto {

    private Integer id;

}

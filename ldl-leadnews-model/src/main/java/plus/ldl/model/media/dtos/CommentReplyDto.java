package plus.ldl.model.media.dtos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

/**
 * @author ldl
 */
@Data
public class CommentReplyDto {

    @IdEncrypt
    private Integer commentId;
    private String content;

}

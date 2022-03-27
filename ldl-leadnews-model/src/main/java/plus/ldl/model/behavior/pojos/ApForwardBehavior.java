package plus.ldl.model.behavior.pojos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
/**
 * @author ldl
 */
@Data
public class ApForwardBehavior {
    private Long id;
    @IdEncrypt
    private Integer entryId;
    private Integer articleId;
    private Integer dynamicId;
    private Date createdTime;
}

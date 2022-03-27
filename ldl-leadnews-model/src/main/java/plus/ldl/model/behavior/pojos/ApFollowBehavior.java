package plus.ldl.model.behavior.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApFollowBehavior {
    private Long id;
    private Integer entryId;
    private Integer articleId;
    private Integer followId;
    private Date createdTime;
}

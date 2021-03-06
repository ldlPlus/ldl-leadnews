package plus.ldl.model.behavior.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApShowBehavior {
    private Integer id;
    private Integer entryId;
    private Integer articleId;
    private Boolean isClick;
    private Date showTime;
    private Date createdTime;

}

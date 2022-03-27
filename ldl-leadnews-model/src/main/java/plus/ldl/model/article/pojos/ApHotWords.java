package plus.ldl.model.article.pojos;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApHotWords implements Serializable {
    private static final long serialVersionUID = 2197591857624816800L;
    private Integer id;
    private String hotWords;
    private Integer type;
    private String hotDate;
    private Date createdTime;
}

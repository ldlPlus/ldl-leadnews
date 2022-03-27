package plus.ldl.model.article.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApAssociateWords {
    private Integer id;
    private String associateWords;
    private Date createdTime;
}

package plus.ldl.model.user.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApUserFeedback {
    private Integer id;
    private Integer userId;
    private String userName;
    private String content;
    private String images;
    private Boolean isSolve;
    private String solveNote;
    private Date solvedTime;
    private Date createdTime;

}

package plus.ldl.model.user.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApUserArticleList {
    private Integer id;
    private Integer userId;
    private Integer channelId;
    private Integer articleId;
    private Boolean isShow;
    private Date recommendTime;
    private Boolean isRead;
    private Integer strategyId;

}

package plus.ldl.model.media.pojos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class WmNews {

    @IdEncrypt
    protected Long userId;
    private Integer id;
    private String title;
    private Short type;
    @IdEncrypt
    private Integer channelId;
    private String labels;
    private Date createdTime;
    private Date submittedTime;
    private Short status;
    private Date publishTime;
    private String reason;
    @IdEncrypt
    private Integer articleId;
    private String content;
    /**
     * 图片用逗号分隔
     */
    private String images;
}

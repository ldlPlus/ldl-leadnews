package plus.ldl.model.crawler.pojos;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章评论
 * @author ldl
 */
@Data
public class ClNewsComment implements Serializable {
    private static final long serialVersionUID = -1452539207824925237L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 文章ID
     */
    private Integer newsId;

    /**
     * 评论人
     */
    private String username;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论日期
     */
    private Date commentDate;

    /**
     * 创建日期
     */
    private Date createdDate;


}

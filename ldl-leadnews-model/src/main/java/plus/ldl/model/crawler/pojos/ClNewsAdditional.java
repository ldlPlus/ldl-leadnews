package plus.ldl.model.crawler.pojos;

import lombok.Data;

import java.util.Date;

/**
 * 回复
 * @author ldl
 */
@Data
public class ClNewsAdditional {
    private Integer id;
    private Integer newsId;
    private String url;
    private Integer readCount;
    private Integer likes;
    private Integer comment;
    private Integer forward;
    private Integer unlikes;
    private Integer collection;
    private Date createdTime;
    private Date count;
    private Date updatedTime;


}

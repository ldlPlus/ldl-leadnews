package plus.ldl.model.crawler.pojos;

import lombok.Data;

import java.util.Date;

/**
 * 媒体
 * @author ldl
 */
@Data
public class ClMaterial {
    private Integer id;
    private Integer userId;
    private String url;
    private Boolean type;
    private Boolean isCollection;
    private Date createdTime;

}

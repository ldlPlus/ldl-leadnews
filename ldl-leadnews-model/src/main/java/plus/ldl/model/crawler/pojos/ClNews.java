package plus.ldl.model.crawler.pojos;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import plus.ldl.model.crawler.core.parse.ZipUtils;

import java.util.Date;

/**
 * 文章
 */
@Data
public class ClNews {
    private Integer id;
    private Integer taskId;
    private String title;
    private String name;
    private int type;
    private Integer channelId;
    private String labels;
    private Date originalTime;
    private Date createdTime;
    private Date submittedTime;
    private Byte status;
    private Date publishTime;
    private String reason;
    private Integer articleId;
    private Integer no;
    private String content;

    public String getUnCompressContent() {
        if (StringUtils.isNotEmpty(content)) {
            return ZipUtils.gunzip(content);
        }
        return content;
    }

}

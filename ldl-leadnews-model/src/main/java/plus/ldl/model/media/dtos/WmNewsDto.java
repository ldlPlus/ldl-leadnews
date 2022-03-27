package plus.ldl.model.media.dtos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;
import java.util.List;

/**
 * @author ldl
 */
@Data
public class WmNewsDto {
    private Integer id;
    private String title;
    @IdEncrypt
    private Integer channelId;
    private String labels;
    private Date publishTime;
    private String content;
    private Short type;
    private Date submittedTime;
    private Short status;
    private String reason;
    private List<String> images;
}

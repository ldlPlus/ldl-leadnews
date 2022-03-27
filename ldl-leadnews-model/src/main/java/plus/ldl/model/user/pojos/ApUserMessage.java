package plus.ldl.model.user.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApUserMessage {

    private Integer id;
    private Long userId;
    private Integer senderId;
    private String senderName;
    private String content;
    private Integer type;
    private Boolean isRead;
    private Date createdTime;
    private Date readTime;
}

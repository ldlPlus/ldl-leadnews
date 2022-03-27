package plus.ldl.model.user.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApUserFan {
    private Long id;
    @IdEncrypt
    private Integer userId;
    @IdEncrypt
    private Long fansId;
    private String fansName;
    private Short level;
    private Date createdTime;
    private Boolean isDisplay;
    private Boolean isShieldLetter;
    private Boolean isShieldComment;
    @JsonIgnore
    private String burst;
}

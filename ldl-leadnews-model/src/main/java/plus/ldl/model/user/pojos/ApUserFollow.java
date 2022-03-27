package plus.ldl.model.user.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApUserFollow {
    private Long id;
    @IdEncrypt
    private Long userId;
    @IdEncrypt
    private Integer followId;
    private String followName;
    private Short level;
    private Boolean isNotice;
    private Date createdTime;
    @JsonIgnore
    private String burst;
}

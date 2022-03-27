package plus.ldl.model.media.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class WmFansPortrait {
    private Integer id;
    @IdEncrypt
    private Integer userId;
    private String name;
    private String value;
    @JsonIgnore
    private String burst;
    private Date createdTime;
}

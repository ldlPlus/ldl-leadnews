package plus.ldl.model.behavior.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApReadBehavior {
    private Long id;
    @IdEncrypt
    private Integer entryId;
    @IdEncrypt
    private Integer articleId;
    private Short count;
    private Integer readDuration;
    private Short percentage;
    private Short loadDuration;
    private Date createdTime;
    private Date updatedTime;
    @JsonIgnore
    private String burst;
}

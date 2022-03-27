package plus.ldl.model.media.pojos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class WmMaterial {
    private Integer id;
    @IdEncrypt
    private Long userId;
    private String url;
    private short type;
    private Short isCollection;
    private Date createdTime;
}

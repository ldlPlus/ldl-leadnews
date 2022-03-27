package plus.ldl.model.media.pojos;

import plus.ldl.model.annotation.IdEncrypt;
import lombok.Data;

import java.util.Date;

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

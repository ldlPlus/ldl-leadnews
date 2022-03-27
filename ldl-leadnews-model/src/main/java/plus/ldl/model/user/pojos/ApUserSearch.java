package plus.ldl.model.user.pojos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

@Data
public class ApUserSearch {
    private Integer id;
    @IdEncrypt
    private Integer entryId;
    private String keyword;
    private Integer status;
    private Date createdTime;

}

package plus.ldl.model.user.pojos;

import plus.ldl.model.annotation.IdEncrypt;
import lombok.Data;

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

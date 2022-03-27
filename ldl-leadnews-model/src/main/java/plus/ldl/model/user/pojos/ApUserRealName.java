package plus.ldl.model.user.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApUserRealName {
    private Integer id;
    @IdEncrypt
    private Integer userId;
    private String name;
    private String idNo;
    private String fontImage;
    private String backImage;
    private String holdImage;
    private String liveImage;
    private Short status;
    private String reason;
    private Date createdTime;
    private Date submittedTime;
    private Date updatedTime;


}

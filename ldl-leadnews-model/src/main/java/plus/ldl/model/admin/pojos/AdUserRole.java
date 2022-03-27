package plus.ldl.model.admin.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class AdUserRole {
    private Integer id;
    private Integer roleId;
    private Integer userId;
    private Date createdTime;

}

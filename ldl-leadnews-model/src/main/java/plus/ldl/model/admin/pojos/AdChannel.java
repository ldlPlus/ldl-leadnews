package plus.ldl.model.admin.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class AdChannel {
    private Integer id;
    private String name;
    private String description;
    private Boolean isDefault;
    private Boolean status;
    private Byte ord;
    private Date createdTime;


}

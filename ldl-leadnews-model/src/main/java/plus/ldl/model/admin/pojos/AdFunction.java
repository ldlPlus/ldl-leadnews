package plus.ldl.model.admin.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class AdFunction {
    private Integer id;
    private String name;
    private String code;
    private Integer parentId;
    private Date createdTime;

}

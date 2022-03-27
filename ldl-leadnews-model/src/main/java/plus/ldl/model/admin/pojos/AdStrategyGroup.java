package plus.ldl.model.admin.pojos;

import lombok.Data;

import java.util.Date;
/**
 * @author ldl
 */
@Data
public class AdStrategyGroup {
    private Integer id;
    private String name;
    private String description;
    private Date createdTime;

}

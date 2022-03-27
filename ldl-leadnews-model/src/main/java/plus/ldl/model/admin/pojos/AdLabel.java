package plus.ldl.model.admin.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class AdLabel {
    private Integer id;
    private String name;
    private Boolean type;
    private Date createdTime;

}

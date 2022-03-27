package plus.ldl.model.admin.pojos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class AdVistorStatistics {
    private Integer id;
    private Integer activity;
    private Integer vistor;
    private Integer ip;
    private Integer register;
    private Date createdTime;

}

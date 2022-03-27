package plus.ldl.model.admin.pojos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ldl
 */
@Data
public class AdUserLogin {
    private Integer id;
    private Integer userId;
    private Integer equipmentId;
    private String ip;
    private String address;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private Date createdTime;

}

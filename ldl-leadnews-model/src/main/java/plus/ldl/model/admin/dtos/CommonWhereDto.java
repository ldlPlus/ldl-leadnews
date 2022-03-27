package plus.ldl.model.admin.dtos;

import lombok.Data;

/**
 * @author ldl
 */
@Data
public class CommonWhereDto {

    private String filed;
    private String type = "eq";
    private String value;

}

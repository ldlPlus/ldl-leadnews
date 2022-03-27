package plus.ldl.model.admin.dtos;

import lombok.Data;

/**
 * @author ldl
 */
@Data
public class AuthListDto {

    private Integer size;
    private Integer page;
//    private Map<String, Object> params;

    private Short status;
}

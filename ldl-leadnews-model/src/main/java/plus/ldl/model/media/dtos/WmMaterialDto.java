package plus.ldl.model.media.dtos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

/**
 * @author ldl
 */
@Data
public class WmMaterialDto {

    @IdEncrypt
    private Integer id;

//    private String url;
}

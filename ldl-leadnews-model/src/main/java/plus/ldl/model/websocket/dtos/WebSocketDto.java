package plus.ldl.model.websocket.dtos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;

/**
 * @author ldl
 */
@Data
public class WebSocketDto {
    /**
     * 设备ID
     */
    @IdEncrypt
    private Integer equipmentId;
    /**
     * 文章ID
     */
    @IdEncrypt
    private String token;
}

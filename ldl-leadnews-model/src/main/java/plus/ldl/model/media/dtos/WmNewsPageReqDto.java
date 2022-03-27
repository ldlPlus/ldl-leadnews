package plus.ldl.model.media.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import plus.ldl.model.annotation.IdEncrypt;
import plus.ldl.model.common.dtos.PageRequestDto;

import java.util.Date;

/**
 * @author ldl
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class WmNewsPageReqDto extends PageRequestDto {

    private Short status;
    private Date beginPubDate;
    private Date endPubDate;
    @IdEncrypt
    private Integer channelId;
    private String keyWord;
}

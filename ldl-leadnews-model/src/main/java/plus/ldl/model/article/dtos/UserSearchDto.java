package plus.ldl.model.article.dtos;

import lombok.Data;
import plus.ldl.model.annotation.IdEncrypt;
import plus.ldl.model.user.pojos.ApUserSearch;

import java.util.List;

/**
 * @author ldl
 */
@Data
public class UserSearchDto {

    /**
     * 设备ID
     */
    @IdEncrypt
    Integer equipmentId;
    String searchWords;
    /**
     * 查询tag: all, article, user, author
     */
    String tag;
    List<ApUserSearch> hisList;
    String hotDate;
    int pageNum;
    int pageSize;

    public int getFromIndex() {
        if (this.pageNum < 1) {
            return 0;
        }
        if (this.pageSize < 1) {
            this.pageSize = 10;
        }
        return this.pageSize * (pageNum - 1);
    }
}

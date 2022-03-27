package plus.ldl.model.behavior.pojos;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApUnlikesBehavior {
    private Long id;
    @IdEncrypt
    private Integer entryId;
    @IdEncrypt
    private Integer articleId;
    private Short type;
    private Date createdTime;

    /**
     * 定义不喜欢操作的类型
     */
    @Alias("ApUnlikesBehaviorEnumType")
    public enum Type {
        /**
         * 不喜欢
         */
        UNLIKE((short) 0),
        /**
         * 取消不喜欢
         */
        CANCEL((short) 1);
        final short code;

        Type(short code) {
            this.code = code;
        }

        public short getCode() {
            return this.code;
        }
    }
}

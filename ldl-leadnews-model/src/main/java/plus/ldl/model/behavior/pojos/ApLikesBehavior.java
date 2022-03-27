package plus.ldl.model.behavior.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.apache.ibatis.type.Alias;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApLikesBehavior {
    private Long id;
    @IdEncrypt
    private Integer behaviorEntryId;
    @IdEncrypt
    private Integer entryId;
    private Short type;
    private Short operation;
    private Date createdTime;
    @JsonIgnore
    private String burst;

    /**
     * 定义点赞内容的类型
     */
    @Alias("ApLikesBehaviorEnumType")
    public enum Type {
        /**
         * 点赞文章
         */
        ARTICLE((short) 0),
        /**
         * 点赞视频
         */
        DYNAMIC((short) 1),
        /**
         * 点赞评论
         */
        COMMENT((short) 2);
        final short code;

        Type(short code) {
            this.code = code;
        }

        public short getCode() {
            return this.code;
        }
    }

    /**
     * 定义点赞操作的方式，点赞还是取消点赞
     */
    @Alias("ApLikesBehaviorEnumOperation")
    public enum Operation {
        /**
         * 点赞
         */
        LIKE((short) 0),
        /**
         * 取消点赞
         */
        CANCEL((short) 1);
        final short code;

        Operation(short code) {
            this.code = code;
        }

        public short getCode() {
            return this.code;
        }
    }

}

package plus.ldl.model.article.pojos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.apache.ibatis.type.Alias;
import plus.ldl.model.annotation.IdEncrypt;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ApCollection {
    private Long id;
    @IdEncrypt
    private Integer behaviorEntryId;
    @IdEncrypt
    private Integer entryId;
    private Short type;
    private Date collectionTime;
    private Date publishedTime;
    @JsonIgnore
    private String burst;

    public boolean isCollectionArticle() {
        return (this.getType() != null && this.getType().equals(Type.ARTICLE));
    }

    /**
     * 定义收藏内容类型的枚举
     */
    @Alias("ApCollectionEnumType")
    public enum Type {
        /**
         * 收藏文章
         */
        ARTICLE((short) 0),
        /**
         * 收藏视频
         */
        DYNAMIC((short) 1);
        final short code;

        Type(short code) {
            this.code = code;
        }

        public short getCode() {
            return this.code;
        }
    }
}

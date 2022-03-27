package plus.ldl.model.admin.enums;

import lombok.Getter;

/**
 * @author ldl
 */

@Getter
public enum CommonTableEnum {

    AD_CHANNEL("*", true, true, true, true),
    AD_SENSITIVE("*", true, true, true, true),
    // APP用户端
    AP_ARTICLE("*", true, false, false, false),
    AP_ARTICLE_CONFIG("*", true, false, true, false),
    AP_USER("*", true, false, true, false);

    final   String filed;
    /**
     * 开启列表权限？
     */
    final  boolean list;
    /**
     * 开启增加权限？
     */
    final  boolean add;
    /**
     * 开启修改权限？
     */
    final boolean update;
    /**
     * 开启删除权限？
     */
    final boolean delete;

    CommonTableEnum(String filed, boolean list, boolean add, boolean update, boolean delete) {
        this.filed = filed;
        this.list = list;
        this.add = add;
        this.update = update;
        this.delete = delete;
    }
}

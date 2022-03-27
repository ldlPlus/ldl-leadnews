package plus.ldl.model.article.dtos;

import lombok.Data;

import java.util.Date;

/**
 * @author ldl
 */
@Data
public class ArticleHomeDto {

    /**
     * 省市
     */
    Integer provinceId;
    /**
     * 市区
     */
    Integer cityId;
    /**
     * 区县
     */
    Integer countyId;
    /**
     * 最大时间
     */
    Date maxBeHotTime;
    /**
     * 最小时间
     */
    Date minBeHotTime;
    /**
     * 分页size
     */
    Integer size;
    /**
     * 数据范围，比如频道ID
     */
    String tag;

}

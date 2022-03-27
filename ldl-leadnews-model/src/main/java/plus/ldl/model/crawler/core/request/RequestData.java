package plus.ldl.model.crawler.core.request;

import lombok.Data;
import plus.ldl.model.crawler.enums.CrawlerEnum;

import java.io.Serializable;
import java.util.List;

/**
 * @author ldl
 */
@Data
public class RequestData implements Serializable {

    private static final long serialVersionUID = 8473551145792868111L;
    /**
     * 访问的URL
     */
    private String url;
    /**
     * 类别
     */
    private String category;
    /**
     * 返回数据类型
     */
    private CrawlerEnum.ReturnDataType returnDataType;
    /**
     * 返回数据结果集
     */
    private List<String> resultList;

    public RequestData() {
    }

    public RequestData(String url, String category, CrawlerEnum.ReturnDataType returnDataType) {
        this.url = url;
        this.category = category;
        this.returnDataType = returnDataType;
    }

}

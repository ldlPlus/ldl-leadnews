package plus.ldl.model.common.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ldl
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PageResponseResult<T> extends ResponseResult<T> {
    private static final long serialVersionUID = -8425248107997907758L;
    private Integer currentPage;
    private Integer size;
    private Integer total;

    public PageResponseResult(Integer currentPage, Integer size, Integer total) {
        this.currentPage = currentPage;
        this.size = size;
        this.total = total;
    }

    public PageResponseResult(T data, Integer currentPage, Integer size, Integer total) {
        super(data);
        this.currentPage = currentPage;
        this.size = size;
        this.total = total;
    }

    public PageResponseResult(Integer code, String msg, T data, Integer currentPage, Integer size, Integer total) {
        super(code, msg, data);
        this.currentPage = currentPage;
        this.size = size;
        this.total = total;
    }
}

package plus.ldl.model.crawler.core.proxy;

import lombok.Data;

/**
 * proxy 校验
 *
 * @author ldl
 */
@Data
public class ProxyValidate {

    /**
     * 主机
     */
    private String host;
    /**
     * 端口号
     */
    private int port;
    /**
     * 错误码
     */
    private int returnCode;
    /**
     * 耗时
     */
    private int duration;
    /**
     * 错误信息
     */
    private String error;

    public ProxyValidate() {
    }

    public ProxyValidate(String host, int port) {
        this.host = host;
        this.port = port;
    }

    /**
     * 获取代理对象
     *
     * @return
     */
    public CrawlerProxy getProxy() {
        return new CrawlerProxy(host, port);
    }
}

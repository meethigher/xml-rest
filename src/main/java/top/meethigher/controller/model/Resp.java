package top.meethigher.controller.model;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 *
 *
 * @author chenchuancheng
 * @since 2023/2/21 10:20
 */
@JacksonXmlRootElement(localName = "resp")
public class Resp<T> {
    @JacksonXmlProperty(localName = "code")
    private Integer code;
    @JacksonXmlProperty(localName = "msg")
    private String msg;
    @JacksonXmlProperty(localName = "data")
    private T data;


    public Resp(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Resp() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

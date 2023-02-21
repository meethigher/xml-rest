package top.meethigher.controller.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Date;

/**
 *
 *
 * @author chenchuancheng
 * @since 2023/2/21 10:21
 */
@JacksonXmlRootElement(localName = "machine")
public class Machine {
    @JacksonXmlProperty(localName = "id")
    private String id;
    @JacksonXmlProperty(localName = "create-date")
    private Date createDate;
    @JacksonXmlProperty(localName = "creator")
    private String creator;
    @JacksonXmlProperty(localName = "online")
    private Integer online;
    @JacksonXmlProperty(localName = "safe-pro-type")
    private Long safeProType;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Long getSafeProType() {
        return safeProType;
    }

    public void setSafeProType(Long safeProType) {
        this.safeProType = safeProType;
    }
}

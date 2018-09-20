package com.datapower.schemas.appliance.management._3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "domain"
})
@Data
@NoArgsConstructor
public class QuiesceRequest {

    @XmlElement(name = "Domain")
    protected QuiesceRequest.Domain domain;

    public QuiesceRequest(int timeout, String domain) {
        this.domain = new Domain(domain, timeout);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "name",
            "timeout"
    })
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Domain {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Timeout")
        @XmlSchemaType(name = "unsignedShort")
        protected int timeout;

    }

}

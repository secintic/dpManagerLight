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
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "UnquiesceRequest")
public class UnquiesceRequest {

    @XmlElement(name = "Domain")
    protected UnquiesceRequest.Domain domain;

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "name"
    })
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Domain {

        @XmlElement(name = "Name", required = true)
        protected String name;
    }

}

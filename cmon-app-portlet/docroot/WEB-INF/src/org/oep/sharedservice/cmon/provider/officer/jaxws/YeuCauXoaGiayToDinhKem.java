
package org.oep.sharedservice.cmon.provider.officer.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.1
 * Wed Jul 17 10:41:56 ICT 2013
 * Generated source version: 2.6.1
 */

@XmlRootElement(name = "yeuCauXoaGiayToDinhKem", namespace = "http://officer.provider.cmon.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yeuCauXoaGiayToDinhKem", namespace = "http://officer.provider.cmon.sharedservice.dtt.vn/", propOrder = {"arg0", "arg1"})

public class YeuCauXoaGiayToDinhKem {

    @XmlElement(name = "arg0")
    private java.lang.Long arg0;
    @XmlElement(name = "arg1")
    private java.lang.Long arg1;

    public java.lang.Long getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.Long newArg0)  {
        this.arg0 = newArg0;
    }

    public java.lang.Long getArg1() {
        return this.arg1;
    }

    public void setArg1(java.lang.Long newArg1)  {
        this.arg1 = newArg1;
    }

}



package org.oep.sharedservice.cmon.provider.form.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.1
 * Sat Jul 05 10:22:09 ICT 2014
 * Generated source version: 2.6.1
 */

@XmlRootElement(name = "getDSThuTucHanhChinhTheoNhom", namespace = "http://form.provider.cmon.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDSThuTucHanhChinhTheoNhom", namespace = "http://form.provider.cmon.sharedservice.dtt.vn/")

public class GetDSThuTucHanhChinhTheoNhom {

    @XmlElement(name = "arg0")
    private java.lang.Long arg0;

    public java.lang.Long getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.Long newArg0)  {
        this.arg0 = newArg0;
    }

}



package org.oep.sharedservice.touchscreen.tracuutthc.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.1
 * Mon Jul 21 12:17:29 ICT 2014
 * Generated source version: 2.6.1
 */

@XmlRootElement(name = "getTTHCByIdTTHC", namespace = "http://tracuutthc.touchscreen.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTTHCByIdTTHC", namespace = "http://tracuutthc.touchscreen.sharedservice.dtt.vn/")

public class GetTTHCByIdTTHC {

    @XmlElement(name = "arg0")
    private java.lang.Long arg0;

    public java.lang.Long getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.Long newArg0)  {
        this.arg0 = newArg0;
    }

}



package org.oep.sharedservice.exch.provider.hoso.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.1
 * Thu Jun 27 00:23:19 ICT 2013
 * Generated source version: 2.6.1
 */

@XmlRootElement(name = "updateResult", namespace = "http://hoso.provider.exch.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateResult", namespace = "http://hoso.provider.exch.sharedservice.dtt.vn/")

public class UpdateResult {

    @XmlElement(name = "arg0")
    private org.oep.sharedservice.exch.provider.soap.DocumentResultSoapList arg0;

    public org.oep.sharedservice.exch.provider.soap.DocumentResultSoapList getArg0() {
        return this.arg0;
    }

    public void setArg0(org.oep.sharedservice.exch.provider.soap.DocumentResultSoapList newArg0)  {
        this.arg0 = newArg0;
    }

}


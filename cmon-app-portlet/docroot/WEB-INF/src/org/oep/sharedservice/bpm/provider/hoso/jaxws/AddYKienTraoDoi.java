
package org.oep.sharedservice.bpm.provider.hoso.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.1
 * Thu Jun 20 15:05:07 ICT 2013
 * Generated source version: 2.6.1
 */

@XmlRootElement(name = "addYKienTraoDoi", namespace = "http://hoso.provider.bpm.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addYKienTraoDoi", namespace = "http://hoso.provider.bpm.sharedservice.dtt.vn/")

public class AddYKienTraoDoi {

    @XmlElement(name = "arg0")
    private vn.dtt.cmon.dao.hosohcc.model.YKienTraoDoiSoap arg0;

    public vn.dtt.cmon.dao.hosohcc.model.YKienTraoDoiSoap getArg0() {
        return this.arg0;
    }

    public void setArg0(vn.dtt.cmon.dao.hosohcc.model.YKienTraoDoiSoap newArg0)  {
        this.arg0 = newArg0;
    }

}


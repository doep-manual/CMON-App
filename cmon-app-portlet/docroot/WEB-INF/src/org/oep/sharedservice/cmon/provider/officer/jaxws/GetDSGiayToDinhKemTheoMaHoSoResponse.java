
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

@XmlRootElement(name = "getDSGiayToDinhKemTheoMaHoSoResponse", namespace = "http://officer.provider.cmon.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDSGiayToDinhKemTheoMaHoSoResponse", namespace = "http://officer.provider.cmon.sharedservice.dtt.vn/")

public class GetDSGiayToDinhKemTheoMaHoSoResponse {

    @XmlElement(name = "return")
    private java.util.List<org.oep.sharedservice.cmon.provider.officer.soap.GiayToDinhKem> _return;

    public java.util.List<org.oep.sharedservice.cmon.provider.officer.soap.GiayToDinhKem> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.List<org.oep.sharedservice.cmon.provider.officer.soap.GiayToDinhKem> new_return)  {
        this._return = new_return;
    }

}


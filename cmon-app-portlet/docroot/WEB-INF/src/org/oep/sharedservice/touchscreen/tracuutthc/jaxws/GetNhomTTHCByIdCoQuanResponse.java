
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

@XmlRootElement(name = "getNhomTTHCByIdCoQuanResponse", namespace = "http://tracuutthc.touchscreen.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNhomTTHCByIdCoQuanResponse", namespace = "http://tracuutthc.touchscreen.sharedservice.dtt.vn/")

public class GetNhomTTHCByIdCoQuanResponse {

    @XmlElement(name = "return")
    private java.util.List<vn.dtt.cmon.dao.dvc.model.NhomThuTucHanhChinhSoap> _return;

    public java.util.List<vn.dtt.cmon.dao.dvc.model.NhomThuTucHanhChinhSoap> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.List<vn.dtt.cmon.dao.dvc.model.NhomThuTucHanhChinhSoap> new_return)  {
        this._return = new_return;
    }

}


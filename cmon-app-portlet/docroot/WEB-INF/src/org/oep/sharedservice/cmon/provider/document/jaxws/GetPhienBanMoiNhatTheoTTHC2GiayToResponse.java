
package org.oep.sharedservice.cmon.provider.document.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.1
 * Tue Jul 16 16:14:21 ICT 2013
 * Generated source version: 2.6.1
 */

@XmlRootElement(name = "getPhienBanMoiNhatTheoTTHC2GiayToResponse", namespace = "http://document.provider.cmon.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPhienBanMoiNhatTheoTTHC2GiayToResponse", namespace = "http://document.provider.cmon.sharedservice.dtt.vn/")

public class GetPhienBanMoiNhatTheoTTHC2GiayToResponse {

    @XmlElement(name = "return")
    private org.oep.sharedservice.cmon.provider.model.TaiLieuDinhKem _return;

    public org.oep.sharedservice.cmon.provider.model.TaiLieuDinhKem getReturn() {
        return this._return;
    }

    public void setReturn(org.oep.sharedservice.cmon.provider.model.TaiLieuDinhKem new_return)  {
        this._return = new_return;
    }

}



package org.oep.sharedservice.cmon.provider.citizen.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.1
 * Thu Sep 11 10:50:08 ICT 2014
 * Generated source version: 2.6.1
 */

@XmlRootElement(name = "getDSDonViHanhChinhTheoChaIdResponse", namespace = "http://citizen.provider.cmon.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDSDonViHanhChinhTheoChaIdResponse", namespace = "http://citizen.provider.cmon.sharedservice.dtt.vn/")

public class GetDSDonViHanhChinhTheoChaIdResponse {

    @XmlElement(name = "return")
    private vn.dtt.cmon.dao.qlhc.model.DonViHanhChinhSoap[] _return;

    public vn.dtt.cmon.dao.qlhc.model.DonViHanhChinhSoap[] getReturn() {
        return this._return;
    }

    public void setReturn(vn.dtt.cmon.dao.qlhc.model.DonViHanhChinhSoap[] new_return)  {
        this._return = new_return;
    }

}


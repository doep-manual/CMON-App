
package org.oep.sharedservice.cmon.provider.thamso.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.1
 * Wed Sep 25 11:13:47 ICT 2013
 * Generated source version: 2.6.1
 */

@XmlRootElement(name = "getAnhXaResponse", namespace = "http://thamso.provider.cmon.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAnhXaResponse", namespace = "http://thamso.provider.cmon.sharedservice.dtt.vn/")

public class GetAnhXaResponse {

    @XmlElement(name = "return")
    private vn.dtt.cmon.dao.thamso.model.AnhXaSoap _return;

    public vn.dtt.cmon.dao.thamso.model.AnhXaSoap getReturn() {
        return this._return;
    }

    public void setReturn(vn.dtt.cmon.dao.thamso.model.AnhXaSoap new_return)  {
        this._return = new_return;
    }

}

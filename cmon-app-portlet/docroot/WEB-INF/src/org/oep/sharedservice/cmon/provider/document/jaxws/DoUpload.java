
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

@XmlRootElement(name = "doUpload", namespace = "http://document.provider.cmon.sharedservice.dtt.vn/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doUpload", namespace = "http://document.provider.cmon.sharedservice.dtt.vn/", propOrder = {"arg0", "arg1", "arg2", "arg3", "arg4", "arg5", "arg6"})

public class DoUpload {

    @XmlElement(name = "arg0")
    private java.lang.Long arg0;
    @XmlElement(name = "arg1")
    private java.lang.Long arg1;
    @XmlElement(name = "arg2")
    private java.lang.String arg2;
    @XmlElement(name = "arg3")
    private byte[] arg3;
    @XmlElement(name = "arg4")
    private java.lang.String arg4;
    @XmlElement(name = "arg5")
    private boolean arg5;
    @XmlElement(name = "arg6")
    private boolean arg6;

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

    public java.lang.String getArg2() {
        return this.arg2;
    }

    public void setArg2(java.lang.String newArg2)  {
        this.arg2 = newArg2;
    }

    public byte[] getArg3() {
        return this.arg3;
    }

    public void setArg3(byte[] newArg3)  {
        this.arg3 = newArg3;
    }

    public java.lang.String getArg4() {
        return this.arg4;
    }

    public void setArg4(java.lang.String newArg4)  {
        this.arg4 = newArg4;
    }

    public boolean getArg5() {
        return this.arg5;
    }

    public void setArg5(boolean newArg5)  {
        this.arg5 = newArg5;
    }

    public boolean getArg6() {
        return this.arg6;
    }

    public void setArg6(boolean newArg6)  {
        this.arg6 = newArg6;
    }

}

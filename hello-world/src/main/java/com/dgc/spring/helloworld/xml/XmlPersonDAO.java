package com.dgc.spring.helloworld.xml;

public class XmlPersonDAO {

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    XmlJdbcConnection xmlJdbcConnection;
}

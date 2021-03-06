
package com.founder.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import pkuhit.iih.mr.wr.ArchiveServiceImpl;
import pkuhit.md.SysFunctionCode;
import pkuhit.xap.pm.Param;
import pkuhit.xap.pm.ParamsService;
import xap.sv.annotation.Reference;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "EmrArchiveService", targetNamespace = "http://webservice.founder.com")
public class EmrArchiveService
    extends Service
{

    private final static URL EMRARCHIVESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.founder.webservice.EmrArchiveService.class.getName());
   
    
    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.founder.webservice.EmrArchiveService.class.getResource(".");
            url = new URL(baseUrl,"http://172.18.75.78:8080/emr-archive-app/services/EmrArchiveService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://172.18.75.70:8080/emr-archive-app/services/EmrArchiveService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        EMRARCHIVESERVICE_WSDL_LOCATION = url;
    }

    public EmrArchiveService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmrArchiveService() {
        super(EMRARCHIVESERVICE_WSDL_LOCATION, new QName("http://webservice.founder.com", "EmrArchiveService"));
    }

    /**
     * 
     * @return
     *     returns EmrArchiveServicePortType
     */
    @WebEndpoint(name = "EmrArchiveServiceHttpSoap11Endpoint")
    public EmrArchiveServicePortType getEmrArchiveServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://webservice.founder.com", "EmrArchiveServiceHttpSoap11Endpoint"), EmrArchiveServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmrArchiveServicePortType
     */
    @WebEndpoint(name = "EmrArchiveServiceHttpSoap11Endpoint")
    public EmrArchiveServicePortType getEmrArchiveServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.founder.com", "EmrArchiveServiceHttpSoap11Endpoint"), EmrArchiveServicePortType.class, features);
    }

}

package com.xaplayd.testecorreios;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import com.xaplayd.testecorreios.servico.ArrayOftCountryCodeAndName;
import com.xaplayd.testecorreios.servico.CountryInfoServiceSoapType;
import com.xaplayd.testecorreios.servico.TCountryCodeAndName;

import jakarta.xml.ws.Service;

public class App {
    public static void main(String[] args) {
        try {
            URL urlWSDL = new URL("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL");
            QName qname = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoService");

            Service service = Service.create(urlWSDL, qname);
            CountryInfoServiceSoapType port = service.getPort(CountryInfoServiceSoapType.class);

            ArrayOftCountryCodeAndName countries = port.listOfCountryNamesByName();
            List<TCountryCodeAndName> countryList = countries.getTCountryCodeAndName();

            for (TCountryCodeAndName country : countryList) {
            	if(country.getSISOCode().compareTo("BR") == 0) {
            		System.out.println("País: " + country.getSName() + " | Código ISO: " + country.getSISOCode());
            	}
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
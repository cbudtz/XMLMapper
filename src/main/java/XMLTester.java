import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XMLTester {
    public static void main(String[] args) throws IOException {
        Patient patient= new Patient();
        patient.setCPR("2509811699");
        patient.setFornavn("Endeavour");
        //Konverter til XML
        XmlMapper xmlMapper = new XmlMapper();
        String s = xmlMapper.writeValueAsString(patient);
        System.out.println(s);
        //Og tilbage igen
        s = s.replace("Endeavour","Robert");
        Patient readPatient = xmlMapper.readValue(s, Patient.class);
        System.out.println("CPR: " + readPatient.getCPR() + " , fornavn: " + readPatient.getFornavn());


    }
}

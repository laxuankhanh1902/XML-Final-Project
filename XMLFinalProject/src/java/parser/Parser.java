/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author frankLX
 */
public class Parser {

    public Parser() {
    }

    public void marshalling(Class inputClass, List<Object> list, String path) {

        try {
            JAXBContext context = JAXBContext.newInstance(inputClass);

            Marshaller marshalling = context.createMarshaller();
            marshalling.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshalling.marshal(list, new File("D:\\" + path));

        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void unMarshalling(Class inputClass, List<Object> list, String path) {

        try {
            JAXBContext context = JAXBContext.newInstance(inputClass);

            Unmarshaller unmarshalling = context.createUnmarshaller();

            Object object = (Object) unmarshalling.unmarshal(new File(path));

            for (Object element : list) {
                //Do something here
            }

        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

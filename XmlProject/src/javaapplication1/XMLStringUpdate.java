/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 *
 * @author DKR
 */
public class XMLStringUpdate {
    
    public static void main(String[] args) throws Exception{
        String xmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?> <i18n> <language id=\"en_US\">     <entity id=\"pwd\">Password</entity>     <entity id=\"uid\">username1234</entity>     <entity id=\"logo\">Logo</entity> </language>	 </i18n> ";
        Document doc =StringToDocument(xmlString);
        String finalUpdatedStr = DocumentToString(doc);
        System.out.println("fianalUpdateStr :"+finalUpdatedStr);
    }
    public static Document StringToDocument(String strXml) throws Exception {

        Document doc = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            StringReader strReader = new StringReader(strXml);
            InputSource is = new InputSource(strReader);
            doc = (Document) builder.parse(is);
            updateNodeValue(doc);
            
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return doc;
    }
    
    
    public static void updateNodeValue(Document doc) {
         NodeList listOfAttributes = doc.getElementsByTagName("entity");
        System.out.println("Node length : "+listOfAttributes.getLength());
        for(int i=0 ; i< listOfAttributes.getLength(); i++){
            Element element = (Element)listOfAttributes.item(i);
            System.out.println("id's :"+element.getAttribute("id"));
            
            //Creating new attribute default
            Attr attr = doc.createAttribute("default");
            //based on condition we have to make it true/false
         attr.setValue("true");
         element.setAttributeNode(attr);
            //System.out.println("element : "+element.getAttribute("default"));
        }
    }
    
    
    public static String DocumentToString(Document doc) throws Exception {

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        String output = writer.getBuffer().toString();
        return output;
    }
}

package eu.pms.common.tools;

import eu.pms.common.utils.XMLItemEntity;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by alisa_000 on 12/28/2016.
 */
public class XmlParser extends DefaultHandler
{
    private ArrayList<XMLItemEntity> tags = null;
    private String tagName = "";
    private String attVal = "";

    public void startDocument() throws SAXException
    {
        tags = new ArrayList<XMLItemEntity>();
    }

    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException
    {
        tagName = localName;
        if(atts.getLength() > 0)
            attVal = atts.getValue(0);
    }

    public void characters(char[] buf, int offset, int len)
    {
        String tagValue = new String(buf, offset, len).trim();
        if (!tagValue.equals(""))
            tags.add(new XMLItemEntity(tagName, tagValue, attVal));

        attVal = "";
    }

    public void endDocument() throws SAXException
    {
//        for(XMLItemEntity e : tags)
//        {
//            System.out.println(e);
//        }
    }

    public void parseFile(String fileName) throws Exception
    {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser saxParser = spf.newSAXParser();
        saxParser.parse(new File(fileName), this);
    }

    public ArrayList<XMLItemEntity> getTagsList()
    {
        return tags;
    }
}
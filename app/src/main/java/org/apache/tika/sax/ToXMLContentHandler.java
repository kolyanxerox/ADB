package org.apache.tika.sax;

import OooO0oO.OooOo;
import com.ironsource.C3037dc;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* loaded from: classes3.dex */
public class ToXMLContentHandler extends ToTextContentHandler {
    private ElementInfo currentElement;
    private final String encoding;
    protected boolean inStartElement;
    protected final Map<String, String> namespaces;

    public static class ElementInfo {
        private final Map<String, String> namespaces;
        private final ElementInfo parent;

        public ElementInfo(ElementInfo elementInfo, Map<String, String> map) {
            this.parent = elementInfo;
            if (map.isEmpty()) {
                this.namespaces = Collections.EMPTY_MAP;
            } else {
                this.namespaces = new HashMap(map);
            }
        }

        public String getPrefix(String str) throws SAXException {
            String str2 = this.namespaces.get(str);
            if (str2 != null) {
                return str2;
            }
            ElementInfo elementInfo = this.parent;
            if (elementInfo != null) {
                return elementInfo.getPrefix(str);
            }
            if (str == null || str.isEmpty()) {
                return "";
            }
            throw new SAXException(OooOo.OooOO0O("Namespace ", str, " not declared"));
        }

        public String getQName(String str, String str2) throws SAXException {
            String prefix = getPrefix(str);
            return prefix.length() > 0 ? OooOo.OooOoo(prefix, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, str2) : str2;
        }
    }

    public ToXMLContentHandler(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        super(outputStream, str);
        this.namespaces = new HashMap();
        this.inStartElement = false;
        this.encoding = str;
    }

    private void lazyCloseStartElement() throws SAXException, IOException {
        if (this.inStartElement) {
            write('>');
            this.inStartElement = false;
        }
    }

    private int writeCharsAndEntity(char[] cArr, int i, int i2, String str) throws SAXException, IOException {
        super.characters(cArr, i, i2 - i);
        write('&');
        write(str);
        write(';');
        return i2 + 1;
    }

    private void writeEscaped(char[] cArr, int i, int i2, boolean z) throws SAXException, IOException {
        int iWriteCharsAndEntity = i;
        while (i < i2) {
            char c = cArr[i];
            if (c == '<') {
                iWriteCharsAndEntity = writeCharsAndEntity(cArr, iWriteCharsAndEntity, i, "lt");
            } else if (c == '>') {
                iWriteCharsAndEntity = writeCharsAndEntity(cArr, iWriteCharsAndEntity, i, "gt");
            } else if (c == '&') {
                iWriteCharsAndEntity = writeCharsAndEntity(cArr, iWriteCharsAndEntity, i, "amp");
            } else if (z && c == '\"') {
                iWriteCharsAndEntity = writeCharsAndEntity(cArr, iWriteCharsAndEntity, i, "quot");
            } else {
                i++;
            }
            i = iWriteCharsAndEntity;
        }
        super.characters(cArr, iWriteCharsAndEntity, i2 - iWriteCharsAndEntity);
    }

    @Override // org.apache.tika.sax.ToTextContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException, IOException {
        lazyCloseStartElement();
        writeEscaped(cArr, i, i2 + i, false);
    }

    @Override // org.apache.tika.sax.ToTextContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException, IOException {
        if (this.inStartElement) {
            write(" />");
            this.inStartElement = false;
        } else {
            write("</");
            write(str3);
            write('>');
        }
        this.namespaces.clear();
        this.currentElement = this.currentElement.parent;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException, IOException {
        if (this.encoding != null) {
            write("<?xml version=\"1.0\" encoding=\"");
            write(this.encoding);
            write("\"?>\n");
        }
        this.currentElement = null;
        this.namespaces.clear();
    }

    @Override // org.apache.tika.sax.ToTextContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException, IOException {
        lazyCloseStartElement();
        this.currentElement = new ElementInfo(this.currentElement, this.namespaces);
        write('<');
        write(this.currentElement.getQName(str, str2));
        for (int i = 0; i < attributes.getLength(); i++) {
            write(' ');
            write(this.currentElement.getQName(attributes.getURI(i), attributes.getLocalName(i)));
            write(C3037dc.f8244T);
            write('\"');
            char[] charArray = attributes.getValue(i).toCharArray();
            writeEscaped(charArray, 0, charArray.length, true);
            write('\"');
        }
        for (Map.Entry<String, String> entry : this.namespaces.entrySet()) {
            write(' ');
            write("xmlns");
            String value = entry.getValue();
            if (value.length() > 0) {
                write(':');
                write(value);
            }
            write(C3037dc.f8244T);
            write('\"');
            char[] charArray2 = entry.getKey().toCharArray();
            writeEscaped(charArray2, 0, charArray2.length, true);
            write('\"');
        }
        this.namespaces.clear();
        this.inStartElement = true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
        try {
            ElementInfo elementInfo = this.currentElement;
            if (elementInfo != null) {
                if (str.equals(elementInfo.getPrefix(str2))) {
                    return;
                }
            }
        } catch (SAXException unused) {
        }
        this.namespaces.put(str2, str);
    }

    public void write(char c) throws SAXException, IOException {
        super.characters(new char[]{c}, 0, 1);
    }

    public void write(String str) throws SAXException, IOException {
        super.characters(str.toCharArray(), 0, str.length());
    }

    public ToXMLContentHandler(String str) {
        this.namespaces = new HashMap();
        this.inStartElement = false;
        this.encoding = str;
    }

    public ToXMLContentHandler() {
        this.namespaces = new HashMap();
        this.inStartElement = false;
        this.encoding = null;
    }
}

package org.apache.tika.sax;

import OooO0oO.OooOo;
import com.ironsource.C3034d9;
import java.io.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* loaded from: classes3.dex */
public class RichTextContentHandler extends WriteOutContentHandler {
    public RichTextContentHandler(Writer writer) {
        super(writer);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if ("img".equals(str2) && attributes.getValue("alt") != null) {
            String strOooOO0O = OooOo.OooOO0O("[image: ", attributes.getValue("alt"), C3034d9.i.f8179e);
            characters(strOooOO0O.toCharArray(), 0, strOooOO0O.length());
        }
        if (!"a".equals(str2) || attributes.getValue("name") == null) {
            return;
        }
        String strOooOO0O2 = OooOo.OooOO0O("[bookmark: ", attributes.getValue("name"), C3034d9.i.f8179e);
        characters(strOooOO0O2.toCharArray(), 0, strOooOO0O2.length());
    }
}

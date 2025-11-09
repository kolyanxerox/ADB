package org.apache.tika.sax;

import o00Oo00.OooO0O0;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;

/* loaded from: classes3.dex */
public class OfflineContentHandler extends ContentHandlerDecorator {
    public OfflineContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) {
        return new InputSource(new OooO0O0());
    }
}

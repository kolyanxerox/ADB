package org.apache.tika.sax;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: classes3.dex */
public class TaggedContentHandler extends ContentHandlerDecorator {
    public TaggedContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator
    public void handleException(SAXException sAXException) throws SAXException {
        throw new TaggedSAXException(sAXException, this);
    }

    public boolean isCauseOf(SAXException sAXException) {
        return (sAXException instanceof TaggedSAXException) && this == ((TaggedSAXException) sAXException).getTag();
    }

    public void throwIfCauseOf(Exception exc) throws SAXException {
        if (exc instanceof TaggedSAXException) {
            TaggedSAXException taggedSAXException = (TaggedSAXException) exc;
            if (this == taggedSAXException.getTag()) {
                throw taggedSAXException.getCause();
            }
        }
    }
}

package org.apache.tika.sax;

import OooO0oO.OooOo;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes3.dex */
public abstract class AbstractRecursiveParserWrapperHandler extends DefaultHandler implements Serializable {
    public static final Property EMBEDDED_RESOURCE_LIMIT_REACHED = Property.internalBoolean("X-TIKA:EXCEPTION:embedded_resource_limit_reached");
    private static final int MAX_DEPTH = 100;
    private final ContentHandlerFactory contentHandlerFactory;
    private int embeddedDepth;
    private int embeddedResources;
    private final int maxEmbeddedResources;

    public AbstractRecursiveParserWrapperHandler(ContentHandlerFactory contentHandlerFactory) {
        this(contentHandlerFactory, -1);
    }

    public void endDocument(ContentHandler contentHandler, Metadata metadata) throws SAXException {
        if (hasHitMaximumEmbeddedResources()) {
            metadata.set(EMBEDDED_RESOURCE_LIMIT_REACHED, C3401a.f9920g);
        }
        metadata.set(TikaCoreProperties.EMBEDDED_DEPTH, 0);
    }

    public void endEmbeddedDocument(ContentHandler contentHandler, Metadata metadata) throws SAXException {
        this.embeddedDepth--;
    }

    public ContentHandlerFactory getContentHandlerFactory() {
        return this.contentHandlerFactory;
    }

    public ContentHandler getNewContentHandler() {
        return this.contentHandlerFactory.getNewContentHandler();
    }

    public boolean hasHitMaximumEmbeddedResources() {
        int i = this.maxEmbeddedResources;
        return i > -1 && this.embeddedResources >= i;
    }

    public void startEmbeddedDocument(ContentHandler contentHandler, Metadata metadata) throws SAXException {
        this.embeddedResources++;
        int i = this.embeddedDepth + 1;
        this.embeddedDepth = i;
        if (i >= 100) {
            throw new SAXException(OooOo.OooO0o(this.embeddedDepth, "Max embedded depth reached: "));
        }
        metadata.set(TikaCoreProperties.EMBEDDED_DEPTH, i);
    }

    public AbstractRecursiveParserWrapperHandler(ContentHandlerFactory contentHandlerFactory, int i) {
        this.embeddedResources = 0;
        this.embeddedDepth = 0;
        this.contentHandlerFactory = contentHandlerFactory;
        this.maxEmbeddedResources = i;
    }

    public ContentHandler getNewContentHandler(OutputStream outputStream, Charset charset) {
        return this.contentHandlerFactory.getNewContentHandler(outputStream, charset);
    }
}

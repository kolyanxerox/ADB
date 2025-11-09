package org.apache.tika.extractor;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import o00Oo00.OooO00o;
import o0oOO.OooO0O0;
import o0oOO.OooO0o;
import org.apache.tika.exception.CorruptedFileException;
import org.apache.tika.exception.EncryptedDocumentException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.p015io.BoundedInputStream;
import org.apache.tika.p015io.TemporaryResources;
import org.apache.tika.p015io.TikaInputStream;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.sax.EmbeddedContentHandler;
import org.apache.tika.sax.XHTMLContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: classes3.dex */
public class RUnpackExtractor extends ParsingEmbeddedDocumentExtractor {
    private long bytesExtracted;
    private EmbeddedBytesSelector embeddedBytesSelector;
    private final long maxEmbeddedBytesForExtraction;
    private static final OooO0O0 LOGGER = OooO0o.OooO0O0(ParsingEmbeddedDocumentExtractor.class);
    private static final File ABSTRACT_PATH = new File("");

    public RUnpackExtractor(ParseContext parseContext, long j) {
        super(parseContext);
        this.embeddedBytesSelector = EmbeddedBytesSelector.ACCEPT_ALL;
        this.bytesExtracted = 0L;
        this.maxEmbeddedBytesForExtraction = j;
    }

    private void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata) throws TikaException, SAXException, IOException {
        getDelegatingParser().parse(inputStream, new EmbeddedContentHandler(new BodyContentHandler(contentHandler)), metadata, this.context);
    }

    private void parseWithBytes(TikaInputStream tikaInputStream, ContentHandler contentHandler, Metadata metadata) throws TikaException, SAXException, IOException {
        Path path = tikaInputStream.getPath();
        try {
            parse(new OooO00o(tikaInputStream), contentHandler, metadata);
        } finally {
            storeEmbeddedBytes(path, metadata);
        }
    }

    private void storeEmbeddedBytes(Path path, Metadata metadata) throws IOException {
        if (!this.embeddedBytesSelector.select(metadata)) {
            OooO0O0 oooO0O0 = LOGGER;
            if (oooO0O0.OooO0O0()) {
                oooO0O0.OooOoOO("skipping embedded bytes {} <-> {}", metadata.get("Content-Type"), metadata.get(TikaCoreProperties.EMBEDDED_RESOURCE_TYPE));
                return;
            }
            return;
        }
        EmbeddedDocumentBytesHandler embeddedDocumentBytesHandler = (EmbeddedDocumentBytesHandler) this.context.get(EmbeddedDocumentBytesHandler.class);
        int iIntValue = metadata.getInt(TikaCoreProperties.EMBEDDED_ID).intValue();
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
            try {
                long j = this.bytesExtracted;
                long j2 = this.maxEmbeddedBytesForExtraction;
                if (j >= j2) {
                    throw new IOException("Bytes extracted (" + this.bytesExtracted + ") >= max allowed (" + this.maxEmbeddedBytesForExtraction + ")");
                }
                BoundedInputStream boundedInputStream = new BoundedInputStream(j2 - j, inputStreamNewInputStream);
                try {
                    embeddedDocumentBytesHandler.add(iIntValue, metadata, boundedInputStream);
                    this.bytesExtracted += boundedInputStream.getPos();
                    if (!boundedInputStream.hasHitBound()) {
                        boundedInputStream.close();
                        if (inputStreamNewInputStream != null) {
                            inputStreamNewInputStream.close();
                            return;
                        }
                        return;
                    }
                    throw new IOException("Bytes extracted (" + this.bytesExtracted + ") >= max allowed (" + this.maxEmbeddedBytesForExtraction + "). Truncated bytes");
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            LOGGER.OooO("problem writing out embedded bytes", e);
        }
    }

    public EmbeddedBytesSelector getEmbeddedBytesSelector() {
        return this.embeddedBytesSelector;
    }

    @Override // org.apache.tika.extractor.ParsingEmbeddedDocumentExtractor, org.apache.tika.extractor.EmbeddedDocumentExtractor
    public void parseEmbedded(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, boolean z) throws SAXException, IOException {
        TemporaryResources temporaryResources;
        Object openContainer;
        if (z) {
            AttributesImpl attributesImpl = new AttributesImpl();
            attributesImpl.addAttribute("", Constants.CLASS, Constants.CLASS, "CDATA", "package-entry");
            contentHandler.startElement(XHTMLContentHandler.XHTML, "div", "div", attributesImpl);
        }
        String str = metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY);
        if (isWriteFileNameToContent() && str != null && str.length() > 0 && z) {
            contentHandler.startElement(XHTMLContentHandler.XHTML, "h1", "h1", new AttributesImpl());
            char[] charArray = str.toCharArray();
            contentHandler.characters(charArray, 0, charArray.length);
            contentHandler.endElement(XHTMLContentHandler.XHTML, "h1", "h1");
        }
        try {
            temporaryResources = new TemporaryResources();
        } catch (CorruptedFileException e) {
            throw new IOException(e);
        } catch (EncryptedDocumentException e2) {
            recordException(e2, this.context);
        } catch (TikaException e3) {
            recordException(e3, this.context);
        }
        try {
            TikaInputStream tikaInputStream = TikaInputStream.get(new OooO00o(inputStream), temporaryResources, metadata);
            if ((inputStream instanceof TikaInputStream) && (openContainer = ((TikaInputStream) inputStream).getOpenContainer()) != null) {
                tikaInputStream.setOpenContainer(openContainer);
            }
            if (((EmbeddedDocumentBytesHandler) this.context.get(EmbeddedDocumentBytesHandler.class)) != null) {
                parseWithBytes(tikaInputStream, contentHandler, metadata);
            } else {
                parse(tikaInputStream, contentHandler, metadata);
            }
            temporaryResources.close();
            if (z) {
                contentHandler.endElement(XHTMLContentHandler.XHTML, "div", "div");
            }
        } finally {
        }
    }

    public void setEmbeddedBytesSelector(EmbeddedBytesSelector embeddedBytesSelector) {
        this.embeddedBytesSelector = embeddedBytesSelector;
    }
}

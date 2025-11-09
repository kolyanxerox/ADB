package org.apache.tika.sax;

import com.applovin.shadow.okio.Utf8;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: classes3.dex */
public class SafeContentHandler extends ContentHandlerDecorator {
    private static final char[] REPLACEMENT = {Utf8.REPLACEMENT_CHARACTER};
    private final Output charactersOutput;
    private final Output ignorableWhitespaceOutput;

    public interface Output {
        void write(char[] cArr, int i, int i2) throws SAXException;
    }

    public static class StringOutput implements Output {
        private final StringBuilder builder;

        public /* synthetic */ StringOutput(int i) {
            this();
        }

        public String toString() {
            return this.builder.toString();
        }

        @Override // org.apache.tika.sax.SafeContentHandler.Output
        public void write(char[] cArr, int i, int i2) {
            this.builder.append(cArr, i, i2);
        }

        private StringOutput() {
            this.builder = new StringBuilder();
        }
    }

    public SafeContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        final int i = 0;
        this.charactersOutput = new Output(this) { // from class: org.apache.tika.sax.OooO00o

            /* renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ SafeContentHandler f33321OooO0O0;

            {
                this.f33321OooO0O0 = this;
            }

            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i2, int i3) throws SAXException {
                switch (i) {
                    case 0:
                        this.f33321OooO0O0.lambda$new$0(cArr, i2, i3);
                        break;
                    default:
                        this.f33321OooO0O0.lambda$new$1(cArr, i2, i3);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.ignorableWhitespaceOutput = new Output(this) { // from class: org.apache.tika.sax.OooO00o

            /* renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ SafeContentHandler f33321OooO0O0;

            {
                this.f33321OooO0O0 = this;
            }

            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i22, int i3) throws SAXException {
                switch (i2) {
                    case 0:
                        this.f33321OooO0O0.lambda$new$0(cArr, i22, i3);
                        break;
                    default:
                        this.f33321OooO0O0.lambda$new$1(cArr, i22, i3);
                        break;
                }
            }
        };
    }

    private void filter(char[] cArr, int i, int i2, Output output) throws SAXException {
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            int iCodePointAt = Character.codePointAt(cArr, i, i3);
            int iCharCount = Character.charCount(iCodePointAt) + i;
            if (isInvalid(iCodePointAt)) {
                if (i > i4) {
                    output.write(cArr, i4, i - i4);
                }
                writeReplacement(output);
                i4 = iCharCount;
            }
            i = iCharCount;
        }
        output.write(cArr, i4, i3 - i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(char[] cArr, int i, int i2) throws SAXException {
        super.characters(cArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(char[] cArr, int i, int i2) throws SAXException {
        super.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        filter(cArr, i, i2, this.charactersOutput);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        filter(cArr, i, i2, this.ignorableWhitespaceOutput);
    }

    public boolean isInvalid(int i) {
        return i < 32 ? (i == 9 || i == 10 || i == 13) ? false : true : i < 57344 ? i > 55295 : i < 65536 ? i > 65533 : i > 1114111;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= attributes.getLength()) {
                break;
            }
            if (isInvalid(attributes.getValue(i2))) {
                AttributesImpl attributesImpl = new AttributesImpl();
                for (int i3 = 0; i3 < attributes.getLength(); i3++) {
                    String value = attributes.getValue(i3);
                    if (i3 >= i2 && isInvalid(value)) {
                        StringOutput stringOutput = new StringOutput(i);
                        filter(value.toCharArray(), 0, value.length(), stringOutput);
                        value = stringOutput.toString();
                    }
                    attributesImpl.addAttribute(attributes.getURI(i3), attributes.getLocalName(i3), attributes.getQName(i3), attributes.getType(i3), value);
                }
                attributes = attributesImpl;
            } else {
                i2++;
            }
        }
        super.startElement(str, str2, str3, attributes);
    }

    public void writeReplacement(Output output) throws SAXException {
        char[] cArr = REPLACEMENT;
        output.write(cArr, 0, cArr.length);
    }

    private boolean isInvalid(String str) {
        char[] charArray = str.toCharArray();
        int iCharCount = 0;
        while (iCharCount < charArray.length) {
            int iCodePointAt = Character.codePointAt(charArray, iCharCount);
            if (isInvalid(iCodePointAt)) {
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return false;
    }
}

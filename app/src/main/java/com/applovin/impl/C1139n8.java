package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* renamed from: com.applovin.impl.n8 */
/* loaded from: classes.dex */
public class C1139n8 {

    /* renamed from: a */
    private final C1240o f1540a;

    /* renamed from: b */
    private Stack f1541b;

    /* renamed from: c */
    private StringBuilder f1542c;

    /* renamed from: d */
    private long f1543d;

    /* renamed from: e */
    private b f1544e;

    /* renamed from: com.applovin.impl.n8$a */
    public class a implements ContentHandler {
        public a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
            if (StringUtils.isValidString(strTrim)) {
                C1139n8.this.f1542c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - C1139n8.this.f1543d;
            C1240o unused = C1139n8.this.f1540a;
            if (C1240o.m3200a()) {
                C1139n8.this.f1540a.m3211a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            C1139n8 c1139n8 = C1139n8.this;
            c1139n8.f1544e = (b) c1139n8.f1541b.pop();
            C1139n8.this.f1544e.m1921d(C1139n8.this.f1542c.toString().trim());
            C1139n8.this.f1542c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i, int i2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            C1240o unused = C1139n8.this.f1540a;
            if (C1240o.m3200a()) {
                C1139n8.this.f1540a.m3211a("XmlParser", "Begin parsing...");
            }
            C1139n8.this.f1543d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !C1139n8.this.f1541b.isEmpty() ? (b) C1139n8.this.f1541b.peek() : null;
                b bVar2 = new b(str2, C1139n8.this.m1914a(attributes), bVar);
                if (bVar != null) {
                    bVar.m1920a(bVar2);
                }
                C1139n8.this.f1541b.push(bVar2);
            } catch (Exception e) {
                C1240o unused = C1139n8.this.f1540a;
                if (C1240o.m3200a()) {
                    C1139n8.this.f1540a.m3212a("XmlParser", OooO0oO.OooOo.OooOO0O("Unable to process element <", str2, ">"), e);
                }
                throw new SAXException("Failed to start element", e);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }
    }

    /* renamed from: com.applovin.impl.n8$b */
    public static class b extends C1099m8 {
        public b(String str, Map map, C1099m8 c1099m8) {
            super(str, map, c1099m8);
        }

        /* renamed from: a */
        public void m1920a(C1099m8 c1099m8) {
            if (c1099m8 == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f1210e.add(c1099m8);
        }

        /* renamed from: d */
        public void m1921d(String str) {
            this.f1209d = str;
        }
    }

    public C1139n8(C1220k c1220k) {
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f1540a = c1220k.m2847O();
    }

    /* renamed from: a */
    public static C1099m8 m1910a(String str, C1220k c1220k) {
        return new C1139n8(c1220k).m1919a(str);
    }

    /* renamed from: a */
    public C1099m8 m1919a(String str) throws SAXException {
        if (str != null) {
            this.f1542c = new StringBuilder();
            this.f1541b = new Stack();
            this.f1544e = null;
            Xml.parse(str, new a());
            b bVar = this.f1544e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Map m1914a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap map = new HashMap(length);
            for (int i = 0; i < length; i++) {
                map.put(attributes.getQName(i), attributes.getValue(i));
            }
            return map;
        }
        return Collections.EMPTY_MAP;
    }
}

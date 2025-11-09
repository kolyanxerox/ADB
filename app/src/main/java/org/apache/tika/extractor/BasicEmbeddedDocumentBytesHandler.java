package org.apache.tika.extractor;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import o000o00o.o00000O0;
import o00O00o0.OooO00o;
import o00OOooO.o00O00;
import o00OOooo.o00O00OO;
import o00Oo00.OooO;
import o00Oo00.OooOO0;
import o00Oo00o.o000oOoO;
import o00Oo00o.o0OoOo0;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;

/* loaded from: classes3.dex */
public class BasicEmbeddedDocumentBytesHandler extends AbstractEmbeddedDocumentBytesHandler {
    private final EmbeddedDocumentBytesConfig config;
    Map<Integer, byte[]> docBytes = new HashMap();

    public BasicEmbeddedDocumentBytesHandler(EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig) {
        this.config = embeddedDocumentBytesConfig;
    }

    @Override // org.apache.tika.extractor.AbstractEmbeddedDocumentBytesHandler, org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public void add(int i, Metadata metadata, InputStream inputStream) throws IOException {
        super.add(i, metadata, inputStream);
        Map<Integer, byte[]> map = this.docBytes;
        Integer numValueOf = Integer.valueOf(i);
        byte[] bArr = o00O00.f32641OooO00o;
        int i2 = o0OoOo0.f32678OooOoOO;
        new OooO();
        o0OoOo0 o0oooo0 = new o0OoOo0();
        o000oOoO o000oooo2 = new o000oOoO(new o00000O0(6), new OooO00o(o0oooo0));
        try {
            o00O00.OooO0O0(inputStream, o000oooo2);
            byte[] bArrOooO0O0 = o0oooo0.OooO0O0();
            o000oooo2.close();
            map.put(numValueOf, bArrOooO0O0);
        } catch (Throwable th) {
            try {
                o000oooo2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public InputStream getDocument(int i) throws IOException {
        OooO oooO = new OooO();
        oooO.f32648OooO0Oo = new o00O00OO(this.docBytes.get(Integer.valueOf(i)));
        o00O00OO o00o00oo = oooO.f32648OooO0Oo;
        if (o00o00oo == null) {
            throw new IllegalStateException("origin == null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) o00o00oo.f32647OooO0Oo);
        OooOO0 oooOO0 = new OooOO0();
        oooOO0.f32661OooOo0O = byteArrayInputStream;
        oooOO0.f32663OooOoO = -1;
        oooOO0.f32662OooOo0o = new byte[8192];
        return oooOO0;
    }
}

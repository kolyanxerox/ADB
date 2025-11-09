package org.apache.tika.mime;

import java.io.IOException;
import o00Oo00.OooOO0O;
import o00Oo00.OooOOO0;
import org.apache.tika.detect.MagicDetector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes3.dex */
class MagicMatch implements Clause {
    private MagicDetector detector = null;
    private final String mask;
    private final MediaType mediaType;
    private final String offset;
    private final String type;
    private final String value;

    public MagicMatch(MediaType mediaType, String str, String str2, String str3, String str4) {
        this.mediaType = mediaType;
        this.type = str;
        this.offset = str2;
        this.value = str3;
        this.mask = str4;
    }

    private synchronized MagicDetector getDetector() {
        try {
            if (this.detector == null) {
                this.detector = MagicDetector.parse(this.mediaType, this.type, this.offset, this.value, this.mask);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.detector;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        try {
            MagicDetector detector = getDetector();
            int i = OooOOO0.f32667OooOoO;
            OooOO0O oooOO0O = new OooOO0O();
            oooOO0O.OooOO0O(bArr);
            return detector.detect(oooOO0O.OooOO0(), new Metadata()) != MediaType.OCTET_STREAM;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        return getDetector().getLength();
    }

    public String toString() {
        String string = this.mediaType.toString();
        String str = this.type;
        String str2 = this.offset;
        String str3 = this.value;
        String str4 = this.mask;
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(StringUtils.SPACE);
        sb.append(str);
        sb.append(StringUtils.SPACE);
        sb.append(str2);
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO(sb, StringUtils.SPACE, str3, StringUtils.SPACE, str4);
    }
}

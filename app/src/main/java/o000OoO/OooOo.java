package o000Ooo;

import java.io.File;

/* loaded from: classes2.dex */
public final class OooOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000O00.o000OOo f30417OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30418OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final File f30419OooO0OO;

    public OooOo(o000O00.o000OOo o000ooo2, String str, File file) {
        this.f30417OooO00o = o000ooo2;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f30418OooO0O0 = str;
        this.f30419OooO0OO = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return this.f30417OooO00o.equals(oooOo.f30417OooO00o) && this.f30418OooO0O0.equals(oooOo.f30418OooO0O0) && this.f30419OooO0OO.equals(oooOo.f30419OooO0OO);
    }

    public final int hashCode() {
        return ((((this.f30417OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f30418OooO0O0.hashCode()) * 1000003) ^ this.f30419OooO0OO.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f30417OooO00o + ", sessionId=" + this.f30418OooO0O0 + ", reportFile=" + this.f30419OooO0OO + "}";
    }
}

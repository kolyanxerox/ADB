package o000o00o;

import androidx.datastore.preferences.protobuf.OooO00o;

/* loaded from: classes2.dex */
public final class o000O0 {
    public static final o000O00O Companion = new o000O00O();

    /* renamed from: OooO00o */
    public final String f30778OooO00o;

    /* renamed from: OooO0O0 */
    public final String f30779OooO0O0;

    /* renamed from: OooO0OO */
    public final int f30780OooO0OO;

    /* renamed from: OooO0Oo */
    public final long f30781OooO0Oo;

    public /* synthetic */ o000O0(int i, String str, int i2, String str2, long j) {
        if (15 != (i & 15)) {
            o00OO0oo.Oooo0.OooO00o(i, 15, o000O00.f30782OooO00o.OooO0Oo());
            throw null;
        }
        this.f30778OooO00o = str;
        this.f30779OooO0O0 = str2;
        this.f30780OooO0OO = i2;
        this.f30781OooO0Oo = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O0)) {
            return false;
        }
        o000O0 o000o0 = (o000O0) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f30778OooO00o, o000o0.f30778OooO00o) && kotlin.jvm.internal.OooOo.OooO00o(this.f30779OooO0O0, o000o0.f30779OooO0O0) && this.f30780OooO0OO == o000o0.f30780OooO0OO && this.f30781OooO0Oo == o000o0.f30781OooO0Oo;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30781OooO0Oo) + OooO00o.OooO00o(this.f30780OooO0OO, OooO00o.OooO0O0(this.f30778OooO00o.hashCode() * 31, 31, this.f30779OooO0O0), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f30778OooO00o + ", firstSessionId=" + this.f30779OooO0O0 + ", sessionIndex=" + this.f30780OooO0OO + ", sessionStartTimestampUs=" + this.f30781OooO0Oo + ')';
    }

    public o000O0(long j, String str, String str2, int i) {
        this.f30778OooO00o = str;
        this.f30779OooO0O0 = str2;
        this.f30780OooO0OO = i;
        this.f30781OooO0Oo = j;
    }
}

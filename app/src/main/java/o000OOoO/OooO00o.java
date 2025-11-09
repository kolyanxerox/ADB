package o000OOoO;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class OooO00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30287OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f30288OooO0O0;

    public OooO00o(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f30287OooO00o = str;
        this.f30288OooO0O0 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return this.f30287OooO00o.equals(oooO00o.f30287OooO00o) && this.f30288OooO0O0.equals(oooO00o.f30288OooO0O0);
    }

    public final int hashCode() {
        return ((this.f30287OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f30288OooO0O0.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f30287OooO00o + ", usedDates=" + this.f30288OooO0O0 + "}";
    }
}

package o000Oo0;

import java.util.Map;

/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30338OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f30339OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Map f30340OooO0OO;

    public OooO0OO(Map additionalCustomKeys, long j, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(additionalCustomKeys, "additionalCustomKeys");
        this.f30338OooO00o = str;
        this.f30339OooO0O0 = j;
        this.f30340OooO0OO = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f30338OooO00o, oooO0OO.f30338OooO00o) && this.f30339OooO0O0 == oooO0OO.f30339OooO0O0 && kotlin.jvm.internal.OooOo.OooO00o(this.f30340OooO0OO, oooO0OO.f30340OooO0OO);
    }

    public final int hashCode() {
        return this.f30340OooO0OO.hashCode() + ((Long.hashCode(this.f30339OooO0O0) + (this.f30338OooO00o.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f30338OooO00o + ", timestamp=" + this.f30339OooO0O0 + ", additionalCustomKeys=" + this.f30340OooO0OO + ')';
    }
}

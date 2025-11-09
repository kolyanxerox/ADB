package o000o00o;

import androidx.datastore.preferences.protobuf.OooO00o;

/* loaded from: classes2.dex */
public final class o0O0ooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30869OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30870OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f30871OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f30872OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f30873OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0O f30874OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final String f30875OooO0oO;

    public o0O0ooO(String sessionId, String firstSessionId, int i, long j, o00O0O o00o0o, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.OooOo.OooO0o0(sessionId, "sessionId");
        kotlin.jvm.internal.OooOo.OooO0o0(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.OooOo.OooO0o0(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f30869OooO00o = sessionId;
        this.f30870OooO0O0 = firstSessionId;
        this.f30871OooO0OO = i;
        this.f30872OooO0Oo = j;
        this.f30874OooO0o0 = o00o0o;
        this.f30873OooO0o = str;
        this.f30875OooO0oO = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O0ooO)) {
            return false;
        }
        o0O0ooO o0o0ooo = (o0O0ooO) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f30869OooO00o, o0o0ooo.f30869OooO00o) && kotlin.jvm.internal.OooOo.OooO00o(this.f30870OooO0O0, o0o0ooo.f30870OooO0O0) && this.f30871OooO0OO == o0o0ooo.f30871OooO0OO && this.f30872OooO0Oo == o0o0ooo.f30872OooO0Oo && kotlin.jvm.internal.OooOo.OooO00o(this.f30874OooO0o0, o0o0ooo.f30874OooO0o0) && kotlin.jvm.internal.OooOo.OooO00o(this.f30873OooO0o, o0o0ooo.f30873OooO0o) && kotlin.jvm.internal.OooOo.OooO00o(this.f30875OooO0oO, o0o0ooo.f30875OooO0oO);
    }

    public final int hashCode() {
        return this.f30875OooO0oO.hashCode() + OooO00o.OooO0O0((this.f30874OooO0o0.hashCode() + ((Long.hashCode(this.f30872OooO0Oo) + OooO00o.OooO00o(this.f30871OooO0OO, OooO00o.OooO0O0(this.f30869OooO00o.hashCode() * 31, 31, this.f30870OooO0O0), 31)) * 31)) * 31, 31, this.f30873OooO0o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.f30869OooO00o);
        sb.append(", firstSessionId=");
        sb.append(this.f30870OooO0O0);
        sb.append(", sessionIndex=");
        sb.append(this.f30871OooO0OO);
        sb.append(", eventTimestampUs=");
        sb.append(this.f30872OooO0Oo);
        sb.append(", dataCollectionStatus=");
        sb.append(this.f30874OooO0o0);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f30873OooO0o);
        sb.append(", firebaseAuthenticationToken=");
        return OooO00o.OooO0oO(')', this.f30875OooO0oO, sb);
    }
}

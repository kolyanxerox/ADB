package oooo00o;

import androidx.datastore.preferences.protobuf.OooO00o;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class o000OO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f33309OooO00o;

    public o000OO0O(String sessionId) {
        OooOo.OooO0o0(sessionId, "sessionId");
        this.f33309OooO00o = sessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o000OO0O) && OooOo.OooO00o(this.f33309OooO00o, ((o000OO0O) obj).f33309OooO00o);
    }

    public final int hashCode() {
        return this.f33309OooO00o.hashCode();
    }

    public final String toString() {
        return OooO00o.OooO0oO(')', this.f33309OooO00o, new StringBuilder("SessionDetails(sessionId="));
    }
}

package o000o00o;

import androidx.datastore.preferences.protobuf.OooO00o;

/* loaded from: classes2.dex */
public final class OooOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30695OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30696OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f30697OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O f30698OooO0Oo;

    public OooOOO0(String appId, String str, String str2, OooOO0O oooOO0O) {
        o0000 o0000Var = o0000.f30735OooOo0o;
        kotlin.jvm.internal.OooOo.OooO0o0(appId, "appId");
        this.f30695OooO00o = appId;
        this.f30696OooO0O0 = str;
        this.f30697OooO0OO = str2;
        this.f30698OooO0Oo = oooOO0O;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        if (!kotlin.jvm.internal.OooOo.OooO00o(this.f30695OooO00o, oooOOO0.f30695OooO00o) || !this.f30696OooO0O0.equals(oooOOO0.f30696OooO0O0) || !this.f30697OooO0OO.equals(oooOOO0.f30697OooO0OO)) {
            return false;
        }
        o0000 o0000Var = o0000.f30735OooOo0o;
        return this.f30698OooO0Oo.equals(oooOOO0.f30698OooO0Oo);
    }

    public final int hashCode() {
        return this.f30698OooO0Oo.hashCode() + ((o0000.f30735OooOo0o.hashCode() + OooO00o.OooO0O0((((this.f30696OooO0O0.hashCode() + (this.f30695OooO00o.hashCode() * 31)) * 31) + 48517559) * 31, 31, this.f30697OooO0OO)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f30695OooO00o + ", deviceModel=" + this.f30696OooO0O0 + ", sessionSdkVersion=3.0.0, osVersion=" + this.f30697OooO0OO + ", logEnvironment=" + o0000.f30735OooOo0o + ", androidAppInfo=" + this.f30698OooO0Oo + ')';
    }
}

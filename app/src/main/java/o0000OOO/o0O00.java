package o0000oOO;

import OooO0oO.OooOOO0;
import OoooOOO.oO0000O;
import OoooOOO.oO0000Oo;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Objects;
import o0000Ooo.o0O00o0;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class o0O00 implements oO0000Oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f29644OooO00o = 0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f29645OooO0O0;

    public o0O00(OooOOO0 oooOOO0) {
        Objects.requireNonNull(oooOOO0);
        this.f29645OooO0O0 = oooOOO0;
    }

    @Override // OoooOOO.oO0000Oo
    public final void OooO00o(long j, Bundle bundle, String str, String str2) {
        Object obj = this.f29645OooO0O0;
        switch (this.f29644OooO00o) {
            case 0:
                OooOOO0 oooOOO0 = (OooOOO0) obj;
                if (((HashSet) oooOOO0.f13280OooOo0o).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    o0O00o0 o0o00o0 = o0O000o0.f29646OooO00o;
                    String strOooO0oO = oO0000O.OooO0oO(str2, oO0000O.f14616OooO0OO, oO0000O.f14614OooO00o);
                    if (strOooO0oO != null) {
                        str2 = strOooO0oO;
                    }
                    bundle2.putString("events", str2);
                    ((OooOOO0) oooOOO0.f13278OooOo).OooO0o0(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !o0O000o0.f29646OooO00o.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((OooOOO0) ((OooOO0) obj).f30538OooOo0o).OooO0o0(3, bundle3);
                    break;
                }
                break;
        }
    }

    public o0O00(OooOO0 oooOO0) {
        Objects.requireNonNull(oooOO0);
        this.f29645OooO0O0 = oooOO0;
    }
}

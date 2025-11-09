package o000o0O;

import Oooo0oO.o00000;
import android.content.Context;
import android.os.Bundle;
import o00O0O0O.OooO0OO;
import o00O0oOO.OooOO0O;

/* loaded from: classes2.dex */
public final class OooOOO0 implements o0O0O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Bundle f30904OooO00o;

    public OooOOO0(Context appContext) {
        kotlin.jvm.internal.OooOo.OooO0o0(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f30904OooO00o = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // o000o0O.o0O0O00
    public final Boolean OooO00o() {
        Bundle bundle = this.f30904OooO00o;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // o000o0O.o0O0O00
    public final OooOO0O OooO0O0() {
        Bundle bundle = this.f30904OooO00o;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new OooOO0O(o00000.OooOO0o(bundle.getInt("firebase_sessions_sessions_restart_timeout"), o00O0oOO.OooOOO.f31467OooOoO0));
        }
        return null;
    }

    @Override // o000o0O.o0O0O00
    public final Double OooO0OO() {
        Bundle bundle = this.f30904OooO00o;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // o000o0O.o0O0O00
    public final Object OooO0Oo(OooO0OO oooO0OO) {
        return oo00o.OooOo.f33195OooO00o;
    }
}

package com.google.firebase.crashlytics;

import OoooO0O.o0000O0O;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import o000.OooO0OO;
import o0000o0.Oooo0;
import o0000oOo.o0O00O;
import o0000oOo.o0O00O0o;
import o0000oOo.o0OoO00O;
import o0000oo0.o00000OO;
import o0000oo0.o00Oo0;
import o0000oo0.oo0o0Oo;
import o000O000.OooO00o;
import o000o00.o0O00o0;
import o00OO0O0.OooO0o;
import oooo00o.o000O0;
import oooo00o.o000O00;
import oooo00o.o000O0Oo;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f28143OooO0Oo = 0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00000OO f28144OooO00o = new o00000OO(o0OoO00O.class, ExecutorService.class);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00000OO f28145OooO0O0 = new o00000OO(o0O00O0o.class, ExecutorService.class);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o00000OO f28146OooO0OO = new o00000OO(o0O00O.class, ExecutorService.class);

    static {
        o000O0Oo o000o0oo2 = o000O0Oo.f33307OooOo0O;
        Map map = o000O0.f33294OooO0O0;
        if (map.containsKey(o000o0oo2)) {
            Log.d("FirebaseSessions", "Dependency " + o000o0oo2 + " already added.");
            return;
        }
        map.put(o000o0oo2, new o000O00(new OooO0o(true)));
        Log.d("FirebaseSessions", "Dependency to " + o000o0oo2 + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        o0000O0O o0000o0oOooO00o = o00Oo0.OooO00o(OooO0OO.class);
        o0000o0oOooO00o.f13931OooO00o = "fire-cls";
        o0000o0oOooO00o.OooO0Oo(oo0o0Oo.OooO00o(Oooo0.class));
        o0000o0oOooO00o.OooO0Oo(oo0o0Oo.OooO00o(o000Oo0O.Oooo0.class));
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(this.f28144OooO00o, 1, 0));
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(this.f28145OooO0O0, 1, 0));
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(this.f28146OooO0OO, 1, 0));
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(0, 2, OooO00o.class));
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(0, 2, o0000oO0.Oooo0.class));
        o0000o0oOooO00o.OooO0Oo(new oo0o0Oo(0, 2, o0O00o0.class));
        o0000o0oOooO00o.f13935OooO0o = new OooO0oo.o00Oo0(this, 18);
        o0000o0oOooO00o.OooO0o();
        return Arrays.asList(o0000o0oOooO00o.OooO0o0(), OooO00o.OooO00o.OooO0Oo("fire-cls", "20.0.0"));
    }
}

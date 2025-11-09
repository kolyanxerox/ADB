package OoooOOO;

import OooO0oO.OooOOO0;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class oo0ooO implements Callable {

    /* renamed from: OooOo */
    public final /* synthetic */ String f14913OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14914OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ o0OO00o0 f14915OooOo0o;

    public /* synthetic */ oo0ooO(o0OO00o0 o0oo00o0, String str, int i) {
        this.f14914OooOo0O = i;
        this.f14915OooOo0o = o0oo00o0;
        this.f14913OooOo = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14914OooOo0O) {
            case 0:
                return new com.google.android.gms.internal.measurement.o0OOO0OO(new oo0ooO(this.f14915OooOo0o, this.f14913OooOo, 1));
            case 1:
                o0OO00o0 o0oo00o0 = this.f14915OooOo0o;
                o00OO0OO o00oo0oo = o0oo00o0.f14916OooOo0o.f14792OooOo;
                oOO0000.OoooOO0(o00oo0oo);
                String str = this.f14913OooOo;
                o0O0o000 o0o0o000O00O0O = o00oo0oo.o00O0O(str);
                HashMap map = new HashMap();
                map.put(C3451ne.f10417G, "android");
                map.put(C3034d9.h.f8089V, str);
                ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14519OooOoO0.OooOOOo();
                map.put("gmp_version", 133005L);
                if (o0o0o000O00O0O != null) {
                    String strOooo0oO = o0o0o000O00O0O.Oooo0oO();
                    if (strOooo0oO != null) {
                        map.put("app_version", strOooo0oO);
                    }
                    map.put("app_version_int", Long.valueOf(o0o0o000O00O0O.Oooo()));
                    map.put("dynamite_version", Long.valueOf(o0o0o000O00O0O.OooO0O0()));
                }
                return map;
            default:
                OooOOO0 oooOOO0 = new OooOOO0(this.f14915OooOo0o, this.f14913OooOo);
                com.google.android.gms.internal.measurement.oO00OOo0 oo00ooo0 = new com.google.android.gms.internal.measurement.oO00OOo0("internal.remoteConfig", 0);
                oo00ooo0.f26428OooOo0o.put("getValue", new com.google.android.gms.internal.measurement.o0OOO0OO(oo00ooo0, oooOOO0));
                return oo00ooo0;
        }
    }
}

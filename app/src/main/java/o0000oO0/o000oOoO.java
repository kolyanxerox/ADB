package o0000oO0;

import OooO0oO.OooOOO0;
import Oooo00O.o000000O;
import OoooO0O.o00O000;
import OoooOOO.C0001o0;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.o000O00O;
import com.google.android.gms.internal.measurement.o00O00OO;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.ConcurrentHashMap;
import o0000oOO.o0O000o0;
import o000Ooo.o00oO0o;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class o000oOoO implements Oooo0 {

    /* renamed from: OooO0OO */
    public static volatile o000oOoO f29639OooO0OO;

    /* renamed from: OooO00o */
    public final o00oO0o f29640OooO00o;

    /* renamed from: OooO0O0 */
    public final ConcurrentHashMap f29641OooO0O0;

    public o000oOoO(o00oO0o o00oo0o) {
        o000000O.OooO0oo(o00oo0o);
        this.f29640OooO00o = o00oo0o;
        this.f29641OooO0O0 = new ConcurrentHashMap();
    }

    public final void OooO00o(String str, Bundle bundle, String str2) {
        if (!o0O000o0.f29648OooO0OO.contains(str) && o0O000o0.OooO00o(bundle, str2) && o0O000o0.OooO0O0(str, bundle, str2)) {
            if ("clx".equals(str) && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            o00O00OO o00o00oo = (o00O00OO) this.f29640OooO00o.f30487OooOo0o;
            o00o00oo.getClass();
            o00o00oo.OooO0OO(new o000O00O(o00o00oo, str, str2, bundle, true));
        }
    }

    public final C0001o0 OooO0O0(String str, OooOOO0 oooOOO0) {
        if (!o0O000o0.f29648OooO0OO.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f29641OooO0O0;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                o00oO0o o00oo0o = this.f29640OooO00o;
                o00O000 oooOOO02 = zEquals ? new OooOOO0(o00oo0o, oooOOO0) : "clx".equals(str) ? new OooOO0(o00oo0o, oooOOO0) : null;
                if (oooOOO02 != null) {
                    concurrentHashMap.put(str, oooOOO02);
                    return new C0001o0(15);
                }
            }
        }
        return null;
    }
}

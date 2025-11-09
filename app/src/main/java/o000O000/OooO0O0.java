package o000O000;

import android.util.Log;
import io.flutter.plugins.webviewflutter.OooOOOO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o000O0Oo.OooO0o;
import o000Oo0.Oooo0;
import o000Oo0.o000oOoO;
import o000o00O.OooO;
import o000o00O.OooOO0;
import o00O0.Oooo000;

/* loaded from: classes2.dex */
public final class OooO0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f30094OooO00o;

    public OooO0O0(OooO0o oooO0o) {
        this.f30094OooO00o = oooO0o;
    }

    public final void OooO00o(OooO oooO) {
        OooO0o oooO0o = this.f30094OooO00o;
        HashSet hashSet = oooO.f30663OooO00o;
        ArrayList arrayList = new ArrayList(Oooo000.OooOo0(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            o000o00O.OooO0o oooO0o2 = (o000o00O.OooO0o) ((OooOO0) it.next());
            String str = oooO0o2.f30676OooO0O0;
            String str2 = oooO0o2.f30678OooO0Oo;
            String strSubstring = oooO0o2.f30680OooO0o0;
            String str3 = oooO0o2.f30677OooO0OO;
            long j = oooO0o2.f30679OooO0o;
            o000Ooo0.OooOO0 oooOO0 = Oooo0.f30359OooO00o;
            if (strSubstring.length() > 256) {
                strSubstring = strSubstring.substring(0, 256);
            }
            arrayList.add(new o000Oo0.OooO0O0(str, str2, strSubstring, str3, j));
        }
        synchronized (((o000oOoO) oooO0o.f30143OooOoo0)) {
            try {
                if (((o000oOoO) oooO0o.f30143OooOoo0).OooO0O0(arrayList)) {
                    ((o000O0O.OooO) oooO0o.f30140OooOoO0).f30100OooO0O0.OooO00o(new OooOOOO(7, oooO0o, ((o000oOoO) oooO0o.f30143OooOoo0).OooO00o()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}

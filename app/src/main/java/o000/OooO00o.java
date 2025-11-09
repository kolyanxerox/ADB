package o000;

import OoooOOO.C0001o0;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import o0000oO0.Oooo0;
import o0000oO0.o000oOoO;
import o000O0o.OooOO0;
import o000OOO.OooOO0O;
import o000Oo00.OooOOO;
import o000Oo00.OooOOO0;
import o000OoO.OooOOOO;
import o000Ooo.o000OOo;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements OooOO0, OooOOOO, OooOOO0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f28888OooOo0O;

    public /* synthetic */ OooO00o(OooO0O0 oooO0O0) {
        this.f28888OooOo0O = oooO0O0;
    }

    @Override // o000Oo00.OooOOO0
    public void OooO00o(OooOOO oooOOO) {
        OooO0O0 oooO0O0 = this.f28888OooOo0O;
        oooO0O0.getClass();
        o000O000.OooO0OO oooO0OO = o000O000.OooO0OO.f30095OooO00o;
        oooO0OO.OooO0OO("AnalyticsConnector now available.");
        Oooo0 oooo0 = (Oooo0) oooOOO.get();
        o000Ooo0.OooOO0 oooOO0 = new o000Ooo0.OooOO0(oooo0, 28);
        OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0(22, false);
        o000oOoO o000oooo2 = (o000oOoO) oooo0;
        C0001o0 c0001o0OooO0O0 = o000oooo2.OooO0O0("clx", oooOOO0);
        if (c0001o0OooO0O0 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            C0001o0 c0001o0OooO0O02 = o000oooo2.OooO0O0("crash", oooOOO0);
            if (c0001o0OooO0O02 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            c0001o0OooO0O0 = c0001o0OooO0O02;
        }
        if (c0001o0OooO0O0 == null) {
            oooO0OO.OooO0oo(null, "Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        oooO0OO.OooO0OO("Registered Firebase Analytics listener.");
        o000Ooo0.OooOO0 oooOO02 = new o000Ooo0.OooOO0(27, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OooOO0O oooOO0O = new OooOO0O(oooOO0);
        synchronized (oooO0O0) {
            try {
                ArrayList arrayList = oooO0O0.f28891OooO0OO;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    oooOO02.OooO0O0((o000OOo) obj);
                }
                oooOOO0.f13278OooOo = oooOO02;
                oooOOO0.f13280OooOo0o = oooOO0O;
                oooO0O0.f28890OooO0O0 = oooOO02;
                oooO0O0.f28889OooO00o = oooOO0O;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o000O0o.OooOO0
    public void OooO0O0(o000OOo o000ooo2) {
        OooO0O0 oooO0O0 = this.f28888OooOo0O;
        synchronized (oooO0O0) {
            try {
                if (oooO0O0.f28890OooO0O0 instanceof o000O0o.OooOO0O) {
                    oooO0O0.f28891OooO0OO.add(o000ooo2);
                }
                oooO0O0.f28890OooO0O0.OooO0O0(o000ooo2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o000OoO.OooOOOO
    public void OooO0o0(Bundle bundle) {
        this.f28888OooOo0O.f28889OooO00o.OooO0o0(bundle);
    }
}

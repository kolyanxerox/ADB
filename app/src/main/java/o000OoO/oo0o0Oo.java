package o000Ooo;

import android.util.Log;
import com.ironsource.C3912zo;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o000O0Oo.OooO0o;
import o000Oo0.OooO0OO;
import o000Oo0O.OooOo00;

/* loaded from: classes2.dex */
public final /* synthetic */ class oo0o0Oo implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FlutterError f30529OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30530OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000000 f30531OooOo0o;

    public /* synthetic */ oo0o0Oo(o000000 o000000Var, FlutterError flutterError, int i) {
        this.f30530OooOo0O = i;
        switch (i) {
            case 1:
                Map map = Collections.EMPTY_MAP;
                this.f30531OooOo0o = o000000Var;
                this.f30529OooOo = flutterError;
                break;
            default:
                this.f30531OooOo0o = o000000Var;
                this.f30529OooOo = flutterError;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f30530OooOo0O) {
            case 0:
                o000000 o000000Var = this.f30531OooOo0o;
                o0OOO0o o0ooo0o = o000000Var.f30440OooO0oo;
                OooOo00 oooOo00 = o000000Var.f30435OooO0OO;
                o0ooo0o.OooO("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(((AtomicInteger) oooOo00.f30372OooOo0o).get()));
                o000000Var.f30440OooO0oo.OooO("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(((AtomicInteger) oooOo00.f30370OooOo).get()));
                o0OOO0o o0ooo0o2 = o000000Var.f30440OooO0oo;
                Thread threadCurrentThread = Thread.currentThread();
                OooOOOo.o0ooOOo o0ooooo = o0ooo0o2.f30510OooOOOO;
                if (o0ooooo != null) {
                    o0ooo0o2.OooO0oO(o0ooooo, threadCurrentThread, this.f30529OooOo, true);
                    break;
                } else {
                    Log.w("FirebaseCrashlytics", "settingsProvider not set", null);
                    break;
                }
            default:
                o0OOO0o o0ooo0o3 = this.f30531OooOo0o.f30440OooO0oo;
                Thread threadCurrentThread2 = Thread.currentThread();
                o0ooo0o3.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                o00000 o00000Var = o0ooo0o3.f30508OooOOO;
                if (o00000Var == null || !o00000Var.f30431OooO0o0.get()) {
                    long j = jCurrentTimeMillis / 1000;
                    String strOooO0o0 = o0ooo0o3.OooO0o0();
                    if (strOooO0o0 != null) {
                        OooO0OO oooO0OO = new OooO0OO(Collections.EMPTY_MAP, j, strOooO0o0);
                        OooO0o oooO0o = o0ooo0o3.f30509OooOOO0;
                        oooO0o.getClass();
                        String strConcat = "Persisting non-fatal event for session ".concat(strOooO0o0);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strConcat, null);
                        }
                        oooO0o.OooOOo0(this.f30529OooOo, threadCurrentThread2, C3912zo.a.f13038g, oooO0OO, false);
                        break;
                    } else {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        break;
                    }
                }
                break;
        }
    }
}

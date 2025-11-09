package o000;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import o0000o0.Oooo0;
import o000Ooo.o000000;
import o000Ooo.o00000O0;

/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000000 f28892OooO00o;

    public OooO0OO(o000000 o000000Var) {
        this.f28892OooO00o = o000000Var;
    }

    public static OooO0OO OooO00o() {
        Oooo0 oooo0OooO0Oo = Oooo0.OooO0Oo();
        oooo0OooO0Oo.OooO00o();
        OooO0OO oooO0OO = (OooO0OO) oooo0OooO0Oo.f29591OooO0Oo.get(OooO0OO.class);
        if (oooO0OO != null) {
            return oooO0OO;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void OooO0O0(Boolean bool) {
        Boolean boolOooO00o;
        o00000O0 o00000o02 = this.f28892OooO00o.f30434OooO0O0;
        synchronized (o00000o02) {
            if (bool != null) {
                try {
                    o00000o02.f30460OooO0o = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool != null) {
                boolOooO00o = bool;
            } else {
                Oooo0 oooo0 = o00000o02.f30457OooO0O0;
                oooo0.OooO00o();
                boolOooO00o = o00000o02.OooO00o(oooo0.f29588OooO00o);
            }
            o00000o02.f30462OooO0oO = boolOooO00o;
            SharedPreferences.Editor editorEdit = o00000o02.f30456OooO00o.edit();
            if (bool != null) {
                editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            } else {
                editorEdit.remove("firebase_crashlytics_collection_enabled");
            }
            editorEdit.apply();
            synchronized (o00000o02.f30458OooO0OO) {
                try {
                    if (o00000o02.OooO0O0()) {
                        if (!o00000o02.f30461OooO0o0) {
                            o00000o02.f30459OooO0Oo.trySetResult(null);
                            o00000o02.f30461OooO0o0 = true;
                        }
                    } else if (o00000o02.f30461OooO0o0) {
                        o00000o02.f30459OooO0Oo = new TaskCompletionSource();
                        o00000o02.f30461OooO0o0 = false;
                    }
                } finally {
                }
            }
        }
    }
}

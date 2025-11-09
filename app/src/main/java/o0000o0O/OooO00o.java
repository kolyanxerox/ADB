package o0000O0O;

import android.content.Context;
import android.preference.PreferenceManager;
import o00000oo.o000oOoO;
import o000O0Oo.OooO0o;

/* loaded from: classes2.dex */
public final class OooO00o {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f29376OooO0O0 = new Object();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000oOoO f29377OooO00o;

    public OooO00o(OooO0o oooO0o) {
        Context context = (Context) oooO0o.f30136OooOo;
        String str = (String) oooO0o.f30138OooOo0o;
        String str2 = (String) oooO0o.f30140OooOoO0;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f29377OooO00o = (o000oOoO) oooO0o.f30142OooOoo;
    }
}

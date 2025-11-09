package o000Ooo;

import OoooOOO.o0O0oo00;
import android.content.Context;
import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0O0O00 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f30488OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30489OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000000 f30490OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f30491OooOoO0;

    public /* synthetic */ o0O0O00(o000000 o000000Var, String str, String str2, int i) {
        this.f30489OooOo0O = i;
        this.f30490OooOo0o = o000000Var;
        this.f30488OooOo = str;
        this.f30491OooOoO0 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30489OooOo0O) {
            case 0:
                String str = this.f30488OooOo;
                String str2 = this.f30491OooOoO0;
                o0OOO0o o0ooo0o = this.f30490OooOo0o.f30440OooO0oo;
                o0ooo0o.getClass();
                try {
                    ((o0O0oo00) o0ooo0o.f30501OooO0Oo.f30139OooOoO).OooO00o(str, str2);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = o0ooo0o.f30498OooO00o;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            default:
                this.f30490OooOo0o.f30440OooO0oo.OooO(this.f30488OooOo, this.f30491OooOoO0);
                return;
        }
    }
}

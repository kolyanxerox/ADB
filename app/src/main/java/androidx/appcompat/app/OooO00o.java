package androidx.appcompat.app;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15172OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f15173OooOo0o;

    public /* synthetic */ OooO00o(Context context, int i) {
        this.f15172OooOo0O = i;
        this.f15173OooOo0o = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15172OooOo0O) {
            case 0:
                AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(this.f15173OooOo0o);
                break;
            default:
                AppCompatDelegate.syncRequestedAndStoredLocales(this.f15173OooOo0o);
                break;
        }
    }
}

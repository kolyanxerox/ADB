package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f16780OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f16781OooOo0o;

    public /* synthetic */ OooO0O0(OooO0OO oooO0OO, o00Oo0 o00oo0, int i) {
        this.f16780OooOo0O = i;
        this.f16781OooOo0o = o00oo0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16780OooOo0O) {
            case 0:
                this.f16781OooOo0o.zzb();
                break;
            case 1:
                this.f16781OooOo0o.getClass();
                break;
            default:
                this.f16781OooOo0o.zza();
                break;
        }
    }

    public /* synthetic */ OooO0O0(OooO0OO oooO0OO, o00Oo0 o00oo0, C1721jn c1721jn) {
        this.f16780OooOo0O = 1;
        this.f16781OooOo0o = o00oo0;
    }
}

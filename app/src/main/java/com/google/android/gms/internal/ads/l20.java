package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class l20 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f20777OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20778OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ k20 f20779OooOo0o;

    public /* synthetic */ l20(k20 k20Var, String str, int i) {
        this.f20778OooOo0O = i;
        this.f20779OooOo0o = k20Var;
        this.f20777OooOo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20778OooOo0O) {
            case 0:
                this.f20779OooOo0o.f20419OooO0Oo.zza(this.f20777OooOo);
                break;
            default:
                this.f20779OooOo0o.f20419OooO0Oo.zza(this.f20777OooOo);
                break;
        }
    }
}

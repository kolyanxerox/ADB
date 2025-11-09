package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final /* synthetic */ class b60 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f17418OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ yg0 f17419OooOo0o;

    public /* synthetic */ b60(yg0 yg0Var, int i) {
        this.f17418OooOo0O = i;
        this.f17419OooOo0o = yg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17418OooOo0O) {
            case 0:
                this.f17419OooOo0o.OooO0OO();
                break;
            default:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0oo0)).booleanValue() && ze0.f26157OooO0Oo.f29577OooOo0o) {
                    this.f17419OooOo0o.OooO00o();
                    break;
                }
                break;
        }
    }
}

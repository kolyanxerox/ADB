package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzv;

/* renamed from: com.google.android.gms.internal.ads.br */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1432br implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f17586OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f17587OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ hg0 f17588OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ zzv f17589OooOoO0;

    public /* synthetic */ RunnableC1432br(hg0 hg0Var, String str, zzv zzvVar, int i) {
        this.f17587OooOo0O = i;
        this.f17588OooOo0o = hg0Var;
        this.f17586OooOo = str;
        this.f17589OooOoO0 = zzvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17587OooOo0O) {
            case 0:
                this.f17588OooOo0o.OooO0O0(this.f17586OooOo, this.f17589OooOoO0, null);
                break;
            default:
                this.f17588OooOo0o.OooO00o(this.f17586OooOo, this.f17589OooOoO0);
                break;
        }
    }
}

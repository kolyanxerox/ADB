package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.ironsource.C3007ch;

/* renamed from: com.google.android.gms.internal.ads.lm */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1794lm implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final C1831mm f20901OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f20902OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f20903OooOo0o;

    public RunnableC1794lm(C1831mm c1831mm) {
        this.f20902OooOo0O = 2;
        this.f20903OooOo0o = false;
        this.f20901OooOo = c1831mm;
    }

    public void OooO00o() {
        this.f20903OooOo0o = true;
        this.f20901OooOo.OooOO0o();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20902OooOo0O) {
            case 0:
                C1831mm c1831mm = this.f20901OooOo;
                c1831mm.getClass();
                c1831mm.OooO0OO("windowFocusChanged", "hasWindowFocus", String.valueOf(this.f20903OooOo0o));
                break;
            case 1:
                this.f20901OooOo.OooO0OO("windowVisibilityChanged", C3007ch.f7750k, String.valueOf(this.f20903OooOo0o));
                break;
            default:
                if (!this.f20903OooOo0o) {
                    this.f20901OooOo.OooOO0o();
                    pj0 pj0Var = zzs.zza;
                    pj0Var.removeCallbacks(this);
                    pj0Var.postDelayed(this, 250L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC1794lm(C1831mm c1831mm, boolean z, int i) {
        this.f20902OooOo0O = i;
        this.f20901OooOo = c1831mm;
        this.f20903OooOo0o = z;
    }
}

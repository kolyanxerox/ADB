package com.applovin.impl.mediation.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f15683OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15684OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ MaxFullscreenAdImpl f15685OooOo0o;

    public /* synthetic */ OooO0OO(MaxFullscreenAdImpl maxFullscreenAdImpl, String str, int i) {
        this.f15684OooOo0O = i;
        this.f15685OooOo0o = maxFullscreenAdImpl;
        this.f15683OooOo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15684OooOo0O) {
            case 0:
                this.f15685OooOo0o.m1632c(this.f15683OooOo);
                break;
            case 1:
                this.f15685OooOo0o.m1620a(this.f15683OooOo);
                break;
            default:
                this.f15685OooOo0o.m1628b(this.f15683OooOo);
                break;
        }
    }
}

package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hr */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1652hr implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f19840OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19841OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1689ir f19842OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f19843OooOoO0;

    public /* synthetic */ RunnableC1652hr(C1689ir c1689ir, int i, int i2, int i3) {
        this.f19841OooOo0O = i3;
        this.f19842OooOo0o = c1689ir;
        this.f19840OooOo = i;
        this.f19843OooOoO0 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19841OooOo0O) {
            case 0:
                C1689ir c1689ir = this.f19842OooOo0o;
                c1689ir.getClass();
                c1689ir.f20094OooOo0o.execute(new RunnableC1652hr(c1689ir, this.f19840OooOo, this.f19843OooOoO0, 1));
                break;
            default:
                this.f19842OooOo0o.OooOO0(this.f19840OooOo - 1, this.f19843OooOoO0);
                break;
        }
    }
}

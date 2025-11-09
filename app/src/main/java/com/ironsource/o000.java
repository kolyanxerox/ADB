package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28500OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC3887z f28501OooOo0o;

    public /* synthetic */ o000(AbstractC3887z abstractC3887z, int i) {
        this.f28500OooOo0O = i;
        this.f28501OooOo0o = abstractC3887z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28500OooOo0O) {
            case 0:
                AbstractC3887z.m13257b(this.f28501OooOo0o);
                break;
            case 1:
                AbstractC3887z.m13258c(this.f28501OooOo0o);
                break;
            case 2:
                AbstractC3887z.m13259d(this.f28501OooOo0o);
                break;
            default:
                AbstractC3887z.m13260e(this.f28501OooOo0o);
                break;
        }
    }
}

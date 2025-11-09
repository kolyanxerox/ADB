package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class oo000o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28586OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3423ml f28587OooOo0o;

    public /* synthetic */ oo000o(C3423ml c3423ml, int i) {
        this.f28586OooOo0O = i;
        this.f28587OooOo0o = c3423ml;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28586OooOo0O) {
            case 0:
                C3423ml.m10837d(this.f28587OooOo0o);
                break;
            case 1:
                C3423ml.m10825a(this.f28587OooOo0o);
                break;
            case 2:
                C3423ml.m10835c(this.f28587OooOo0o);
                break;
            case 3:
                C3423ml.m10839e(this.f28587OooOo0o);
                break;
            default:
                C3423ml.m10833b(this.f28587OooOo0o);
                break;
        }
    }
}

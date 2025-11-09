package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000OOo implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28545OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3534pr f28546OooOo0o;

    public /* synthetic */ o000OOo(C3534pr c3534pr, int i) {
        this.f28545OooOo0O = i;
        this.f28546OooOo0o = c3534pr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28545OooOo0O) {
            case 0:
                C3534pr.m11443b(this.f28546OooOo0o);
                break;
            case 1:
                C3534pr.m11444c(this.f28546OooOo0o);
                break;
            case 2:
                C3534pr.m11445d(this.f28546OooOo0o);
                break;
            case 3:
                C3534pr.m11446e(this.f28546OooOo0o);
                break;
            default:
                C3534pr.m11441a(this.f28546OooOo0o);
                break;
        }
    }
}

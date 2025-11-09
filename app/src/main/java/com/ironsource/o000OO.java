package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000OO implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28543OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3825x5 f28544OooOo0o;

    public /* synthetic */ o000OO(C3825x5 c3825x5, int i) {
        this.f28543OooOo0O = i;
        this.f28544OooOo0o = c3825x5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28543OooOo0O) {
            case 0:
                C3825x5.m13017a(this.f28544OooOo0o);
                break;
            case 1:
                C3825x5.m13023e(this.f28544OooOo0o);
                break;
            case 2:
                C3825x5.m13021c(this.f28544OooOo0o);
                break;
            case 3:
                C3825x5.m13020b(this.f28544OooOo0o);
                break;
            default:
                C3825x5.m13022d(this.f28544OooOo0o);
                break;
        }
    }
}

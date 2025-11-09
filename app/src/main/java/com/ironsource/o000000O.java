package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000000O implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28513OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3564qm f28514OooOo0o;

    public /* synthetic */ o000000O(C3564qm c3564qm, int i) {
        this.f28513OooOo0O = i;
        this.f28514OooOo0o = c3564qm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28513OooOo0O) {
            case 0:
                C3564qm.m11567a(this.f28514OooOo0o);
                break;
            default:
                C3564qm.m11572b(this.f28514OooOo0o);
                break;
        }
    }
}

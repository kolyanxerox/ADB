package com.ironsource;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOOO implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28473OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C3022cw f28474OooOo0o;

    public /* synthetic */ OooOOO(C3022cw c3022cw, int i) {
        this.f28473OooOo0O = i;
        this.f28474OooOo0o = c3022cw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28473OooOo0O) {
            case 0:
                C3022cw.m8233b(this.f28474OooOo0o);
                break;
            default:
                C3022cw.m8230a(this.f28474OooOo0o);
                break;
        }
    }
}

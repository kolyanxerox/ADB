package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class to0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ap0 f24369OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o00000oO.OooOOO f24370OooOo0o;

    public to0(ap0 ap0Var, o00000oO.OooOOO oooOOO) {
        this.f24369OooOo0O = ap0Var;
        this.f24370OooOo0o = oooOOO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24369OooOo0O.f17078OooOo0O != this) {
            return;
        }
        o00000oO.OooOOO oooOOO = this.f24370OooOo0o;
        if (ap0.f17075OooOoOO.OooooOO(this.f24369OooOo0O, this, ap0.OooO0oo(oooOOO))) {
            ap0.OooOOOO(this.f24369OooOo0O, false);
        }
    }
}

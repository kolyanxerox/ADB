package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o00O0000 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o00O00O f27041OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final oo0o0O0 f27042OooOo0o;

    public o00O0000(o00O00O o00o00o, oo0o0O0 oo0o0o0) {
        this.f27041OooOo0O = o00o00o;
        this.f27042OooOo0o = oo0o0o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f27041OooOo0O.f27054OooOo0O != this) {
            return;
        }
        oo0o0O0 oo0o0o0 = this.f27042OooOo0o;
        if (o00O00O.f27051OooOoOO.OooOooO(this.f27041OooOo0O, this, o00O00O.OooO0o0(oo0o0o0))) {
            o00O00O.OooO0oo(this.f27041OooOo0O);
        }
    }
}

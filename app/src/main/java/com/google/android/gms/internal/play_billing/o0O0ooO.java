package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o0O0ooO extends o0O000Oo {
    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final o000OOo0 OooO0Oo(o00O00O o00o00o) {
        o000OOo0 o000ooo02;
        o000OOo0 o000ooo03 = o000OOo0.f27028OooO0Oo;
        synchronized (o00o00o) {
            o000ooo02 = o00o00o.f27055OooOo0o;
            if (o000ooo02 != o000ooo03) {
                o00o00o.f27055OooOo0o = o000ooo03;
            }
        }
        return o000ooo02;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final o00O00 OooOOOO(o00O00O o00o00o) {
        o00O00 o00o00;
        o00O00 o00o002 = o00O00.f27038OooO0OO;
        synchronized (o00o00o) {
            o00o00 = o00o00o.f27053OooOo;
            if (o00o00 != o00o002) {
                o00o00o.f27053OooOo = o00o002;
            }
        }
        return o00o00;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final void OooOOoo(o00O00 o00o00, o00O00 o00o002) {
        o00o00.f27040OooO0O0 = o00o002;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final void OooOo0(o00O00 o00o00, Thread thread) {
        o00o00.f27039OooO00o = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOoO(o00O00O o00o00o, o000OOo0 o000ooo02, o000OOo0 o000ooo03) {
        synchronized (o00o00o) {
            try {
                if (o00o00o.f27055OooOo0o != o000ooo02) {
                    return false;
                }
                o00o00o.f27055OooOo0o = o000ooo03;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOooO(o00O00O o00o00o, Object obj, Object obj2) {
        synchronized (o00o00o) {
            try {
                if (o00o00o.f27054OooOo0O != obj) {
                    return false;
                }
                o00o00o.f27054OooOo0O = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean Oooo000(o00O00O o00o00o, o00O00 o00o00, o00O00 o00o002) {
        synchronized (o00o00o) {
            try {
                if (o00o00o.f27053OooOo != o00o00) {
                    return false;
                }
                o00o00o.f27053OooOo = o00o002;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

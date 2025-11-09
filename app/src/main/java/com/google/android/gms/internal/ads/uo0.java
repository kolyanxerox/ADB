package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class uo0 extends xh0 {
    @Override // com.google.android.gms.internal.ads.xh0
    public final ro0 OooOO0(ap0 ap0Var) {
        ro0 ro0Var;
        ro0 ro0Var2 = ro0.f23921OooO0Oo;
        synchronized (ap0Var) {
            ro0Var = ap0Var.f17079OooOo0o;
            if (ro0Var != ro0Var2) {
                ap0Var.f17079OooOo0o = ro0Var2;
            }
        }
        return ro0Var;
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final zo0 Oooo000(ap0 ap0Var) {
        zo0 zo0Var;
        zo0 zo0Var2 = zo0.f26234OooO0OO;
        synchronized (ap0Var) {
            zo0Var = ap0Var.f17077OooOo;
            if (zo0Var != zo0Var2) {
                ap0Var.f17077OooOo = zo0Var2;
            }
        }
        return zo0Var;
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void OoooO00(zo0 zo0Var, zo0 zo0Var2) {
        zo0Var.f26236OooO0O0 = zo0Var2;
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final boolean Ooooo00(ap0 ap0Var, ro0 ro0Var, ro0 ro0Var2) {
        synchronized (ap0Var) {
            try {
                if (ap0Var.f17079OooOo0o != ro0Var) {
                    return false;
                }
                ap0Var.f17079OooOo0o = ro0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final boolean OooooOO(ap0 ap0Var, Object obj, Object obj2) {
        synchronized (ap0Var) {
            try {
                if (ap0Var.f17078OooOo0O != obj) {
                    return false;
                }
                ap0Var.f17078OooOo0O = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final boolean Oooooo0(ap0 ap0Var, zo0 zo0Var, zo0 zo0Var2) {
        synchronized (ap0Var) {
            try {
                if (ap0Var.f17077OooOo != zo0Var) {
                    return false;
                }
                ap0Var.f17077OooOo = zo0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void o000oOoO(zo0 zo0Var, Thread thread) {
        zo0Var.f26235OooO00o = thread;
    }
}

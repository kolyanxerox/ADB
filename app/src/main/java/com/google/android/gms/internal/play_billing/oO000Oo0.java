package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class oO000Oo0 extends o0O000Oo {
    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final void OooO(oO000Oo oo000oo, oO000Oo oo000oo2) {
        oo000oo.f27188OooO0O0 = oo000oo2;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final void OooOOo(oO000Oo oo000oo, Thread thread) {
        oo000oo.f27187OooO00o = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOo00(oO000o00 oo000o00, oo0ooO oo0ooo, oo0ooO oo0ooo2) {
        synchronized (oo000o00) {
            try {
                if (oo000o00.f27195OooOo0o != oo0ooo) {
                    return false;
                }
                oo000o00.f27195OooOo0o = oo0ooo2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOo0O(oO000o00 oo000o00, Object obj, Object obj2) {
        synchronized (oo000o00) {
            try {
                if (oo000o00.f27194OooOo0O != obj) {
                    return false;
                }
                oo000o00.f27194OooOo0O = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0O000Oo
    public final boolean OooOoOO(oO000o00 oo000o00, oO000Oo oo000oo, oO000Oo oo000oo2) {
        synchronized (oo000o00) {
            try {
                if (oo000o00.f27193OooOo != oo000oo) {
                    return false;
                }
                oo000o00.f27193OooOo = oo000oo2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

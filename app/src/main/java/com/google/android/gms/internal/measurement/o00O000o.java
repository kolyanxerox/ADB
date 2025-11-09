package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class o00O000o implements Runnable {

    /* renamed from: OooOo */
    public final boolean f26517OooOo;

    /* renamed from: OooOo0O */
    public final long f26518OooOo0O;

    /* renamed from: OooOo0o */
    public final long f26519OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ o00O00OO f26520OooOoO0;

    public o00O000o(o00O00OO o00o00oo, boolean z) {
        Objects.requireNonNull(o00o00oo);
        this.f26520OooOoO0 = o00o00oo;
        this.f26518OooOo0O = System.currentTimeMillis();
        this.f26519OooOo0o = SystemClock.elapsedRealtime();
        this.f26517OooOo = z;
    }

    public abstract void OooO00o();

    public void OooO0O0() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00O00OO o00o00oo = this.f26520OooOoO0;
        if (o00o00oo.f26530OooO0o0) {
            OooO0O0();
            return;
        }
        try {
            OooO00o();
        } catch (Exception e) {
            o00o00oo.OooO0Oo(e, false, this.f26517OooOo);
            OooO0O0();
        }
    }
}

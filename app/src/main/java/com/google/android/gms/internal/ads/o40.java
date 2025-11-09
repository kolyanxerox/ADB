package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public abstract class o40 implements Oooo00O.OooO0OO, Oooo00O.OooO0o {

    /* renamed from: OooOoO */
    public C2197wi f22331OooOoO;

    /* renamed from: OooOoOO */
    public C1666i4 f22333OooOoOO;

    /* renamed from: OooOo0O */
    public final C2274yl f22329OooOo0O = new C2274yl();

    /* renamed from: OooOo0o */
    public final Object f22330OooOo0o = new Object();

    /* renamed from: OooOo */
    public boolean f22328OooOo = false;

    /* renamed from: OooOoO0 */
    public boolean f22332OooOoO0 = false;

    public static void OooO0O0(Context context, C2274yl c2274yl, cq0 cq0Var) {
        if (((Boolean) AbstractC1413b8.f17440OooOO0.OooOOO()).booleanValue() || ((Boolean) AbstractC1413b8.f17439OooO0oo.OooOOO()).booleanValue()) {
            c2274yl.addListener(new wp0(0, c2274yl, new C2111u6(context, false)), cq0Var);
        }
    }

    public void OooO(OooOooo.o000Oo0 o000oo02) {
        zzo.zze("Disconnected from remote ad request service.");
        this.f22329OooOo0O.zzd(new v40(1));
    }

    public final void OooO00o() {
        synchronized (this.f22330OooOo0o) {
            try {
                this.f22332OooOoO0 = true;
                if (this.f22333OooOoOO.isConnected() || this.f22333OooOoOO.isConnecting()) {
                    this.f22333OooOoOO.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Oooo00O.OooO0OO
    public final void OooOOO(int i) {
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
    }
}

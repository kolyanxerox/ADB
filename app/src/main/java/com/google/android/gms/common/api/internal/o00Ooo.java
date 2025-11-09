package com.google.android.gms.common.api.internal;

import OooOooo.o000Oo0;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.InterfaceC3173h3;

/* loaded from: classes2.dex */
public final class o00Ooo implements OnCompleteListener {

    /* renamed from: OooOo */
    public final OooO00o f16732OooOo;

    /* renamed from: OooOo0O */
    public final OooO0o f16733OooOo0O;

    /* renamed from: OooOo0o */
    public final int f16734OooOo0o;

    /* renamed from: OooOoO */
    public final long f16735OooOoO;

    /* renamed from: OooOoO0 */
    public final long f16736OooOoO0;

    public o00Ooo(OooO0o oooO0o, int i, OooO00o oooO00o, long j, long j2) {
        this.f16733OooOo0O = oooO0o;
        this.f16734OooOo0o = i;
        this.f16732OooOo = oooO00o;
        this.f16736OooOoO0 = j;
        this.f16735OooOoO = j2;
    }

    public static Oooo00O.OooOOO0 OooO00o(Oooo0 oooo0, Oooo00O.OooOO0O oooOO0O, int i) {
        Oooo00O.OooOOO0 telemetryConfiguration = oooOO0O.getTelemetryConfiguration();
        if (telemetryConfiguration != null && telemetryConfiguration.OooO()) {
            int[] iArrOooO0o = telemetryConfiguration.OooO0o();
            int i2 = 0;
            if (iArrOooO0o == null) {
                int[] iArrOooO0oO = telemetryConfiguration.OooO0oO();
                if (iArrOooO0oO != null) {
                    while (i2 < iArrOooO0oO.length) {
                        if (iArrOooO0oO[i2] == i) {
                            return null;
                        }
                        i2++;
                    }
                }
            } else {
                while (i2 < iArrOooO0o.length) {
                    if (iArrOooO0o[i2] != i) {
                        i2++;
                    }
                }
            }
            if (oooo0.f16724Oooo00O < telemetryConfiguration.OooO0o0()) {
                return telemetryConfiguration;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Oooo0 oooo0;
        int iOooOO0;
        int i;
        int i2;
        int iOooO0o;
        int iOooO0o0;
        int i3;
        long j;
        long j2;
        OooO0o oooO0o = this.f16733OooOo0O;
        if (oooO0o.OooO00o()) {
            Oooo00O.Oooo0 oooo02 = (Oooo00O.Oooo0) Oooo00O.Oooo000.OooO0O0().f13781OooOo0O;
            if ((oooo02 == null || oooo02.OooO0oO()) && (oooo0 = (Oooo0) oooO0o.f16707OooOooo.get(this.f16732OooOo)) != null) {
                Object obj = oooo0.f16715OooOo0o;
                if (obj instanceof Oooo00O.OooOO0O) {
                    Oooo00O.OooOO0O oooOO0O = (Oooo00O.OooOO0O) obj;
                    long j3 = this.f16736OooOoO0;
                    boolean zOooO = j3 > 0;
                    int gCoreServiceId = oooOO0O.getGCoreServiceId();
                    if (oooo02 != null) {
                        zOooO &= oooo02.OooO();
                        int iOooO0o02 = oooo02.OooO0o0();
                        int iOooO0o2 = oooo02.OooO0o();
                        iOooOO0 = oooo02.OooOO0();
                        if (oooOO0O.hasConnectionInfo() && !oooOO0O.isConnecting()) {
                            Oooo00O.OooOOO0 oooOOO0OooO00o = OooO00o(oooo0, oooOO0O, this.f16734OooOo0o);
                            if (oooOOO0OooO00o == null) {
                                return;
                            }
                            boolean z = oooOOO0OooO00o.OooOO0() && j3 > 0;
                            iOooO0o2 = oooOOO0OooO00o.OooO0o0();
                            zOooO = z;
                        }
                        i2 = iOooO0o02;
                        i = iOooO0o2;
                    } else {
                        iOooOO0 = 0;
                        i = 100;
                        i2 = 5000;
                    }
                    int iElapsedRealtime = -1;
                    if (task.isSuccessful()) {
                        i3 = 0;
                        iOooO0o0 = 0;
                    } else if (task.isCanceled()) {
                        iOooO0o0 = -1;
                        i3 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof Oooo000.OooO0o) {
                            Status status = ((Oooo000.OooO0o) exception).f13723OooOo0O;
                            iOooO0o = status.OooO0o();
                            o000Oo0 o000oo0OooO0o0 = status.OooO0o0();
                            if (o000oo0OooO0o0 != null) {
                                iOooO0o0 = o000oo0OooO0o0.OooO0o0();
                            }
                            i3 = iOooO0o;
                        } else {
                            iOooO0o = InterfaceC3173h3.d.b.f8819b;
                        }
                        iOooO0o0 = -1;
                        i3 = iOooO0o;
                    }
                    if (zOooO) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f16735OooOoO);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    oo000o oo000oVar = new oo000o(new Oooo00O.OooOo(this.f16734OooOo0o, i3, iOooO0o0, j, j2, null, null, gCoreServiceId, iElapsedRealtime), iOooOO0, i2, i);
                    OoooO0.OooOO0O oooOO0O2 = oooO0o.f16711Oooo00o;
                    oooOO0O2.sendMessage(oooOO0O2.obtainMessage(18, oo000oVar));
                }
            }
        }
    }
}

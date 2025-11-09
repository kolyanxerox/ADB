package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class nf0 implements Runnable {

    /* renamed from: OooOooO, reason: collision with root package name */
    public static final Object f21474OooOooO = new Object();

    /* renamed from: OooOooo, reason: collision with root package name */
    public static final Object f21475OooOooo = new Object();

    /* renamed from: Oooo000, reason: collision with root package name */
    public static final Object f21476Oooo000 = new Object();

    /* renamed from: Oooo00O, reason: collision with root package name */
    public static Boolean f21477Oooo00O;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f21479OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final VersionInfoParcel f21480OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f21481OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final s10 f21483OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final List f21485OooOoo0;

    /* renamed from: OooOo, reason: collision with root package name */
    public final rf0 f21478OooOo = uf0.OooOo();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public String f21482OooOoO0 = "";

    /* renamed from: OooOoo, reason: collision with root package name */
    public boolean f21484OooOoo = false;

    public nf0(Context context, VersionInfoParcel versionInfoParcel, s10 s10Var, C2007rd c2007rd) {
        this.f21479OooOo0O = context;
        this.f21480OooOo0o = versionInfoParcel;
        this.f21483OooOoOO = s10Var;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO)).booleanValue()) {
            this.f21485OooOoo0 = zzs.zzd();
        } else {
            pm0 pm0Var = rm0.f23913OooOo0o;
            this.f21485OooOoo0 = gn0.f19388OooOoO;
        }
    }

    public static boolean OooO00o() {
        boolean zBooleanValue;
        synchronized (f21474OooOooO) {
            try {
                if (f21477Oooo00O == null) {
                    if (((Boolean) AbstractC1449c8.f17949OooO0O0.OooOOO()).booleanValue()) {
                        f21477Oooo00O = Boolean.valueOf(Math.random() < ((Double) AbstractC1449c8.f17948OooO00o.OooOOO()).doubleValue());
                    } else {
                        f21477Oooo00O = Boolean.FALSE;
                    }
                }
                zBooleanValue = f21477Oooo00O.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void OooO0O0(lf0 lf0Var) {
        AbstractC2200wl.f25321OooO00o.OooO00o(new c60(8, this, lf0Var));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrOooO0Oo;
        if (OooO00o()) {
            Object obj = f21475OooOooo;
            synchronized (obj) {
                try {
                    if (((uf0) this.f21478OooOo.f25822OooOo0o).OooOo0o() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrOooO0Oo = ((uf0) this.f21478OooOo.OooO0O0()).OooO0Oo();
                            rf0 rf0Var = this.f21478OooOo;
                            rf0Var.OooO0Oo();
                            uf0.OooOoO((uf0) rf0Var.f25822OooOo0o);
                        }
                        e50 e50Var = new e50((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0oOO), 60000, new HashMap(), bArrOooO0Oo, CommonGatewayClient.HEADER_PROTOBUF);
                        Context context = this.f21479OooOo0O;
                        String str = this.f21480OooOo0o.afmaVersion;
                        Binder.getCallingUid();
                        new C1548ey(10, context, str).OooO0Oo(e50Var);
                    } catch (Exception e) {
                        if ((e instanceof a40) && ((a40) e).f16906OooOo0O == 3) {
                            return;
                        }
                        zzv.zzp().OooO0oO("CuiMonitor.sendCuiPing", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class vg0 {

    /* renamed from: OooO00o */
    public final Context f24972OooO00o;

    /* renamed from: OooO0O0 */
    public final VersionInfoParcel f24973OooO0O0;

    /* renamed from: OooO0OO */
    public final ScheduledExecutorService f24974OooO0OO;

    /* renamed from: OooO0Oo */
    public final ClientApi f24975OooO0Oo = new ClientApi();

    /* renamed from: OooO0o */
    public final Oooo0OO.o00Ooo f24976OooO0o;

    /* renamed from: OooO0o0 */
    public InterfaceC2156ve f24977OooO0o0;

    public vg0(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, Oooo0OO.o00Ooo o00ooo2) {
        this.f24972OooO00o = context;
        this.f24973OooO0O0 = versionInfoParcel;
        this.f24974OooO0OO = scheduledExecutorService;
        this.f24976OooO0o = o00ooo2;
    }

    public static lg0 OooO0O0() {
        return new lg0(((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17730OooOo0o)).longValue(), ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17727OooOo)).longValue());
    }

    public final kg0 OooO00o(zzft zzftVar, zzcf zzcfVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        VersionInfoParcel versionInfoParcel = this.f24973OooO0O0;
        Context context = this.f24972OooO00o;
        if (iOrdinal == 1) {
            int i = versionInfoParcel.clientJarVersion;
            InterfaceC2156ve interfaceC2156ve = this.f24977OooO0o0;
            lg0 lg0VarOooO0O0 = OooO0O0();
            return new kg0(this.f24975OooO0Oo, context, i, interfaceC2156ve, zzftVar, zzcfVar, this.f24974OooO0OO, lg0VarOooO0O0, this.f24976OooO0o, 1);
        }
        if (iOrdinal == 2) {
            int i2 = versionInfoParcel.clientJarVersion;
            InterfaceC2156ve interfaceC2156ve2 = this.f24977OooO0o0;
            lg0 lg0VarOooO0O02 = OooO0O0();
            return new kg0(this.f24975OooO0Oo, context, i2, interfaceC2156ve2, zzftVar, zzcfVar, this.f24974OooO0OO, lg0VarOooO0O02, this.f24976OooO0o, 2);
        }
        if (iOrdinal != 5) {
            return null;
        }
        int i3 = versionInfoParcel.clientJarVersion;
        InterfaceC2156ve interfaceC2156ve3 = this.f24977OooO0o0;
        lg0 lg0VarOooO0O03 = OooO0O0();
        return new kg0(this.f24975OooO0Oo, context, i3, interfaceC2156ve3, zzftVar, zzcfVar, this.f24974OooO0OO, lg0VarOooO0O03, this.f24976OooO0o, 0);
    }
}

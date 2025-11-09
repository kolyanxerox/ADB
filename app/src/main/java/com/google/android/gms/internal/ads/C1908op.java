package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.op */
/* loaded from: classes2.dex */
public final class C1908op implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f23074OooO00o;

    /* renamed from: OooO0O0 */
    public final C1834mp f23075OooO0O0;

    /* renamed from: OooO0OO */
    public final p31 f23076OooO0OO;

    public /* synthetic */ C1908op(C1834mp c1834mp, p31 p31Var, int i) {
        this.f23074OooO00o = i;
        this.f23075OooO0O0 = c1834mp;
        this.f23076OooO0OO = p31Var;
    }

    public OooOOo0.o0OOO0o OooO00o() {
        Context contextOooO00o = this.f23075OooO0O0.OooO00o();
        nf0 nf0Var = (nf0) this.f23076OooO0OO.zzb();
        C1602ge c1602geOooO0O0 = zzv.zzg().OooO0O0(contextOooO00o, VersionInfoParcel.forPackage(), nf0Var);
        C2007rd c2007rd = AbstractC1565fe.f18933OooO0O0;
        c1602geOooO0O0.getClass();
        return new OooOOo0.o0OOO0o(contextOooO00o, zzv.zzg().OooO0O0(contextOooO00o, VersionInfoParcel.forPackage(), nf0Var).OooO00o("google.afma.sdkConstants.getSdkConstants", c2007rd, c2007rd), VersionInfoParcel.forPackage());
    }

    public o90 OooO0O0() {
        return new o90(3, this.f23075OooO0O0.OooO00o(), (Intent) this.f23076OooO0OO.zzb());
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f23074OooO00o) {
            case 0:
                try {
                    return Oooo0o0.OooOO0.OooO00o(this.f23075OooO0O0.OooO00o()).OooO0OO(0, ((ApplicationInfo) this.f23076OooO0OO.zzb()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return OooO00o();
            case 2:
                return new C1836mr(this.f23075OooO0O0.OooO00o(), (C1408b3) this.f23076OooO0OO.zzb());
            case 3:
                return new c40(this.f23075OooO0O0.OooO00o(), (h20) this.f23076OooO0OO.zzb());
            case 4:
                return new s40(this.f23075OooO0O0.OooO00o(), (C2162vk) this.f23076OooO0OO.zzb());
            case 5:
                return OooO0O0();
            case 6:
                C2162vk c2162vk = (C2162vk) this.f23076OooO0OO.zzb();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new t90(c2162vk, c2163vl, this.f23075OooO0O0.OooO00o(), 3);
            case 7:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f23076OooO0OO.zzb();
                this.f23075OooO0O0.OooO00o();
                return new k90(scheduledExecutorService, 6);
            default:
                return new if0(this.f23075OooO0O0.OooO00o(), (mf0) this.f23076OooO0OO.zzb());
        }
    }

    public /* synthetic */ C1908op(p31 p31Var, C1834mp c1834mp, int i) {
        this.f23074OooO00o = i;
        this.f23076OooO0OO = p31Var;
        this.f23075OooO0O0 = c1834mp;
    }
}

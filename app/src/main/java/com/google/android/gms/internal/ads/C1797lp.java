package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.lp */
/* loaded from: classes2.dex */
public final class C1797lp implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f20918OooO00o;

    /* renamed from: OooO0O0 */
    public final C1834mp f20919OooO0O0;

    public /* synthetic */ C1797lp(C1834mp c1834mp, int i) {
        this.f20918OooO00o = i;
        this.f20919OooO0O0 = c1834mp;
    }

    public q40 OooO00o() {
        Context contextOooO00o = this.f20919OooO0O0.OooO00o();
        q40 q40Var = new q40();
        q40Var.f23507OooOoo = 1;
        q40Var.f22333OooOoOO = new C1666i4(contextOooO00o, zzv.zzu().zzb(), (o40) q40Var, (o40) q40Var);
        return q40Var;
    }

    public z90 OooO0O0() {
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new z90(c2163vl, this.f20919OooO0O0.OooO00o(), 1);
    }

    public String OooO0OO() {
        zzfb liteSdkVersion;
        zzcw zzcwVar = (zzcw) de0.OooOOOo(this.f20919OooO0O0.OooO00o()).f18240OooOo;
        if (zzcwVar != null) {
            try {
                liteSdkVersion = zzcwVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.zzb();
        }
        return null;
    }

    public z90 OooO0Oo() {
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new z90(c2163vl, this.f20919OooO0O0.OooO00o(), 8);
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f20918OooO00o) {
            case 0:
                ApplicationInfo applicationInfo = this.f20919OooO0O0.OooO00o().getApplicationInfo();
                ii0.Oooo000(applicationInfo);
                return applicationInfo;
            case 1:
                return OooO0OO();
            case 2:
                C2051sk c2051skOooOo00 = C2051sk.OooOo00(this.f20919OooO0O0.OooO00o());
                return new C2249xx(19, (Oooo0OO.o00Ooo) c2051skOooOo00.f24098OooOo0o, (C1904ok) ((p31) c2051skOooOo00.f24100OooOoO0).zzb());
            case 3:
                return new ki0(this.f20919OooO0O0.OooO00o(), zzv.zzu().zzb());
            case 4:
                return new zzbo(this.f20919OooO0O0.OooO00o());
            case 5:
                return de0.OooOOOo(this.f20919OooO0O0.OooO00o());
            case 6:
                return new C2242xq(this.f20919OooO0O0.OooO00o());
            case 7:
                return new g30(this.f20919OooO0O0.OooO00o());
            case 8:
                return new z30(this.f20919OooO0O0.OooO00o());
            case 9:
                Context contextOooO00o = this.f20919OooO0O0.OooO00o();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new l40(contextOooO00o, c2163vl, 1);
            case 10:
                return OooO00o();
            case 11:
                return new i50(this.f20919OooO0O0.OooO00o());
            case 12:
                Context contextOooO00o2 = this.f20919OooO0O0.OooO00o();
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                return new s50(contextOooO00o2, c2163vl2);
            case 13:
                return new g60(this.f20919OooO0O0.OooO00o());
            case 14:
                return new h60(this.f20919OooO0O0.OooO00o());
            case 15:
                return new k90(this.f20919OooO0O0.OooO00o(), 0);
            case 16:
                C2163vl c2163vl3 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl3);
                return new z90(c2163vl3, this.f20919OooO0O0.OooO00o(), 0);
            case 17:
                return OooO0O0();
            case 18:
                C2163vl c2163vl4 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl4);
                return new z90(c2163vl4, this.f20919OooO0O0.OooO00o(), 2);
            case 19:
                Context contextOooO00o3 = this.f20919OooO0O0.OooO00o();
                C2163vl c2163vl5 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl5);
                return new z90(contextOooO00o3, c2163vl5, 3);
            case 20:
                C2163vl c2163vl6 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl6);
                return new z90(c2163vl6, this.f20919OooO0O0.OooO00o(), 4);
            case 21:
                C2163vl c2163vl7 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl7);
                return new z90(c2163vl7, this.f20919OooO0O0.OooO00o(), 5);
            case 22:
                Context contextOooO00o4 = this.f20919OooO0O0.OooO00o();
                C2163vl c2163vl8 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl8);
                return new z90(contextOooO00o4, c2163vl8, 6);
            case 23:
                C2163vl c2163vl9 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl9);
                return new z90(c2163vl9, this.f20919OooO0O0.OooO00o(), 7);
            case 24:
                return OooO0Oo();
            case 25:
                C2163vl c2163vl10 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl10);
                this.f20919OooO0O0.OooO00o();
                return new na0(c2163vl10, 3);
            default:
                return new wb0(this.f20919OooO0O0.OooO00o());
        }
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.InterfaceC3173h3;

/* loaded from: classes2.dex */
public final class x10 implements InterfaceC2173vv, InterfaceC1656hv, InterfaceC2135uu, InterfaceC1399av, zza, InterfaceC1620gw {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C1998r4 f25495OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f25496OooOo0o = false;

    public x10(C1998r4 c1998r4, uc0 uc0Var) {
        this.f25495OooOo0O = c1998r4;
        c1998r4.OooO0O0(2);
        if (uc0Var != null) {
            c1998r4.OooO0O0(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void OooOO0(C2184w5 c2184w5) {
        C1998r4 c1998r4 = this.f25495OooOo0O;
        synchronized (c1998r4) {
            if (c1998r4.f23741OooO0OO) {
                try {
                    c1998r4.f23740OooO0O0.OooO0o(c2184w5);
                } catch (NullPointerException e) {
                    zzv.zzp().OooO0oo("AdMobClearcutLogger.modify", e);
                }
            }
        }
        this.f25495OooOo0O.OooO0O0(1104);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void OooOOO(C2184w5 c2184w5) {
        C1998r4 c1998r4 = this.f25495OooOo0O;
        synchronized (c1998r4) {
            if (c1998r4.f23741OooO0OO) {
                try {
                    c1998r4.f23740OooO0O0.OooO0o(c2184w5);
                } catch (NullPointerException e) {
                    zzv.zzp().OooO0oo("AdMobClearcutLogger.modify", e);
                }
            }
        }
        this.f25495OooOo0O.OooO0O0(1102);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void OoooO0(C2197wi c2197wi) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void OoooO00(boolean z) {
        this.f25495OooOo0O.OooO0O0(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1656hv
    public final void OoooOOO() {
        this.f25495OooOo0O.OooO0O0(3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void OoooOo0(boolean z) {
        this.f25495OooOo0O.OooO0O0(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void Oooooo0(C2184w5 c2184w5) {
        C1998r4 c1998r4 = this.f25495OooOo0O;
        synchronized (c1998r4) {
            if (c1998r4.f23741OooO0OO) {
                try {
                    c1998r4.f23740OooO0O0.OooO0o(c2184w5);
                } catch (NullPointerException e) {
                    zzv.zzp().OooO0oo("AdMobClearcutLogger.modify", e);
                }
            }
        }
        this.f25495OooOo0O.OooO0O0(1103);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2135uu
    public final void o0OOO0o(zze zzeVar) {
        int i = zzeVar.zza;
        C1998r4 c1998r4 = this.f25495OooOo0O;
        switch (i) {
            case 1:
                c1998r4.OooO0O0(InterfaceC3173h3.d.b.f8819b);
                break;
            case 2:
                c1998r4.OooO0O0(102);
                break;
            case 3:
                c1998r4.OooO0O0(5);
                break;
            case 4:
                c1998r4.OooO0O0(InterfaceC3173h3.d.b.f8821d);
                break;
            case 5:
                c1998r4.OooO0O0(104);
                break;
            case 6:
                c1998r4.OooO0O0(InterfaceC3173h3.d.b.f8823f);
                break;
            case 7:
                c1998r4.OooO0O0(106);
                break;
            default:
                c1998r4.OooO0O0(4);
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.f25496OooOo0o) {
            this.f25495OooOo0O.OooO0O0(8);
        } else {
            this.f25495OooOo0O.OooO0O0(7);
            this.f25496OooOo0o = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2173vv
    public final void oo000o(rd0 rd0Var) {
        this.f25495OooOo0O.OooO00o(new p80(rd0Var, 17));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1620gw
    public final void zzh() {
        this.f25495OooOo0O.OooO0O0(1109);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final synchronized void zzr() {
        this.f25495OooOo0O.OooO0O0(6);
    }
}

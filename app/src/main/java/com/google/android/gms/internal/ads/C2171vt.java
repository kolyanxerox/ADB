package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.vt */
/* loaded from: classes2.dex */
public final class C2171vt implements q31 {

    /* renamed from: OooO, reason: collision with root package name */
    public final v31 f25125OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f25126OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final p31 f25127OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p31 f25128OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final p31 f25129OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final v31 f25130OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final q31 f25131OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final v31 f25132OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final v31 f25133OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final v31 f25134OooOO0;

    public C2171vt(C1834mp c1834mp, C1986qt c1986qt, p31 p31Var, p31 p31Var2, p31 p31Var3, C1876nu c1876nu, p31 p31Var4, p31 p31Var5, p31 p31Var6) {
        this.f25126OooO00o = 5;
        this.f25131OooO0o0 = c1834mp;
        this.f25130OooO0o = c1986qt;
        this.f25127OooO0O0 = p31Var;
        this.f25128OooO0OO = p31Var2;
        this.f25129OooO0Oo = p31Var3;
        this.f25132OooO0oO = c1876nu;
        this.f25133OooO0oo = p31Var4;
        this.f25125OooO = p31Var5;
        this.f25134OooOO0 = p31Var6;
    }

    public OooOOOo.o0ooOOo OooO00o() {
        rd0 rd0Var = (rd0) ((C1764kt) this.f25131OooO0o0).f20673OooO0O0.f18242OooOo0o;
        ii0.Oooo000(rd0Var);
        return new OooOOOo.o0ooOOo(rd0Var, ((C1764kt) this.f25130OooO0o).OooO00o(), (C1472cv) this.f25127OooO0O0.zzb(), (C1619gv) this.f25132OooO0oO.zzb(), ((C1841mw) this.f25133OooO0oo).f21358OooO0O0.f20976OooOOOO, ((C1984qr) this.f25125OooO).OooO00o(), (C2247xv) this.f25128OooO0OO.zzb(), new C1692iv(((C1987qu) this.f25134OooOO0).f23701OooO0O0.zzb()), (C2174vw) this.f25129OooO0Oo.zzb());
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f25126OooO00o) {
            case 0:
                return OooO00o();
            case 1:
                return new x00(((C1834mp) this.f25131OooO0o0).OooO00o(), (Executor) this.f25127OooO0O0.zzb(), (C1663i1) this.f25128OooO0OO.zzb(), ((C1982qp) this.f25130OooO0o).OooO00o(), C1651hq.OooO0O0(), (s50) this.f25129OooO0Oo.zzb(), (hg0) ((p31) this.f25132OooO0oO).zzb(), (h20) ((p31) this.f25133OooO0oo).zzb(), (x50) ((p31) this.f25125OooO).zzb(), (xd0) ((p31) this.f25134OooOO0).zzb());
            case 2:
                Context context = (Context) this.f25127OooO0O0.zzb();
                C1663i1 c1663i1 = (C1663i1) this.f25128OooO0OO.zzb();
                C2075t7 c2075t7 = (C2075t7) this.f25129OooO0Oo.zzb();
                VersionInfoParcel versionInfoParcelOooO00o = ((C1982qp) this.f25131OooO0o0).OooO00o();
                Object obj = ((C1651hq) this.f25130OooO0o).f19838OooO0O0;
                return new n10(context, c1663i1, c2075t7, versionInfoParcelOooO00o, C1651hq.OooO0O0(), (C1998r4) ((p31) this.f25132OooO0oO).zzb(), (C2099tv) ((q31) this.f25133OooO0oo).zzb(), (x50) ((p31) this.f25125OooO).zzb(), (xd0) ((p31) this.f25134OooOO0).zzb());
            case 3:
                Executor executor = (Executor) this.f25127OooO0O0.zzb();
                Context contextOooO00o = ((C1834mp) this.f25131OooO0o0).OooO00o();
                WeakReference weakReference = ((C1871np) this.f25130OooO0o).f21563OooO0O0.f20082OooO0Oo;
                ii0.Oooo000(weakReference);
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new d30(executor, contextOooO00o, weakReference, c2163vl, (t10) this.f25128OooO0OO.zzb(), (ScheduledExecutorService) this.f25129OooO0Oo.zzb(), (m20) ((p31) this.f25132OooO0oO).zzb(), ((C1982qp) this.f25133OooO0oo).OooO00o(), new C1915ow(((C1987qu) this.f25125OooO).f23701OooO0O0.zzb()), (nf0) ((p31) this.f25134OooOO0).zzb());
            case 4:
                return new f90((Context) ((r31) this.f25131OooO0o0).f23738OooO00o, (zzs) ((r31) this.f25130OooO0o).f23738OooO00o, (String) ((r31) this.f25132OooO0oO).f23738OooO00o, (yc0) this.f25127OooO0O0.zzb(), (c90) this.f25128OooO0OO.zzb(), (bd0) this.f25129OooO0Oo.zzb(), ((C1982qp) this.f25133OooO0oo).OooO00o(), (C1663i1) ((p31) this.f25125OooO).zzb(), (h20) ((p31) this.f25134OooOO0).zzb());
            case 5:
                Context contextOooO00o2 = ((C1834mp) this.f25131OooO0o0).OooO00o();
                String str = ((C1949pt) ((C1986qt) this.f25130OooO0o).f23697OooO0O0.zzb()).f23427OooOo0o.f21274OooO0o0;
                ii0.Oooo000(str);
                return new ea0(contextOooO00o2, str, (String) this.f25127OooO0O0.zzb(), (C1949pt) this.f25128OooO0OO.zzb(), (ge0) this.f25129OooO0Oo.zzb(), ((C1876nu) this.f25132OooO0oO).OooO00o(), (f20) ((p31) this.f25133OooO0oo).zzb(), (C2134ut) ((p31) this.f25125OooO).zzb(), ((Long) ((p31) this.f25134OooOO0).zzb()).longValue());
            case 6:
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                return new eb0(c2163vl2, (ScheduledExecutorService) this.f25127OooO0O0.zzb(), (String) this.f25132OooO0oO.zzb(), (u80) this.f25128OooO0OO.zzb(), (Context) this.f25129OooO0Oo.zzb(), ((C1876nu) this.f25131OooO0o0).OooO00o(), (s80) ((p31) this.f25130OooO0o).zzb(), (t10) ((p31) this.f25133OooO0oo).zzb(), (e30) ((p31) this.f25125OooO).zzb(), ((Integer) ((p31) this.f25134OooOO0).zzb()).intValue());
            default:
                x70 x70Var = (x70) this.f25127OooO0O0.zzb();
                VersionInfoParcel versionInfoParcelOooO00o2 = ((C1982qp) this.f25131OooO0o0).OooO00o();
                String str2 = ((C1949pt) ((C1986qt) this.f25130OooO0o).f23697OooO0O0.zzb()).f23427OooOo0o.f21274OooO0o0;
                ii0.Oooo000(str2);
                return new fg0(x70Var, versionInfoParcelOooO00o2, str2, (String) this.f25128OooO0OO.zzb(), (Context) this.f25129OooO0Oo.zzb(), ((C1839mu) this.f25132OooO0oO).f21355OooO0O0.f20956OooO0Oo, (td0) ((p31) this.f25133OooO0oo).zzb(), (Oooo0OO.o00Ooo) ((p31) this.f25125OooO).zzb(), (C1663i1) ((p31) this.f25134OooOO0).zzb());
        }
    }

    public C2171vt(C1834mp c1834mp, p31 p31Var, p31 p31Var2, C1982qp c1982qp, C1651hq c1651hq, p31 p31Var3, p31 p31Var4, p31 p31Var5, p31 p31Var6, p31 p31Var7) {
        this.f25126OooO00o = 1;
        this.f25131OooO0o0 = c1834mp;
        this.f25127OooO0O0 = p31Var;
        this.f25128OooO0OO = p31Var2;
        this.f25130OooO0o = c1982qp;
        this.f25129OooO0Oo = p31Var3;
        this.f25132OooO0oO = p31Var4;
        this.f25133OooO0oo = p31Var5;
        this.f25125OooO = p31Var6;
        this.f25134OooOO0 = p31Var7;
    }

    public C2171vt(C1764kt c1764kt, C1764kt c1764kt2, p31 p31Var, v31 v31Var, C1841mw c1841mw, C1984qr c1984qr, p31 p31Var2, C1987qu c1987qu, p31 p31Var3) {
        this.f25126OooO00o = 0;
        this.f25131OooO0o0 = c1764kt;
        this.f25130OooO0o = c1764kt2;
        this.f25127OooO0O0 = p31Var;
        this.f25132OooO0oO = v31Var;
        this.f25133OooO0oo = c1841mw;
        this.f25125OooO = c1984qr;
        this.f25128OooO0OO = p31Var2;
        this.f25134OooOO0 = c1987qu;
        this.f25129OooO0Oo = p31Var3;
    }

    public C2171vt(p31 p31Var, p31 p31Var2, p31 p31Var3, C1982qp c1982qp, C1651hq c1651hq, p31 p31Var4, q31 q31Var, p31 p31Var5, p31 p31Var6) {
        this.f25126OooO00o = 2;
        this.f25127OooO0O0 = p31Var;
        this.f25128OooO0OO = p31Var2;
        this.f25129OooO0Oo = p31Var3;
        this.f25131OooO0o0 = c1982qp;
        this.f25130OooO0o = c1651hq;
        this.f25132OooO0oO = p31Var4;
        this.f25133OooO0oo = q31Var;
        this.f25125OooO = p31Var5;
        this.f25134OooOO0 = p31Var6;
    }

    public /* synthetic */ C2171vt(p31 p31Var, q31 q31Var, q31 q31Var2, p31 p31Var2, p31 p31Var3, v31 v31Var, v31 v31Var2, v31 v31Var3, p31 p31Var4, int i) {
        this.f25126OooO00o = i;
        this.f25127OooO0O0 = p31Var;
        this.f25131OooO0o0 = q31Var;
        this.f25130OooO0o = q31Var2;
        this.f25128OooO0OO = p31Var2;
        this.f25129OooO0Oo = p31Var3;
        this.f25132OooO0oO = v31Var;
        this.f25133OooO0oo = v31Var2;
        this.f25125OooO = v31Var3;
        this.f25134OooOO0 = p31Var4;
    }

    public C2171vt(p31 p31Var, v31 v31Var, p31 p31Var2, p31 p31Var3, C1876nu c1876nu, p31 p31Var4, p31 p31Var5, p31 p31Var6, p31 p31Var7) {
        this.f25126OooO00o = 6;
        this.f25127OooO0O0 = p31Var;
        this.f25132OooO0oO = v31Var;
        this.f25128OooO0OO = p31Var2;
        this.f25129OooO0Oo = p31Var3;
        this.f25131OooO0o0 = c1876nu;
        this.f25130OooO0o = p31Var4;
        this.f25133OooO0oo = p31Var5;
        this.f25125OooO = p31Var6;
        this.f25134OooOO0 = p31Var7;
    }

    public C2171vt(r31 r31Var, r31 r31Var2, r31 r31Var3, p31 p31Var, p31 p31Var2, p31 p31Var3, C1982qp c1982qp, p31 p31Var4, p31 p31Var5) {
        this.f25126OooO00o = 4;
        this.f25131OooO0o0 = r31Var;
        this.f25130OooO0o = r31Var2;
        this.f25132OooO0oO = r31Var3;
        this.f25127OooO0O0 = p31Var;
        this.f25128OooO0OO = p31Var2;
        this.f25129OooO0Oo = p31Var3;
        this.f25133OooO0oo = c1982qp;
        this.f25125OooO = p31Var4;
        this.f25134OooOO0 = p31Var5;
    }
}

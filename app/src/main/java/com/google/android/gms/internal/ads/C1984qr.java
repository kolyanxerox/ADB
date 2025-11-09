package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzu;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.qr */
/* loaded from: classes2.dex */
public final class C1984qr implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f23677OooO00o;

    /* renamed from: OooO0O0 */
    public final p31 f23678OooO0O0;

    /* renamed from: OooO0OO */
    public final z31 f23679OooO0OO;

    /* renamed from: OooO0Oo */
    public final v31 f23680OooO0Oo;

    /* renamed from: OooO0o */
    public final v31 f23681OooO0o;

    /* renamed from: OooO0o0 */
    public final Object f23682OooO0o0;

    public C1984qr(C1834mp c1834mp, p31 p31Var, zb0 zb0Var, zb0 zb0Var2, zb0 zb0Var3) {
        this.f23677OooO00o = 16;
        this.f23679OooO0OO = c1834mp;
        this.f23678OooO0O0 = p31Var;
        this.f23680OooO0Oo = zb0Var;
        this.f23682OooO0o0 = zb0Var2;
        this.f23681OooO0o = zb0Var3;
    }

    public BinderC1913ou OooO00o() {
        return new BinderC1913ou(((C1764kt) this.f23680OooO0Oo).OooO00o(), (String) ((C1764kt) this.f23682OooO0o0).f20673OooO0O0.f18243OooOoO0, (o60) this.f23678OooO0O0.zzb(), ((C1764kt) this.f23681OooO0o).f20673OooO0O0.OooO0o(), (String) ((p31) this.f23679OooO0OO).zzb());
    }

    public o50 OooO0O0() {
        return new o50(((C1834mp) this.f23679OooO0OO).OooO00o(), ((C1655hu) this.f23680OooO0Oo).zzb(), (m50) this.f23678OooO0O0.zzb(), ((C1866nk) this.f23682OooO0o0).OooO0O0(), ((C1760kp) this.f23681OooO0o).OooO00o());
    }

    public d70 OooO0OO() {
        AbstractC1837ms abstractC1837ms = (AbstractC1837ms) ((r31) this.f23682OooO0o0).f23738OooO00o;
        x60 x60VarOooO00o = ((b20) this.f23681OooO0o).OooO00o();
        C2098tu c2098tu = (C2098tu) this.f23678OooO0O0.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((p31) this.f23679OooO0OO).zzb();
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new d70(abstractC1837ms, x60VarOooO00o, c2098tu, scheduledExecutorService, c2163vl, (f20) ((p31) this.f23680OooO0Oo).zzb());
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f23677OooO00o) {
            case 0:
                return new C1947pr((C1823me) this.f23678OooO0O0.zzb(), (C1836mr) ((p31) this.f23679OooO0OO).zzb(), (Executor) ((p31) this.f23680OooO0Oo).zzb(), (C1799lr) ((p31) this.f23682OooO0o0).zzb(), (Oooo0OO.o00Ooo) ((p31) this.f23681OooO0o).zzb());
            case 1:
                return new C2133us(((C1834mp) this.f23679OooO0OO).OooO00o(), (InterfaceC1722jo) ((C1653hs) this.f23680OooO0Oo).f19846OooO0O0.f17045OooOoO, ((C1764kt) this.f23682OooO0o0).OooO00o(), ((C1982qp) this.f23681OooO0o).OooO00o(), (e60) this.f23678OooO0O0.zzb());
            case 2:
                return OooO00o();
            case 3:
                C1763ks c1763ks = (C1763ks) this.f23679OooO0OO;
                C2088tk c2088tk = new C2088tk(c1763ks.f20668OooO0O0.OooO00o(), c1763ks.f20669OooO0OO.OooO00o().f24955OooO0o);
                Context contextOooO00o = ((C1834mp) this.f23680OooO0Oo).OooO00o();
                C2162vk c2162vk = (C2162vk) this.f23678OooO0O0.zzb();
                InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) ((C1842mx) this.f23682OooO0o0).f21360OooO0O0.f25813OooOo;
                return new C2175vx(c2088tk, contextOooO00o, c2162vk, interfaceC1722jo == null ? null : interfaceC1722jo.OooOOo(), (EnumC2035s4) ((q31) this.f23681OooO0o).zzb());
            case 4:
                Map mapZzb = ((s31) this.f23679OooO0OO).zzb();
                Map mapZzb2 = ((s31) this.f23680OooO0Oo).zzb();
                Map mapZzb3 = ((s31) this.f23682OooO0o0).zzb();
                C2213wy c2213wy = (C2213wy) ((C2286yx) this.f23681OooO0o).f26035OooO0O0.f25815OooOo0o;
                ii0.Oooo000(c2213wy);
                return new C2212wx(mapZzb, mapZzb2, mapZzb3, this.f23678OooO0O0, c2213wy);
            case 5:
                Context contextOooO00o2 = ((C1834mp) this.f23679OooO0OO).OooO00o();
                String packageName = ((C1834mp) ((z31) ((C1651hq) this.f23680OooO0Oo).f19838OooO0O0)).OooO00o().getPackageName();
                ii0.Oooo000(packageName);
                VersionInfoParcel versionInfoParcelOooO00o = ((C1982qp) ((z31) this.f23682OooO0o0)).OooO00o();
                EnumC2035s4 enumC2035s4 = (EnumC2035s4) this.f23681OooO0o.zzb();
                String str = (String) this.f23678OooO0O0.zzb();
                C1998r4 c1998r4 = new C1998r4(new com.google.android.gms.internal.measurement.o0OOO00(contextOooO00o2, 3));
                C1703j5 c1703j5OooOoO = C1740k5.OooOoO();
                int i = versionInfoParcelOooO00o.buddyApkVersion;
                c1703j5OooOoO.OooO0Oo();
                C1740k5.OooOo0o((C1740k5) c1703j5OooOoO.f25822OooOo0o, i);
                int i2 = versionInfoParcelOooO00o.clientJarVersion;
                c1703j5OooOoO.OooO0Oo();
                C1740k5.OooOoO0((C1740k5) c1703j5OooOoO.f25822OooOo0o, i2);
                int i3 = true != versionInfoParcelOooO00o.isClientJar ? 2 : 0;
                c1703j5OooOoO.OooO0Oo();
                C1740k5.OooOo((C1740k5) c1703j5OooOoO.f25822OooOo0o, i3);
                c1998r4.OooO00o(new C1386ai(enumC2035s4, packageName, (C1740k5) c1703j5OooOoO.OooO0O0(), str));
                return c1998r4;
            case 6:
                Context contextOooO00o3 = ((C1834mp) this.f23680OooO0Oo).OooO00o();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                C2007rd c2007rd = new C2007rd(10);
                C2130up c2130up = (C2130up) ((C1945pp) this.f23682OooO0o0).f23397OooO0O0.f23738OooO00o;
                ii0.Oooo000(c2130up);
                return new d50(contextOooO00o3, c2163vl, c2007rd, c2130up, new wj0(((C1908op) ((C1651hq) this.f23681OooO0o).f19838OooO0O0).OooO00o(), 23), (ArrayDeque) this.f23678OooO0O0.zzb(), (nf0) ((p31) this.f23679OooO0OO).zzb());
            case 7:
                return OooO0O0();
            case 8:
                return new e60(((C1834mp) this.f23679OooO0OO).OooO00o(), ((C1982qp) this.f23680OooO0Oo).OooO00o(), ((C1764kt) this.f23682OooO0o0).OooO00o(), (InterfaceC1722jo) ((q31) this.f23681OooO0o).zzb(), (h20) this.f23678OooO0O0.zzb());
            case 9:
                return new c70((Context) this.f23678OooO0O0.zzb(), (Executor) ((p31) this.f23679OooO0OO).zzb(), (AbstractC1990qx) ((r31) this.f23681OooO0o).f23738OooO00o, (jd0) ((p31) this.f23680OooO0Oo).zzb(), (h20) ((p31) this.f23682OooO0o0).zzb());
            case 10:
                return OooO0OO();
            case 11:
                AbstractC2323zx abstractC2323zx = (AbstractC2323zx) ((r31) this.f23682OooO0o0).f23738OooO00o;
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                C1866nk c1866nk = (C1866nk) this.f23681OooO0o;
                ii0.Oooo000(c2163vl2);
                return new m70(abstractC2323zx, c2163vl2, new de0(c2163vl2, ((c00) c1866nk.f21500OooO0O0).zzb(), new C1548ey(5, c2163vl2, ((c00) ((C1651hq) c1866nk.f21501OooO0OO).f19838OooO0O0).zzb()), false, 18), (fe0) this.f23678OooO0O0.zzb(), (c10) ((p31) this.f23679OooO0OO).zzb(), (f20) ((p31) this.f23680OooO0Oo).zzb());
            case 12:
                return new t70((C2130up) ((r31) this.f23680OooO0Oo).f23738OooO00o, ((C1839mu) this.f23682OooO0o0).f21355OooO0O0.OooO00o(), ((C1841mw) this.f23681OooO0o).f21358OooO0O0, (x70) this.f23678OooO0O0.zzb(), (o60) ((p31) this.f23679OooO0OO).zzb());
            case 13:
                Oooo0OO.o00Ooo o00ooo2 = (Oooo0OO.o00Ooo) this.f23678OooO0O0.zzb();
                d20 d20Var = (d20) this.f23681OooO0o;
                de0 de0Var = new de0((ce0) d20Var.f18136OooO0O0.zzb(), (s10) d20Var.f18137OooO0OO.zzb(), (h20) d20Var.f18138OooO0Oo.zzb(), false, 23);
                o60 o60Var = (o60) ((p31) this.f23679OooO0OO).zzb();
                hg0 hg0Var = (hg0) ((p31) this.f23680OooO0Oo).zzb();
                x70 x70Var = (x70) ((sj0) this.f23682OooO0o0).f24094OooOo0o;
                return x70Var != null ? x70Var : new x70(o00ooo2, de0Var, o60Var, hg0Var);
            case 14:
                return new o80((Context) this.f23678OooO0O0.zzb(), (AbstractC1837ms) ((r31) this.f23682OooO0o0).f23738OooO00o, (gf0) ((p31) this.f23679OooO0OO).zzb(), (cq0) ((p31) this.f23680OooO0Oo).zzb(), (InterfaceC1779l7) ((q80) this.f23681OooO0o).f23544OooO0O0.f23242OooOo0o);
            case 15:
                return new y80((Context) this.f23678OooO0O0.zzb(), (zzbl) ((C2286yx) this.f23680OooO0Oo).f26035OooO0O0.f25813OooOo, ((C1876nu) this.f23682OooO0o0).OooO00o(), ((C1542es) ((C1651hq) this.f23681OooO0o).f19838OooO0O0).OooO00o(), (h20) ((p31) this.f23679OooO0OO).zzb());
            case 16:
                C1756kl c1756kl = new C1756kl();
                Context contextOooO00o4 = ((C1834mp) this.f23679OooO0OO).OooO00o();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f23678OooO0O0.zzb();
                C2163vl c2163vl3 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl3);
                return new sb0(c1756kl, contextOooO00o4, scheduledExecutorService, c2163vl3, ((zb0) this.f23680OooO0Oo).f26143OooO0O0.f13285OooOo0o, ((C2197wi) ((zb0) this.f23682OooO0o0).f26143OooO0O0.f13283OooOo).zzl, ((C2197wi) ((zb0) this.f23681OooO0o).f26143OooO0O0.f13283OooOo).zzk);
            case 17:
                C1978ql c1978ql = (C1978ql) this.f23678OooO0O0.zzb();
                boolean z = ((C2197wi) ((zb0) this.f23680OooO0Oo).f26143OooO0O0.f13283OooOo).zza.getBoolean("is_gbid");
                boolean z2 = ((C2197wi) ((zb0) this.f23682OooO0o0).f26143OooO0O0.f13283OooOo).zzk;
                C2163vl c2163vl4 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl4);
                ii0.Oooo000(((C2197wi) ((zb0) this.f23681OooO0o).f26143OooO0O0.f13283OooOo).zzd);
                return new bc0(c1978ql, z, z2, c2163vl4, (ScheduledExecutorService) ((p31) this.f23679OooO0OO).zzb());
            case 18:
                return new yc0((Context) ((r31) this.f23682OooO0o0).f23738OooO00o, (Executor) this.f23678OooO0O0.zzb(), (C2130up) ((r31) this.f23681OooO0o).f23738OooO00o, (c90) ((p31) this.f23679OooO0OO).zzb(), (bd0) ((p31) this.f23680OooO0Oo).zzb(), new ud0());
            default:
                Context contextOooO00o5 = ((C1834mp) this.f23682OooO0o0).OooO00o();
                C2163vl c2163vl5 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl5);
                return new hg0(contextOooO00o5, c2163vl5, (dq0) this.f23678OooO0O0.zzb(), (zzu) this.f23681OooO0o.zzb(), (eg0) ((p31) this.f23679OooO0OO).zzb(), (nf0) ((p31) this.f23680OooO0Oo).zzb());
        }
    }

    public C1984qr(C1764kt c1764kt, C1764kt c1764kt2, p31 p31Var, C1764kt c1764kt3, p31 p31Var2) {
        this.f23677OooO00o = 2;
        this.f23680OooO0Oo = c1764kt;
        this.f23682OooO0o0 = c1764kt2;
        this.f23678OooO0O0 = p31Var;
        this.f23681OooO0o = c1764kt3;
        this.f23679OooO0OO = p31Var2;
    }

    public C1984qr(p31 p31Var, p31 p31Var2, p31 p31Var3, p31 p31Var4, p31 p31Var5) {
        this.f23677OooO00o = 0;
        this.f23678OooO0O0 = p31Var;
        this.f23679OooO0OO = p31Var2;
        this.f23680OooO0Oo = p31Var3;
        this.f23682OooO0o0 = p31Var4;
        this.f23681OooO0o = p31Var5;
    }

    public C1984qr(p31 p31Var, p31 p31Var2, r31 r31Var, p31 p31Var3, p31 p31Var4) {
        this.f23677OooO00o = 9;
        this.f23678OooO0O0 = p31Var;
        this.f23679OooO0OO = p31Var2;
        this.f23681OooO0o = r31Var;
        this.f23680OooO0Oo = p31Var3;
        this.f23682OooO0o0 = p31Var4;
    }

    public /* synthetic */ C1984qr(p31 p31Var, q31 q31Var, q31 q31Var2, q31 q31Var3, p31 p31Var2, int i) {
        this.f23677OooO00o = i;
        this.f23678OooO0O0 = p31Var;
        this.f23680OooO0Oo = q31Var;
        this.f23682OooO0o0 = q31Var2;
        this.f23681OooO0o = q31Var3;
        this.f23679OooO0OO = p31Var2;
    }

    public C1984qr(p31 p31Var, r31 r31Var, p31 p31Var2, p31 p31Var3, q80 q80Var) {
        this.f23677OooO00o = 14;
        this.f23678OooO0O0 = p31Var;
        this.f23682OooO0o0 = r31Var;
        this.f23679OooO0OO = p31Var2;
        this.f23680OooO0Oo = p31Var3;
        this.f23681OooO0o = q80Var;
    }

    public /* synthetic */ C1984qr(q31 q31Var, q31 q31Var2, p31 p31Var, q31 q31Var3, q31 q31Var4, int i) {
        this.f23677OooO00o = i;
        this.f23679OooO0OO = q31Var;
        this.f23680OooO0Oo = q31Var2;
        this.f23678OooO0O0 = p31Var;
        this.f23682OooO0o0 = q31Var3;
        this.f23681OooO0o = q31Var4;
    }

    public /* synthetic */ C1984qr(q31 q31Var, q31 q31Var2, q31 q31Var3, p31 p31Var, p31 p31Var2, int i) {
        this.f23677OooO00o = i;
        this.f23680OooO0Oo = q31Var;
        this.f23682OooO0o0 = q31Var2;
        this.f23681OooO0o = q31Var3;
        this.f23678OooO0O0 = p31Var;
        this.f23679OooO0OO = p31Var2;
    }

    public /* synthetic */ C1984qr(r31 r31Var, q31 q31Var, p31 p31Var, p31 p31Var2, p31 p31Var3, int i) {
        this.f23677OooO00o = i;
        this.f23682OooO0o0 = r31Var;
        this.f23681OooO0o = q31Var;
        this.f23678OooO0O0 = p31Var;
        this.f23679OooO0OO = p31Var2;
        this.f23680OooO0Oo = p31Var3;
    }

    public C1984qr(s31 s31Var, s31 s31Var2, s31 s31Var3, p31 p31Var, C2286yx c2286yx) {
        this.f23677OooO00o = 4;
        this.f23679OooO0OO = s31Var;
        this.f23680OooO0Oo = s31Var2;
        this.f23682OooO0o0 = s31Var3;
        this.f23678OooO0O0 = p31Var;
        this.f23681OooO0o = c2286yx;
    }

    public /* synthetic */ C1984qr(z31 z31Var, q31 q31Var, z31 z31Var2, v31 v31Var, p31 p31Var, int i) {
        this.f23677OooO00o = i;
        this.f23679OooO0OO = z31Var;
        this.f23680OooO0Oo = q31Var;
        this.f23682OooO0o0 = z31Var2;
        this.f23681OooO0o = v31Var;
        this.f23678OooO0O0 = p31Var;
    }

    public /* synthetic */ C1984qr(Object obj, p31 p31Var, v31 v31Var, p31 p31Var2, p31 p31Var3, int i) {
        this.f23677OooO00o = i;
        this.f23682OooO0o0 = obj;
        this.f23678OooO0O0 = p31Var;
        this.f23681OooO0o = v31Var;
        this.f23679OooO0OO = p31Var2;
        this.f23680OooO0Oo = p31Var3;
    }
}

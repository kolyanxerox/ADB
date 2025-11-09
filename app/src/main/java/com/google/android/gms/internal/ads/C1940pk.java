package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pk */
/* loaded from: classes2.dex */
public final class C1940pk implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f23360OooO00o;

    /* renamed from: OooO0O0 */
    public final v31 f23361OooO0O0;

    /* renamed from: OooO0OO */
    public final v31 f23362OooO0OO;

    /* renamed from: OooO0Oo */
    public final v31 f23363OooO0Oo;

    public /* synthetic */ C1940pk(v31 v31Var, v31 v31Var2, v31 v31Var3, int i) {
        this.f23360OooO00o = i;
        this.f23361OooO0O0 = v31Var;
        this.f23362OooO0OO = v31Var2;
        this.f23363OooO0Oo = v31Var3;
    }

    public m90 OooO00o() {
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new m90(c2163vl, (Object) ((C1834mp) this.f23361OooO0O0).OooO00o(), (Object) ((C1876nu) this.f23362OooO0OO).OooO00o(), ((wj0) ((C1651hq) this.f23363OooO0Oo).f19838OooO0O0).f25318OooOo0o, 0);
    }

    public m90 OooO0O0() {
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new m90(c2163vl, ((p31) this.f23361OooO0O0).zzb(), (Object) ((C1876nu) this.f23362OooO0OO).OooO00o(), this.f23363OooO0Oo.zzb(), 3);
    }

    public m90 OooO0OO() {
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new m90((Object) c2163vl, ((wj0) ((C1651hq) this.f23361OooO0O0).f19838OooO0O0).f25318OooOo0o, ((p31) this.f23362OooO0OO).zzb(), (Object) ((x31) this.f23363OooO0Oo).zzb(), 4);
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        String string;
        Set setSingleton;
        switch (this.f23360OooO00o) {
            case 0:
                zzg zzgVar = (zzg) ((r31) this.f23362OooO0OO).f23738OooO00o;
                return new C1904ok(zzgVar);
            case 1:
                VersionInfoParcel versionInfoParcelOooO00o = ((C1982qp) this.f23361OooO0O0).OooO00o();
                JSONObject jSONObject = (JSONObject) ((p31) this.f23362OooO0OO).zzb();
                String str = (String) ((q31) this.f23363OooO0Oo).zzb();
                boolean zEquals = IronSourceConstants.EVENTS_NATIVE.equals(str);
                zzv.zzq();
                return new C1408b3(UUID.randomUUID().toString(), versionInfoParcelOooO00o, str, jSONObject, zEquals);
            case 2:
                return new C1800ls((InterfaceC1722jo) ((C1653hs) this.f23361OooO0O0).f19846OooO0O0.f17045OooOoO, (h20) ((p31) this.f23362OooO0OO).zzb(), ((C1764kt) this.f23363OooO0Oo).OooO00o());
            case 3:
                return ((C1876nu) this.f23361OooO0O0).OooO00o().OooO00o() != null ? ((C1984qr) this.f23362OooO0OO).OooO0OO() : ((b20) this.f23363OooO0Oo).OooO00o();
            case 4:
                return true == ((C1874ns) this.f23361OooO0O0).OooO00o().booleanValue() ? ((C1542es) this.f23362OooO0OO).OooO0O0() : ((C2280yr) this.f23363OooO0Oo).OooO00o();
            case 5:
                return new C2170vs(((C1764kt) this.f23361OooO0O0).OooO00o(), (C2320zu) ((p31) this.f23362OooO0OO).zzb(), (C1803lv) ((p31) this.f23363OooO0Oo).zzb());
            case 6:
                Oooo0OO.o00Ooo o00ooo2 = (Oooo0OO.o00Ooo) ((p31) this.f23361OooO0O0).zzb();
                C2052sl c2052slZzb = ((C2019rp) this.f23362OooO0OO).zzb();
                String str2 = ((C1876nu) this.f23363OooO0Oo).OooO00o().f24955OooO0o;
                C2249xx c2249xx = c2052slZzb.f24104OooO0OO;
                synchronized (c2249xx) {
                    string = ((BigInteger) c2249xx.f25815OooOo0o).toString();
                    c2249xx.f25815OooOo0o = ((BigInteger) c2249xx.f25815OooOo0o).add(BigInteger.ONE);
                    c2249xx.f25813OooOo = string;
                }
                return new C1830ml(o00ooo2, c2052slZzb, string, str2);
            case 7:
                return new C1398au((Context) ((p31) this.f23361OooO0O0).zzb(), ((C1982qp) this.f23362OooO0OO).OooO00o(), ((C1876nu) this.f23363OooO0Oo).OooO00o(), 0);
            case 8:
                Context context = (Context) ((p31) this.f23361OooO0O0).zzb();
                VersionInfoParcel versionInfoParcelOooO00o2 = ((C1982qp) this.f23362OooO0OO).OooO00o();
                kd0 kd0VarOooO00o = ((C1764kt) this.f23363OooO0Oo).OooO00o();
                C1755kk c1755kk = kd0VarOooO00o.f20510OooOoOO;
                if (c1755kk == null) {
                    return null;
                }
                od0 od0Var = kd0VarOooO00o.f20503OooOOoo;
                return new C1718jk(context, versionInfoParcelOooO00o2, c1755kk, od0Var != null ? od0Var.f22974OooO0O0 : null);
            case 9:
                C2209wu c2209wu = new C2209wu(((C1987qu) this.f23361OooO0O0).f23701OooO0O0.zzb());
                Set setZzb = ((x31) this.f23362OooO0OO).zzb();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new C2246xu(c2209wu, setZzb, c2163vl, (ScheduledExecutorService) ((p31) this.f23363OooO0Oo).zzb());
            case 10:
                return new C2285yw((Context) ((p31) this.f23361OooO0O0).zzb(), ((x31) this.f23362OooO0OO).zzb(), ((C1764kt) this.f23363OooO0Oo).OooO00o());
            case 11:
                C2065sy c2065syOooO00o = ((C1651hq) this.f23361OooO0O0).OooO00o();
                C2102ty c2102ty = (C2102ty) ((C1916ox) this.f23362OooO0OO).f23137OooO0O0.zzb();
                ii0.Oooo000(c2102ty);
                Executor executor = (Executor) ((p31) this.f23363OooO0Oo).zzb();
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                return new C1918oz(c2065syOooO00o, c2102ty, executor, c2163vl2);
            case 12:
                int i = ((C1876nu) this.f23363OooO0Oo).OooO00o().f24963OooOOOO.f13884OooOo0o;
                if (i != 0) {
                    return i + (-1) != 0 ? ((C2280yr) this.f23362OooO0OO).OooO00o() : ((C2280yr) this.f23361OooO0O0).OooO00o();
                }
                throw null;
            case 13:
                String str3 = ((C2197wi) ((zb0) this.f23361OooO0O0).f26143OooO0O0.f13283OooOo).zzh;
                ii0.Oooo000(str3);
                Context contextOooO00o = ((C1834mp) this.f23362OooO0OO).OooO00o();
                C2163vl c2163vl3 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl3);
                Map mapZzb = ((s31) this.f23363OooO0Oo).zzb();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0o0o)).booleanValue()) {
                    C1998r4 c1998r4 = new C1998r4(new com.google.android.gms.internal.measurement.o0OOO00(contextOooO00o, 3));
                    synchronized (c1998r4) {
                        if (c1998r4.f23741OooO0OO) {
                            try {
                                C1889o6 c1889o6 = c1998r4.f23740OooO0O0;
                                c1889o6.OooO0Oo();
                                C1926p6.OooOoo((C1926p6) c1889o6.f25822OooOo0o, str3);
                            } catch (NullPointerException e) {
                                zzv.zzp().OooO0oo("AdMobClearcutLogger.modify", e);
                            }
                        }
                    }
                    setSingleton = Collections.singleton(new C2248xw(new z10(c1998r4, mapZzb), c2163vl3));
                } else {
                    setSingleton = Collections.EMPTY_SET;
                }
                ii0.Oooo000(setSingleton);
                return setSingleton;
            case 14:
                return new j20((f20) ((p31) this.f23361OooO0O0).zzb(), ((x31) this.f23362OooO0OO).zzb(), (Oooo0OO.o00Ooo) ((p31) this.f23363OooO0Oo).zzb());
            case 15:
                return new i30((p30) ((p31) this.f23361OooO0O0).zzb(), ((C1876nu) this.f23362OooO0OO).OooO00o(), (String) ((p31) this.f23363OooO0Oo).zzb());
            case 16:
                Context contextOooO00o2 = ((C1834mp) this.f23361OooO0O0).OooO00o();
                WeakReference weakReference = ((C1871np) this.f23362OooO0OO).f21563OooO0O0.f20082OooO0Oo;
                ii0.Oooo000(weakReference);
                q30 q30Var = (q30) ((p31) this.f23363OooO0Oo).zzb();
                C2163vl c2163vl4 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl4);
                return new x30(contextOooO00o2, weakReference, q30Var, c2163vl4);
            case 17:
                return OooO00o();
            case 18:
                return OooO0O0();
            case 19:
                C1797lp c1797lp = (C1797lp) this.f23361OooO0O0;
                C2163vl c2163vl5 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl5);
                z90 z90Var = new z90(c2163vl5, c1797lp.f20919OooO0O0.OooO00o(), 2);
                Oooo0OO.o00Ooo o00ooo3 = (Oooo0OO.o00Ooo) ((p31) this.f23362OooO0OO).zzb();
                ii0.Oooo000(c2163vl5);
                return new ma0(z90Var, ((Long) AbstractC2297z7.f26107OooO0OO.OooOOO()).longValue(), o00ooo3, c2163vl5, (h20) ((p31) this.f23363OooO0Oo).zzb());
            case 20:
                Context contextOooO00o3 = ((C1797lp) this.f23361OooO0O0).f20919OooO0O0.OooO00o();
                C2163vl c2163vl6 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl6);
                z90 z90Var2 = new z90(contextOooO00o3, c2163vl6, 6);
                Oooo0OO.o00Ooo o00ooo4 = (Oooo0OO.o00Ooo) ((p31) this.f23362OooO0OO).zzb();
                ii0.Oooo000(c2163vl6);
                return new ma0(z90Var2, 2147483647L, o00ooo4, c2163vl6, (h20) ((p31) this.f23363OooO0Oo).zzb());
            case 21:
                C1797lp c1797lp2 = (C1797lp) this.f23361OooO0O0;
                C2163vl c2163vl7 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl7);
                z90 z90Var3 = new z90(c2163vl7, c1797lp2.f20919OooO0O0.OooO00o(), 7);
                Oooo0OO.o00Ooo o00ooo5 = (Oooo0OO.o00Ooo) ((p31) this.f23362OooO0OO).zzb();
                ii0.Oooo000(c2163vl7);
                return new ma0(z90Var3, ((Long) AbstractC2297z7.f26108OooO0Oo.OooOOO()).longValue(), o00ooo5, c2163vl7, (h20) ((p31) this.f23363OooO0Oo).zzb());
            case 22:
                o90 o90VarOooO00o = ((o20) this.f23361OooO0O0).OooO00o();
                Oooo0OO.o00Ooo o00ooo6 = (Oooo0OO.o00Ooo) ((p31) this.f23362OooO0OO).zzb();
                C2163vl c2163vl8 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl8);
                return new ma0(o90VarOooO00o, ((Long) AbstractC2297z7.f26105OooO00o.OooOOO()).longValue(), o00ooo6, c2163vl8, (h20) ((p31) this.f23363OooO0Oo).zzb());
            case 23:
                o90 o90VarOooO00o2 = ((C1622gy) this.f23361OooO0O0).OooO00o();
                Oooo0OO.o00Ooo o00ooo7 = (Oooo0OO.o00Ooo) ((p31) this.f23362OooO0OO).zzb();
                C2163vl c2163vl9 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl9);
                return new ma0(o90VarOooO00o2, 2147483647L, o00ooo7, c2163vl9, (h20) ((p31) this.f23363OooO0Oo).zzb());
            case 24:
                z90 z90VarOooO0O0 = ((C1797lp) this.f23361OooO0O0).OooO0O0();
                Oooo0OO.o00Ooo o00ooo8 = (Oooo0OO.o00Ooo) ((p31) this.f23362OooO0OO).zzb();
                C2163vl c2163vl10 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl10);
                return new ma0(z90VarOooO0O0, ((Long) AbstractC2297z7.f26106OooO0O0.OooOOO()).longValue(), o00ooo8, c2163vl10, (h20) ((p31) this.f23363OooO0Oo).zzb());
            case 25:
                o90 o90VarOooO0O0 = ((C1908op) this.f23361OooO0O0).OooO0O0();
                Oooo0OO.o00Ooo o00ooo9 = (Oooo0OO.o00Ooo) ((p31) this.f23362OooO0OO).zzb();
                C2163vl c2163vl11 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl11);
                return new ma0(o90VarOooO0O0, ((Long) AbstractC2297z7.f26110OooO0o0.OooOOO()).longValue(), o00ooo9, c2163vl11, (h20) ((p31) this.f23363OooO0Oo).zzb());
            case 26:
                m90 m90VarOooO0O0 = ((ab0) this.f23361OooO0O0).OooO0O0();
                Oooo0OO.o00Ooo o00ooo10 = (Oooo0OO.o00Ooo) ((p31) this.f23362OooO0OO).zzb();
                C2163vl c2163vl12 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl12);
                return new ma0(m90VarOooO0O0, ((Long) AbstractC2297z7.f26111OooO0oO.OooOOO()).longValue(), o00ooo10, c2163vl12, (h20) ((p31) this.f23363OooO0Oo).zzb());
            case 27:
                z90 z90VarOooO0Oo = ((C1797lp) this.f23361OooO0O0).OooO0Oo();
                Oooo0OO.o00Ooo o00ooo11 = (Oooo0OO.o00Ooo) ((p31) this.f23362OooO0OO).zzb();
                C2163vl c2163vl13 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl13);
                return new ma0(z90VarOooO0Oo, ((Long) AbstractC2297z7.f26112OooO0oo.OooOOO()).longValue(), o00ooo11, c2163vl13, (h20) ((p31) this.f23363OooO0Oo).zzb());
            case 28:
                return OooO0OO();
            default:
                C2163vl c2163vl14 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl14);
                return new m90((Object) c2163vl14, (Object) ((C1876nu) this.f23361OooO0O0).OooO00o(), ((p31) this.f23362OooO0OO).zzb(), (Object) ((C1760kp) this.f23363OooO0Oo).OooO00o(), 5);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zza;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hq */
/* loaded from: classes2.dex */
public final class C1651hq implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f19837OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f19838OooO0O0;

    public /* synthetic */ C1651hq(Object obj, int i) {
        this.f19837OooO00o = i;
        this.f19838OooO0O0 = obj;
    }

    public static zza OooO0O0() {
        return new zza(new C1464cn(), new C1906om());
    }

    public C2065sy OooO00o() {
        C2065sy c2065sy = (C2065sy) ((wj0) this.f19838OooO0O0).f25318OooOo0o;
        ii0.Oooo000(c2065sy);
        return c2065sy;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        Object tn0Var;
        Object obj = this.f19838OooO0O0;
        switch (this.f19837OooO00o) {
            case 0:
                return OooO0O0();
            case 1:
                return new C2131uq(new h60(((C1797lp) obj).f20919OooO0O0.OooO00o()), 0);
            case 2:
                C2051sk c2051skOooOo00 = C2051sk.OooOo00(((C1797lp) obj).f20919OooO0O0.OooO00o());
                return new C2168vq(new C2249xx(19, (Oooo0OO.o00Ooo) c2051skOooOo00.f24098OooOo0o, (C1904ok) ((p31) c2051skOooOo00.f24100OooOoO0).zzb()), 1);
            case 3:
                return (FrameLayout) ((wj0) obj).f25318OooOo0o;
            case 4:
                return ((C1542es) obj).OooO00o();
            case 5:
                C1940pk c1940pk = (C1940pk) obj;
                return new C2248xw(new C1800ls((InterfaceC1722jo) ((C1653hs) c1940pk.f23361OooO0O0).f19846OooO0O0.f17045OooOoO, (h20) ((p31) c1940pk.f23362OooO0OO).zzb(), ((C1764kt) c1940pk.f23363OooO0Oo).OooO00o()), AbstractC2200wl.f25321OooO00o);
            case 6:
                C1866nk c1866nk = (C1866nk) obj;
                C1985qs c1985qs = new C1985qs((InterfaceC1722jo) ((C1653hs) c1866nk.f21500OooO0O0).f19846OooO0O0.f17045OooOoO, (Executor) ((p31) c1866nk.f21501OooO0OO).zzb());
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O00o)).booleanValue()) {
                    C2248xw c2248xw = new C2248xw(c1985qs, AbstractC2200wl.f25321OooO00o);
                    int i = um0.f24660OooOo;
                    tn0Var = new tn0(c2248xw);
                } else {
                    int i2 = um0.f24660OooOo;
                    tn0Var = nn0.f21519OooOooo;
                }
                ii0.Oooo000(tn0Var);
                return tn0Var;
            case 7:
                return new C2248xw(new C1616gs((C2099tv) ((C2244xs) obj).f25791OooO0O0.f25815OooOo0o, 0), AbstractC2200wl.f25327OooO0oO);
            case 8:
                C1763ks c1763ks = (C1763ks) obj;
                return new C2281ys(new C2088tk(c1763ks.f20668OooO0O0.OooO00o(), c1763ks.f20669OooO0OO.OooO00o().f24955OooO0o));
            case 9:
                return new C1470ct(((s31) obj).zzb());
            case 10:
                return ((C2021rr) obj).OooO00o();
            case 11:
                C2213wy c2213wy = (C2213wy) ((C2286yx) obj).f26035OooO0O0.f25815OooOo0o;
                ii0.Oooo000(c2213wy);
                Set setSingleton = c2213wy.f25424OooO0Oo != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                ii0.Oooo000(setSingleton);
                return setSingleton;
            case 12:
                C2102ty c2102ty = (C2102ty) ((C1916ox) obj).f23137OooO0O0.zzb();
                ii0.Oooo000(c2102ty);
                JSONObject jSONObject = c2102ty.f24527OooO0O0;
                if (jSONObject != null) {
                    return jSONObject;
                }
                try {
                    return new JSONObject(c2102ty.f24790OooO00o.f20508OooOoO);
                } catch (JSONException unused) {
                    return null;
                }
            case 13:
                BinderC1695iy binderC1695iy = new BinderC1695iy(((C1732jy) obj).f20401OooO0O0.OooO00o());
                C1991qy c1991qy = new C1991qy();
                c1991qy.f23708OooO00o = binderC1695iy;
                return c1991qy;
            case 14:
                C2065sy c2065sy = (C2065sy) ((wj0) obj).f25318OooOo0o;
                ii0.Oooo000(c2065sy);
                return c2065sy;
            case 15:
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new C1548ey(5, c2163vl, ((c00) obj).zzb());
            case 16:
                return new C2316zq((InterfaceC1722jo) ((q31) obj).zzb(), 1);
            case 17:
                return new C2248xw(new C2316zq((InterfaceC1722jo) ((q31) ((C1651hq) obj).f19838OooO0O0).zzb(), 1), AbstractC2200wl.f25325OooO0o);
            case 18:
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                C1866nk c1866nk2 = (C1866nk) obj;
                Set setSingleton2 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00o0o0o)).booleanValue() ? Collections.singleton(new C2248xw(new z10((C1998r4) ((p31) c1866nk2.f21500OooO0O0).zzb(), ((s31) c1866nk2.f21501OooO0OO).zzb()), c2163vl2)) : Collections.EMPTY_SET;
                ii0.Oooo000(setSingleton2);
                return setSingleton2;
            case 19:
                C1908op c1908op = (C1908op) obj;
                s40 s40Var = new s40(c1908op.f23075OooO0O0.OooO00o(), (C2162vk) c1908op.f23076OooO0OO.zzb());
                C2163vl c2163vl3 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl3);
                return new C2248xw(s40Var, c2163vl3);
            case 20:
                String packageName = ((C1834mp) ((z31) obj)).OooO00o().getPackageName();
                ii0.Oooo000(packageName);
                return packageName;
            case 21:
                return new wj0(((C1908op) obj).OooO00o(), 23);
            case 22:
                C1866nk c1866nk3 = (C1866nk) obj;
                m50 m50Var = (m50) ((p31) c1866nk3.f21500OooO0O0).zzb();
                C1866nk c1866nk4 = (C1866nk) c1866nk3.f21501OooO0OO;
                z10 z10Var = new z10(m50Var, new n50(((C1866nk) c1866nk4.f21500OooO0O0).OooO0O0(), ((C1760kp) c1866nk4.f21501OooO0OO).OooO00o()));
                C2163vl c2163vl4 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl4);
                return new C2248xw(z10Var, c2163vl4);
            case 23:
                return new k90(((C1839mu) obj).f21355OooO0O0.f20955OooO0OO, 5);
            default:
                ii0.Oooo000(AbstractC2200wl.f25321OooO00o);
                ii0.Oooo000(((C2197wi) ((zb0) obj).f26143OooO0O0.f13283OooOo).zzd);
                return new yb0();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d50 extends AbstractBinderC2181w2 implements InterfaceC1902oi {

    /* renamed from: OooOo, reason: collision with root package name */
    public final wj0 f18158OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f18159OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C2163vl f18160OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final ArrayDeque f18161OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final C2130up f18162OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final nf0 f18163OooOoOO;

    public d50(Context context, C2163vl c2163vl, C2007rd c2007rd, C2130up c2130up, wj0 wj0Var, ArrayDeque arrayDeque, nf0 nf0Var) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        AbstractC1448c7.OooO00o(context);
        this.f18159OooOo0O = context;
        this.f18160OooOo0o = c2163vl;
        this.f18158OooOo = wj0Var;
        this.f18162OooOoO0 = c2130up;
        this.f18161OooOoO = arrayDeque;
        this.f18163OooOoOO = nf0Var;
    }

    public static df0 o000OO00(df0 df0Var, gf0 gf0Var, C1602ge c1602ge, mf0 mf0Var, jf0 jf0Var) {
        C1676ie c1676ieOooO00o = c1602ge.OooO00o("AFMA_getAdDictionary", AbstractC1565fe.f18933OooO0O0, new C1658hx(8, (byte) 0));
        af0.OoooO00(df0Var, jf0Var);
        df0 df0VarOooO00o = gf0Var.OooO00o(ef0.BUILD_URL, df0Var).OooOO0(c1676ieOooO00o).OooO00o();
        if (!((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue()) {
            return df0VarOooO00o;
        }
        tp0 tp0VarOooOOo = tp0.OooOOo(df0VarOooO00o);
        C1548ey c1548ey = new C1548ey(23, mf0Var, jf0Var);
        tp0VarOooOOo.addListener(new wp0(0, tp0VarOooOOo, c1548ey), AbstractC2200wl.f25327OooO0oO);
        return df0VarOooO00o;
    }

    public static void o000OO0o(o00000oO.OooOOO oooOOO, InterfaceC2049si interfaceC2049si, C2197wi c2197wi) {
        dp0 dp0VarOoOO = ii0.ooOO(oooOOO, new C2094tq(8), AbstractC2200wl.f25321OooO00o);
        C1548ey c1548ey = new C1548ey(9, c2197wi, interfaceC2049si);
        dp0VarOoOO.addListener(new wp0(0, dp0VarOoOO, c1548ey), AbstractC2200wl.f25327OooO0oO);
    }

    public static df0 o0OoO0o(C2197wi c2197wi, gf0 gf0Var, C2051sk c2051sk) {
        C1786le c1786le = new C1786le(7, c2051sk, c2197wi);
        return gf0Var.OooO00o(ef0.GMS_SIGNALS, ii0.OooooOO(c2197wi.zza)).OooOO0(c1786le).OooO0oO(new C1658hx(7, (byte) 0)).OooO00o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1902oi
    public final void OoooOo0(String str, InterfaceC2049si interfaceC2049si) {
        o000OO0o(o000O0oo(str), interfaceC2049si, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1902oi
    public final void o00000o0(C2197wi c2197wi, InterfaceC2049si interfaceC2049si) {
        o000OO0o(o000O0O0(c2197wi, Binder.getCallingUid()), interfaceC2049si, c2197wi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1902oi
    public final void o0000O(C2197wi c2197wi, InterfaceC2049si interfaceC2049si) {
        Bundle bundle;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue() && (bundle = c2197wi.zzm) != null) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), bundle, "service-connected");
        }
        df0 df0VarO000O0o0 = o000O0o0(c2197wi, Binder.getCallingUid());
        o000OO0o(df0VarO000O0o0, interfaceC2049si, c2197wi);
        if (((Boolean) AbstractC1633h8.f19645OooO0o0.OooOOO()).booleanValue()) {
            wj0 wj0Var = this.f18158OooOo;
            Objects.requireNonNull(wj0Var);
            df0VarO000O0o0.addListener(new b30(wj0Var, 3), this.f18160OooOo0o);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1902oi
    public final void o0000OOo(C2197wi c2197wi, InterfaceC2049si interfaceC2049si) {
        Bundle bundle;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17849o000oo0O)).booleanValue() && (bundle = c2197wi.zzm) != null) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOo0O((Oooo0OO.oo000o) zzv.zzC(), bundle, "service-connected");
        }
        o000OO0o(o000O0oO(c2197wi, Binder.getCallingUid()), interfaceC2049si, c2197wi);
    }

    public final synchronized b50 o000O(String str) {
        Iterator it = this.f18161OooOoO.iterator();
        while (it.hasNext()) {
            b50 b50Var = (b50) it.next();
            if (b50Var.f17371OooO0OO.equals(str)) {
                it.remove();
                return b50Var;
            }
        }
        return null;
    }

    public final o00000oO.OooOOO o000O0O0(final C2197wi c2197wi, int i) {
        if (!((Boolean) AbstractC1891o8.f22356OooO00o.OooOOO()).booleanValue()) {
            return ii0.Ooooo00(new Exception("Split request is disabled."));
        }
        ne0 ne0Var = c2197wi.zzi;
        if (ne0Var == null) {
            return ii0.Ooooo00(new Exception("Pool configuration missing from request."));
        }
        if (ne0Var.zzc == 0 || ne0Var.zzd == 0) {
            return ii0.Ooooo00(new Exception("Caching is disabled."));
        }
        C1419be c1419beZzg = zzv.zzg();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        nf0 nf0Var = this.f18163OooOoOO;
        Context context = this.f18159OooOo0O;
        C1602ge c1602geOooO0O0 = c1419beZzg.OooO0O0(context, versionInfoParcelForPackage, nf0Var);
        C2130up c2130up = this.f18162OooOoO0;
        c2130up.getClass();
        C2051sk c2051sk = new C2051sk(c2130up.f24676OooO0O0, new OooO0oO.Oooo0(c2197wi, i, 5));
        gf0 gf0Var = (gf0) ((p31) c2051sk.f24100OooOoO0).zzb();
        final df0 df0VarO0OoO0o = o0OoO0o(c2197wi, gf0Var, c2051sk);
        mf0 mf0Var = (mf0) ((p31) c2051sk.f24096OooOo).zzb();
        final jf0 jf0VarOooO0oO = ze0.OooO0oO(context, 9);
        final df0 df0VarO000OO00 = o000OO00(df0VarO0OoO0o, gf0Var, c1602geOooO0O0, mf0Var, jf0VarOooO0oO);
        ef0 ef0Var = ef0.GET_URL_AND_CACHE_KEY;
        List listAsList = Arrays.asList(df0VarO0OoO0o, df0VarO000OO00);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.z40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                d50 d50Var = this.f26078OooOo0O;
                df0 df0Var = df0VarO000OO00;
                df0 df0Var2 = df0VarO0OoO0o;
                C2197wi c2197wi2 = c2197wi;
                jf0 jf0Var = jf0VarOooO0oO;
                d50Var.getClass();
                String str = ((C2234xi) df0Var.f18244OooOo.get()).f25627OooO;
                b50 b50Var = new b50((C2234xi) df0Var.f18244OooOo.get(), (JSONObject) df0Var2.f18244OooOo.get(), c2197wi2.zzh, jf0Var);
                synchronized (d50Var) {
                    synchronized (d50Var) {
                        int iIntValue = ((Long) AbstractC1891o8.f22357OooO0O0.OooOOO()).intValue();
                        while (d50Var.f18161OooOoO.size() >= iIntValue) {
                            d50Var.f18161OooOoO.removeFirst();
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                d50Var.f18161OooOoO.addLast(b50Var);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        pm0 pm0Var = rm0.f23913OooOo0o;
        listAsList.getClass();
        rm0 rm0VarOooOOOO = rm0.OooOOOO(listAsList);
        CallableC2074t6 callableC2074t6 = new CallableC2074t6(6);
        C2163vl c2163vl = AbstractC2200wl.f25327OooO0oO;
        pp0 pp0Var = new pp0(rm0VarOooOOOO, true, false);
        pp0Var.f23398Oooo0OO = new op0(pp0Var, callableC2074t6, c2163vl);
        pp0Var.OooOo0o();
        pp0 pp0Var2 = new pp0(rm0VarOooOOOO, true, false);
        pp0Var2.f23398Oooo0OO = new op0(pp0Var2, callable, gf0Var.f19332OooO00o);
        pp0Var2.OooOo0o();
        return new s20(gf0Var, ef0Var, null, pp0Var, listAsList, pp0Var2).OooO00o();
    }

    public final df0 o000O0o0(C2197wi c2197wi, int i) {
        b50 b50VarO000O;
        df0 df0VarOooO00o;
        int i2 = 10;
        C1419be c1419beZzg = zzv.zzg();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        Context context = this.f18159OooOo0O;
        C1602ge c1602geOooO0O0 = c1419beZzg.OooO0O0(context, versionInfoParcelForPackage, this.f18163OooOoOO);
        C2130up c2130up = this.f18162OooOoO0;
        c2130up.getClass();
        C2051sk c2051sk = new C2051sk(c2130up.f24676OooO0O0, new OooO0oO.Oooo0(c2197wi, i, 5));
        C1676ie c1676ieOooO00o = c1602geOooO0O0.OooO00o("google.afma.response.normalize", c50.f17693OooO0Oo, AbstractC1565fe.f18934OooO0OO);
        if (((Boolean) AbstractC1891o8.f22356OooO00o.OooOOO()).booleanValue()) {
            b50VarO000O = o000O(c2197wi.zzh);
            if (b50VarO000O == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = c2197wi.zzj;
            b50VarO000O = null;
            if (str != null && !str.isEmpty()) {
                zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        jf0 jf0VarOooO0oO = b50VarO000O == null ? ze0.OooO0oO(context, 9) : b50VarO000O.f17372OooO0Oo;
        mf0 mf0Var = (mf0) ((p31) c2051sk.f24096OooOo).zzb();
        mf0Var.OooO0Oo(c2197wi.zza.getStringArrayList("ad_types"));
        h50 h50Var = new h50(c2197wi.zzg, mf0Var, jf0VarOooO0oO);
        C1548ey c1548ey = new C1548ey(i2, context, c2197wi.zzb.afmaVersion);
        gf0 gf0Var = (gf0) ((p31) c2051sk.f24100OooOoO0).zzb();
        jf0 jf0VarOooO0oO2 = ze0.OooO0oO(context, 11);
        ef0 ef0Var = ef0.PRE_PROCESS;
        ef0 ef0Var2 = ef0.HTTP;
        if (b50VarO000O == null) {
            df0 df0VarO0OoO0o = o0OoO0o(c2197wi, gf0Var, c2051sk);
            df0 df0VarO000OO00 = o000OO00(df0VarO0OoO0o, gf0Var, c1602geOooO0O0, mf0Var, jf0VarOooO0oO);
            jf0 jf0VarOooO0oO3 = ze0.OooO0oO(context, 10);
            List listAsList = Arrays.asList(df0VarO000OO00, df0VarO0OoO0o);
            CallableC1544eu callableC1544eu = new CallableC1544eu(df0VarO000OO00, c2197wi, df0VarO0OoO0o);
            pm0 pm0Var = rm0.f23913OooOo0o;
            listAsList.getClass();
            rm0 rm0VarOooOOOO = rm0.OooOOOO(listAsList);
            CallableC2074t6 callableC2074t6 = new CallableC2074t6(6);
            C2163vl c2163vl = AbstractC2200wl.f25327OooO0oO;
            pp0 pp0Var = new pp0(rm0VarOooOOOO, true, false);
            pp0Var.f23398Oooo0OO = new op0(pp0Var, callableC2074t6, c2163vl);
            pp0Var.OooOo0o();
            pp0 pp0Var2 = new pp0(rm0VarOooOOOO, true, false);
            C2163vl c2163vl2 = gf0Var.f19332OooO00o;
            pp0Var2.f23398Oooo0OO = new op0(pp0Var2, callableC1544eu, c2163vl2);
            pp0Var2.OooOo0o();
            df0 df0VarOooO00o2 = new s20(gf0Var, ef0Var2, null, pp0Var, listAsList, pp0Var2).OooO0oO(h50Var).OooO0oO(new C1847n1(jf0VarOooO0oO3, 29)).OooO0oO(c1548ey).OooO00o();
            af0.OoooooO(df0VarOooO00o2, mf0Var, jf0VarOooO0oO3, false);
            af0.OoooO00(df0VarOooO00o2, jf0VarOooO0oO2);
            List listAsList2 = Arrays.asList(df0VarO0OoO0o, df0VarO000OO00, df0VarOooO00o2);
            OoooOOO.o0OOO0OO o0ooo0oo = new OoooOOO.o0OOO0OO(c2197wi, df0VarOooO00o2, df0VarO0OoO0o, df0VarO000OO00);
            pm0 pm0Var2 = rm0.f23913OooOo0o;
            listAsList2.getClass();
            rm0 rm0VarOooOOOO2 = rm0.OooOOOO(listAsList2);
            CallableC2074t6 callableC2074t62 = new CallableC2074t6(6);
            C2163vl c2163vl3 = AbstractC2200wl.f25327OooO0oO;
            pp0 pp0Var3 = new pp0(rm0VarOooOOOO2, true, false);
            pp0Var3.f23398Oooo0OO = new op0(pp0Var3, callableC2074t62, c2163vl3);
            pp0Var3.OooOo0o();
            pp0 pp0Var4 = new pp0(rm0VarOooOOOO2, true, false);
            pp0Var4.f23398Oooo0OO = new op0(pp0Var4, o0ooo0oo, c2163vl2);
            pp0Var4.OooOo0o();
            df0VarOooO00o = new s20(gf0Var, ef0Var, null, pp0Var3, listAsList2, pp0Var4).OooOO0(c1676ieOooO00o).OooO00o();
        } else {
            g50 g50Var = new g50(b50VarO000O.f17370OooO0O0, b50VarO000O.f17369OooO00o);
            jf0 jf0VarOooO0oO4 = ze0.OooO0oO(context, 10);
            df0 df0VarOooO00o3 = gf0Var.OooO00o(ef0Var2, ii0.OooooOO(g50Var)).OooO0oO(h50Var).OooO0oO(new C1847n1(jf0VarOooO0oO4, 29)).OooO0oO(c1548ey).OooO00o();
            af0.OoooooO(df0VarOooO00o3, mf0Var, jf0VarOooO0oO4, false);
            yp0 yp0VarOooooOO = ii0.OooooOO(b50VarO000O);
            af0.OoooO00(df0VarOooO00o3, jf0VarOooO0oO2);
            List listAsList3 = Arrays.asList(df0VarOooO00o3, yp0VarOooooOO);
            CallableC2031s0 callableC2031s0 = new CallableC2031s0(8, df0VarOooO00o3, yp0VarOooooOO);
            pm0 pm0Var3 = rm0.f23913OooOo0o;
            listAsList3.getClass();
            rm0 rm0VarOooOOOO3 = rm0.OooOOOO(listAsList3);
            CallableC2074t6 callableC2074t63 = new CallableC2074t6(6);
            C2163vl c2163vl4 = AbstractC2200wl.f25327OooO0oO;
            pp0 pp0Var5 = new pp0(rm0VarOooOOOO3, true, false);
            pp0Var5.f23398Oooo0OO = new op0(pp0Var5, callableC2074t63, c2163vl4);
            pp0Var5.OooOo0o();
            pp0 pp0Var6 = new pp0(rm0VarOooOOOO3, true, false);
            pp0Var6.f23398Oooo0OO = new op0(pp0Var6, callableC2031s0, gf0Var.f19332OooO00o);
            pp0Var6.OooOo0o();
            df0VarOooO00o = new s20(gf0Var, ef0Var, null, pp0Var5, listAsList3, pp0Var6).OooOO0(c1676ieOooO00o).OooO00o();
        }
        af0.OoooooO(df0VarOooO00o, mf0Var, jf0VarOooO0oO2, false);
        return df0VarOooO00o;
    }

    public final o00000oO.OooOOO o000O0oO(C2197wi c2197wi, int i) {
        int i2 = 7;
        int i3 = 23;
        int i4 = 5;
        C1419be c1419beZzg = zzv.zzg();
        VersionInfoParcel versionInfoParcelForPackage = VersionInfoParcel.forPackage();
        Context context = this.f18159OooOo0O;
        C1602ge c1602geOooO0O0 = c1419beZzg.OooO0O0(context, versionInfoParcelForPackage, this.f18163OooOoOO);
        if (!((Boolean) AbstractC2002r8.f23802OooO00o.OooOOO()).booleanValue()) {
            return ii0.Ooooo00(new Exception("Signal collection disabled."));
        }
        C2130up c2130up = this.f18162OooOoO0;
        c2130up.getClass();
        OooO0oO.Oooo0 oooo0 = new OooO0oO.Oooo0(c2197wi, i, i4);
        C2130up c2130up2 = c2130up.f24676OooO0O0;
        p31 p31VarOooO0O0 = p31.OooO0O0(new o20(c2130up2.f24688OooOOOo, i3));
        zb0 zb0Var = new zb0(oooo0, 1);
        zb0 zb0Var2 = new zb0(oooo0, 2);
        zb0 zb0Var3 = new zb0(oooo0, 4);
        C1834mp c1834mp = c2130up2.f24681OooO0oO;
        p31 p31Var = c2130up2.f24678OooO0Oo;
        C1984qr c1984qr = new C1984qr(c1834mp, p31Var, zb0Var, zb0Var2, zb0Var3);
        C1797lp c1797lp = new C1797lp(c1834mp, 25);
        zb0 zb0Var4 = new zb0(oooo0, 0);
        C1651hq c1651hq = new C1651hq(zb0Var4, 24);
        C1908op c1908op = new C1908op(p31Var, c1834mp, i2);
        C2250xy c2250xy = new C2250xy(27);
        zb0 zb0Var5 = new zb0(oooo0, 3);
        p31 p31Var2 = c2130up2.f24713Oooo0oo;
        C1984qr c1984qr2 = new C1984qr(p31Var2, (q31) zb0Var5, (q31) zb0Var3, (q31) zb0Var4, p31Var, 17);
        ab0 ab0Var = new ab0(zb0Var4, p31Var2, p31Var, 2);
        zb0 zb0Var6 = new zb0(oooo0, 5);
        p31 p31VarOooO0O02 = p31.OooO0O0(AbstractC1641hg.f19758OoooO);
        p31 p31VarOooO0O03 = p31.OooO0O0(wz0.f25471Oooo00O);
        p31 p31VarOooO0O04 = p31.OooO0O0(wz0.f25472Oooo00o);
        p31 p31VarOooO0O05 = p31.OooO0O0(AbstractC1641hg.f19762OoooOO0);
        int i5 = s31.f23985OooO0O0;
        LinkedHashMap linkedHashMapOooo0O0 = xh0.Oooo0O0(4);
        ef0 ef0Var = ef0.GMS_SIGNALS;
        ii0.OooOOO0(p31VarOooO0O02, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMapOooo0O0.put(ef0Var, p31VarOooO0O02);
        ef0 ef0Var2 = ef0.BUILD_URL;
        ii0.OooOOO0(p31VarOooO0O03, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMapOooo0O0.put(ef0Var2, p31VarOooO0O03);
        ef0 ef0Var3 = ef0.HTTP;
        ii0.OooOOO0(p31VarOooO0O04, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMapOooo0O0.put(ef0Var3, p31VarOooO0O04);
        ef0 ef0Var4 = ef0.PRE_PROCESS;
        ii0.OooOOO0(p31VarOooO0O05, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMapOooo0O0.put(ef0Var4, p31VarOooO0O05);
        p31 p31VarOooO0O06 = p31.OooO0O0(new C1940pk(zb0Var6, c2130up2.f24681OooO0oO, new s31(linkedHashMapOooo0O0), 13));
        int i6 = x31.f25505OooO0OO;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(p31VarOooO0O06);
        p31 p31VarOooO0O07 = p31.OooO0O0(new sa0(c2130up2.f24678OooO0Oo, new C1987qu(new x31(list, arrayList), 23)));
        Context context2 = c2130up2.f24675OooO00o.f20080OooO0O0;
        ii0.Oooo000(context2);
        Object objZzb = c2130up2.f24741o00000o0.zzb();
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        String string = ((C2197wi) oooo0.f13283OooOo).zza.getString("ms");
        if (string == null) {
            string = "";
        }
        o90 o90Var = new o90(6, c2163vl, string);
        C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl2);
        List list2 = c2197wi.zze;
        ii0.Oooo000(list2);
        o90 o90Var2 = new o90(7, c2163vl2, list2);
        n31 n31VarOooO00o = p31.OooO00o(c1984qr);
        n31 n31VarOooO00o2 = p31.OooO00o(c1797lp);
        p31.OooO00o(c1651hq);
        n31 n31VarOooO00o3 = p31.OooO00o(c1908op);
        n31 n31VarOooO00o4 = p31.OooO00o(c2250xy);
        p31.OooO00o(c1984qr2);
        n31 n31VarOooO00o5 = p31.OooO00o(ab0Var);
        ii0.Oooo000(c2163vl2);
        mf0 mf0Var = (mf0) p31VarOooO0O0.zzb();
        h20 h20Var = (h20) c2130up2.f24692OooOo.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add((wb0) objZzb);
        hashSet.add(o90Var);
        hashSet.add(o90Var2);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo0OO)).booleanValue()) {
            hashSet.add((kb0) n31VarOooO00o.zzb());
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo0O0)).booleanValue()) {
            hashSet.add((kb0) n31VarOooO00o2.zzb());
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo0Oo)).booleanValue()) {
            hashSet.add((kb0) n31VarOooO00o3.zzb());
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo0o0)).booleanValue()) {
            hashSet.add((kb0) n31VarOooO00o4.zzb());
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17877o00O0o)).booleanValue()) {
            hashSet.add((kb0) n31VarOooO00o5.zzb());
        }
        mb0 mb0Var = new mb0(context2, c2163vl2, hashSet, mf0Var, h20Var);
        C1676ie c1676ieOooO00o = c1602geOooO0O0.OooO00o("google.afma.request.getSignals", AbstractC1565fe.f18933OooO0O0, AbstractC1565fe.f18934OooO0OO);
        jf0 jf0VarOooO0oO = ze0.OooO0oO(context, 22);
        s20 s20VarOooOO0 = ((gf0) p31VarOooO0O07.zzb()).OooO00o(ef0.GET_SIGNALS, ii0.OooooOO(c2197wi.zza)).OooO0oO(new C1847n1(jf0VarOooO0oO, 29)).OooOO0(new C1786le(8, mb0Var, c2197wi));
        df0 df0VarOooO00o = ((gf0) s20VarOooOO0.f23980OooOoOO).OooO00o(ef0.JS_SIGNALS, s20VarOooOO0.OooO00o()).OooOO0(c1676ieOooO00o).OooO00o();
        mf0 mf0Var2 = (mf0) p31VarOooO0O0.zzb();
        mf0Var2.OooO0Oo(c2197wi.zza.getStringArrayList("ad_types"));
        mf0Var2.OooO0o(c2197wi.zza.getBundle("extras"));
        af0.OoooooO(df0VarOooO00o, mf0Var2, jf0VarOooO0oO, true);
        if (((Boolean) AbstractC1633h8.f19644OooO0o.OooOOO()).booleanValue()) {
            wj0 wj0Var = this.f18158OooOo;
            Objects.requireNonNull(wj0Var);
            df0VarOooO00o.addListener(new b30(wj0Var, 3), this.f18160OooOo0o);
        }
        return df0VarOooO00o;
    }

    public final o00000oO.OooOOO o000O0oo(String str) {
        if (((Boolean) AbstractC1891o8.f22356OooO00o.OooOOO()).booleanValue()) {
            return o000O(str) == null ? ii0.Ooooo00(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : ii0.OooooOO(new a50());
        }
        return ii0.Ooooo00(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2049si c1975qi = null;
        C2086ti c2086ti = null;
        InterfaceC2049si c1975qi2 = null;
        InterfaceC2049si c1975qi3 = null;
        InterfaceC2049si c1975qi4 = null;
        switch (i) {
            case 1:
                AbstractC2218x2.OooO0O0(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                C2197wi c2197wi = (C2197wi) AbstractC2218x2.OooO00o(parcel, C2197wi.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c1975qi = iInterfaceQueryLocalInterface instanceof InterfaceC2049si ? (InterfaceC2049si) iInterfaceQueryLocalInterface : new C1975qi(strongBinder2);
                }
                AbstractC2218x2.OooO0O0(parcel);
                o0000O(c2197wi, c1975qi);
                parcel2.writeNoException();
                return true;
            case 5:
                C2197wi c2197wi2 = (C2197wi) AbstractC2218x2.OooO00o(parcel, C2197wi.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c1975qi4 = iInterfaceQueryLocalInterface2 instanceof InterfaceC2049si ? (InterfaceC2049si) iInterfaceQueryLocalInterface2 : new C1975qi(strongBinder3);
                }
                AbstractC2218x2.OooO0O0(parcel);
                o0000OOo(c2197wi2, c1975qi4);
                parcel2.writeNoException();
                return true;
            case 6:
                C2197wi c2197wi3 = (C2197wi) AbstractC2218x2.OooO00o(parcel, C2197wi.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c1975qi3 = iInterfaceQueryLocalInterface3 instanceof InterfaceC2049si ? (InterfaceC2049si) iInterfaceQueryLocalInterface3 : new C1975qi(strongBinder4);
                }
                AbstractC2218x2.OooO0O0(parcel);
                o00000o0(c2197wi3, c1975qi3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c1975qi2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC2049si ? (InterfaceC2049si) iInterfaceQueryLocalInterface4 : new C1975qi(strongBinder5);
                }
                AbstractC2218x2.OooO0O0(parcel);
                OoooOo0(string, c1975qi2);
                parcel2.writeNoException();
                return true;
            case 8:
                C1827mi c1827mi = (C1827mi) AbstractC2218x2.OooO00o(parcel, C1827mi.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c2086ti = iInterfaceQueryLocalInterface5 instanceof C2086ti ? (C2086ti) iInterfaceQueryLocalInterface5 : new C2086ti(strongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                if (((Boolean) AbstractC2076t8.f24267OooO00o.OooOOO()).booleanValue()) {
                    this.f18162OooOoO0.getClass();
                    String str = c1827mi.zza;
                    yp0 yp0Var = yp0.f25991OooOo0o;
                    yp0Var.addListener(new wp0(0, yp0Var, new C1548ey(c2086ti, false, c1827mi, 8)), AbstractC2200wl.f25327OooO0oO);
                } else {
                    try {
                        Parcel parcelOooO = c2086ti.OooO();
                        parcelOooO.writeString("");
                        AbstractC2218x2.OooO0OO(parcelOooO, c1827mi);
                        c2086ti.o000OO0O(parcelOooO, 1);
                    } catch (RemoteException e) {
                        zze.zzb("Service can't call client", e);
                    }
                }
                parcel2.writeNoException();
                return true;
        }
    }
}

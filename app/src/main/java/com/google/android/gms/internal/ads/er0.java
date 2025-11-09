package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes2.dex */
public abstract class er0 {
    static {
        int i = gy0.zza;
        try {
            OooO00o();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void OooO00o() {
        eu0 eu0Var = eu0.f18703OooO0O0;
        eu0Var.OooO0Oo(ir0.f20107OooO0O0);
        eu0Var.OooO0OO(ir0.f20108OooO0OO);
        kv0.OooO00o();
        int i = nr0.f21575OooO0o0;
        if (!xh0.OooOo0O(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        ju0 ju0Var = ts0.f24499OooO00o;
        fu0 fu0Var = fu0.f19127OooO0O0;
        fu0Var.OooO0oo(ts0.f24499OooO00o);
        fu0Var.OooO0oO(ts0.f24500OooO0O0);
        fu0Var.OooO0o(ts0.f24501OooO0OO);
        fu0Var.OooO0o0(ts0.f24502OooO0Oo);
        eu0Var.OooO0OO(nr0.f21571OooO00o);
        du0 du0Var = du0.f18410OooO0O0;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", ns0.f21583OooO0o0);
        s20 s20Var = new s20();
        s20Var.OooO0OO(16);
        s20Var.OooO0o0(32);
        s20Var.OooO(16);
        s20Var.OooO0o(16);
        or0 or0Var = or0.f23087OooOoO;
        s20Var.f23975OooOo = or0Var;
        pr0 pr0Var = pr0.f23413OooO0o0;
        s20Var.f23979OooOoO0 = pr0Var;
        map.put("AES128_CTR_HMAC_SHA256_RAW", s20Var.OooOO0O());
        map.put("AES256_CTR_HMAC_SHA256", ns0.f21582OooO0o);
        s20 s20Var2 = new s20();
        s20Var2.OooO0OO(32);
        s20Var2.OooO0o0(32);
        s20Var2.OooO(32);
        s20Var2.OooO0o(16);
        s20Var2.f23975OooOo = or0Var;
        s20Var2.f23979OooOoO0 = pr0Var;
        map.put("AES256_CTR_HMAC_SHA256_RAW", s20Var2.OooOO0O());
        du0Var.OooO0O0(Collections.unmodifiableMap(map));
        au0 au0Var = au0.f17117OooO0O0;
        au0Var.OooO00o(nr0.f21573OooO0OO, qr0.class);
        zt0 zt0Var = zt0.f26384OooO0O0;
        zt0Var.OooO0O0(nr0.f21574OooO0Oo, qr0.class);
        mt0 mt0Var = mt0.f21351OooO0Oo;
        mt0Var.OooO0O0(nr0.f21572OooO0O0, i);
        int i2 = wr0.f25397OooO0o0;
        if (!xh0.OooOo0O(i2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        fu0Var.OooO0oo(ys0.f26017OooO00o);
        fu0Var.OooO0oO(ys0.f26018OooO0O0);
        fu0Var.OooO0o(ys0.f26019OooO0OO);
        fu0Var.OooO0o0(ys0.f26020OooO0Oo);
        eu0Var.OooO0OO(wr0.f25393OooO00o);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", ns0.f21578OooO00o);
        C1386ai c1386ai = new C1386ai(17);
        c1386ai.mo13703zza();
        c1386ai.OooOOo(16);
        c1386ai.OooOo00();
        tq0 tq0Var = tq0.f24471OooOoo;
        c1386ai.f17045OooOoO = tq0Var;
        map2.put("AES128_GCM_RAW", c1386ai.OooOo());
        map2.put("AES256_GCM", ns0.f21579OooO0O0);
        C1386ai c1386ai2 = new C1386ai(17);
        c1386ai2.mo13703zza();
        c1386ai2.OooOOo(32);
        c1386ai2.OooOo00();
        c1386ai2.f17045OooOoO = tq0Var;
        map2.put("AES256_GCM_RAW", c1386ai2.OooOo());
        du0Var.OooO0O0(Collections.unmodifiableMap(map2));
        au0Var.OooO00o(wr0.f25395OooO0OO, xr0.class);
        zt0Var.OooO0O0(wr0.f25396OooO0Oo, xr0.class);
        mt0Var.OooO0O0(wr0.f25394OooO0O0, i2);
        if (lt0.OooO00o()) {
            return;
        }
        lu0 lu0Var = sr0.f24149OooO00o;
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        fu0Var.OooO0oo(vs0.f25121OooO00o);
        fu0Var.OooO0oO(vs0.f25122OooO0O0);
        fu0Var.OooO0o(vs0.f25123OooO0OO);
        fu0Var.OooO0o0(vs0.f25124OooO0Oo);
        eu0Var.OooO0OO(sr0.f24149OooO00o);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", ns0.f21580OooO0OO);
        C2051sk c2051sk = new C2051sk(16);
        c2051sk.OooO0oo(16);
        c2051sk.OooOOO0(16);
        c2051sk.OooOOo0();
        tr0 tr0Var = tr0.f24488OooOoO;
        c2051sk.f24099OooOoO = tr0Var;
        map3.put("AES128_EAX_RAW", c2051sk.OooOoO0());
        map3.put("AES256_EAX", ns0.f21581OooO0Oo);
        C2051sk c2051sk2 = new C2051sk(16);
        c2051sk2.OooO0oo(16);
        c2051sk2.OooOOO0(32);
        c2051sk2.OooOOo0();
        c2051sk2.f24099OooOoO = tr0Var;
        map3.put("AES256_EAX_RAW", c2051sk2.OooOoO0());
        du0Var.OooO0O0(Collections.unmodifiableMap(map3));
        zt0Var.OooO0O0(sr0.f24151OooO0OO, ur0.class);
        mt0Var.OooO00o(sr0.f24150OooO0O0);
        lu0 lu0Var2 = zr0.f26370OooO00o;
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        fu0Var.OooO0oo(zs0.f26374OooO00o);
        fu0Var.OooO0oO(zs0.f26375OooO0O0);
        fu0Var.OooO0o(zs0.f26376OooO0OO);
        fu0Var.OooO0o0(zs0.f26377OooO0Oo);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            eu0Var.OooO0OO(zr0.f26370OooO00o);
            HashMap map4 = new HashMap();
            or0 or0Var2 = or0.f23093OooOooo;
            or0 or0Var3 = or0.f23090OooOoo;
            map4.put("AES128_GCM_SIV", new as0(16, or0Var3));
            map4.put("AES128_GCM_SIV_RAW", new as0(16, or0Var2));
            map4.put("AES256_GCM_SIV", new as0(32, or0Var3));
            map4.put("AES256_GCM_SIV_RAW", new as0(32, or0Var2));
            du0Var.OooO0O0(Collections.unmodifiableMap(map4));
            au0Var.OooO00o(zr0.f26372OooO0OO, as0.class);
            zt0Var.OooO0O0(zr0.f26371OooO0O0, as0.class);
            mt0Var.OooO00o(zr0.f26373OooO0Oo);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        lu0 lu0Var3 = cs0.f18052OooO00o;
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        ju0 ju0Var2 = bt0.f17595OooO00o;
        fu0 fu0Var2 = fu0.f19127OooO0O0;
        fu0Var2.OooO0oo(bt0.f17595OooO00o);
        fu0Var2.OooO0oO(bt0.f17596OooO0O0);
        fu0Var2.OooO0o(bt0.f17597OooO0OO);
        fu0Var2.OooO0o0(bt0.f17598OooO0Oo);
        eu0 eu0Var2 = eu0.f18703OooO0O0;
        eu0Var2.OooO0OO(cs0.f18052OooO00o);
        zt0 zt0Var2 = zt0.f26384OooO0O0;
        zt0Var2.OooO0O0(cs0.f18053OooO0O0, ds0.class);
        du0 du0Var2 = du0.f18410OooO0O0;
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new ds0(pr0.f23412OooO0o));
        map5.put("CHACHA20_POLY1305_RAW", new ds0(pr0.f23415OooO0oo));
        du0Var2.OooO0O0(Collections.unmodifiableMap(map5));
        mt0 mt0Var2 = mt0.f21351OooO0Oo;
        mt0Var2.OooO00o(cs0.f18054OooO0OO);
        lu0 lu0Var4 = es0.f18693OooO00o;
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        fu0Var2.OooO0oo(js0.f20380OooO00o);
        fu0Var2.OooO0oO(js0.f20381OooO0O0);
        fu0Var2.OooO0o(js0.f20382OooO0OO);
        fu0Var2.OooO0o0(js0.f20383OooO0Oo);
        eu0Var2.OooO0OO(es0.f18693OooO00o);
        zt0Var2.OooO0O0(es0.f18695OooO0OO, is0.class);
        mt0Var2.OooO00o(es0.f18694OooO0O0);
        st0 st0Var = gs0.f19451OooO00o;
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        fu0Var2.OooO0oo(ms0.f21342OooO00o);
        fu0Var2.OooO0oO(ms0.f21343OooO0O0);
        fu0Var2.OooO0o(ms0.f21344OooO0OO);
        fu0Var2.OooO0o0(ms0.f21345OooO0Oo);
        zt0Var2.OooO0O0(gs0.f19452OooO0O0, ls0.class);
        eu0Var2.OooO0OO(gs0.f19453OooO0OO);
        mt0Var2.OooO00o(gs0.f19451OooO00o);
        lu0 lu0Var5 = rs0.f23937OooO00o;
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        fu0Var2.OooO0oo(jt0.f20387OooO00o);
        fu0Var2.OooO0oO(jt0.f20388OooO0O0);
        fu0Var2.OooO0o(jt0.f20389OooO0OO);
        fu0Var2.OooO0o0(jt0.f20390OooO0Oo);
        eu0Var2.OooO0OO(rs0.f23937OooO00o);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new ss0(tr0.f24491OooOoo));
        map6.put("XCHACHA20_POLY1305_RAW", new ss0(tr0.f24494OooOooo));
        du0Var2.OooO0O0(Collections.unmodifiableMap(map6));
        zt0Var2.OooO0O0(rs0.f23940OooO0Oo, ss0.class);
        au0.f17117OooO0O0.OooO00o(rs0.f23939OooO0OO, ss0.class);
        mt0Var2.OooO00o(rs0.f23938OooO0O0);
        fu0Var2.OooO0oo(it0.f20116OooO00o);
        fu0Var2.OooO0oO(it0.f20117OooO0O0);
        fu0Var2.OooO0o(it0.f20118OooO0OO);
        fu0Var2.OooO0o0(it0.f20119OooO0Oo);
        HashMap map7 = new HashMap();
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", ns0.f21584OooO0oO);
        du0Var2.OooO0O0(Collections.unmodifiableMap(map7));
        eu0Var2.OooO0OO(ze0.f26158OooO0o);
        zt0Var2.OooO0O0(ze0.f26159OooO0o0, ps0.class);
    }
}

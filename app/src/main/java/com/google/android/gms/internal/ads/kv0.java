package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class kv0 {
    static {
        int i = gy0.zza;
        try {
            OooO00o();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void OooO00o() throws GeneralSecurityException {
        eu0 eu0Var = eu0.f18703OooO0O0;
        eu0Var.OooO0Oo(ir0.f20111OooO0o0);
        eu0Var.OooO0OO(ir0.f20110OooO0o);
        eu0Var.OooO0Oo(ir0.f20109OooO0Oo);
        int i = gv0.f19478OooO0o;
        if (!xh0.OooOo0O(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C1872nq c1872nq = rv0.f23943OooO00o;
        fu0 fu0Var = fu0.f19127OooO0O0;
        fu0Var.OooO0oo(rv0.f23945OooO0OO);
        fu0Var.OooO0oO(rv0.f23946OooO0Oo);
        fu0Var.OooO0o(rv0.f23948OooO0o0);
        fu0Var.OooO0o0(rv0.f23947OooO0o);
        eu0Var.OooO0OO(gv0.f19474OooO00o);
        eu0Var.OooO0OO(gv0.f19475OooO0O0);
        du0 du0Var = du0.f18410OooO0O0;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", ov0.f23133OooO00o);
        C1386ai c1386ai = new C1386ai(18);
        c1386ai.OooOOo(32);
        c1386ai.OooOo0(16);
        iv0 iv0Var = iv0.f20123OooO0o0;
        c1386ai.f17045OooOoO = iv0Var;
        hv0 hv0Var = hv0.f19870OooO0Oo;
        c1386ai.f17046OooOoO0 = hv0Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", c1386ai.OooOoO0());
        C1386ai c1386ai2 = new C1386ai(18);
        c1386ai2.OooOOo(32);
        c1386ai2.OooOo0(32);
        iv0 iv0Var2 = iv0.f20120OooO0O0;
        c1386ai2.f17045OooOoO = iv0Var2;
        c1386ai2.f17046OooOoO0 = hv0Var;
        map.put("HMAC_SHA256_256BITTAG", c1386ai2.OooOoO0());
        C1386ai c1386ai3 = new C1386ai(18);
        c1386ai3.OooOOo(32);
        c1386ai3.OooOo0(32);
        c1386ai3.f17045OooOoO = iv0Var;
        c1386ai3.f17046OooOoO0 = hv0Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", c1386ai3.OooOoO0());
        C1386ai c1386ai4 = new C1386ai(18);
        c1386ai4.OooOOo(64);
        c1386ai4.OooOo0(16);
        c1386ai4.f17045OooOoO = iv0Var2;
        hv0 hv0Var2 = hv0.f19871OooO0o;
        c1386ai4.f17046OooOoO0 = hv0Var2;
        map.put("HMAC_SHA512_128BITTAG", c1386ai4.OooOoO0());
        C1386ai c1386ai5 = new C1386ai(18);
        c1386ai5.OooOOo(64);
        c1386ai5.OooOo0(16);
        c1386ai5.f17045OooOoO = iv0Var;
        c1386ai5.f17046OooOoO0 = hv0Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", c1386ai5.OooOoO0());
        C1386ai c1386ai6 = new C1386ai(18);
        c1386ai6.OooOOo(64);
        c1386ai6.OooOo0(32);
        c1386ai6.f17045OooOoO = iv0Var2;
        c1386ai6.f17046OooOoO0 = hv0Var2;
        map.put("HMAC_SHA512_256BITTAG", c1386ai6.OooOoO0());
        C1386ai c1386ai7 = new C1386ai(18);
        c1386ai7.OooOOo(64);
        c1386ai7.OooOo0(32);
        c1386ai7.f17045OooOoO = iv0Var;
        c1386ai7.f17046OooOoO0 = hv0Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", c1386ai7.OooOoO0());
        map.put("HMAC_SHA512_512BITTAG", ov0.f23134OooO0O0);
        C1386ai c1386ai8 = new C1386ai(18);
        c1386ai8.OooOOo(64);
        c1386ai8.OooOo0(64);
        c1386ai8.f17045OooOoO = iv0Var;
        c1386ai8.f17046OooOoO0 = hv0Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", c1386ai8.OooOoO0());
        du0Var.OooO0O0(Collections.unmodifiableMap(map));
        zt0 zt0Var = zt0.f26384OooO0O0;
        zt0Var.OooO0O0(gv0.f19479OooO0o0, jv0.class);
        au0.f17117OooO0O0.OooO00o(gv0.f19477OooO0Oo, jv0.class);
        mt0 mt0Var = mt0.f21351OooO0Oo;
        mt0Var.OooO0O0(gv0.f19476OooO0OO, i);
        if (lt0.OooO00o()) {
            return;
        }
        mr0 mr0Var = cv0.f18061OooO00o;
        if (!xh0.OooOo0O(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        fu0Var.OooO0oo(pv0.f23432OooO00o);
        fu0Var.OooO0oO(pv0.f23433OooO0O0);
        fu0Var.OooO0o(pv0.f23434OooO0OO);
        fu0Var.OooO0o0(pv0.f23435OooO0Oo);
        zt0Var.OooO0O0(cv0.f18061OooO00o, dv0.class);
        eu0Var.OooO0OO(cv0.f18062OooO0O0);
        eu0Var.OooO0OO(cv0.f18063OooO0OO);
        HashMap map2 = new HashMap();
        dv0 dv0Var = ov0.f23135OooO0OO;
        map2.put("AES_CMAC", dv0Var);
        map2.put("AES256_CMAC", dv0Var);
        bi0 bi0Var = new bi0(8);
        bi0Var.OooO00o(32);
        bi0Var.OooO0o0(16);
        bi0Var.f17510OooOoO0 = tq0.f24481Oooo0o;
        map2.put("AES256_CMAC_RAW", bi0Var.OooOO0o());
        du0Var.OooO0O0(Collections.unmodifiableMap(map2));
        mt0Var.OooO00o(cv0.f18064OooO0Oo);
    }
}

package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zy0 implements xq0 {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final byte[] f26391OooO0o0 = {0};

    /* renamed from: OooO00o, reason: collision with root package name */
    public final sv0 f26392OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f26393OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final byte[] f26394OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f26395OooO0Oo;

    public zy0(av0 av0Var) {
        this.f26392OooO00o = new xy0(((az0) av0Var.f17119OooOo.f23325OooOo0o).OooO0O0());
        dv0 dv0Var = av0Var.f17120OooOo0o;
        this.f26393OooO0O0 = dv0Var.f18413OooO0O0;
        this.f26394OooO0OO = av0Var.f17122OooOoO0.OooO0O0();
        if (dv0Var.f18414OooO0OO.equals(tq0.f24482Oooo0o0)) {
            this.f26395OooO0Oo = Arrays.copyOf(f26391OooO0o0, 1);
        } else {
            this.f26395OooO0Oo = new byte[0];
        }
    }

    public zy0(fv0 fv0Var) {
        jv0 jv0Var = fv0Var.f19131OooOo0o;
        String strValueOf = String.valueOf(jv0Var.f20398OooO0Oo);
        this.f26392OooO00o = new b40("HMAC".concat(strValueOf), new SecretKeySpec(((az0) fv0Var.f19130OooOo.f23325OooOo0o).OooO0O0(), "HMAC"));
        this.f26393OooO0O0 = jv0Var.f20396OooO0O0;
        this.f26394OooO0OO = fv0Var.f19133OooOoO0.OooO0O0();
        if (jv0Var.f20397OooO0OO.equals(iv0.f20122OooO0Oo)) {
            this.f26395OooO0Oo = Arrays.copyOf(f26391OooO0o0, 1);
        } else {
            this.f26395OooO0Oo = new byte[0];
        }
    }

    public zy0(b40 b40Var, int i) throws IllegalStateException, InvalidAlgorithmParameterException {
        this.f26392OooO00o = b40Var;
        this.f26393OooO0O0 = i;
        this.f26394OooO0OO = new byte[0];
        this.f26395OooO0Oo = new byte[0];
        b40Var.OooO00o(i, new byte[0]);
    }
}

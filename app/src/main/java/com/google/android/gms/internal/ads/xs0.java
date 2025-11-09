package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final /* synthetic */ class xs0 implements rt0, pt0, ku0, iu0, mu0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f25792OooOo0O;

    public /* synthetic */ xs0(int i) {
        this.f25792OooOo0O = i;
    }

    @Override // com.google.android.gms.internal.ads.iu0
    public yq0 OooO00o(tu0 tu0Var) throws GeneralSecurityException {
        switch (this.f25792OooOo0O) {
            case 3:
                mx0 mx0Var = tu0Var.f24510OooO0O0;
                if (!mx0Var.OooOoo0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO = mx0Var.OooOoOO();
                    tz0 tz0Var = tz0.f24541OooO00o;
                    a11 a11Var = a11.f16875OooO0OO;
                    xw0 xw0VarOooOoO = xw0.OooOoO(jz0VarOooOoOO, tz0.f24542OooO0O0);
                    if (xw0VarOooOoO.OooOo() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int iOooOo0o = xw0VarOooOoO.OooOo0o();
                    if (iOooOo0o == 16 || iOooOo0o == 32) {
                        return new as0(iOooOo0o, zs0.OooO00o(mx0Var.OooOoO()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iOooOo0o)));
                } catch (k01 e) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
                }
            case 7:
                mx0 mx0Var2 = tu0Var.f24510OooO0O0;
                if (!mx0Var2.OooOoo0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var2.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO2 = mx0Var2.OooOoOO();
                    tz0 tz0Var2 = tz0.f24541OooO00o;
                    a11 a11Var2 = a11.f16875OooO0OO;
                    ax0.OooOo(jz0VarOooOoOO2, tz0.f24542OooO0O0);
                    return new ds0(bt0.OooO00o(mx0Var2.OooOoO()));
                } catch (k01 e2) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
                }
            case 11:
                mx0 mx0Var3 = tu0Var.f24510OooO0O0;
                if (!mx0Var3.OooOoo0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var3.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO3 = mx0Var3.OooOoOO();
                    tz0 tz0Var3 = tz0.f24541OooO00o;
                    a11 a11Var3 = a11.f16875OooO0OO;
                    ky0 ky0VarOooOoO0 = ky0.OooOoO0(jz0VarOooOoOO3, tz0.f24542OooO0O0);
                    if (ky0VarOooOoO0.OooOo0o() == 0) {
                        return ps0.OooO0O0(it0.OooO00o(mx0Var3.OooOoO()), ky0VarOooOoO0.OooOoO().OooOo0o());
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (k01 e3) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e3);
                }
            case 15:
                mx0 mx0Var4 = tu0Var.f24510OooO0O0;
                if (!mx0Var4.OooOoo0().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var4.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO4 = mx0Var4.OooOoOO();
                    tz0 tz0Var4 = tz0.f24541OooO00o;
                    a11 a11Var4 = a11.f16875OooO0OO;
                    if (qy0.OooOoO0(jz0VarOooOoOO4, tz0.f24542OooO0O0).OooOo0o() == 0) {
                        return new ss0(jt0.OooO00o(mx0Var4.OooOoO()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (k01 e4) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e4);
                }
            case 25:
                mx0 mx0Var5 = tu0Var.f24510OooO0O0;
                if (!mx0Var5.OooOoo0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var5.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO5 = mx0Var5.OooOoOO();
                    tz0 tz0Var5 = tz0.f24541OooO00o;
                    a11 a11Var5 = a11.f16875OooO0OO;
                    wv0 wv0VarOooOoO0 = wv0.OooOoO0(jz0VarOooOoOO5, tz0.f24542OooO0O0);
                    bi0 bi0Var = new bi0(8);
                    bi0Var.OooO00o(wv0VarOooOoO0.OooOo0o());
                    bi0Var.OooO0o0(wv0VarOooOoO0.OooOoO().OooOo0o());
                    bi0Var.f17510OooOoO0 = pv0.OooO00o(mx0Var5.OooOoO());
                    return bi0Var.OooOO0o();
                } catch (k01 e5) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e5);
                }
            default:
                mx0 mx0Var6 = tu0Var.f24510OooO0O0;
                if (!mx0Var6.OooOoo0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var6.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO6 = mx0Var6.OooOoOO();
                    tz0 tz0Var6 = tz0.f24541OooO00o;
                    a11 a11Var6 = a11.f16875OooO0OO;
                    gx0 gx0VarOooOoOO = gx0.OooOoOO(jz0VarOooOoOO6, tz0.f24542OooO0O0);
                    if (gx0VarOooOoOO.OooOo() != 0) {
                        throw new GeneralSecurityException(OooO0oO.OooOo.OooO0o(gx0VarOooOoOO.OooOo(), "Parsing HmacParameters failed: unknown Version "));
                    }
                    C1386ai c1386ai = new C1386ai(18);
                    c1386ai.OooOOo(gx0VarOooOoOO.OooOo0o());
                    c1386ai.OooOo0(gx0VarOooOoOO.OooOoo0().OooOo0o());
                    c1386ai.f17046OooOoO0 = (hv0) rv0.f23944OooO0O0.OooO0O0(gx0VarOooOoOO.OooOoo0().OooOo());
                    c1386ai.f17045OooOoO = (iv0) rv0.f23943OooO00o.OooO0O0(mx0Var6.OooOoO());
                    return c1386ai.OooOoO0();
                } catch (k01 e6) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e6);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.ku0
    public tu0 OooO0O0(yq0 yq0Var) {
        switch (this.f25792OooOo0O) {
            case 2:
                as0 as0Var = (as0) yq0Var;
                lx0 lx0VarOooOo0o = mx0.OooOo0o();
                lx0VarOooOo0o.OooO0oO("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                ww0 ww0VarOooOoO0 = xw0.OooOoO0();
                int i = as0Var.f17096OooO00o;
                ww0VarOooOoO0.OooO0Oo();
                ((xw0) ww0VarOooOoO0.f25822OooOo0o).zzc = i;
                lx0VarOooOo0o.OooO0oo(((xw0) ww0VarOooOoO0.OooO0O0()).OooO0O0());
                lx0VarOooOo0o.OooO0o(zs0.OooO0O0(as0Var.f17097OooO0O0));
                return tu0.OooO00o((mx0) lx0VarOooOo0o.OooO0O0());
            case 6:
                lx0 lx0VarOooOo0o2 = mx0.OooOo0o();
                lx0VarOooOo0o2.OooO0oO("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                lx0VarOooOo0o2.OooO0oo(ax0.OooOo0o().OooO0O0());
                lx0VarOooOo0o2.OooO0o(bt0.OooO0O0(((ds0) yq0Var).f18405OooO00o));
                return tu0.OooO00o((mx0) lx0VarOooOo0o2.OooO0O0());
            case 10:
                ps0 ps0Var = (ps0) yq0Var;
                lx0 lx0VarOooOo0o3 = mx0.OooOo0o();
                lx0VarOooOo0o3.OooO0oO("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                jy0 jy0VarOooOo = ky0.OooOo();
                ly0 ly0VarOooOo = ny0.OooOo();
                int i2 = ps0Var.f23425OooO0O0;
                ly0VarOooOo.OooO0Oo();
                ((ny0) ly0VarOooOo.f25822OooOo0o).zzc = i2;
                ny0 ny0Var = (ny0) ly0VarOooOo.OooO0O0();
                jy0VarOooOo.OooO0Oo();
                ky0.OooOoOO((ky0) jy0VarOooOo.f25822OooOo0o, ny0Var);
                lx0VarOooOo0o3.OooO0oo(((ky0) jy0VarOooOo.OooO0O0()).OooO0O0());
                lx0VarOooOo0o3.OooO0o(it0.OooO0O0(ps0Var.f23424OooO00o));
                return tu0.OooO00o((mx0) lx0VarOooOo0o3.OooO0O0());
            case 14:
                lx0 lx0VarOooOo0o4 = mx0.OooOo0o();
                lx0VarOooOo0o4.OooO0oO("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                lx0VarOooOo0o4.OooO0oo(qy0.OooOo().OooO0O0());
                lx0VarOooOo0o4.OooO0o(jt0.OooO0O0(((ss0) yq0Var).f24154OooO00o));
                return tu0.OooO00o((mx0) lx0VarOooOo0o4.OooO0O0());
            case 24:
                dv0 dv0Var = (dv0) yq0Var;
                lx0 lx0VarOooOo0o5 = mx0.OooOo0o();
                lx0VarOooOo0o5.OooO0oO("type.googleapis.com/google.crypto.tink.AesCmacKey");
                vv0 vv0VarOooOo = wv0.OooOo();
                xv0 xv0VarOooOo = yv0.OooOo();
                int i3 = dv0Var.f18413OooO0O0;
                xv0VarOooOo.OooO0Oo();
                ((yv0) xv0VarOooOo.f25822OooOo0o).zzc = i3;
                yv0 yv0Var = (yv0) xv0VarOooOo.OooO0O0();
                vv0VarOooOo.OooO0Oo();
                wv0.OooOoo0((wv0) vv0VarOooOo.f25822OooOo0o, yv0Var);
                vv0VarOooOo.OooO0Oo();
                ((wv0) vv0VarOooOo.f25822OooOo0o).zzd = dv0Var.f18412OooO00o;
                lx0VarOooOo0o5.OooO0oo(((wv0) vv0VarOooOo.OooO0O0()).OooO0O0());
                lx0VarOooOo0o5.OooO0o(pv0.OooO0O0(dv0Var.f18414OooO0OO));
                return tu0.OooO00o((mx0) lx0VarOooOo0o5.OooO0O0());
            default:
                jv0 jv0Var = (jv0) yq0Var;
                lx0 lx0VarOooOo0o6 = mx0.OooOo0o();
                lx0VarOooOo0o6.OooO0oO("type.googleapis.com/google.crypto.tink.HmacKey");
                fx0 fx0VarOooOoO0 = gx0.OooOoO0();
                hx0 hx0VarOooOoO0 = ix0.OooOoO0();
                int i4 = jv0Var.f20396OooO0O0;
                hx0VarOooOoO0.OooO0Oo();
                ((ix0) hx0VarOooOoO0.f25822OooOo0o).zzd = i4;
                bx0 bx0Var = (bx0) rv0.f23944OooO0O0.OooO00o(jv0Var.f20398OooO0Oo);
                hx0VarOooOoO0.OooO0Oo();
                ((ix0) hx0VarOooOoO0.f25822OooOo0o).zzc = bx0Var.OooO00o();
                ix0 ix0Var = (ix0) hx0VarOooOoO0.OooO0O0();
                fx0VarOooOoO0.OooO0Oo();
                gx0.OooOooO((gx0) fx0VarOooOoO0.f25822OooOo0o, ix0Var);
                fx0VarOooOoO0.OooO0Oo();
                ((gx0) fx0VarOooOoO0.f25822OooOo0o).zze = jv0Var.f20395OooO00o;
                lx0VarOooOo0o6.OooO0oo(((gx0) fx0VarOooOoO0.OooO0O0()).OooO0O0());
                lx0VarOooOo0o6.OooO0o((fy0) rv0.f23943OooO00o.OooO00o(jv0Var.f20397OooO0OO));
                return tu0.OooO00o((mx0) lx0VarOooOo0o6.OooO0O0());
        }
    }

    @Override // com.google.android.gms.internal.ads.rt0
    public su0 OooO0OO(ii0 ii0Var) {
        switch (this.f25792OooOo0O) {
            case 0:
                vr0 vr0Var = (vr0) ii0Var;
                qw0 qw0VarOooOo = rw0.OooOo();
                byte[] bArrOooO0O0 = ((az0) vr0Var.f25112OooOo.f23325OooOo0o).OooO0O0();
                hz0 hz0VarOooOo0 = jz0.OooOo0(bArrOooO0O0, 0, bArrOooO0O0.length);
                qw0VarOooOo.OooO0Oo();
                ((rw0) qw0VarOooOo.f25822OooOo0o).zzd = hz0VarOooOo0;
                return su0.OooO00o("type.googleapis.com/google.crypto.tink.AesGcmKey", ((rw0) qw0VarOooOo.OooO0O0()).OooO0O0(), 2, ys0.OooO0O0(vr0Var.f25113OooOo0o.f25789OooO0O0), vr0Var.f25114OooOoO);
            case 4:
                yr0 yr0Var = (yr0) ii0Var;
                uw0 uw0VarOooOo = vw0.OooOo();
                byte[] bArrOooO0O02 = ((az0) yr0Var.f26012OooOo.f23325OooOo0o).OooO0O0();
                hz0 hz0VarOooOo02 = jz0.OooOo0(bArrOooO0O02, 0, bArrOooO0O02.length);
                uw0VarOooOo.OooO0Oo();
                ((vw0) uw0VarOooOo.f25822OooOo0o).zzd = hz0VarOooOo02;
                return su0.OooO00o("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((vw0) uw0VarOooOo.OooO0O0()).OooO0O0(), 2, zs0.OooO0O0(yr0Var.f26013OooOo0o.f17097OooO0O0), yr0Var.f26014OooOoO);
            case 8:
                bs0 bs0Var = (bs0) ii0Var;
                yw0 yw0VarOooOo = zw0.OooOo();
                byte[] bArrOooO0O03 = ((az0) bs0Var.f17591OooOo.f23325OooOo0o).OooO0O0();
                hz0 hz0VarOooOo03 = jz0.OooOo0(bArrOooO0O03, 0, bArrOooO0O03.length);
                yw0VarOooOo.OooO0Oo();
                ((zw0) yw0VarOooOo.f25822OooOo0o).zzd = hz0VarOooOo03;
                return su0.OooO00o("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zw0) yw0VarOooOo.OooO0O0()).OooO0O0(), 2, bt0.OooO0O0(bs0Var.f17592OooOo0o.f18405OooO00o), bs0Var.f17593OooOoO);
            case 12:
                os0 os0Var = (os0) ii0Var;
                hy0 hy0VarOooOo = iy0.OooOo();
                byte[] bArrOooO0O04 = ((az0) os0Var.f23100OooOo.f23325OooOo0o).OooO0O0();
                hz0 hz0VarOooOo04 = jz0.OooOo0(bArrOooO0O04, 0, bArrOooO0O04.length);
                hy0VarOooOo.OooO0Oo();
                ((iy0) hy0VarOooOo.f25822OooOo0o).zzf = hz0VarOooOo04;
                ly0 ly0VarOooOo = ny0.OooOo();
                ps0 ps0Var = os0Var.f23101OooOo0o;
                ly0VarOooOo.OooO0Oo();
                ((ny0) ly0VarOooOo.f25822OooOo0o).zzc = ps0Var.f23425OooO0O0;
                ny0 ny0Var = (ny0) ly0VarOooOo.OooO0O0();
                hy0VarOooOo.OooO0Oo();
                iy0.OooOoo((iy0) hy0VarOooOo.f25822OooOo0o, ny0Var);
                return su0.OooO00o("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((iy0) hy0VarOooOo.OooO0O0()).OooO0O0(), 2, it0.OooO0O0(ps0Var.f23424OooO00o), os0Var.f23102OooOoO);
            case 16:
                qs0 qs0Var = (qs0) ii0Var;
                oy0 oy0VarOooOo = py0.OooOo();
                byte[] bArrOooO0O05 = ((az0) qs0Var.f23692OooOo.f23325OooOo0o).OooO0O0();
                hz0 hz0VarOooOo05 = jz0.OooOo0(bArrOooO0O05, 0, bArrOooO0O05.length);
                oy0VarOooOo.OooO0Oo();
                ((py0) oy0VarOooOo.f25822OooOo0o).zzd = hz0VarOooOo05;
                return su0.OooO00o("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((py0) oy0VarOooOo.OooO0O0()).OooO0O0(), 2, jt0.OooO0O0(qs0Var.f23693OooOo0o.f24154OooO00o), qs0Var.f23694OooOoO);
            case 18:
                su0 su0Var = ((ut0) ii0Var).f24787OooOo0o;
                int i = tt0.f24508OooO0O0[OooOOo.OooOOO.OooO0O0(su0Var.f24166OooO0Oo)];
                return su0Var;
            default:
                av0 av0Var = (av0) ii0Var;
                tv0 tv0VarOooOo = uv0.OooOo();
                dv0 dv0Var = av0Var.f17120OooOo0o;
                xv0 xv0VarOooOo = yv0.OooOo();
                int i2 = dv0Var.f18413OooO0O0;
                xv0VarOooOo.OooO0Oo();
                ((yv0) xv0VarOooOo.f25822OooOo0o).zzc = i2;
                yv0 yv0Var = (yv0) xv0VarOooOo.OooO0O0();
                tv0VarOooOo.OooO0Oo();
                uv0.OooOooO((uv0) tv0VarOooOo.f25822OooOo0o, yv0Var);
                byte[] bArrOooO0O06 = ((az0) av0Var.f17119OooOo.f23325OooOo0o).OooO0O0();
                hz0 hz0VarOooOo06 = jz0.OooOo0(bArrOooO0O06, 0, bArrOooO0O06.length);
                tv0VarOooOo.OooO0Oo();
                ((uv0) tv0VarOooOo.f25822OooOo0o).zze = hz0VarOooOo06;
                return su0.OooO00o("type.googleapis.com/google.crypto.tink.AesCmacKey", ((uv0) tv0VarOooOo.OooO0O0()).OooO0O0(), 2, pv0.OooO0O0(av0Var.f17120OooOo0o.f18414OooO0OO), av0Var.f17121OooOoO);
        }
    }

    @Override // com.google.android.gms.internal.ads.pt0
    public ii0 OooO0o0(su0 su0Var) throws GeneralSecurityException {
        boolean z = false;
        switch (this.f25792OooOo0O) {
            case 1:
                if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    jz0 jz0Var = su0Var.f24165OooO0OO;
                    tz0 tz0Var = tz0.f24541OooO00o;
                    a11 a11Var = a11.f16875OooO0OO;
                    rw0 rw0VarOooOoO0 = rw0.OooOoO0(jz0Var, tz0.f24542OooO0O0);
                    if (rw0VarOooOoO0.OooOo0o() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1386ai c1386ai = new C1386ai(17);
                    c1386ai.OooOOo(rw0VarOooOoO0.OooOoO().OooOO0());
                    c1386ai.mo13703zza();
                    c1386ai.OooOo00();
                    c1386ai.f17045OooOoO = ys0.OooO00o(su0Var.f24168OooO0o0);
                    xr0 xr0VarOooOo = c1386ai.OooOo();
                    bi0 bi0Var = new bi0(4, z);
                    bi0Var.f17509OooOo0o = xr0VarOooOo;
                    bi0Var.f17507OooOo = pd0.OooO0o0(rw0VarOooOoO0.OooOoO().OooO0o0());
                    bi0Var.f17510OooOoO0 = su0Var.f24167OooO0o;
                    return bi0Var.OooO();
                } catch (k01 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 5:
                if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    jz0 jz0Var2 = su0Var.f24165OooO0OO;
                    tz0 tz0Var2 = tz0.f24541OooO00o;
                    a11 a11Var2 = a11.f16875OooO0OO;
                    vw0 vw0VarOooOoO0 = vw0.OooOoO0(jz0Var2, tz0.f24542OooO0O0);
                    if (vw0VarOooOoO0.OooOo0o() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int iOooOO0 = vw0VarOooOoO0.OooOoO().OooOO0();
                    if (iOooOO0 != 16 && iOooOO0 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iOooOO0)));
                    }
                    as0 as0Var = new as0(iOooOO0, zs0.OooO00o(su0Var.f24168OooO0o0));
                    bi0 bi0Var2 = new bi0(5, z);
                    bi0Var2.f17509OooOo0o = as0Var;
                    bi0Var2.f17507OooOo = pd0.OooO0o0(vw0VarOooOoO0.OooOoO().OooO0o0());
                    bi0Var2.f17510OooOoO0 = su0Var.f24167OooO0o;
                    return bi0Var2.OooOO0();
                } catch (k01 unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 9:
                if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    jz0 jz0Var3 = su0Var.f24165OooO0OO;
                    tz0 tz0Var3 = tz0.f24541OooO00o;
                    a11 a11Var3 = a11.f16875OooO0OO;
                    zw0 zw0VarOooOoO0 = zw0.OooOoO0(jz0Var3, tz0.f24542OooO0O0);
                    if (zw0VarOooOoO0.OooOo0o() == 0) {
                        return bs0.o00ooo(bt0.OooO00o(su0Var.f24168OooO0o0), pd0.OooO0o0(zw0VarOooOoO0.OooOoO().OooO0o0()), su0Var.f24167OooO0o);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (k01 unused3) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 13:
                if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    jz0 jz0Var4 = su0Var.f24165OooO0OO;
                    tz0 tz0Var4 = tz0.f24541OooO00o;
                    a11 a11Var4 = a11.f16875OooO0OO;
                    iy0 iy0VarOooOoO0 = iy0.OooOoO0(jz0Var4, tz0.f24542OooO0O0);
                    if (iy0VarOooOoO0.OooOo0o() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (iy0VarOooOoO0.OooOoOO().OooOO0() == 32) {
                        return os0.o00ooo(ps0.OooO0O0(it0.OooO00o(su0Var.f24168OooO0o0), iy0VarOooOoO0.OooOoO().OooOo0o()), pd0.OooO0o0(iy0VarOooOoO0.OooOoOO().OooO0o0()), su0Var.f24167OooO0o);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (k01 unused4) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            case 17:
                if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    jz0 jz0Var5 = su0Var.f24165OooO0OO;
                    tz0 tz0Var5 = tz0.f24541OooO00o;
                    a11 a11Var5 = a11.f16875OooO0OO;
                    py0 py0VarOooOoO0 = py0.OooOoO0(jz0Var5, tz0.f24542OooO0O0);
                    if (py0VarOooOoO0.OooOo0o() == 0) {
                        return qs0.o00ooo(jt0.OooO00o(su0Var.f24168OooO0o0), pd0.OooO0o0(py0VarOooOoO0.OooOoO().OooO0o0()), su0Var.f24167OooO0o);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (k01 unused5) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            default:
                if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    jz0 jz0Var6 = su0Var.f24165OooO0OO;
                    tz0 tz0Var6 = tz0.f24541OooO00o;
                    a11 a11Var6 = a11.f16875OooO0OO;
                    uv0 uv0VarOooOoO0 = uv0.OooOoO0(jz0Var6, tz0.f24542OooO0O0);
                    if (uv0VarOooOoO0.OooOo0o() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    bi0 bi0Var3 = new bi0(8);
                    bi0Var3.OooO00o(uv0VarOooOoO0.OooOoOO().OooOO0());
                    bi0Var3.OooO0o0(uv0VarOooOoO0.OooOoO().OooOo0o());
                    bi0Var3.f17510OooOoO0 = pv0.OooO00o(su0Var.f24168OooO0o0);
                    dv0 dv0VarOooOO0o = bi0Var3.OooOO0o();
                    bi0 bi0Var4 = new bi0(7, z);
                    bi0Var4.f17509OooOo0o = dv0VarOooOO0o;
                    bi0Var4.f17507OooOo = pd0.OooO0o0(uv0VarOooOoO0.OooOoOO().OooO0o0());
                    bi0Var4.f17510OooOoO0 = su0Var.f24167OooO0o;
                    return bi0Var4.OooOO0O();
                } catch (k01 | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.mu0, com.google.android.gms.internal.ads.rt0
    public Object OooO0OO(ii0 ii0Var) throws GeneralSecurityException {
        switch (this.f25792OooOo0O) {
            case 19:
                if (((av0) ii0Var).f17120OooOo0o.f18412OooO00o == 32) {
                    ev0 ev0Var = new ev0();
                    if (xh0.OooOo0O(1)) {
                        return ev0Var;
                    }
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 20:
                av0 av0Var = (av0) ii0Var;
                if (av0Var.f17120OooOo0o.f18412OooO00o == 32) {
                    return new zy0(av0Var);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 21:
                ev0 ev0Var2 = new ev0();
                if (xh0.OooOo0O(2)) {
                    return ev0Var2;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 22:
                return new zy0((fv0) ii0Var);
            default:
                int[] iArr = tt0.f24508OooO0O0;
                su0 su0Var = ((ut0) ii0Var).f24787OooOo0o;
                int i = iArr[OooOOo.OooOOO.OooO0O0(su0Var.f24166OooO0Oo)];
                jx0 jx0VarOooOo0o = kx0.OooOo0o();
                jx0VarOooOo0o.OooO0Oo();
                kx0.OooOoo((kx0) jx0VarOooOo0o.f25822OooOo0o, su0Var.f24163OooO00o);
                jx0VarOooOo0o.OooO0Oo();
                kx0.OooOooO((kx0) jx0VarOooOo0o.f25822OooOo0o, su0Var.f24165OooO0OO);
                jx0VarOooOo0o.OooO0Oo();
                kx0.OooOoo0((kx0) jx0VarOooOo0o.f25822OooOo0o, su0Var.f24166OooO0Oo);
                int iOrdinal = su0Var.f24168OooO0o0.ordinal();
                if (iOrdinal == 1) {
                    gu0.OooO0O0(su0Var.f24167OooO0o.intValue()).OooO0O0();
                } else if (iOrdinal == 2) {
                    gu0.OooO00o(su0Var.f24167OooO0o.intValue()).OooO0O0();
                } else if (iOrdinal == 3) {
                    gu0.f19473OooO00o.OooO0O0();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    gu0.OooO00o(su0Var.f24167OooO0o.intValue()).OooO0O0();
                }
                return new nv0();
        }
    }
}

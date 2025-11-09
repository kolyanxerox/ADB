package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class el0 implements hl0, il0, mu0, ku0, iu0, rt0, pt0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f18624OooOo0O;

    public /* synthetic */ el0(int i) {
        this.f18624OooOo0O = i;
    }

    @Override // com.google.android.gms.internal.ads.iu0
    public yq0 OooO00o(tu0 tu0Var) throws GeneralSecurityException {
        switch (this.f18624OooOo0O) {
            case 11:
                mx0 mx0Var = tu0Var.f24510OooO0O0;
                if (!mx0Var.OooOoo0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO = mx0Var.OooOoOO();
                    tz0 tz0Var = tz0.f24541OooO00o;
                    a11 a11Var = a11.f16875OooO0OO;
                    return new is0(ay0.OooOoO0(jz0VarOooOoOO, tz0.f24542OooO0O0).OooOoO(), js0.OooO00o(mx0Var.OooOoO()));
                } catch (k01 e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            case 15:
                mx0 mx0Var2 = tu0Var.f24510OooO0O0;
                if (!mx0Var2.OooOoo0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var2.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO2 = mx0Var2.OooOoOO();
                    tz0 tz0Var2 = tz0.f24541OooO00o;
                    a11 a11Var2 = a11.f16875OooO0OO;
                    return ms0.OooO00o(ey0.OooOoO(jz0VarOooOoOO2, tz0.f24542OooO0O0), mx0Var2.OooOoO());
                } catch (k01 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
            case 21:
                mx0 mx0Var3 = tu0Var.f24510OooO0O0;
                if (!mx0Var3.OooOoo0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var3.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO3 = mx0Var3.OooOoOO();
                    tz0 tz0Var3 = tz0.f24541OooO00o;
                    a11 a11Var3 = a11.f16875OooO0OO;
                    cw0 cw0VarOooOo = cw0.OooOo(jz0VarOooOoOO3, tz0.f24542OooO0O0);
                    if (cw0VarOooOo.OooOoO().OooOo() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    s20 s20Var = new s20();
                    s20Var.OooO0OO(cw0VarOooOo.OooOoO0().OooOo0o());
                    s20Var.OooO0o0(cw0VarOooOo.OooOoO().OooOo0o());
                    s20Var.OooO0o(cw0VarOooOo.OooOoO0().OooOoO().OooOo0o());
                    s20Var.OooO(cw0VarOooOo.OooOoO().OooOoo0().OooOo0o());
                    s20Var.f23975OooOo = ts0.OooO00o(cw0VarOooOo.OooOoO().OooOoo0().OooOo());
                    s20Var.f23979OooOoO0 = ts0.OooO0O0(mx0Var3.OooOoO());
                    return s20Var.OooOO0O();
                } catch (k01 e3) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e3);
                }
            case 25:
                mx0 mx0Var4 = tu0Var.f24510OooO0O0;
                if (!mx0Var4.OooOoo0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var4.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO4 = mx0Var4.OooOoOO();
                    tz0 tz0Var4 = tz0.f24541OooO00o;
                    a11 a11Var4 = a11.f16875OooO0OO;
                    nw0 nw0VarOooOoO0 = nw0.OooOoO0(jz0VarOooOoOO4, tz0.f24542OooO0O0);
                    C2051sk c2051sk = new C2051sk(16);
                    c2051sk.OooOOO0(nw0VarOooOoO0.OooOo0o());
                    c2051sk.OooO0oo(nw0VarOooOoO0.OooOoO().OooOo0o());
                    c2051sk.OooOOo0();
                    c2051sk.f24099OooOoO = vs0.OooO00o(mx0Var4.OooOoO());
                    return c2051sk.OooOoO0();
                } catch (k01 e4) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e4);
                }
            default:
                mx0 mx0Var5 = tu0Var.f24510OooO0O0;
                if (!mx0Var5.OooOoo0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(mx0Var5.OooOoo0())));
                }
                try {
                    jz0 jz0VarOooOoOO5 = mx0Var5.OooOoOO();
                    tz0 tz0Var5 = tz0.f24541OooO00o;
                    a11 a11Var5 = a11.f16875OooO0OO;
                    tw0 tw0VarOooOoO = tw0.OooOoO(jz0VarOooOoOO5, tz0.f24542OooO0O0);
                    if (tw0VarOooOoO.OooOo() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    C1386ai c1386ai = new C1386ai(17);
                    c1386ai.OooOOo(tw0VarOooOoO.OooOo0o());
                    c1386ai.mo13703zza();
                    c1386ai.OooOo00();
                    c1386ai.f17045OooOoO = ys0.OooO00o(mx0Var5.OooOoO());
                    return c1386ai.OooOo();
                } catch (k01 e5) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e5);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.ku0
    public tu0 OooO0O0(yq0 yq0Var) {
        switch (this.f18624OooOo0O) {
            case 10:
                is0 is0Var = (is0) yq0Var;
                lx0 lx0VarOooOo0o = mx0.OooOo0o();
                lx0VarOooOo0o.OooO0oO("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                zx0 zx0VarOooOo0o = ay0.OooOo0o();
                String str = is0Var.f20114OooO00o;
                zx0VarOooOo0o.OooO0Oo();
                ay0.OooOoOO((ay0) zx0VarOooOo0o.f25822OooOo0o, str);
                lx0VarOooOo0o.OooO0oo(((ay0) zx0VarOooOo0o.OooO0O0()).OooO0O0());
                lx0VarOooOo0o.OooO0o(js0.OooO0O0(is0Var.f20115OooO0O0));
                return tu0.OooO00o((mx0) lx0VarOooOo0o.OooO0O0());
            case 14:
                ls0 ls0Var = (ls0) yq0Var;
                lx0 lx0VarOooOo0o2 = mx0.OooOo0o();
                lx0VarOooOo0o2.OooO0oO("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                lx0VarOooOo0o2.OooO0oo(ms0.OooO0O0(ls0Var).OooO0O0());
                lx0VarOooOo0o2.OooO0o(ms0.OooO0OO(ls0Var.f20944OooO00o));
                return tu0.OooO00o((mx0) lx0VarOooOo0o2.OooO0O0());
            case 20:
                qr0 qr0Var = (qr0) yq0Var;
                lx0 lx0VarOooOo0o3 = mx0.OooOo0o();
                lx0VarOooOo0o3.OooO0oO("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                bw0 bw0VarOooOo0o = cw0.OooOo0o();
                fw0 fw0VarOooOo = gw0.OooOo();
                hw0 hw0VarOooOo = iw0.OooOo();
                int i = qr0Var.f23685OooO0OO;
                hw0VarOooOo.OooO0Oo();
                ((iw0) hw0VarOooOo.f25822OooOo0o).zzc = i;
                iw0 iw0Var = (iw0) hw0VarOooOo.OooO0O0();
                fw0VarOooOo.OooO0Oo();
                gw0.OooOoo0((gw0) fw0VarOooOo.f25822OooOo0o, iw0Var);
                fw0VarOooOo.OooO0Oo();
                ((gw0) fw0VarOooOo.f25822OooOo0o).zze = qr0Var.f23683OooO00o;
                gw0 gw0Var = (gw0) fw0VarOooOo.OooO0O0();
                bw0VarOooOo0o.OooO0Oo();
                cw0.OooOoOO((cw0) bw0VarOooOo0o.f25822OooOo0o, gw0Var);
                fx0 fx0VarOooOoO0 = gx0.OooOoO0();
                ix0 ix0VarOooO0OO = ts0.OooO0OO(qr0Var);
                fx0VarOooOoO0.OooO0Oo();
                gx0.OooOooO((gx0) fx0VarOooOoO0.f25822OooOo0o, ix0VarOooO0OO);
                fx0VarOooOoO0.OooO0Oo();
                ((gx0) fx0VarOooOoO0.f25822OooOo0o).zze = qr0Var.f23684OooO0O0;
                gx0 gx0Var = (gx0) fx0VarOooOoO0.OooO0O0();
                bw0VarOooOo0o.OooO0Oo();
                cw0.OooOoo0((cw0) bw0VarOooOo0o.f25822OooOo0o, gx0Var);
                lx0VarOooOo0o3.OooO0oo(((cw0) bw0VarOooOo0o.OooO0O0()).OooO0O0());
                lx0VarOooOo0o3.OooO0o(ts0.OooO0Oo(qr0Var.f23688OooO0o0));
                return tu0.OooO00o((mx0) lx0VarOooOo0o3.OooO0O0());
            case 24:
                ur0 ur0Var = (ur0) yq0Var;
                lx0 lx0VarOooOo0o4 = mx0.OooOo0o();
                lx0VarOooOo0o4.OooO0oO("type.googleapis.com/google.crypto.tink.AesEaxKey");
                mw0 mw0VarOooOo = nw0.OooOo();
                ow0 ow0VarOooOo = pw0.OooOo();
                int i2 = ur0Var.f24773OooO0O0;
                ow0VarOooOo.OooO0Oo();
                ((pw0) ow0VarOooOo.f25822OooOo0o).zzc = i2;
                pw0 pw0Var = (pw0) ow0VarOooOo.OooO0O0();
                mw0VarOooOo.OooO0Oo();
                nw0.OooOoo0((nw0) mw0VarOooOo.f25822OooOo0o, pw0Var);
                mw0VarOooOo.OooO0Oo();
                ((nw0) mw0VarOooOo.f25822OooOo0o).zze = ur0Var.f24772OooO00o;
                lx0VarOooOo0o4.OooO0oo(((nw0) mw0VarOooOo.OooO0O0()).OooO0O0());
                lx0VarOooOo0o4.OooO0o(vs0.OooO0O0(ur0Var.f24774OooO0OO));
                return tu0.OooO00o((mx0) lx0VarOooOo0o4.OooO0O0());
            default:
                xr0 xr0Var = (xr0) yq0Var;
                lx0 lx0VarOooOo0o5 = mx0.OooOo0o();
                lx0VarOooOo0o5.OooO0oO("type.googleapis.com/google.crypto.tink.AesGcmKey");
                sw0 sw0VarOooOoO0 = tw0.OooOoO0();
                int i3 = xr0Var.f25788OooO00o;
                sw0VarOooOoO0.OooO0Oo();
                ((tw0) sw0VarOooOoO0.f25822OooOo0o).zzc = i3;
                lx0VarOooOo0o5.OooO0oo(((tw0) sw0VarOooOoO0.OooO0O0()).OooO0O0());
                lx0VarOooOo0o5.OooO0o(ys0.OooO0O0(xr0Var.f25789OooO0O0));
                return tu0.OooO00o((mx0) lx0VarOooOo0o5.OooO0O0());
        }
    }

    @Override // com.google.android.gms.internal.ads.mu0, com.google.android.gms.internal.ads.rt0
    public su0 OooO0OO(ii0 ii0Var) {
        switch (this.f18624OooOo0O) {
            case 12:
                hs0 hs0Var = (hs0) ii0Var;
                xx0 xx0VarOooOo = yx0.OooOo();
                zx0 zx0VarOooOo0o = ay0.OooOo0o();
                is0 is0Var = hs0Var.f19848OooOo0o;
                zx0VarOooOo0o.OooO0Oo();
                ay0.OooOoOO((ay0) zx0VarOooOo0o.f25822OooOo0o, is0Var.f20114OooO00o);
                ay0 ay0Var = (ay0) zx0VarOooOo0o.OooO0O0();
                xx0VarOooOo.OooO0Oo();
                yx0.OooOoo0((yx0) xx0VarOooOo.f25822OooOo0o, ay0Var);
                return su0.OooO00o("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((yx0) xx0VarOooOo.OooO0O0()).OooO0O0(), 5, js0.OooO0O0(hs0Var.f19848OooOo0o.f20115OooO0O0), hs0Var.f19847OooOo);
            case 16:
                ks0 ks0Var = (ks0) ii0Var;
                by0 by0VarOooOo = cy0.OooOo();
                ey0 ey0VarOooO0O0 = ms0.OooO0O0(ks0Var.f20671OooOo0o);
                by0VarOooOo.OooO0Oo();
                cy0.OooOoo0((cy0) by0VarOooOo.f25822OooOo0o, ey0VarOooO0O0);
                return su0.OooO00o("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((cy0) by0VarOooOo.OooO0O0()).OooO0O0(), 5, ms0.OooO0OO(ks0Var.f20671OooOo0o.f20944OooO00o), ks0Var.f20670OooOo);
            case 22:
                kr0 kr0Var = (kr0) ii0Var;
                zv0 zv0VarOooOo = aw0.OooOo();
                dw0 dw0VarOooOo = ew0.OooOo();
                hw0 hw0VarOooOo = iw0.OooOo();
                int i = kr0Var.f20663OooOo0o.f23685OooO0OO;
                hw0VarOooOo.OooO0Oo();
                ((iw0) hw0VarOooOo.f25822OooOo0o).zzc = i;
                iw0 iw0Var = (iw0) hw0VarOooOo.OooO0O0();
                dw0VarOooOo.OooO0Oo();
                ew0.OooOoo((ew0) dw0VarOooOo.f25822OooOo0o, iw0Var);
                byte[] bArrOooO0O0 = ((az0) kr0Var.f20662OooOo.f23325OooOo0o).OooO0O0();
                hz0 hz0VarOooOo0 = jz0.OooOo0(bArrOooO0O0, 0, bArrOooO0O0.length);
                dw0VarOooOo.OooO0Oo();
                ((ew0) dw0VarOooOo.f25822OooOo0o).zzf = hz0VarOooOo0;
                ew0 ew0Var = (ew0) dw0VarOooOo.OooO0O0();
                zv0VarOooOo.OooO0Oo();
                aw0.OooOoo((aw0) zv0VarOooOo.f25822OooOo0o, ew0Var);
                cx0 cx0VarOooOo = ex0.OooOo();
                qr0 qr0Var = kr0Var.f20663OooOo0o;
                ix0 ix0VarOooO0OO = ts0.OooO0OO(qr0Var);
                cx0VarOooOo.OooO0Oo();
                ex0.OooOooo((ex0) cx0VarOooOo.f25822OooOo0o, ix0VarOooO0OO);
                byte[] bArrOooO0O02 = ((az0) kr0Var.f20665OooOoO0.f23325OooOo0o).OooO0O0();
                hz0 hz0VarOooOo02 = jz0.OooOo0(bArrOooO0O02, 0, bArrOooO0O02.length);
                cx0VarOooOo.OooO0Oo();
                ((ex0) cx0VarOooOo.f25822OooOo0o).zzf = hz0VarOooOo02;
                ex0 ex0Var = (ex0) cx0VarOooOo.OooO0O0();
                zv0VarOooOo.OooO0Oo();
                aw0.OooOooO((aw0) zv0VarOooOo.f25822OooOo0o, ex0Var);
                return su0.OooO00o("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((aw0) zv0VarOooOo.OooO0O0()).OooO0O0(), 2, ts0.OooO0Oo(qr0Var.f23688OooO0o0), kr0Var.f20666OooOoOO);
            default:
                rr0 rr0Var = (rr0) ii0Var;
                jw0 jw0VarOooOo = kw0.OooOo();
                ur0 ur0Var = rr0Var.f23932OooOo0o;
                ow0 ow0VarOooOo = pw0.OooOo();
                int i2 = ur0Var.f24773OooO0O0;
                ow0VarOooOo.OooO0Oo();
                ((pw0) ow0VarOooOo.f25822OooOo0o).zzc = i2;
                pw0 pw0Var = (pw0) ow0VarOooOo.OooO0O0();
                jw0VarOooOo.OooO0Oo();
                kw0.OooOooO((kw0) jw0VarOooOo.f25822OooOo0o, pw0Var);
                byte[] bArrOooO0O03 = ((az0) rr0Var.f23931OooOo.f23325OooOo0o).OooO0O0();
                hz0 hz0VarOooOo03 = jz0.OooOo0(bArrOooO0O03, 0, bArrOooO0O03.length);
                jw0VarOooOo.OooO0Oo();
                ((kw0) jw0VarOooOo.f25822OooOo0o).zzf = hz0VarOooOo03;
                return su0.OooO00o("type.googleapis.com/google.crypto.tink.AesEaxKey", ((kw0) jw0VarOooOo.OooO0O0()).OooO0O0(), 2, vs0.OooO0O0(rr0Var.f23932OooOo0o.f24774OooO0OO), rr0Var.f23933OooOoO);
        }
    }

    @Override // com.google.android.gms.internal.ads.hl0
    public Iterator OooO0Oo(ni0 ni0Var, CharSequence charSequence) {
        return new dl0(charSequence);
    }

    @Override // com.google.android.gms.internal.ads.pt0
    public ii0 OooO0o0(su0 su0Var) throws GeneralSecurityException {
        switch (this.f18624OooOo0O) {
            case 13:
                if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    jz0 jz0Var = su0Var.f24165OooO0OO;
                    tz0 tz0Var = tz0.f24541OooO00o;
                    a11 a11Var = a11.f16875OooO0OO;
                    yx0 yx0VarOooOoO0 = yx0.OooOoO0(jz0Var, tz0.f24542OooO0O0);
                    if (yx0VarOooOoO0.OooOo0o() == 0) {
                        return hs0.o00ooo(new is0(yx0VarOooOoO0.OooOoO().OooOoO(), js0.OooO00o(su0Var.f24168OooO0o0)), su0Var.f24167OooO0o);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(yx0VarOooOoO0)));
                } catch (k01 e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            case 17:
                if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    jz0 jz0Var2 = su0Var.f24165OooO0OO;
                    tz0 tz0Var2 = tz0.f24541OooO00o;
                    a11 a11Var2 = a11.f16875OooO0OO;
                    cy0 cy0VarOooOoO0 = cy0.OooOoO0(jz0Var2, tz0.f24542OooO0O0);
                    if (cy0VarOooOoO0.OooOo0o() == 0) {
                        return ks0.o00ooo(ms0.OooO00o(cy0VarOooOoO0.OooOoO(), su0Var.f24168OooO0o0), su0Var.f24167OooO0o);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(cy0VarOooOoO0)));
                } catch (k01 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
            case 23:
                if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    jz0 jz0Var3 = su0Var.f24165OooO0OO;
                    tz0 tz0Var3 = tz0.f24541OooO00o;
                    a11 a11Var3 = a11.f16875OooO0OO;
                    aw0 aw0VarOooOoO0 = aw0.OooOoO0(jz0Var3, tz0.f24542OooO0O0);
                    if (aw0VarOooOoO0.OooOo0o() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (aw0VarOooOoO0.OooOoO().OooOo0o() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (aw0VarOooOoO0.OooOoOO().OooOo0o() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    s20 s20Var = new s20();
                    s20Var.OooO0OO(aw0VarOooOoO0.OooOoO().OooOoOO().OooOO0());
                    s20Var.OooO0o0(aw0VarOooOoO0.OooOoOO().OooOoo0().OooOO0());
                    s20Var.OooO0o(aw0VarOooOoO0.OooOoO().OooOoO().OooOo0o());
                    s20Var.OooO(aw0VarOooOoO0.OooOoOO().OooOoOO().OooOo0o());
                    s20Var.f23975OooOo = ts0.OooO00o(aw0VarOooOoO0.OooOoOO().OooOoOO().OooOo());
                    s20Var.f23979OooOoO0 = ts0.OooO0O0(su0Var.f24168OooO0o0);
                    qr0 qr0VarOooOO0O = s20Var.OooOO0O();
                    C1386ai c1386ai = new C1386ai(16);
                    c1386ai.f17044OooOo0o = qr0VarOooOO0O;
                    c1386ai.f17042OooOo = pd0.OooO0o0(aw0VarOooOoO0.OooOoO().OooOoOO().OooO0o0());
                    c1386ai.f17046OooOoO0 = pd0.OooO0o0(aw0VarOooOoO0.OooOoOO().OooOoo0().OooO0o0());
                    c1386ai.f17045OooOoO = su0Var.f24167OooO0o;
                    return c1386ai.OooOo0o();
                } catch (k01 unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            default:
                if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    jz0 jz0Var4 = su0Var.f24165OooO0OO;
                    tz0 tz0Var4 = tz0.f24541OooO00o;
                    a11 a11Var4 = a11.f16875OooO0OO;
                    kw0 kw0VarOooOoO0 = kw0.OooOoO0(jz0Var4, tz0.f24542OooO0O0);
                    if (kw0VarOooOoO0.OooOo0o() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2051sk c2051sk = new C2051sk(16);
                    c2051sk.OooOOO0(kw0VarOooOoO0.OooOoOO().OooOO0());
                    c2051sk.OooO0oo(kw0VarOooOoO0.OooOoO().OooOo0o());
                    c2051sk.OooOOo0();
                    c2051sk.f24099OooOoO = vs0.OooO00o(su0Var.f24168OooO0o0);
                    ur0 ur0VarOooOoO0 = c2051sk.OooOoO0();
                    bi0 bi0Var = new bi0(3, false);
                    bi0Var.f17509OooOo0o = ur0VarOooOoO0;
                    bi0Var.f17507OooOo = pd0.OooO0o0(kw0VarOooOoO0.OooOoOO().OooO0o0());
                    bi0Var.f17510OooOoO0 = su0Var.f24167OooO0o;
                    return bi0Var.OooO0oo();
                } catch (k01 unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Object mo13704zza() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.mu0, com.google.android.gms.internal.ads.rt0
    public Object OooO0OO(ii0 ii0Var) throws GeneralSecurityException {
        byte[] bArrOooO0O0;
        switch (this.f18624OooOo0O) {
            case 2:
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
                pq0 pq0Var = (pq0) br0.OooO00o((kx0) jx0VarOooOo0o.OooO0O0(), pq0.class);
                fy0 fy0Var = su0Var.f24168OooO0o0;
                int iOrdinal = fy0Var.ordinal();
                if (iOrdinal == 1) {
                    bArrOooO0O0 = gu0.OooO0O0(su0Var.f24167OooO0o.intValue()).OooO0O0();
                } else if (iOrdinal == 2) {
                    bArrOooO0O0 = gu0.OooO00o(su0Var.f24167OooO0o.intValue()).OooO0O0();
                } else if (iOrdinal == 3) {
                    bArrOooO0O0 = gu0.f19473OooO00o.OooO0O0();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(fy0Var)));
                    }
                    bArrOooO0O0 = gu0.OooO00o(su0Var.f24167OooO0o.intValue()).OooO0O0();
                }
                return new gt0(pq0Var, bArrOooO0O0);
            case 3:
                kr0 kr0Var = (kr0) ii0Var;
                byte[] bArrOooO0O02 = ((az0) kr0Var.f20662OooOo.f23325OooOo0o).OooO0O0();
                qr0 qr0Var = kr0Var.f20663OooOo0o;
                ry0 ry0Var = new ry0(bArrOooO0O02, qr0Var.f23685OooO0OO);
                String strValueOf = String.valueOf(qr0Var.f23687OooO0o);
                b40 b40Var = new b40("HMAC".concat(strValueOf), new SecretKeySpec(((az0) kr0Var.f20665OooOoO0.f23325OooOo0o).OooO0O0(), "HMAC"));
                int i2 = qr0Var.f23686OooO0Oo;
                return new ty0(ry0Var, new zy0(b40Var, i2), i2, kr0Var.f20664OooOoO.OooO0O0());
            case 4:
                rr0 rr0Var = (rr0) ii0Var;
                Oooo0oO.o00000O o00000o = sy0.f24201OooO0o;
                if (xh0.OooOo0O(1)) {
                    return new sy0(((az0) rr0Var.f23931OooOo.f23325OooOo0o).OooO0O0(), rr0Var.f23932OooOo0o.f24773OooO0O0, rr0Var.f23934OooOoO0.OooO0O0());
                }
                throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
            case 5:
                vr0 vr0Var = (vr0) ii0Var;
                return new gt0(((az0) vr0Var.f25112OooOo.f23325OooOo0o).OooO0O0(), vr0Var.f25115OooOoO0);
            case 6:
                yr0 yr0Var = (yr0) ii0Var;
                return new kt0(((az0) yr0Var.f26012OooOo.f23325OooOo0o).OooO0O0(), yr0Var.f26015OooOoO0.OooO0O0());
            case 7:
                bs0 bs0Var = (bs0) ii0Var;
                lu0 lu0Var = cs0.f18052OooO00o;
                Object obj = at0.f17109OooO0o.get();
                az0 az0Var = bs0Var.f17594OooOoO0;
                pd0 pd0Var = bs0Var.f17591OooOo;
                if (obj != null) {
                    return new at0(((az0) pd0Var.f23325OooOo0o).OooO0O0(), az0Var.OooO0O0());
                }
                return new gt0(((az0) pd0Var.f23325OooOo0o).OooO0O0(), 3, az0Var.OooO0O0());
            case 8:
                lu0 lu0Var2 = es0.f18693OooO00o;
                wq0.OooO00o(((hs0) ii0Var).f19848OooOo0o.f20114OooO00o);
                throw null;
            case 9:
                st0 st0Var = gs0.f19451OooO00o;
                wq0.OooO00o(((ks0) ii0Var).f20671OooOo0o.f20945OooO0O0);
                throw null;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                qs0 qs0Var = (qs0) ii0Var;
                lu0 lu0Var3 = rs0.f23937OooO00o;
                Cipher cipher = (Cipher) at0.f17109OooO0o.get();
                az0 az0Var2 = qs0Var.f23695OooOoO0;
                pd0 pd0Var2 = qs0Var.f23692OooOo;
                if (cipher != null) {
                    return new gt0(((az0) pd0Var2.f23325OooOo0o).OooO0O0(), 1, az0Var2.OooO0O0());
                }
                return new gt0(((az0) pd0Var2.f23325OooOo0o).OooO0O0(), 4, az0Var2.OooO0O0());
            case 18:
                os0 os0Var = (os0) ii0Var;
                return new ht0(((az0) os0Var.f23100OooOo.f23325OooOo0o).OooO0O0(), os0Var.f23103OooOoO0, os0Var.f23101OooOo0o.f23425OooO0O0);
        }
    }
}

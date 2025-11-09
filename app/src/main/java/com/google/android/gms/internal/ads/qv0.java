package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final /* synthetic */ class qv0 implements rt0, pt0, t01, il0, InterfaceC1770kz, InterfaceC2251xz {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f23707OooOo0O;

    public /* synthetic */ qv0(int i) {
        this.f23707OooOo0O = i;
    }

    public static String OooO(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if ((((length - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                cArr[i6] = (char) b2;
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = bArr[i];
                    if (b3 >= 0) {
                        i++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                }
            } else {
                if (b2 < -32) {
                    if (i7 >= i4) {
                        throw new k01("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    i += 2;
                    ii0.Oooo0o(b2, bArr[i7], cArr, i6);
                } else if (b2 < -16) {
                    if (i7 >= i4 - 1) {
                        throw new k01("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    ii0.OooOoo(b2, bArr[i7], bArr[i8], cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw new k01("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = bArr[i7];
                    int i9 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    ii0.OooO(b2, b4, b5, bArr[i9], cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    public static final h01 OooO0Oo(long j, Object obj) {
        h01 h01Var = (h01) q11.OooO(j, obj);
        if (((cz0) h01Var).f18106OooOo0O) {
            return h01Var;
        }
        int size = h01Var.size();
        h01 h01VarOooO0O0 = h01Var.OooO0O0(size == 0 ? 10 : size + size);
        q11.OooOOO(j, obj, h01VarOooO0O0);
        return h01VarOooO0O0;
    }

    public static final q01 OooO0oo(Object obj, Object obj2) {
        q01 q01VarOooO00o = (q01) obj;
        q01 q01Var = (q01) obj2;
        if (!q01Var.isEmpty()) {
            if (!q01VarOooO00o.f23474OooOo0O) {
                q01VarOooO00o = q01VarOooO00o.OooO00o();
            }
            q01VarOooO00o.OooO0OO();
            if (!q01Var.isEmpty()) {
                q01VarOooO00o.putAll(q01Var);
            }
        }
        return q01VarOooO00o;
    }

    public static final String OooOO0(ByteBuffer byteBuffer, int i, int i2) throws k01 {
        int i3;
        if ((((byteBuffer.limit() - i) - i2) | i | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i4 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i4) {
            byte b = byteBuffer.get(i);
            if (b < 0) {
                break;
            }
            i++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i < i4) {
            int i7 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                cArr[i6] = (char) b2;
                i6++;
                i = i7;
                while (i < i4) {
                    byte b3 = byteBuffer.get(i);
                    if (b3 >= 0) {
                        i++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                }
            } else {
                if (b2 < -32) {
                    if (i7 >= i4) {
                        throw new k01("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    i += 2;
                    ii0.Oooo0o(b2, byteBuffer.get(i7), cArr, i6);
                } else if (b2 < -16) {
                    if (i7 >= i4 - 1) {
                        throw new k01("Protocol message had invalid UTF-8.");
                    }
                    i3 = i6 + 1;
                    int i8 = i + 2;
                    i += 3;
                    ii0.OooOoo(b2, byteBuffer.get(i7), byteBuffer.get(i8), cArr, i6);
                } else {
                    if (i7 >= i4 - 2) {
                        throw new k01("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = byteBuffer.get(i7);
                    int i9 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    ii0.OooO(b2, b4, b5, byteBuffer.get(i9), cArr, i6);
                    i6 += 2;
                }
                i6 = i3;
            }
        }
        return new String(cArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.ads.t01
    public c11 OooO00o(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.t01
    public boolean OooO0O0(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.rt0
    public su0 OooO0OO(ii0 ii0Var) {
        fv0 fv0Var = (fv0) ii0Var;
        cx0 cx0VarOooOo = ex0.OooOo();
        jv0 jv0Var = fv0Var.f19131OooOo0o;
        hx0 hx0VarOooOoO0 = ix0.OooOoO0();
        int i = jv0Var.f20396OooO0O0;
        hx0VarOooOoO0.OooO0Oo();
        ((ix0) hx0VarOooOoO0.f25822OooOo0o).zzd = i;
        bx0 bx0Var = (bx0) rv0.f23944OooO0O0.OooO00o(jv0Var.f20398OooO0Oo);
        hx0VarOooOoO0.OooO0Oo();
        ((ix0) hx0VarOooOoO0.f25822OooOo0o).zzc = bx0Var.OooO00o();
        ix0 ix0Var = (ix0) hx0VarOooOoO0.OooO0O0();
        cx0VarOooOo.OooO0Oo();
        ex0.OooOooo((ex0) cx0VarOooOo.f25822OooOo0o, ix0Var);
        byte[] bArrOooO0O0 = ((az0) fv0Var.f19130OooOo.f23325OooOo0o).OooO0O0();
        hz0 hz0VarOooOo0 = jz0.OooOo0(bArrOooO0O0, 0, bArrOooO0O0.length);
        cx0VarOooOo.OooO0Oo();
        ((ex0) cx0VarOooOo.f25822OooOo0o).zzf = hz0VarOooOo0;
        return su0.OooO00o("type.googleapis.com/google.crypto.tink.HmacKey", ((ex0) cx0VarOooOo.OooO0O0()).OooO0O0(), 2, (fy0) rv0.f23943OooO00o.OooO00o(fv0Var.f19131OooOo0o.f20397OooO0OO), fv0Var.f19132OooOoO);
    }

    public /* bridge */ Object OooO0o(String str, Provider provider) {
        switch (this.f23707OooOo0O) {
            case 2:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 3:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 4:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 5:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 6:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 7:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // com.google.android.gms.internal.ads.pt0
    public ii0 OooO0o0(su0 su0Var) throws GeneralSecurityException {
        if (!su0Var.f24163OooO00o.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            jz0 jz0Var = su0Var.f24165OooO0OO;
            tz0 tz0Var = tz0.f24541OooO00o;
            a11 a11Var = a11.f16875OooO0OO;
            ex0 ex0VarOooOoO = ex0.OooOoO(jz0Var, tz0.f24542OooO0O0);
            if (ex0VarOooOoO.OooOo0o() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C1386ai c1386ai = new C1386ai(18);
            c1386ai.OooOOo(ex0VarOooOoO.OooOoo0().OooOO0());
            c1386ai.OooOo0(ex0VarOooOoO.OooOoOO().OooOo0o());
            c1386ai.f17046OooOoO0 = (hv0) rv0.f23944OooO0O0.OooO0O0(ex0VarOooOoO.OooOoOO().OooOo());
            c1386ai.f17045OooOoO = (iv0) rv0.f23943OooO00o.OooO0O0(su0Var.f24168OooO0o0);
            jv0 jv0VarOooOoO0 = c1386ai.OooOoO0();
            bi0 bi0Var = new bi0(9, false);
            bi0Var.f17509OooOo0o = jv0VarOooOoO0;
            bi0Var.f17507OooOo = pd0.OooO0o0(ex0VarOooOoO.OooOoo0().OooO0o0());
            bi0Var.f17510OooOoO0 = su0Var.f24167OooO0o;
            return bi0Var.OooOOO0();
        } catch (k01 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251xz
    public void OooO0oO(Object obj, ka1 ka1Var) {
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Object mo13704zza() {
        return new k41();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        switch (this.f23707OooOo0O) {
            case 16:
                h61 h61Var = (h61) obj;
                int i = w41.f25183o00ooo;
                h61Var.OooO(h61Var.OooO0oO(), 14, new f61(29));
                break;
            case 17:
                h61 h61Var2 = (h61) obj;
                int i2 = w41.f25183o00ooo;
                h61Var2.OooO(h61Var2.OooOO0o(), 22, new f61(4));
                break;
            case 18:
                h61 h61Var3 = (h61) obj;
                int i3 = w41.f25183o00ooo;
                h61Var3.OooO(h61Var3.OooOO0o(), 24, new g61(0));
                break;
            case 19:
                h61 h61Var4 = (h61) obj;
                l41 l41Var = new l41(2, 1003, new OooOOO0.OooO00o("Player release timed out."));
                h61Var4.getClass();
                h91 h91Var = l41Var.f20800OooOoo;
                d61 d61VarOooOO0 = h91Var != null ? h61Var4.OooOO0(h91Var) : h61Var4.OooO0oO();
                h61Var4.OooO(d61VarOooOO0, 10, new hk0(d61VarOooOO0, l41Var));
                break;
            case 20:
            default:
                break;
            case 21:
                h61 h61Var5 = (h61) obj;
                int i4 = w41.f25183o00ooo;
                h61Var5.OooO(h61Var5.OooO0oO(), 1, new f61(2));
                break;
            case 22:
                h61 h61Var6 = (h61) obj;
                h61Var6.OooO(h61Var6.OooOO0o(), 23, new f61(3));
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
    }
}

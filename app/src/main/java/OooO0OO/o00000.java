package Oooo0oO;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.EditText;
import com.google.android.gms.internal.measurement.o0OO00OO;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.OooOo;
import o0000Oo.Oooo0;
import o000Oo0O.OooOo00;
import o000ooOO.o000OO0O;
import o00O0oOO.OooOO0O;
import o00O0oOO.OooOOO;
import o00O0oOO.OooOOO0;
import o00OO0OO.OooO00o;
import o00OO0oo.Oooo000;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public abstract class o00000 {

    /* renamed from: OooO00o */
    public static ClassLoader f13864OooO00o;

    /* renamed from: OooO0O0 */
    public static Thread f13865OooO0O0;

    public static Object OooO00o(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static byte[] OooO0O0(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws IllegalStateException, GeneralSecurityException {
        Mac mac = (Mac) Oooo0.f29464OooO0OO.f29465OooO00o.OooO00o(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr3);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr4, length, i - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i2++;
        }
    }

    public static float OooO0OO(float f, float f2, float f3, float f4) {
        double d = 0.0f - f;
        double d2 = 0.0f - f2;
        float fHypot = (float) Math.hypot(d, d2);
        double d3 = f3 - f;
        float fHypot2 = (float) Math.hypot(d3, d2);
        double d4 = f4 - f2;
        float fHypot3 = (float) Math.hypot(d3, d4);
        float fHypot4 = (float) Math.hypot(d, d4);
        return (fHypot <= fHypot2 || fHypot <= fHypot3 || fHypot <= fHypot4) ? (fHypot2 <= fHypot3 || fHypot2 <= fHypot4) ? fHypot3 > fHypot4 ? fHypot3 : fHypot4 : fHypot2 : fHypot;
    }

    public static final long OooO0Oo(long j) {
        long j2 = (j << 1) + 1;
        int i = OooOO0O.f31462OooOoO0;
        int i2 = OooOOO0.f31472OooO00o;
        return j2;
    }

    public static final OooO00o OooO0o(OooO00o oooO00o) {
        OooOo.OooO0o0(oooO00o, "<this>");
        return oooO00o.OooO0Oo().OooO0O0() ? oooO00o : new Oooo000(oooO00o);
    }

    public static final long OooO0o0(long j) {
        long j2 = j << 1;
        int i = OooOO0O.f31462OooOoO0;
        int i2 = OooOOO0.f31472OooO00o;
        return j2;
    }

    public static final int OooO0oO(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static boolean OooOO0(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static String OooOO0O(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final long OooOO0o(int i, OooOOO unit) {
        OooOo.OooO0o0(unit, "unit");
        return unit.compareTo(OooOOO.f31467OooOoO0) <= 0 ? OooO0o0(o0OO00OO.OooO0o0(i, unit, OooOOO.f31465OooOo0o)) : OooOOO0(i, unit);
    }

    public static void OooOOO(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    public static final long OooOOO0(long j, OooOOO unit) {
        OooOo.OooO0o0(unit, "unit");
        OooOOO oooOOO = OooOOO.f31465OooOo0o;
        long jOooO0o0 = o0OO00OO.OooO0o0(4611686018426999999L, oooOOO, unit);
        return ((-jOooO0o0) > j || j > jOooO0o0) ? OooO0Oo(o00oO0o.OooO0OO(o0OO00OO.OooO0Oo(j, unit, OooOOO.f31464OooOo))) : OooO0o0(o0OO00OO.OooO0o0(j, unit, oooOOO));
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x00ab A[Catch: all -> 0x00a7, PHI: r1
  0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:92:0x000a, B:132:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:89:0x0003, B:91:0x0007, B:93:0x000c, B:131:0x00a2, B:146:0x00d1, B:97:0x001f, B:137:0x00aa, B:138:0x00ab, B:149:0x00d5, B:150:0x00d6, B:139:0x00ac, B:145:0x00d0, B:144:0x00b6, B:98:0x0020, B:100:0x002d, B:110:0x0047, B:111:0x004e, B:113:0x0059, B:119:0x006e, B:120:0x0075, B:128:0x0086, B:129:0x00a0, B:103:0x003c), top: B:162:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader OooOOOO() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0oO.o00000.OooOOOO():java.lang.ClassLoader");
    }

    public static boolean OooOOOo(byte b) {
        return b > -65;
    }

    public abstract void OooO(Context context, o000OO0O o000oo0o, OooO0oO.Oooo0 oooo0, OooOo00 oooOo00);

    public abstract void OooO0oo(Context context, String str, o000OO0O o000oo0o, OooO0oO.Oooo0 oooo0, OooOo00 oooOo00);
}

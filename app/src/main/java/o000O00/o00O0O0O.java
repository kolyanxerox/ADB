package o000O00;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.measurement.o0OO000o;
import io.flutter.embedding.android.KeyboardMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public abstract class o00O0O0O {
    public static String OooO(Parcel parcel, int i) {
        int iOooOoOO = OooOoOO(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iOooOoOO == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iOooOoOO);
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object OooO00o(o00O0oo.o00oOoo r4, o00O0Oo.OooO0O0 r5, o00O0O0O.OooO0OO r6) {
        /*
            boolean r0 = r6 instanceof o00O0oo.o00
            if (r0 == 0) goto L13
            r0 = r6
            o00O0oo.o00 r0 = (o00O0oo.o00) r0
            int r1 = r0.f31588OooOo
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31588OooOo = r1
            goto L18
        L13:
            o00O0oo.o00 r0 = new o00O0oo.o00
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f31590OooOo0o
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f31588OooOo
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            o00O0Oo.OooO0O0 r5 = r0.f31589OooOo0O
            o00O0.o000OOo.OooOO0O(r6)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r4 = move-exception
            goto L69
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            o00O0.o000OOo.OooOO0O(r6)
            o00O0O0O.OooOOO0 r6 = r0.getContext()
            o00O0oOo.o00O0 r2 = o00O0oOo.o00O0.f31523OooOo0O
            o00O0O0O.OooOO0 r6 = r6.get(r2)
            if (r6 != r4) goto L6d
            r0.f31589OooOo0O = r5     // Catch: java.lang.Throwable -> L29
            r0.f31588OooOo = r3     // Catch: java.lang.Throwable -> L29
            o00O0oOo.oo0o0Oo r6 = new o00O0oOo.oo0o0Oo     // Catch: java.lang.Throwable -> L29
            o00O0O0O.OooO0OO r0 = Oooo0o0.OooO.OooOOOO(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.OooOOo0()     // Catch: java.lang.Throwable -> L29
            o00O0oo.o00O0000 r0 = new o00O0oo.o00O0000     // Catch: java.lang.Throwable -> L29
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L29
            o00O0oo.o0O0ooO r4 = (o00O0oo.o0O0ooO) r4     // Catch: java.lang.Throwable -> L29
            r4.OooooO0(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.OooOOOo()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L63
            return r1
        L63:
            r5.invoke()
            oo00o.OooOo r4 = oo00o.OooOo.f33195OooO00o
            return r4
        L69:
            r5.invoke()
            throw r4
        L6d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o000O00.o00O0O0O.OooO00o(o00O0oo.o00oOoo, o00O0Oo.OooO0O0, o00O0O0O.OooO0OO):java.lang.Object");
    }

    public static void OooO0O0(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static byte[] OooO0OO(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jOooOo0 = OooOo0(0, bArr) & 67108863;
        int i = 3;
        long jOooOo02 = (OooOo0(3, bArr) >> 2) & 67108611;
        long jOooOo03 = (OooOo0(6, bArr) >> 4) & 67092735;
        long jOooOo04 = (OooOo0(9, bArr) >> 6) & 66076671;
        long jOooOo05 = (OooOo0(12, bArr) >> 8) & 1048575;
        long j = jOooOo02 * 5;
        long j2 = jOooOo03 * 5;
        long j3 = jOooOo04 * 5;
        long j4 = jOooOo05 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jOooOo06 = j9 + (OooOo0(0, bArr3) & 67108863);
            long jOooOo07 = j5 + ((OooOo0(i, bArr3) >> 2) & 67108863);
            long jOooOo08 = j6 + ((OooOo0(6, bArr3) >> 4) & 67108863);
            long jOooOo09 = j7 + ((OooOo0(9, bArr3) >> 6) & 67108863);
            long j10 = jOooOo02;
            long jOooOo010 = j8 + (((OooOo0(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j11 = (jOooOo010 * j) + (jOooOo09 * j2) + (jOooOo08 * j3) + (jOooOo07 * j4) + (jOooOo06 * jOooOo0);
            long j12 = (jOooOo010 * j2) + (jOooOo09 * j3) + (jOooOo08 * j4) + (jOooOo07 * jOooOo0) + (jOooOo06 * j10);
            long j13 = (jOooOo010 * j3) + (jOooOo09 * j4) + (jOooOo08 * jOooOo0) + (jOooOo07 * j10) + (jOooOo06 * jOooOo03);
            long j14 = (jOooOo010 * j4) + (jOooOo09 * jOooOo0) + (jOooOo08 * j10) + (jOooOo07 * jOooOo03) + (jOooOo06 * jOooOo04);
            long j15 = jOooOo09 * j10;
            long j16 = jOooOo010 * jOooOo0;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jOooOo08 * jOooOo03) + (jOooOo07 * jOooOo04) + (jOooOo06 * jOooOo05) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jOooOo02 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & KeyboardMap.kValueMask;
        long j51 = ((j47 >> 6) | (j48 << 20)) & KeyboardMap.kValueMask;
        long j52 = ((j48 >> 12) | (j49 << 14)) & KeyboardMap.kValueMask;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & KeyboardMap.kValueMask;
        long jOooOo011 = OooOo0(16, bArr) + j50;
        long j54 = jOooOo011 & KeyboardMap.kValueMask;
        long jOooOo012 = OooOo0(20, bArr) + j51 + (jOooOo011 >> 32);
        long j55 = jOooOo012 & KeyboardMap.kValueMask;
        long jOooOo013 = OooOo0(24, bArr) + j52 + (jOooOo012 >> 32);
        long j56 = jOooOo013 & KeyboardMap.kValueMask;
        long jOooOo014 = (OooOo0(28, bArr) + j53 + (jOooOo013 >> 32)) & KeyboardMap.kValueMask;
        byte[] bArr4 = new byte[16];
        OooOoo(bArr4, j54, 0);
        OooOoo(bArr4, j55, 4);
        OooOoo(bArr4, j56, 8);
        OooOoo(bArr4, jOooOo014, 12);
        return bArr4;
    }

    public static Bundle OooO0Oo(Parcel parcel, int i) {
        int iOooOoOO = OooOoOO(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iOooOoOO == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iOooOoOO);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatorSet OooO0o(o00O0O.OooO oooO, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(oooO, o00O0O.OooO0O0.f31308OooO00o, o00O0O.OooO00o.f31306OooO0O0, new o00O0O.OooO0o(f, f2, f3));
        o00O0O.OooO0o revealInfo = oooO.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) oooO, (int) f, (int) f2, revealInfo.f31312OooO0OO, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    public static byte[] OooO0o0(Parcel parcel, int i) {
        int iOooOoOO = OooOoOO(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iOooOoOO == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iOooOoOO);
        return bArrCreateByteArray;
    }

    public static ArrayList OooO0oO(Parcel parcel, int i) {
        int iOooOoOO = OooOoOO(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iOooOoOO == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iOooOoOO);
        return arrayList;
    }

    public static Parcelable OooO0oo(Parcel parcel, int i, Parcelable.Creator creator) {
        int iOooOoOO = OooOoOO(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iOooOoOO == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iOooOoOO);
        return parcelable;
    }

    public static String[] OooOO0(Parcel parcel, int i) {
        int iOooOoOO = OooOoOO(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iOooOoOO == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iOooOoOO);
        return strArrCreateStringArray;
    }

    public static ArrayList OooOO0O(Parcel parcel, int i) {
        int iOooOoOO = OooOoOO(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iOooOoOO == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iOooOoOO);
        return arrayListCreateStringArrayList;
    }

    public static Object[] OooOO0o(Parcel parcel, int i, Parcelable.Creator creator) {
        int iOooOoOO = OooOoOO(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iOooOoOO == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iOooOoOO);
        return objArrCreateTypedArray;
    }

    public static ArrayList OooOOO0(Parcel parcel, int i, Parcelable.Creator creator) {
        int iOooOoOO = OooOoOO(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iOooOoOO == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iOooOoOO);
        return arrayListCreateTypedArrayList;
    }

    public static o00OOOoO.o0000O0 OooOOOo(String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<this>");
        byte[] bytes = str.getBytes(o00O0oO.o0OO00O.f31451OooO00o);
        kotlin.jvm.internal.OooOo.OooO0Oo(bytes, "this as java.lang.String).getBytes(charset)");
        o00OOOoO.o0000O0 o0000o02 = new o00OOOoO.o0000O0(bytes);
        o0000o02.f32554OooOo = str;
        return o0000o02;
    }

    public static final oo0o0O0.OooO0O0 OooOOo(Enum[] entries) {
        kotlin.jvm.internal.OooOo.OooO0o0(entries, "entries");
        return new oo0o0O0.OooO0O0(entries);
    }

    public static void OooOOo0(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new Oooo00o.o000O0o(OooO0oO.OooOo.OooO0o(i, "Overread allowed size end="), parcel);
        }
    }

    public static IBinder OooOo(Parcel parcel, int i) {
        int iOooOoOO = OooOoOO(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iOooOoOO == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iOooOoOO);
        return strongBinder;
    }

    public static long OooOo0(int i, byte[] bArr) {
        return (((bArr[i + 3] & ForkServer.ERROR) << 24) | (bArr[i] & ForkServer.ERROR) | ((bArr[i + 1] & ForkServer.ERROR) << 8) | ((bArr[i + 2] & ForkServer.ERROR) << 16)) & KeyboardMap.kValueMask;
    }

    public static o00O0o.Oooo0 OooOo00(o00O0Oo.o00O0O o00o0o) {
        o00O0o.Oooo0 oooo0 = new o00O0o.Oooo0();
        oooo0.f31422OooOoO0 = Oooo0o0.OooO.OooO0oO(oooo0, oooo0, o00o0o);
        return oooo0;
    }

    public static boolean OooOo0o(Parcel parcel, int i) {
        Oooo00o(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static long OooOoO(Parcel parcel, int i) {
        Oooo00o(parcel, i, 8);
        return parcel.readLong();
    }

    public static int OooOoO0(Parcel parcel, int i) {
        Oooo00o(parcel, i, 4);
        return parcel.readInt();
    }

    public static int OooOoOO(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void OooOoo(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static void OooOoo0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + OooOoOO(parcel, i));
    }

    public static int OooOooO(Parcel parcel) {
        int i = parcel.readInt();
        int iOooOoOO = OooOoOO(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new Oooo00o.o000O0o("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iOooOoOO + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new Oooo00o.o000O0o(OooO0oO.OooOo.OooO0o0(iDataPosition, i2, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static com.google.android.gms.internal.measurement.Oooo0 OooOooo(Object obj) {
        if (obj == null) {
            return com.google.android.gms.internal.measurement.Oooo0.f26431OooOOO0;
        }
        if (obj instanceof String) {
            return new com.google.android.gms.internal.measurement.o00O0O((String) obj);
        }
        if (obj instanceof Double) {
            return new com.google.android.gms.internal.measurement.OooOO0O((Double) obj);
        }
        if (obj instanceof Long) {
            return new com.google.android.gms.internal.measurement.OooOO0O(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new com.google.android.gms.internal.measurement.OooOO0O(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new com.google.android.gms.internal.measurement.OooO((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            com.google.android.gms.internal.measurement.OooO0o oooO0o = new com.google.android.gms.internal.measurement.OooO0o();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                oooO0o.OooOO0o(oooO0o.OooOO0(), OooOooo(it.next()));
            }
            return oooO0o;
        }
        com.google.android.gms.internal.measurement.OooOo00 oooOo00 = new com.google.android.gms.internal.measurement.OooOo00();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            com.google.android.gms.internal.measurement.Oooo0 oooo0OooOooo = OooOooo(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                oooOo00.OooO0o0((String) string, oooo0OooOooo);
            }
        }
        return oooOo00;
    }

    public static void Oooo000(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new Oooo00o.o000O0o(OooO0oO.OooOo.OooOOOo(OooO0oO.OooOo.OooOo0o("Expected size ", i2, " got ", i, " (0x"), Integer.toHexString(i), ")"), parcel);
    }

    public static com.google.android.gms.internal.measurement.Oooo0 Oooo00O(o0OO000o o0oo000o) {
        if (o0oo000o == null) {
            return com.google.android.gms.internal.measurement.Oooo0.OooOO0o;
        }
        int iOooOo = o0oo000o.OooOo() - 1;
        if (iOooOo == 1) {
            return o0oo000o.OooOOo() ? new com.google.android.gms.internal.measurement.o00O0O(o0oo000o.OooOOoo()) : com.google.android.gms.internal.measurement.Oooo0.f26436OooOOoo;
        }
        if (iOooOo == 2) {
            return o0oo000o.OooOo0O() ? new com.google.android.gms.internal.measurement.OooOO0O(Double.valueOf(o0oo000o.OooOo0o())) : new com.google.android.gms.internal.measurement.OooOO0O(null);
        }
        if (iOooOo == 3) {
            return o0oo000o.OooOo00() ? new com.google.android.gms.internal.measurement.OooO(Boolean.valueOf(o0oo000o.OooOo0())) : new com.google.android.gms.internal.measurement.OooO(null);
        }
        if (iOooOo != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listOooOOOo = o0oo000o.OooOOOo();
        ArrayList arrayList = new ArrayList();
        Iterator it = listOooOOOo.iterator();
        while (it.hasNext()) {
            arrayList.add(Oooo00O((o0OO000o) it.next()));
        }
        return new com.google.android.gms.internal.measurement.o000oOoO(o0oo000o.OooOOo0(), arrayList);
    }

    public static void Oooo00o(Parcel parcel, int i, int i2) {
        int iOooOoOO = OooOoOO(parcel, i);
        if (iOooOoOO == i2) {
            return;
        }
        throw new Oooo00o.o000O0o(OooO0oO.OooOo.OooOOOo(OooO0oO.OooOo.OooOo0o("Expected size ", i2, " got ", iOooOoOO, " (0x"), Integer.toHexString(iOooOoOO), ")"), parcel);
    }

    public abstract String OooOOO(byte[] bArr, int i, int i2);

    public abstract int OooOOOO(String str, byte[] bArr, int i, int i2);

    public boolean OooOOoo(byte[] bArr, int i, int i2) {
        return OooOo0O(bArr, i, i2) == 0;
    }

    public abstract int OooOo0O(byte[] bArr, int i, int i2);
}

package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.android.gms.internal.ads.ez0;
import com.google.android.gms.internal.ads.pz0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.PipesConfigBase;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class oO00o0 implements oO0 {

    /* renamed from: OooOO0, reason: collision with root package name */
    public static final int[] f26705OooOO0 = new int[0];

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final Unsafe f26706OooOO0O = oO0O0Oo0.OooOO0O();

    /* renamed from: OooO, reason: collision with root package name */
    public final oO0Oo0oo f26707OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int[] f26708OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f26709OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f26710OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f26711OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int[] f26712OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC2346o f26713OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f26714OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final int f26715OooO0oo;

    public oO00o0(int[] iArr, Object[] objArr, int i, int i2, AbstractC2346o abstractC2346o, int[] iArr2, int i3, int i4, oO0Oo0oo oo0oo0oo, oO0Oo0oo oo0oo0oo2) {
        this.f26708OooO00o = iArr;
        this.f26709OooO0O0 = objArr;
        this.f26710OooO0OO = i;
        this.f26711OooO0Oo = i2;
        this.f26712OooO0o = iArr2;
        this.f26714OooO0oO = i3;
        this.f26715OooO0oo = i4;
        this.f26707OooO = oo0oo0oo;
        this.f26713OooO0o0 = abstractC2346o;
    }

    public static boolean OooO00o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof ooOOOOoo) {
            return ((ooOOOOoo) obj).OooO0o0();
        }
        return true;
    }

    public static int OooO0O0(long j, Object obj) {
        return ((Integer) oO0O0Oo0.OooO(j, obj)).intValue();
    }

    public static long OooOO0O(long j, Object obj) {
        return ((Long) oO0O0Oo0.OooO(j, obj)).longValue();
    }

    public static final int OooOOo(byte[] bArr, int i, int i2, ooOOO00O ooooo00o, Class cls, ez0 ez0Var) throws oO00O0oO {
        ooOOO00O ooooo00o2 = ooOOO00O.f26913OooOo;
        switch (ooooo00o.ordinal()) {
            case 0:
                int i3 = i + 8;
                ez0Var.f18713OooO0OO = Double.valueOf(Double.longBitsToDouble(o00Oo0oo.o00oO0o.Oooo00O(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                ez0Var.f18713OooO0OO = Float.valueOf(Float.intBitsToFloat(o00Oo0oo.o00oO0o.Oooo000(i, bArr)));
                return i4;
            case 2:
            case 3:
                int iOooOooO = o00Oo0oo.o00oO0o.OooOooO(bArr, i, ez0Var);
                ez0Var.f18713OooO0OO = Long.valueOf(ez0Var.f18712OooO0O0);
                return iOooOooO;
            case 4:
            case 12:
            case 13:
                int iOooOoOO = o00Oo0oo.o00oO0o.OooOoOO(bArr, i, ez0Var);
                ez0Var.f18713OooO0OO = Integer.valueOf(ez0Var.f18711OooO00o);
                return iOooOoOO;
            case 5:
            case 15:
                int i5 = i + 8;
                ez0Var.f18713OooO0OO = Long.valueOf(o00Oo0oo.o00oO0o.Oooo00O(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                ez0Var.f18713OooO0OO = Integer.valueOf(o00Oo0oo.o00oO0o.Oooo000(i, bArr));
                return i6;
            case 7:
                int iOooOooO2 = o00Oo0oo.o00oO0o.OooOooO(bArr, i, ez0Var);
                ez0Var.f18713OooO0OO = Boolean.valueOf(ez0Var.f18712OooO0O0 != 0);
                return iOooOooO2;
            case 8:
                return o00Oo0oo.o00oO0o.Oooo00o(bArr, i, ez0Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                oO0 oo0OooO00o = oOo000Oo.f26877OooO0OO.OooO00o(cls);
                ooOOOOoo ooooooooZza = oo0OooO00o.zza();
                int iOooo0O0 = o00Oo0oo.o00oO0o.Oooo0O0(ooooooooZza, oo0OooO00o, bArr, i, i2, ez0Var);
                oo0OooO00o.OooO0oo(ooooooooZza);
                ez0Var.f18713OooO0OO = ooooooooZza;
                return iOooo0O0;
            case 11:
                return o00Oo0oo.o00oO0o.Oooo0(bArr, i, ez0Var);
            case 16:
                int iOooOoOO2 = o00Oo0oo.o00oO0o.OooOoOO(bArr, i, ez0Var);
                ez0Var.f18713OooO0OO = Integer.valueOf(OooO00o.OooO00o.OooOoO(ez0Var.f18711OooO00o));
                return iOooOoOO2;
            case 17:
                int iOooOooO3 = o00Oo0oo.o00oO0o.OooOooO(bArr, i, ez0Var);
                ez0Var.f18713OooO0OO = Long.valueOf(OooO00o.OooO00o.OooOoOO(ez0Var.f18712OooO0O0));
                return iOooOooO3;
        }
    }

    public static Field OooOo0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            androidx.datastore.preferences.protobuf.OooO00o.OooOooO(sb, "Field ", str, " for ", name);
            throw new RuntimeException(OooO0oO.OooOo.OooOOOo(sb, " not found. Known fields are ", string), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.oO00o0 OooOo00(com.google.android.gms.internal.measurement.oOo000o0 r34, com.google.android.gms.internal.measurement.oO0Oo0oo r35, com.google.android.gms.internal.measurement.oO0Oo0oo r36) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.oO00o0.OooOo00(com.google.android.gms.internal.measurement.oOo000o0, com.google.android.gms.internal.measurement.oO0Oo0oo, com.google.android.gms.internal.measurement.oO0Oo0oo):com.google.android.gms.internal.measurement.oO00o0");
    }

    public static int OooOooo(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.oO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO(com.google.android.gms.internal.measurement.ooOOOOoo r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.oO00o0.OooO(com.google.android.gms.internal.measurement.ooOOOOoo):int");
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final boolean OooO0OO(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.f26714OooO0oO) {
            int i7 = this.f26712OooO0o[i5];
            int[] iArr = this.f26708OooO00o;
            int i8 = iArr[i7];
            int iOooOooO = OooOooO(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = f26706OooOO0O.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & iOooOooO) == 0 || OooOOO0(obj, i2, i, i3, i11)) {
                int iOooOooo = OooOooo(iOooOooO);
                if (iOooOooo != 9 && iOooOooo != 17) {
                    if (iOooOooo != 27) {
                        if (iOooOooo == 60 || iOooOooo == 68) {
                            if (!OooOOOo(i8, i2, obj) || OooOo(i2).OooO0OO(oO0O0Oo0.OooO(iOooOooO & 1048575, obj))) {
                                i5++;
                                i6 = i;
                                i4 = i3;
                            }
                        } else if (iOooOooo != 49) {
                            if (iOooOooo != 50) {
                                continue;
                            } else {
                                oO00o000 oo00o000 = (oO00o000) oO0O0Oo0.OooO(iOooOooO & 1048575, obj);
                                if (oo00o000.isEmpty()) {
                                    continue;
                                } else {
                                    int i13 = i2 / 3;
                                    if (((ooOOO00O) ((oOOoOOO0) this.f26709OooO0O0[i13 + i13]).f26872OooO00o.f26893OooO0O0).f26916OooOo0O == ooo0o.f26934OooOooO) {
                                        oO0 oo0OooO00o = null;
                                        for (Object obj2 : oo00o000.values()) {
                                            if (oo0OooO00o == null) {
                                                oo0OooO00o = oOo000Oo.f26877OooO0OO.OooO00o(obj2.getClass());
                                            }
                                            if (!oo0OooO00o.OooO0OO(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i5++;
                            i6 = i;
                            i4 = i3;
                        }
                    }
                    List list = (List) oO0O0Oo0.OooO(iOooOooO & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        oO0 oo0OooOo = OooOo(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (oo0OooOo.OooO0OO(list.get(i14))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else if (!OooOOO0(obj, i2, i, i3, i11) || OooOo(i2).OooO0OO(oO0O0Oo0.OooO(iOooOooO & 1048575, obj))) {
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.oO0
    public final void OooO0Oo(Object obj, oO00Oo0 oo00oo0) throws pz0 {
        int[] iArr;
        int i;
        int i2;
        boolean z;
        oO00o0 oo00o0 = this;
        int i3 = 2;
        Unsafe unsafe = f26706OooOO0O;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr2 = oo00o0.f26708OooO00o;
            if (i6 >= iArr2.length) {
                ((ooOOOOoo) obj).zzc.OooO0O0(oo00oo0);
                return;
            }
            int iOooOooO = oo00o0.OooOooO(i6);
            int iOooOooo = OooOooo(iOooOooO);
            int i8 = iArr2[i6];
            if (iOooOooo <= 17) {
                int i9 = iArr2[i6 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                iArr = iArr2;
                i = 1 << (i9 >>> 20);
            } else {
                iArr = iArr2;
                i = 0;
            }
            int[] iArr3 = iArr;
            long j = iOooOooO & i4;
            switch (iOooOooo) {
                case 0:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOo0(i8, Double.doubleToRawLongBits(oO0O0Oo0.f26745OooO0OO.OooO0o(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOO(i8, Float.floatToRawIntBits(oO0O0Oo0.f26745OooO0OO.OooO0Oo(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOo(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOo(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOO0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOo0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOO(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        boolean zOooO0O0 = oO0O0Oo0.f26745OooO0OO.OooO0O0(j, obj);
                        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
                        oo000o0.OooOo0(i8 << 3);
                        oo000o0.OooOOoo(zOooO0O0 ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            oO000O0 oo000o02 = (oO000O0) oo00oo0.f26700OooOo0O;
                            oo000o02.OooOo0((i8 << 3) | 2);
                            oo000o02.OooOoO((String) object);
                            break;
                        } else {
                            oO000O0 oo000o03 = (oO000O0) oo00oo0.f26700OooOo0O;
                            oo000o03.OooOo0((i8 << 3) | 2);
                            oo000o03.OooOOo((oO000) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        oo00oo0.OooO0Oo(i8, unsafe.getObject(obj, j), oo00o0.OooOo(i6));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        oO000 oo000 = (oO000) unsafe.getObject(obj, j);
                        oO000O0 oo000o04 = (oO000O0) oo00oo0.f26700OooOo0O;
                        oo000o04.OooOo0((i8 << 3) | 2);
                        oo000o04.OooOOo(oo000);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOO(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOO0(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOO(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOo0(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        int i11 = unsafe.getInt(obj, j);
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOO(i8, (i11 >> 31) ^ (i11 + i11));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOo(i8, (j2 + j2) ^ (j2 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i2 = i3;
                    if (oo00o0.OooOOO0(obj, i6, i5, i7, i)) {
                        oo00oo0.OooO0o0(i8, unsafe.getObject(obj, j), oo00o0.OooOo(i6));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i2 = i3;
                    oO0O000.OooO0OO(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 19:
                    i2 = i3;
                    oO0O000.OooO0Oo(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 20:
                    i2 = i3;
                    oO0O000.OooO0o0(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 21:
                    i2 = i3;
                    oO0O000.OooO0o(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 22:
                    i2 = i3;
                    oO0O000.OooOO0(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 23:
                    i2 = i3;
                    oO0O000.OooO0oo(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 24:
                    i2 = i3;
                    oO0O000.OooOOO0(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 25:
                    i2 = i3;
                    oO0O000.OooOOOo(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 26:
                    i2 = i3;
                    int i12 = iArr3[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    oO0Oo0oo oo0oo0oo = oO0O000.f26723OooO00o;
                    if (list != null && !list.isEmpty()) {
                        oo00oo0.getClass();
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            String str = (String) list.get(i13);
                            oO000O0 oo000o05 = (oO000O0) oo00oo0.f26700OooOo0O;
                            oo000o05.OooOo0((i12 << 3) | 2);
                            oo000o05.OooOoO(str);
                        }
                    }
                    break;
                case 27:
                    i2 = i3;
                    int i14 = iArr3[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    oO0 oo0OooOo = oo00o0.OooOo(i6);
                    oO0Oo0oo oo0oo0oo2 = oO0O000.f26723OooO00o;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            oo00oo0.OooO0Oo(i14, list2.get(i15), oo0OooOo);
                        }
                    }
                    break;
                case 28:
                    i2 = i3;
                    int i16 = iArr3[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    oO0Oo0oo oo0oo0oo3 = oO0O000.f26723OooO00o;
                    if (list3 != null && !list3.isEmpty()) {
                        oo00oo0.getClass();
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            oO000 oo0002 = (oO000) list3.get(i17);
                            oO000O0 oo000o06 = (oO000O0) oo00oo0.f26700OooOo0O;
                            oo000o06.OooOo0((i16 << 3) | 2);
                            oo000o06.OooOOo(oo0002);
                        }
                    }
                    break;
                case 29:
                    i2 = i3;
                    z = false;
                    oO0O000.OooOO0O(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 30:
                    i2 = i3;
                    z = false;
                    oO0O000.OooOOOO(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 31:
                    i2 = i3;
                    z = false;
                    oO0O000.OooOOO(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 32:
                    i2 = i3;
                    z = false;
                    oO0O000.OooO(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 33:
                    i2 = i3;
                    z = false;
                    oO0O000.OooOO0o(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 34:
                    i2 = i3;
                    z = false;
                    oO0O000.OooO0oO(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, false);
                    break;
                case 35:
                    i2 = i3;
                    oO0O000.OooO0OO(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 36:
                    i2 = i3;
                    oO0O000.OooO0Oo(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 37:
                    i2 = i3;
                    oO0O000.OooO0o0(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 38:
                    i2 = i3;
                    oO0O000.OooO0o(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 39:
                    i2 = i3;
                    oO0O000.OooOO0(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 40:
                    i2 = i3;
                    oO0O000.OooO0oo(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 41:
                    i2 = i3;
                    oO0O000.OooOOO0(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 42:
                    i2 = i3;
                    oO0O000.OooOOOo(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 43:
                    i2 = i3;
                    oO0O000.OooOO0O(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 44:
                    i2 = i3;
                    oO0O000.OooOOOO(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 45:
                    i2 = i3;
                    oO0O000.OooOOO(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 46:
                    i2 = i3;
                    oO0O000.OooO(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case 47:
                    i2 = i3;
                    oO0O000.OooOO0o(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    i2 = i3;
                    oO0O000.OooO0oO(iArr3[i6], (List) unsafe.getObject(obj, j), oo00oo0, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i2 = i3;
                    int i18 = iArr3[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    oO0 oo0OooOo2 = oo00o0.OooOo(i6);
                    oO0Oo0oo oo0oo0oo4 = oO0O000.f26723OooO00o;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            oo00oo0.OooO0o0(i18, list4.get(i19), oo0OooOo2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i20 = i6 / 3;
                        oo000o oo000oVar = ((oOOoOOO0) oo00o0.f26709OooO0O0[i20 + i20]).f26872OooO00o;
                        oo00oo0.getClass();
                        for (Map.Entry entry : ((oO00o000) object2).entrySet()) {
                            oO000O0 oo000o07 = (oO000O0) oo00oo0.f26700OooOo0O;
                            oo000o07.OooOO0o(i8, i3);
                            oo000o07.OooOo0(oOOoOOO0.OooO0O0(oo000oVar, entry.getKey(), entry.getValue()));
                            oOOoOOO0.OooO00o(oo000o07, oo000oVar, entry.getKey(), entry.getValue());
                            i3 = i3;
                        }
                    }
                    i2 = i3;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOo0(i8, Double.doubleToRawLongBits(((Double) oO0O0Oo0.OooO(j, obj)).doubleValue()));
                    }
                    i2 = i3;
                    break;
                case 52:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOO(i8, Float.floatToRawIntBits(((Float) oO0O0Oo0.OooO(j, obj)).floatValue()));
                    }
                    i2 = i3;
                    break;
                case 53:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOo(i8, OooOO0O(j, obj));
                    }
                    i2 = i3;
                    break;
                case 54:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOo(i8, OooOO0O(j, obj));
                    }
                    i2 = i3;
                    break;
                case 55:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOO0(i8, OooO0O0(j, obj));
                    }
                    i2 = i3;
                    break;
                case 56:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOo0(i8, OooOO0O(j, obj));
                    }
                    i2 = i3;
                    break;
                case 57:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOO(i8, OooO0O0(j, obj));
                    }
                    i2 = i3;
                    break;
                case 58:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        boolean zBooleanValue = ((Boolean) oO0O0Oo0.OooO(j, obj)).booleanValue();
                        oO000O0 oo000o08 = (oO000O0) oo00oo0.f26700OooOo0O;
                        oo000o08.OooOo0(i8 << 3);
                        oo000o08.OooOOoo(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i2 = i3;
                    break;
                case 59:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            oO000O0 oo000o09 = (oO000O0) oo00oo0.f26700OooOo0O;
                            oo000o09.OooOo0((i8 << 3) | i3);
                            oo000o09.OooOoO((String) object3);
                        } else {
                            oO000O0 oo000o010 = (oO000O0) oo00oo0.f26700OooOo0O;
                            oo000o010.OooOo0((i8 << 3) | i3);
                            oo000o010.OooOOo((oO000) object3);
                        }
                    }
                    i2 = i3;
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        oo00oo0.OooO0Oo(i8, unsafe.getObject(obj, j), oo00o0.OooOo(i6));
                    }
                    i2 = i3;
                    break;
                case 61:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        oO000 oo0003 = (oO000) unsafe.getObject(obj, j);
                        oO000O0 oo000o011 = (oO000O0) oo00oo0.f26700OooOo0O;
                        oo000o011.OooOo0((i8 << 3) | i3);
                        oo000o011.OooOOo(oo0003);
                    }
                    i2 = i3;
                    break;
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOO(i8, OooO0O0(j, obj));
                    }
                    i2 = i3;
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOO0(i8, OooO0O0(j, obj));
                    }
                    i2 = i3;
                    break;
                case 64:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOO(i8, OooO0O0(j, obj));
                    }
                    i2 = i3;
                    break;
                case 65:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOo0(i8, OooOO0O(j, obj));
                    }
                    i2 = i3;
                    break;
                case 66:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        int iOooO0O0 = OooO0O0(j, obj);
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOO(i8, (iOooO0O0 >> 31) ^ (iOooO0O0 + iOooO0O0));
                    }
                    i2 = i3;
                    break;
                case 67:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        long jOooOO0O = OooOO0O(j, obj);
                        ((oO000O0) oo00oo0.f26700OooOo0O).OooOOOo(i8, (jOooOO0O + jOooOO0O) ^ (jOooOO0O >> 63));
                    }
                    i2 = i3;
                    break;
                case 68:
                    if (oo00o0.OooOOOo(i8, i6, obj)) {
                        oo00oo0.OooO0o0(i8, unsafe.getObject(obj, j), oo00o0.OooOo(i6));
                    }
                    i2 = i3;
                    break;
                default:
                    i2 = i3;
                    break;
            }
            i6 += 3;
            i4 = 1048575;
            oo00o0 = this;
            i3 = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f8  */
    @Override // com.google.android.gms.internal.measurement.oO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o(com.google.android.gms.internal.measurement.ooOOOOoo r18) {
        /*
            Method dump skipped, instructions count: 1966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.oO00o0.OooO0o(com.google.android.gms.internal.measurement.ooOOOOoo):int");
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final boolean OooO0o0(ooOOOOoo oooooooo, ooOOOOoo oooooooo2) {
        boolean zOooO00o;
        int i = 0;
        while (true) {
            int[] iArr = this.f26708OooO00o;
            if (i < iArr.length) {
                int iOooOooO = OooOooO(i);
                long j = iOooOooO & 1048575;
                switch (OooOooo(iOooOooO)) {
                    case 0:
                        if (!OooOO0o(oooooooo, oooooooo2, i)) {
                            break;
                        } else {
                            oOo0oooO ooo0oooo = oO0O0Oo0.f26745OooO0OO;
                            if (Double.doubleToLongBits(ooo0oooo.OooO0o(j, oooooooo)) != Double.doubleToLongBits(ooo0oooo.OooO0o(j, oooooooo2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!OooOO0o(oooooooo, oooooooo2, i)) {
                            break;
                        } else {
                            oOo0oooO ooo0oooo2 = oO0O0Oo0.f26745OooO0OO;
                            if (Float.floatToIntBits(ooo0oooo2.OooO0Oo(j, oooooooo)) != Float.floatToIntBits(ooo0oooo2.OooO0Oo(j, oooooooo2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0oO(j, oooooooo) != oO0O0Oo0.OooO0oO(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0oO(j, oooooooo) != oO0O0Oo0.OooO0oO(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0o0(j, oooooooo) != oO0O0Oo0.OooO0o0(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0oO(j, oooooooo) != oO0O0Oo0.OooO0oO(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0o0(j, oooooooo) != oO0O0Oo0.OooO0o0(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!OooOO0o(oooooooo, oooooooo2, i)) {
                            break;
                        } else {
                            oOo0oooO ooo0oooo3 = oO0O0Oo0.f26745OooO0OO;
                            if (ooo0oooo3.OooO0O0(j, oooooooo) != ooo0oooo3.OooO0O0(j, oooooooo2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || !oO0O000.OooO00o(oO0O0Oo0.OooO(j, oooooooo), oO0O0Oo0.OooO(j, oooooooo2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || !oO0O000.OooO00o(oO0O0Oo0.OooO(j, oooooooo), oO0O0Oo0.OooO(j, oooooooo2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || !oO0O000.OooO00o(oO0O0Oo0.OooO(j, oooooooo), oO0O0Oo0.OooO(j, oooooooo2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0o0(j, oooooooo) != oO0O0Oo0.OooO0o0(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0o0(j, oooooooo) != oO0O0Oo0.OooO0o0(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0o0(j, oooooooo) != oO0O0Oo0.OooO0o0(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0oO(j, oooooooo) != oO0O0Oo0.OooO0oO(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0o0(j, oooooooo) != oO0O0Oo0.OooO0o0(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || oO0O0Oo0.OooO0oO(j, oooooooo) != oO0O0Oo0.OooO0oO(j, oooooooo2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (!OooOO0o(oooooooo, oooooooo2, i) || !oO0O000.OooO00o(oO0O0Oo0.OooO(j, oooooooo), oO0O0Oo0.OooO(j, oooooooo2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        zOooO00o = oO0O000.OooO00o(oO0O0Oo0.OooO(j, oooooooo), oO0O0Oo0.OooO(j, oooooooo2));
                        break;
                    case 50:
                        zOooO00o = oO0O000.OooO00o(oO0O0Oo0.OooO(j, oooooooo), oO0O0Oo0.OooO(j, oooooooo2));
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    case 61:
                    case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (oO0O0Oo0.OooO0o0(j2, oooooooo) != oO0O0Oo0.OooO0o0(j2, oooooooo2) || !oO0O000.OooO00o(oO0O0Oo0.OooO(j, oooooooo), oO0O0Oo0.OooO(j, oooooooo2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (zOooO00o) {
                    i += 3;
                }
            } else if (oooooooo.zzc.equals(oooooooo2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.measurement.oO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oO(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.oO00o0.OooO0oO(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // com.google.android.gms.internal.measurement.oO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oo(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = OooO00o(r8)
            if (r0 != 0) goto L8
            goto L96
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.ooOOOOoo
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.measurement.ooOOOOoo r0 = (com.google.android.gms.internal.measurement.ooOOOOoo) r0
            r0.OooOO0()
            r0.zza = r1
            r0.OooO0o()
        L18:
            r0 = r1
        L19:
            int[] r2 = r7.f26708OooO00o
            int r3 = r2.length
            if (r0 >= r3) goto L87
            int r3 = r7.OooOooO(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = OooOooo(r3)
            long r4 = (long) r4
            r6 = 9
            if (r3 == r6) goto L71
            r6 = 60
            if (r3 == r6) goto L5b
            r6 = 68
            if (r3 == r6) goto L5b
            switch(r3) {
                case 17: goto L71;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L84
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.oO00o0.f26706OooOO0O
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L84
            r6 = r3
            com.google.android.gms.internal.measurement.oO00o000 r6 = (com.google.android.gms.internal.measurement.oO00o000) r6
            r6.f26718OooOo0O = r1
            r2.putObject(r8, r4, r3)
            goto L84
        L4c:
            java.lang.Object r2 = com.google.android.gms.internal.measurement.oO0O0Oo0.OooO(r4, r8)
            com.google.android.gms.internal.measurement.oO00O0o0 r2 = (com.google.android.gms.internal.measurement.oO00O0o0) r2
            com.google.android.gms.internal.measurement.oO00000 r2 = (com.google.android.gms.internal.measurement.oO00000) r2
            boolean r3 = r2.f26666OooOo0O
            if (r3 == 0) goto L84
            r2.f26666OooOo0O = r1
            goto L84
        L5b:
            r2 = r2[r0]
            boolean r2 = r7.OooOOOo(r2, r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.measurement.oO0 r2 = r7.OooOo(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.measurement.oO00o0.f26706OooOO0O
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.OooO0oo(r3)
            goto L84
        L71:
            boolean r2 = r7.OooOOO(r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.measurement.oO0 r2 = r7.OooOo(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.measurement.oO00o0.f26706OooOO0O
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.OooO0oo(r3)
        L84:
            int r0 = r0 + 3
            goto L19
        L87:
            com.google.android.gms.internal.measurement.oO0Oo0oo r0 = r7.f26707OooO
            r0.getClass()
            com.google.android.gms.internal.measurement.ooOOOOoo r8 = (com.google.android.gms.internal.measurement.ooOOOOoo) r8
            com.google.android.gms.internal.measurement.oO0O00oO r8 = r8.zzc
            boolean r0 = r8.f26742OooO0o0
            if (r0 == 0) goto L96
            r8.f26742OooO0o0 = r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.oO00o0.OooO0oo(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final void OooOO0(Object obj, byte[] bArr, int i, int i2, ez0 ez0Var) {
        OooOOoo(obj, bArr, i, i2, 0, ez0Var);
    }

    public final boolean OooOO0o(ooOOOOoo oooooooo, ooOOOOoo oooooooo2, int i) {
        return OooOOO(i, oooooooo) == OooOOO(i, oooooooo2);
    }

    public final boolean OooOOO(int i, Object obj) {
        int i2 = this.f26708OooO00o[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iOooOooO = OooOooO(i);
            long j2 = iOooOooO & 1048575;
            switch (OooOooo(iOooOooO)) {
                case 0:
                    if (Double.doubleToRawLongBits(oO0O0Oo0.f26745OooO0OO.OooO0o(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(oO0O0Oo0.f26745OooO0OO.OooO0Oo(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (oO0O0Oo0.OooO0oO(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (oO0O0Oo0.OooO0oO(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (oO0O0Oo0.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (oO0O0Oo0.OooO0oO(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (oO0O0Oo0.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return oO0O0Oo0.f26745OooO0OO.OooO0O0(j2, obj);
                case 8:
                    Object objOooO = oO0O0Oo0.OooO(j2, obj);
                    if (objOooO instanceof String) {
                        if (((String) objOooO).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objOooO instanceof oO000)) {
                            throw new IllegalArgumentException();
                        }
                        if (oO000.f26663OooOo.equals(objOooO)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (oO0O0Oo0.OooO(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (oO000.f26663OooOo.equals(oO0O0Oo0.OooO(j2, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (oO0O0Oo0.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (oO0O0Oo0.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (oO0O0Oo0.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (oO0O0Oo0.OooO0oO(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (oO0O0Oo0.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (oO0O0Oo0.OooO0oO(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (oO0O0Oo0.OooO(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & oO0O0Oo0.OooO0o0(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean OooOOO0(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? OooOOO(i, obj) : (i3 & i4) != 0;
    }

    public final void OooOOOO(int i, Object obj) {
        int i2 = this.f26708OooO00o[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        oO0O0Oo0.OooO0o(obj, (1 << (i2 >>> 20)) | oO0O0Oo0.OooO0o0(j, obj), j);
    }

    public final boolean OooOOOo(int i, int i2, Object obj) {
        return oO0O0Oo0.OooO0o0((long) (this.f26708OooO00o[i2 + 2] & 1048575), obj) == i;
    }

    public final int OooOOo0(int i, int i2) {
        int[] iArr = this.f26708OooO00o;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int OooOOoo(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.ads.ez0 r45) {
        /*
            Method dump skipped, instructions count: 4508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.oO00o0.OooOOoo(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.ez0):int");
    }

    public final oO0 OooOo(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f26709OooO0O0;
        oO0 oo0 = (oO0) objArr[i3];
        if (oo0 != null) {
            return oo0;
        }
        oO0 oo0OooO00o = oOo000Oo.f26877OooO0OO.OooO00o((Class) objArr[i3 + 1]);
        objArr[i3] = oo0OooO00o;
        return oo0OooO00o;
    }

    public final void OooOo0O(int i, Object obj, Object obj2) {
        if (OooOOO(i, obj2)) {
            int iOooOooO = OooOooO(i) & 1048575;
            Unsafe unsafe = f26706OooOO0O;
            long j = iOooOooO;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.f26708OooO00o[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            oO0 oo0OooOo = OooOo(i);
            if (!OooOOO(i, obj)) {
                if (OooO00o(object)) {
                    ooOOOOoo ooooooooZza = oo0OooOo.zza();
                    oo0OooOo.OooO0oO(ooooooooZza, object);
                    unsafe.putObject(obj, j, ooooooooZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                OooOOOO(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!OooO00o(object2)) {
                ooOOOOoo ooooooooZza2 = oo0OooOo.zza();
                oo0OooOo.OooO0oO(ooooooooZza2, object2);
                unsafe.putObject(obj, j, ooooooooZza2);
                object2 = ooooooooZza2;
            }
            oo0OooOo.OooO0oO(object2, object);
        }
    }

    public final void OooOo0o(int i, Object obj, Object obj2) {
        int[] iArr = this.f26708OooO00o;
        int i2 = iArr[i];
        if (OooOOOo(i2, i, obj2)) {
            int iOooOooO = OooOooO(i) & 1048575;
            Unsafe unsafe = f26706OooOO0O;
            long j = iOooOooO;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            oO0 oo0OooOo = OooOo(i);
            if (!OooOOOo(i2, i, obj)) {
                if (OooO00o(object)) {
                    ooOOOOoo ooooooooZza = oo0OooOo.zza();
                    oo0OooOo.OooO0oO(ooooooooZza, object);
                    unsafe.putObject(obj, j, ooooooooZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                oO0O0Oo0.OooO0o(obj, i2, iArr[i + 2] & 1048575);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!OooO00o(object2)) {
                ooOOOOoo ooooooooZza2 = oo0OooOo.zza();
                oo0OooOo.OooO0oO(ooooooooZza2, object2);
                unsafe.putObject(obj, j, ooooooooZza2);
                object2 = ooooooooZza2;
            }
            oo0OooOo.OooO0oO(object2, object);
        }
    }

    public final Object OooOoO(int i, Object obj) {
        oO0 oo0OooOo = OooOo(i);
        int iOooOooO = OooOooO(i) & 1048575;
        if (!OooOOO(i, obj)) {
            return oo0OooOo.zza();
        }
        Object object = f26706OooOO0O.getObject(obj, iOooOooO);
        if (OooO00o(object)) {
            return object;
        }
        ooOOOOoo ooooooooZza = oo0OooOo.zza();
        if (object != null) {
            oo0OooOo.OooO0oO(ooooooooZza, object);
        }
        return ooooooooZza;
    }

    public final oO000Oo OooOoO0(int i) {
        int i2 = i / 3;
        return (oO000Oo) this.f26709OooO0O0[i2 + i2 + 1];
    }

    public final void OooOoOO(int i, Object obj, Object obj2) {
        f26706OooOO0O.putObject(obj, OooOooO(i) & 1048575, obj2);
        OooOOOO(i, obj);
    }

    public final void OooOoo(int i, Object obj, int i2, Object obj2) {
        f26706OooOO0O.putObject(obj, OooOooO(i2) & 1048575, obj2);
        oO0O0Oo0.OooO0o(obj, i, this.f26708OooO00o[i2 + 2] & 1048575);
    }

    public final Object OooOoo0(int i, int i2, Object obj) {
        oO0 oo0OooOo = OooOo(i2);
        if (!OooOOOo(i, i2, obj)) {
            return oo0OooOo.zza();
        }
        Object object = f26706OooOO0O.getObject(obj, OooOooO(i2) & 1048575);
        if (OooO00o(object)) {
            return object;
        }
        ooOOOOoo ooooooooZza = oo0OooOo.zza();
        if (object != null) {
            oo0OooOo.OooO0oO(ooooooooZza, object);
        }
        return ooooooooZza;
    }

    public final int OooOooO(int i) {
        return this.f26708OooO00o[i + 1];
    }

    @Override // com.google.android.gms.internal.measurement.oO0
    public final ooOOOOoo zza() {
        return (ooOOOOoo) ((ooOOOOoo) this.f26713OooO0o0).OooOOOO(4);
    }
}

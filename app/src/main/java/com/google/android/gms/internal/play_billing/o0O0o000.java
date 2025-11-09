package com.google.android.gms.internal.play_billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.android.gms.internal.ads.ez0;
import com.google.android.gms.internal.ads.pz0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.pipes.PipesConfigBase;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class o0O0o000 implements o0OO000o {

    /* renamed from: OooOO0, reason: collision with root package name */
    public static final int[] f27117OooOO0 = new int[0];

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final Unsafe f27118OooOO0O = o0OO0o.OooO0oo();

    /* renamed from: OooO, reason: collision with root package name */
    public final o0O000o0 f27119OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int[] f27120OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object[] f27121OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f27122OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f27123OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int[] f27124OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o0O00o0 f27125OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f27126OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final int f27127OooO0oo;

    public o0O0o000(int[] iArr, Object[] objArr, int i, int i2, o0O00o0 o0o00o0, int[] iArr2, int i3, int i4, o0O000o0 o0o000o0, o0O000o0 o0o000o02) {
        this.f27120OooO00o = iArr;
        this.f27121OooO0O0 = objArr;
        this.f27122OooO0OO = i;
        this.f27123OooO0Oo = i2;
        this.f27124OooO0o = iArr2;
        this.f27126OooO0oO = i3;
        this.f27127OooO0oo = i4;
        this.f27119OooO = o0o000o0;
        this.f27125OooO0o0 = o0o00o0;
    }

    public static boolean OooOOo0(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof o0OoO00O) {
            return ((o0OoO00O) obj).OooO0OO();
        }
        return true;
    }

    public static int OooOo0(long j, Object obj) {
        return ((Integer) o0OO0o.OooO0oO(j, obj)).intValue();
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
    public static com.google.android.gms.internal.play_billing.o0O0o000 OooOo00(com.google.android.gms.internal.play_billing.o0OO000 r34, com.google.android.gms.internal.play_billing.o0O000o0 r35, com.google.android.gms.internal.play_billing.o0O000o0 r36) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o0O0o000.OooOo00(com.google.android.gms.internal.play_billing.o0OO000, com.google.android.gms.internal.play_billing.o0O000o0, com.google.android.gms.internal.play_billing.o0O000o0):com.google.android.gms.internal.play_billing.o0O0o000");
    }

    public static int OooOo0o(int i) {
        return (i >>> 20) & 255;
    }

    public static long OooOoO0(long j, Object obj) {
        return ((Long) o0OO0o.OooO0oO(j, obj)).longValue();
    }

    public static Field OooOooO(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbOooOOo0 = androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("Field ", str, " for ", name, " not found. Known fields are ");
            sbOooOOo0.append(string);
            throw new RuntimeException(sbOooOOo0.toString());
        }
    }

    public final void OooO(int i, Object obj, Object obj2) {
        if (OooOOOO(i, obj2)) {
            int iOooOo = OooOo(i) & 1048575;
            Unsafe unsafe = f27118OooOO0O;
            long j = iOooOo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f27120OooO00o[i] + " is present but null: " + obj2.toString());
            }
            o0OO000o o0oo000oOooOoOO = OooOoOO(i);
            if (!OooOOOO(i, obj)) {
                if (OooOOo0(object)) {
                    o0OoO00O o0ooo00oZze = o0oo000oOooOoOO.zze();
                    o0oo000oOooOoOO.OooO0O0(o0ooo00oZze, object);
                    unsafe.putObject(obj, j, o0ooo00oZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                OooOO0O(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!OooOOo0(object2)) {
                o0OoO00O o0ooo00oZze2 = o0oo000oOooOoOO.zze();
                o0oo000oOooOoOO.OooO0O0(o0ooo00oZze2, object2);
                unsafe.putObject(obj, j, o0ooo00oZze2);
                object2 = o0ooo00oZze2;
            }
            o0oo000oOooOoOO.OooO0O0(object2, object);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = OooOOo0(r8)
            if (r0 != 0) goto L8
            goto L96
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.play_billing.o0OoO00O
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.play_billing.o0OoO00O r0 = (com.google.android.gms.internal.play_billing.o0OoO00O) r0
            r0.OooOO0o()
            r0.zza = r1
            r0.OooOO0()
        L18:
            r0 = r1
        L19:
            int[] r2 = r7.f27120OooO00o
            int r3 = r2.length
            if (r0 >= r3) goto L87
            int r3 = r7.OooOo(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = OooOo0o(r3)
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
            sun.misc.Unsafe r2 = com.google.android.gms.internal.play_billing.o0O0o000.f27118OooOO0O
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L84
            r6 = r3
            com.google.android.gms.internal.play_billing.o0O0OO0 r6 = (com.google.android.gms.internal.play_billing.o0O0OO0) r6
            r6.f27111OooOo0O = r1
            r2.putObject(r8, r4, r3)
            goto L84
        L4c:
            java.lang.Object r2 = com.google.android.gms.internal.play_billing.o0OO0o.OooO0oO(r4, r8)
            com.google.android.gms.internal.play_billing.o0O00OOO r2 = (com.google.android.gms.internal.play_billing.o0O00OOO) r2
            com.google.android.gms.internal.play_billing.oo00oO r2 = (com.google.android.gms.internal.play_billing.oo00oO) r2
            boolean r3 = r2.f27207OooOo0O
            if (r3 == 0) goto L84
            r2.f27207OooOo0O = r1
            goto L84
        L5b:
            r2 = r2[r0]
            boolean r2 = r7.OooOOo(r2, r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.play_billing.o0OO000o r2 = r7.OooOoOO(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.play_billing.o0O0o000.f27118OooOO0O
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.OooO00o(r3)
            goto L84
        L71:
            boolean r2 = r7.OooOOOO(r0, r8)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.play_billing.o0OO000o r2 = r7.OooOoOO(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.play_billing.o0O0o000.f27118OooOO0O
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.OooO00o(r3)
        L84:
            int r0 = r0 + 3
            goto L19
        L87:
            com.google.android.gms.internal.play_billing.o0O000o0 r0 = r7.f27119OooO
            r0.getClass()
            com.google.android.gms.internal.play_billing.o0OoO00O r8 = (com.google.android.gms.internal.play_billing.o0OoO00O) r8
            com.google.android.gms.internal.play_billing.o0OO00o0 r8 = r8.zzc
            boolean r0 = r8.f27144OooO0o0
            if (r0 == 0) goto L96
            r8.f27144OooO0o0 = r1
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o0O0o000.OooO00o(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o0O0o000.OooO0O0(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final boolean OooO0OO(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.f27126OooO0oO) {
            int i7 = this.f27124OooO0o[i5];
            int[] iArr = this.f27120OooO00o;
            int i8 = iArr[i7];
            int iOooOo = OooOo(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = f27118OooOO0O.getInt(obj, i10);
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
            if ((268435456 & iOooOo) == 0 || OooOOOo(obj, i2, i, i3, i11)) {
                int iOooOo0o = OooOo0o(iOooOo);
                if (iOooOo0o != 9 && iOooOo0o != 17) {
                    if (iOooOo0o != 27) {
                        if (iOooOo0o == 60 || iOooOo0o == 68) {
                            if (!OooOOo(i8, i2, obj) || OooOoOO(i2).OooO0OO(o0OO0o.OooO0oO(iOooOo & 1048575, obj))) {
                            }
                        } else if (iOooOo0o != 49) {
                            if (iOooOo0o == 50 && !((o0O0OO0) o0OO0o.OooO0oO(iOooOo & 1048575, obj)).isEmpty()) {
                                int i13 = i2 / 3;
                                throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(this.f27121OooO0O0[i13 + i13]);
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) o0OO0o.OooO0oO(iOooOo & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        o0OO000o o0oo000oOooOoOO = OooOoOO(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (o0oo000oOooOoOO.OooO0OO(list.get(i14))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else if (!OooOOOo(obj, i2, i, i3, i11) || OooOoOO(i2).OooO0OO(o0OO0o.OooO0oO(iOooOo & 1048575, obj))) {
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final void OooO0Oo(Object obj, byte[] bArr, int i, int i2, ez0 ez0Var) {
        OooOOoo(obj, bArr, i, i2, 0, ez0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o(com.google.android.gms.internal.play_billing.o0OoO00O r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o0O0o000.OooO0o(com.google.android.gms.internal.play_billing.o0OoO00O):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04db  */
    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o0(com.google.android.gms.internal.play_billing.o0OoO00O r18) {
        /*
            Method dump skipped, instructions count: 1950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o0O0o000.OooO0o0(com.google.android.gms.internal.play_billing.o0OoO00O):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final void OooO0oO(Object obj, o0O0O0o0 o0o0o0o0) throws pz0 {
        int i;
        int i2;
        boolean z;
        int i3;
        o0O0o000 o0o0o000 = this;
        Unsafe unsafe = f27118OooOO0O;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = o0o0o000.f27120OooO00o;
            if (i6 >= iArr.length) {
                ((o0OoO00O) obj).zzc.OooO0Oo(o0o0o0o0);
                return;
            }
            int iOooOo = o0o0o000.OooOo(i6);
            int iOooOo0o = OooOo0o(iOooOo);
            int i8 = iArr[i6];
            if (iOooOo0o <= 17) {
                int i9 = iArr[i6 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = iOooOo & i4;
            switch (iOooOo0o) {
                case 0:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO0O(i8, Double.doubleToRawLongBits(o0OO0o.f27147OooO0OO.OooO00o(j, obj)));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 1:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO00(i8, Float.floatToRawIntBits(o0OO0o.f27147OooO0OO.OooO0O0(j, obj)));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 2:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOoo(i8, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 3:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOoo(i8, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 4:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOO0(i8, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 5:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO0O(i8, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 6:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO00(i8, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 7:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        byte bOooO0oO = o0OO0o.f27147OooO0OO.OooO0oO(j, obj);
                        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
                        o0o0000o.OoooOoO(i8 << 3);
                        int i11 = o0o0000o.f27085OooOoO;
                        try {
                            i2 = i11 + 1;
                        } catch (IndexOutOfBoundsException e) {
                            e = e;
                        }
                        try {
                            o0o0000o.f27083OooOo[i11] = bOooO0oO;
                            o0o0000o.f27085OooOoO = i2;
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                            i11 = i2;
                            throw new pz0(i11, o0o0000o.f27086OooOoO0, 1, e, 3);
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 8:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOOO(i8, (String) object);
                        } else {
                            ((o0O0000O) o0o0o0o0.f27109OooO00o).Oooo(i8, (o0O00000) object);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 9:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        o0o0o0o0.OooO0Oo(i8, unsafe.getObject(obj, j), o0o0o000.OooOoOO(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 10:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).Oooo(i8, (o0O00000) unsafe.getObject(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 11:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOo0(i8, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 12:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOO0(i8, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 13:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO00(i8, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 14:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO0O(i8, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 15:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOo0(i8, (i12 >> 31) ^ (i12 + i12));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 16:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOoo(i8, (j2 + j2) ^ (j2 >> 63));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 17:
                    if (o0o0o000.OooOOOo(obj, i6, i5, i7, i)) {
                        o0o0o0o0.OooO0OO(i8, unsafe.getObject(obj, j), o0o0o000.OooOoOO(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 18:
                    oo0oO0.OooOOo(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 19:
                    oo0oO0.OooOo0O(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 20:
                    oo0oO0.OooOo(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 21:
                    oo0oO0.OooO0Oo(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 22:
                    oo0oO0.OooOo0o(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 23:
                    oo0oO0.OooOo0(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 24:
                    oo0oO0.OooOo00(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 25:
                    oo0oO0.OooOOo0(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    o0O000o0 o0o000o0 = oo0oO0.f27216OooO00o;
                    if (list != null && !list.isEmpty()) {
                        o0o0o0o0.getClass();
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOOO(i13, (String) list.get(i14));
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                    break;
                case 27:
                    int i15 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    o0OO000o o0oo000oOooOoOO = o0o0o000.OooOoOO(i6);
                    o0O000o0 o0o000o02 = oo0oO0.f27216OooO00o;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            o0o0o0o0.OooO0Oo(i15, list2.get(i16), o0oo000oOooOoOO);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                    break;
                case 28:
                    int i17 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    o0O000o0 o0o000o03 = oo0oO0.f27216OooO00o;
                    if (list3 != null && !list3.isEmpty()) {
                        o0o0o0o0.getClass();
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            ((o0O0000O) o0o0o0o0.f27109OooO00o).Oooo(i17, (o0O00000) list3.get(i18));
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                    break;
                case 29:
                    z = false;
                    oo0oO0.OooO0OO(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 30:
                    z = false;
                    oo0oO0.OooOOoo(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 31:
                    z = false;
                    oo0oO0.OooOoO0(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 32:
                    z = false;
                    oo0oO0.OooOoO(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 33:
                    z = false;
                    oo0oO0.OooO00o(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 34:
                    z = false;
                    oo0oO0.OooO0O0(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, false);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 35:
                    oo0oO0.OooOOo(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 36:
                    oo0oO0.OooOo0O(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 37:
                    oo0oO0.OooOo(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 38:
                    oo0oO0.OooO0Oo(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 39:
                    oo0oO0.OooOo0o(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 40:
                    oo0oO0.OooOo0(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 41:
                    oo0oO0.OooOo00(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 42:
                    oo0oO0.OooOOo0(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 43:
                    oo0oO0.OooO0OO(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 44:
                    oo0oO0.OooOOoo(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 45:
                    oo0oO0.OooOoO0(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 46:
                    oo0oO0.OooOoO(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 47:
                    oo0oO0.OooO00o(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    oo0oO0.OooO0O0(iArr[i6], (List) unsafe.getObject(obj, j), o0o0o0o0, true);
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    int i19 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    o0OO000o o0oo000oOooOoOO2 = o0o0o000.OooOoOO(i6);
                    o0O000o0 o0o000o04 = oo0oO0.f27216OooO00o;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            o0o0o0o0.OooO0OO(i19, list4.get(i20), o0oo000oOooOoOO2);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        int i21 = i6 / 3;
                        throw androidx.datastore.preferences.protobuf.OooO00o.OooO0o0(o0o0o000.f27121OooO0O0[i21 + i21]);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO0O(i8, Double.doubleToRawLongBits(((Double) o0OO0o.OooO0oO(j, obj)).doubleValue()));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 52:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO00(i8, Float.floatToRawIntBits(((Float) o0OO0o.OooO0oO(j, obj)).floatValue()));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 53:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOoo(i8, OooOoO0(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 54:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOoo(i8, OooOoO0(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 55:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOO0(i8, OooOo0(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 56:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO0O(i8, OooOoO0(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 57:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO00(i8, OooOo0(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 58:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        byte bBooleanValue = ((Boolean) o0OO0o.OooO0oO(j, obj)).booleanValue();
                        o0O0000O o0o0000o2 = (o0O0000O) o0o0o0o0.f27109OooO00o;
                        o0o0000o2.OoooOoO(i8 << 3);
                        int i22 = o0o0000o2.f27085OooOoO;
                        try {
                            i3 = i22 + 1;
                        } catch (IndexOutOfBoundsException e3) {
                            e = e3;
                        }
                        try {
                            o0o0000o2.f27083OooOo[i22] = bBooleanValue;
                            o0o0000o2.f27085OooOoO = i3;
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                            i22 = i3;
                            throw new pz0(i22, o0o0000o2.f27086OooOoO0, 1, e, 3);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 59:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOOO(i8, (String) object2);
                        } else {
                            ((o0O0000O) o0o0o0o0.f27109OooO00o).Oooo(i8, (o0O00000) object2);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        o0o0o0o0.OooO0Oo(i8, unsafe.getObject(obj, j), o0o0o000.OooOoOO(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 61:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).Oooo(i8, (o0O00000) unsafe.getObject(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOo0(i8, OooOo0(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOO0(i8, OooOo0(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 64:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO00(i8, OooOo0(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 65:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooO0O(i8, OooOoO0(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 66:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        int iOooOo0 = OooOo0(j, obj);
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOo0(i8, (iOooOo0 >> 31) ^ (iOooOo0 + iOooOo0));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 67:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        long jOooOoO0 = OooOoO0(j, obj);
                        ((o0O0000O) o0o0o0o0.f27109OooO00o).OoooOoo(i8, (jOooOoO0 + jOooOoO0) ^ (jOooOoO0 >> 63));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                case 68:
                    if (o0o0o000.OooOOo(i8, i6, obj)) {
                        o0o0o0o0.OooO0OO(i8, unsafe.getObject(obj, j), o0o0o000.OooOoOO(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
                default:
                    i6 += 3;
                    i4 = 1048575;
                    o0o0o000 = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final boolean OooO0oo(o0OoO00O o0ooo00o, o0OoO00O o0ooo00o2) {
        boolean zOooO0o0;
        int i = 0;
        while (true) {
            int[] iArr = this.f27120OooO00o;
            if (i < iArr.length) {
                int iOooOo = OooOo(i);
                long j = iOooOo & 1048575;
                switch (OooOo0o(iOooOo)) {
                    case 0:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i)) {
                            break;
                        } else {
                            o0OO0o00 o0oo0o00 = o0OO0o.f27147OooO0OO;
                            if (Double.doubleToLongBits(o0oo0o00.OooO00o(j, o0ooo00o)) != Double.doubleToLongBits(o0oo0o00.OooO00o(j, o0ooo00o2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i)) {
                            break;
                        } else {
                            o0OO0o00 o0oo0o002 = o0OO0o.f27147OooO0OO;
                            if (Float.floatToIntBits(o0oo0o002.OooO0O0(j, o0ooo00o)) != Float.floatToIntBits(o0oo0o002.OooO0O0(j, o0ooo00o2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0o0(j, o0ooo00o) != o0OO0o.OooO0o0(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0o0(j, o0ooo00o) != o0OO0o.OooO0o0(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0Oo(j, o0ooo00o) != o0OO0o.OooO0Oo(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0o0(j, o0ooo00o) != o0OO0o.OooO0o0(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0Oo(j, o0ooo00o) != o0OO0o.OooO0Oo(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i)) {
                            break;
                        } else {
                            o0OO0o00 o0oo0o003 = o0OO0o.f27147OooO0OO;
                            if (o0oo0o003.OooO0oO(j, o0ooo00o) != o0oo0o003.OooO0oO(j, o0ooo00o2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || !oo0oO0.OooO0o0(o0OO0o.OooO0oO(j, o0ooo00o), o0OO0o.OooO0oO(j, o0ooo00o2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || !oo0oO0.OooO0o0(o0OO0o.OooO0oO(j, o0ooo00o), o0OO0o.OooO0oO(j, o0ooo00o2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || !oo0oO0.OooO0o0(o0OO0o.OooO0oO(j, o0ooo00o), o0OO0o.OooO0oO(j, o0ooo00o2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0Oo(j, o0ooo00o) != o0OO0o.OooO0Oo(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0Oo(j, o0ooo00o) != o0OO0o.OooO0Oo(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0Oo(j, o0ooo00o) != o0OO0o.OooO0Oo(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0o0(j, o0ooo00o) != o0OO0o.OooO0o0(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0Oo(j, o0ooo00o) != o0OO0o.OooO0Oo(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || o0OO0o.OooO0o0(j, o0ooo00o) != o0OO0o.OooO0o0(j, o0ooo00o2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (!OooOOO(o0ooo00o, o0ooo00o2, i) || !oo0oO0.OooO0o0(o0OO0o.OooO0oO(j, o0ooo00o), o0OO0o.OooO0oO(j, o0ooo00o2))) {
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
                        zOooO0o0 = oo0oO0.OooO0o0(o0OO0o.OooO0oO(j, o0ooo00o), o0OO0o.OooO0oO(j, o0ooo00o2));
                        break;
                    case 50:
                        zOooO0o0 = oo0oO0.OooO0o0(o0OO0o.OooO0oO(j, o0ooo00o), o0OO0o.OooO0oO(j, o0ooo00o2));
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
                        if (o0OO0o.OooO0Oo(j2, o0ooo00o) != o0OO0o.OooO0Oo(j2, o0ooo00o2) || !oo0oO0.OooO0o0(o0OO0o.OooO0oO(j, o0ooo00o), o0OO0o.OooO0oO(j, o0ooo00o2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (zOooO0o0) {
                    i += 3;
                }
            } else if (o0ooo00o.zzc.equals(o0ooo00o2.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final void OooOO0(int i, Object obj, Object obj2) {
        int[] iArr = this.f27120OooO00o;
        int i2 = iArr[i];
        if (OooOOo(i2, i, obj2)) {
            int iOooOo = OooOo(i) & 1048575;
            Unsafe unsafe = f27118OooOO0O;
            long j = iOooOo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            o0OO000o o0oo000oOooOoOO = OooOoOO(i);
            if (!OooOOo(i2, i, obj)) {
                if (OooOOo0(object)) {
                    o0OoO00O o0ooo00oZze = o0oo000oOooOoOO.zze();
                    o0oo000oOooOoOO.OooO0O0(o0ooo00oZze, object);
                    unsafe.putObject(obj, j, o0ooo00oZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                o0OO0o.OooO(obj, i2, iArr[i + 2] & 1048575);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!OooOOo0(object2)) {
                o0OoO00O o0ooo00oZze2 = o0oo000oOooOoOO.zze();
                o0oo000oOooOoOO.OooO0O0(o0ooo00oZze2, object2);
                unsafe.putObject(obj, j, o0ooo00oZze2);
                object2 = o0ooo00oZze2;
            }
            o0oo000oOooOoOO.OooO0O0(object2, object);
        }
    }

    public final void OooOO0O(int i, Object obj) {
        int i2 = this.f27120OooO00o[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        o0OO0o.OooO(obj, (1 << (i2 >>> 20)) | o0OO0o.OooO0Oo(j, obj), j);
    }

    public final void OooOO0o(int i, Object obj, Object obj2) {
        f27118OooOO0O.putObject(obj, OooOo(i) & 1048575, obj2);
        OooOO0O(i, obj);
    }

    public final boolean OooOOO(o0OoO00O o0ooo00o, o0OoO00O o0ooo00o2, int i) {
        return OooOOOO(i, o0ooo00o) == OooOOOO(i, o0ooo00o2);
    }

    public final void OooOOO0(int i, Object obj, int i2, Object obj2) {
        f27118OooOO0O.putObject(obj, OooOo(i2) & 1048575, obj2);
        o0OO0o.OooO(obj, i, this.f27120OooO00o[i2 + 2] & 1048575);
    }

    public final boolean OooOOOO(int i, Object obj) {
        int i2 = this.f27120OooO00o[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iOooOo = OooOo(i);
            long j2 = iOooOo & 1048575;
            switch (OooOo0o(iOooOo)) {
                case 0:
                    if (Double.doubleToRawLongBits(o0OO0o.f27147OooO0OO.OooO00o(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(o0OO0o.f27147OooO0OO.OooO0O0(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (o0OO0o.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (o0OO0o.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (o0OO0o.OooO0Oo(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (o0OO0o.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (o0OO0o.OooO0Oo(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return o0OO0o.f27147OooO0OO.OooO0oO(j2, obj);
                case 8:
                    Object objOooO0oO = o0OO0o.OooO0oO(j2, obj);
                    if (objOooO0oO instanceof String) {
                        if (((String) objOooO0oO).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objOooO0oO instanceof o0O00000)) {
                            throw new IllegalArgumentException();
                        }
                        if (o0O00000.f27078OooOo.equals(objOooO0oO)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (o0OO0o.OooO0oO(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (o0O00000.f27078OooOo.equals(o0OO0o.OooO0oO(j2, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (o0OO0o.OooO0Oo(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (o0OO0o.OooO0Oo(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (o0OO0o.OooO0Oo(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (o0OO0o.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (o0OO0o.OooO0Oo(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (o0OO0o.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (o0OO0o.OooO0oO(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & o0OO0o.OooO0Oo(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean OooOOOo(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? OooOOOO(i, obj) : (i3 & i4) != 0;
    }

    public final boolean OooOOo(int i, int i2, Object obj) {
        return o0OO0o.OooO0Oo((long) (this.f27120OooO00o[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02f3, code lost:
    
        throw new com.google.android.gms.internal.play_billing.o0O00oO0("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x034e, code lost:
    
        throw new com.google.android.gms.internal.play_billing.o0O00oO0("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03ba, code lost:
    
        throw new com.google.android.gms.internal.play_billing.o0O00oO0("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0431, code lost:
    
        r14 = r5;
        r7 = r10;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04ad, code lost:
    
        r3 = r10;
        r16 = r12;
        r6 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04b1, code lost:
    
        r9 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04da, code lost:
    
        r11 = r41;
        r5 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0526, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0555, code lost:
    
        r11 = r41;
        r3 = r6;
        r17 = r7;
        r2 = r9;
        r16 = r12;
        r6 = r14;
        r8 = r19;
        r27 = r22;
        r15 = r32;
        r14 = r1;
        r1 = r10;
        r10 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0105, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0146, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0147, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0c17, code lost:
    
        r10 = r43;
        r3 = r0;
        r1 = r2;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0184, code lost:
    
        r10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0185, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0186, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d9, code lost:
    
        r22 = r2;
        r14 = r10;
        r19 = r13;
        r13 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0e95 A[PHI: r1 r2 r5 r28
  0x0e95: PHI (r1v98 byte[]) = 
  (r1v68 byte[])
  (r1v69 byte[])
  (r1v70 byte[])
  (r1v71 byte[])
  (r1v72 byte[])
  (r1v74 byte[])
  (r1v75 byte[])
  (r1v76 byte[])
  (r1v99 byte[])
 binds: [B:610:0x0e7d, B:607:0x0e61, B:604:0x0e49, B:601:0x0e32, B:598:0x0e1b, B:594:0x0e01, B:587:0x0de0, B:573:0x0da5, B:537:0x0c97] A[DONT_GENERATE, DONT_INLINE]
  0x0e95: PHI (r2v118 com.google.android.gms.internal.play_billing.o0OO00o0) = 
  (r2v97 com.google.android.gms.internal.play_billing.o0OO00o0)
  (r2v98 com.google.android.gms.internal.play_billing.o0OO00o0)
  (r2v99 com.google.android.gms.internal.play_billing.o0OO00o0)
  (r2v100 com.google.android.gms.internal.play_billing.o0OO00o0)
  (r2v101 com.google.android.gms.internal.play_billing.o0OO00o0)
  (r2v103 com.google.android.gms.internal.play_billing.o0OO00o0)
  (r2v104 com.google.android.gms.internal.play_billing.o0OO00o0)
  (r2v105 com.google.android.gms.internal.play_billing.o0OO00o0)
  (r2v119 com.google.android.gms.internal.play_billing.o0OO00o0)
 binds: [B:610:0x0e7d, B:607:0x0e61, B:604:0x0e49, B:601:0x0e32, B:598:0x0e1b, B:594:0x0e01, B:587:0x0de0, B:573:0x0da5, B:537:0x0c97] A[DONT_GENERATE, DONT_INLINE]
  0x0e95: PHI (r5v85 int) = (r5v57 int), (r5v58 int), (r5v59 int), (r5v60 int), (r5v61 int), (r5v63 int), (r5v64 int), (r5v65 int), (r5v86 int) binds: [B:610:0x0e7d, B:607:0x0e61, B:604:0x0e49, B:601:0x0e32, B:598:0x0e1b, B:594:0x0e01, B:587:0x0de0, B:573:0x0da5, B:537:0x0c97] A[DONT_GENERATE, DONT_INLINE]
  0x0e95: PHI (r28v14 int) = (r28v3 int), (r28v3 int), (r28v3 int), (r28v3 int), (r28v3 int), (r28v3 int), (r28v3 int), (r28v3 int), (r28v15 int) binds: [B:610:0x0e7d, B:607:0x0e61, B:604:0x0e49, B:601:0x0e32, B:598:0x0e1b, B:594:0x0e01, B:587:0x0de0, B:573:0x0da5, B:537:0x0c97] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0e98  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x0eb0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:736:0x0c17 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOOoo(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, com.google.android.gms.internal.ads.ez0 r44) {
        /*
            Method dump skipped, instructions count: 4088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o0O0o000.OooOOoo(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.ez0):int");
    }

    public final int OooOo(int i) {
        return this.f27120OooO00o[i + 1];
    }

    public final int OooOo0O(int i, int i2) {
        int[] iArr = this.f27120OooO00o;
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

    public final o0O00O OooOoO(int i) {
        int i2 = i / 3;
        return (o0O00O) this.f27121OooO0O0[i2 + i2 + 1];
    }

    public final o0OO000o OooOoOO(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f27121OooO0O0;
        o0OO000o o0oo000o = (o0OO000o) objArr[i3];
        if (o0oo000o != null) {
            return o0oo000o;
        }
        o0OO000o o0oo000oOooO00o = o0O0oo00.f27130OooO0OO.OooO00o((Class) objArr[i3 + 1]);
        objArr[i3] = o0oo000oOooO00o;
        return o0oo000oOooO00o;
    }

    public final Object OooOoo(int i, int i2, Object obj) {
        o0OO000o o0oo000oOooOoOO = OooOoOO(i2);
        if (!OooOOo(i, i2, obj)) {
            return o0oo000oOooOoOO.zze();
        }
        Object object = f27118OooOO0O.getObject(obj, OooOo(i2) & 1048575);
        if (OooOOo0(object)) {
            return object;
        }
        o0OoO00O o0ooo00oZze = o0oo000oOooOoOO.zze();
        if (object != null) {
            o0oo000oOooOoOO.OooO0O0(o0ooo00oZze, object);
        }
        return o0ooo00oZze;
    }

    public final Object OooOoo0(int i, Object obj) {
        o0OO000o o0oo000oOooOoOO = OooOoOO(i);
        int iOooOo = OooOo(i) & 1048575;
        if (!OooOOOO(i, obj)) {
            return o0oo000oOooOoOO.zze();
        }
        Object object = f27118OooOO0O.getObject(obj, iOooOo);
        if (OooOOo0(object)) {
            return object;
        }
        o0OoO00O o0ooo00oZze = o0oo000oOooOoOO.zze();
        if (object != null) {
            o0oo000oOooOoOO.OooO0O0(o0ooo00oZze, object);
        }
        return o0ooo00oZze;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OO000o
    public final o0OoO00O zze() {
        return (o0OoO00O) ((o0OoO00O) this.f27125OooO0o0).OooO0Oo(4);
    }
}

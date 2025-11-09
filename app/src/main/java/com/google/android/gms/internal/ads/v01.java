package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.pipes.PipesConfigBase;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class v01 implements g11 {

    /* renamed from: OooOO0O */
    public static final int[] f24802OooOO0O = new int[0];
    public static final Unsafe OooOO0o = q11.OooOO0();

    /* renamed from: OooO */
    public final int f24803OooO;

    /* renamed from: OooO00o */
    public final int[] f24804OooO00o;

    /* renamed from: OooO0O0 */
    public final Object[] f24805OooO0O0;

    /* renamed from: OooO0OO */
    public final int f24806OooO0OO;

    /* renamed from: OooO0Oo */
    public final int f24807OooO0Oo;

    /* renamed from: OooO0o */
    public final boolean f24808OooO0o;

    /* renamed from: OooO0o0 */
    public final bz0 f24809OooO0o0;

    /* renamed from: OooO0oO */
    public final int[] f24810OooO0oO;

    /* renamed from: OooO0oo */
    public final int f24811OooO0oo;

    /* renamed from: OooOO0 */
    public final o0O f24812OooOO0;

    public v01(int[] iArr, Object[] objArr, int i, int i2, bz0 bz0Var, int[] iArr2, int i3, int i4, o0O o0o, qv0 qv0Var) {
        this.f24804OooO00o = iArr;
        this.f24805OooO0O0 = objArr;
        this.f24806OooO0OO = i;
        this.f24807OooO0Oo = i2;
        this.f24808OooO0o = bz0Var instanceof zz0;
        this.f24810OooO0oO = iArr2;
        this.f24811OooO0oo = i3;
        this.f24803OooO = i4;
        this.f24812OooOO0 = o0o;
        this.f24809OooO0o0 = bz0Var;
    }

    public static Field OooOO0o(Class cls, String str) {
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

    public static void OooOOO0(Object obj) {
        if (!OooOo(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean OooOo(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zz0) {
            return ((zz0) obj).OooOOo();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:351:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.v01 OooOoOO(com.google.android.gms.internal.ads.c11 r34, com.google.android.gms.internal.ads.o0O r35, com.google.android.gms.internal.ads.qv0 r36) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v01.OooOoOO(com.google.android.gms.internal.ads.c11, com.google.android.gms.internal.ads.o0O, com.google.android.gms.internal.ads.qv0):com.google.android.gms.internal.ads.v01");
    }

    public static int OooOoo0(long j, Object obj) {
        return ((Integer) q11.OooO(j, obj)).intValue();
    }

    public static int OooOooO(int i) {
        return (i >>> 20) & 255;
    }

    public static long Oooo000(long j, Object obj) {
        return ((Long) q11.OooO(j, obj)).longValue();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.g11
    public final void OooO(java.lang.Object r27, com.google.android.gms.internal.ads.w10 r28, com.google.android.gms.internal.ads.tz0 r29) {
        /*
            Method dump skipped, instructions count: 2090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v01.OooO(java.lang.Object, com.google.android.gms.internal.ads.w10, com.google.android.gms.internal.ads.tz0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0074  */
    @Override // com.google.android.gms.internal.ads.g11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = OooOo(r8)
            if (r0 != 0) goto L8
            goto L99
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zz0
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.ads.zz0 r0 = (com.google.android.gms.internal.ads.zz0) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.OooO0o(r2)
            r0.zzq = r1
            r0.OooOO0()
        L1b:
            r0 = r1
        L1c:
            int[] r2 = r7.f24804OooO00o
            int r3 = r2.length
            if (r0 >= r3) goto L8a
            int r3 = r7.OooOooo(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = OooOooO(r3)
            long r4 = (long) r4
            r6 = 9
            if (r3 == r6) goto L74
            r6 = 60
            if (r3 == r6) goto L5e
            r6 = 68
            if (r3 == r6) goto L5e
            switch(r3) {
                case 17: goto L74;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L87
        L3e:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.v01.OooOO0o
            java.lang.Object r3 = r2.getObject(r8, r4)
            if (r3 == 0) goto L87
            r6 = r3
            com.google.android.gms.internal.ads.q01 r6 = (com.google.android.gms.internal.ads.q01) r6
            r6.f23474OooOo0O = r1
            r2.putObject(r8, r4, r3)
            goto L87
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.ads.q11.OooO(r4, r8)
            com.google.android.gms.internal.ads.h01 r2 = (com.google.android.gms.internal.ads.h01) r2
            com.google.android.gms.internal.ads.cz0 r2 = (com.google.android.gms.internal.ads.cz0) r2
            boolean r3 = r2.f18106OooOo0O
            if (r3 == 0) goto L87
            r2.f18106OooOo0O = r1
            goto L87
        L5e:
            r2 = r2[r0]
            boolean r2 = r7.OooOoO0(r2, r0, r8)
            if (r2 == 0) goto L87
            com.google.android.gms.internal.ads.g11 r2 = r7.Oooo00o(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.ads.v01.OooOO0o
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.OooO00o(r3)
            goto L87
        L74:
            boolean r2 = r7.OooOo0O(r0, r8)
            if (r2 == 0) goto L87
            com.google.android.gms.internal.ads.g11 r2 = r7.Oooo00o(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.ads.v01.OooOO0o
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.OooO00o(r3)
        L87:
            int r0 = r0 + 3
            goto L1c
        L8a:
            com.google.android.gms.internal.ads.o0O r0 = r7.f24812OooOO0
            r0.getClass()
            com.google.android.gms.internal.ads.zz0 r8 = (com.google.android.gms.internal.ads.zz0) r8
            com.google.android.gms.internal.ads.l11 r8 = r8.zzt
            boolean r0 = r8.f20776OooO0o0
            if (r0 == 0) goto L99
            r8.f20776OooO0o0 = r1
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v01.OooO00o(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:91:0x001e  */
    @Override // com.google.android.gms.internal.ads.g11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v01.OooO0O0(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final void OooO0OO(Object obj, byte[] bArr, int i, int i2, ez0 ez0Var) {
        OooOoO(obj, bArr, i, i2, 0, ez0Var);
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final void OooO0Oo(Object obj, rh0 rh0Var) {
        int i;
        v01 v01Var = this;
        Unsafe unsafe = OooOO0o;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = v01Var.f24804OooO00o;
            if (i3 >= iArr.length) {
                ((zz0) obj).zzt.OooO0Oo(rh0Var);
                return;
            }
            int iOooOooo = v01Var.OooOooo(i3);
            int iOooOooO = OooOooO(iOooOooo);
            int i6 = iArr[i3];
            if (iOooOooO <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iOooOooo & i2;
            switch (iOooOooO) {
                case 0:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OO00O(i6, Double.doubleToRawLongBits(q11.f23482OooO0OO.o0O0O00(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OOO0o(i6, Float.floatToRawIntBits(q11.f23482OooO0OO.o000OOo(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o00000O(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o00000O(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0O0O00(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OO00O(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OOO0o(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0ooOOo(i6, q11.f23482OooO0OO.o00000OO(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((rz0) rh0Var.f23865OooOo0O).o000000O(i6, (String) object);
                            break;
                        } else {
                            ((rz0) rh0Var.f23865OooOo0O).o0ooOoO(i6, (jz0) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        Object object2 = unsafe.getObject(obj, j);
                        g11 g11VarOooo00o = v01Var.Oooo00o(i3);
                        rh0Var.getClass();
                        ((rz0) rh0Var.f23865OooOo0O).o000000(i6, (bz0) object2, g11VarOooo00o);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0ooOoO(i6, (jz0) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o00000(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0O0O00(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OOO0o(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OO00O(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        int i9 = unsafe.getInt(obj, j);
                        ((rz0) rh0Var.f23865OooOo0O).o00000(i6, (i9 >> 31) ^ (i9 + i9));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((rz0) rh0Var.f23865OooOo0O).o00000O(i6, (j2 + j2) ^ (j2 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (v01Var.OooOo0o(obj, i3, i5, i4, i)) {
                        rh0Var.OooO0O0(i6, unsafe.getObject(obj, j), v01Var.Oooo00o(i3));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h11.OooOo0(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 19:
                    h11.OooOoO0(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 20:
                    h11.OooO00o(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 21:
                    h11.OooO0oO(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 22:
                    h11.OooOoO(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 23:
                    h11.OooOo(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 24:
                    h11.OooOo0o(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 25:
                    h11.OooOo00(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 26:
                    int i10 = iArr[i3];
                    List list = (List) unsafe.getObject(obj, j);
                    o0O o0o = h11.f19523OooO00o;
                    if (list != null && !list.isEmpty()) {
                        rh0Var.getClass();
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            ((rz0) rh0Var.f23865OooOo0O).o000000O(i10, (String) list.get(i11));
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 27:
                    int i12 = iArr[i3];
                    List list2 = (List) unsafe.getObject(obj, j);
                    g11 g11VarOooo00o2 = v01Var.Oooo00o(i3);
                    o0O o0o2 = h11.f19523OooO00o;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            Object obj2 = list2.get(i13);
                            rh0Var.getClass();
                            ((rz0) rh0Var.f23865OooOo0O).o000000(i12, (bz0) obj2, g11VarOooo00o2);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 28:
                    int i14 = iArr[i3];
                    List list3 = (List) unsafe.getObject(obj, j);
                    o0O o0o3 = h11.f19523OooO00o;
                    if (list3 != null && !list3.isEmpty()) {
                        rh0Var.getClass();
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            ((rz0) rh0Var.f23865OooOo0O).o0ooOoO(i14, (jz0) list3.get(i15));
                        }
                        break;
                    } else {
                        break;
                    }
                case 29:
                    h11.OooO0o(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 30:
                    h11.OooOo0O(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 31:
                    h11.OooO0O0(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 32:
                    h11.OooO0OO(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 33:
                    h11.OooO0Oo(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 34:
                    h11.OooO0o0(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, false);
                    break;
                case 35:
                    h11.OooOo0(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 36:
                    h11.OooOoO0(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 37:
                    h11.OooO00o(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 38:
                    h11.OooO0oO(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 39:
                    h11.OooOoO(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 40:
                    h11.OooOo(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 41:
                    h11.OooOo0o(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 42:
                    h11.OooOo00(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 43:
                    h11.OooO0o(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 44:
                    h11.OooOo0O(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 45:
                    h11.OooO0O0(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 46:
                    h11.OooO0OO(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case 47:
                    h11.OooO0Oo(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    h11.OooO0o0(iArr[i3], (List) unsafe.getObject(obj, j), rh0Var, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    int i16 = iArr[i3];
                    List list4 = (List) unsafe.getObject(obj, j);
                    g11 g11VarOooo00o3 = v01Var.Oooo00o(i3);
                    o0O o0o4 = h11.f19523OooO00o;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            rh0Var.OooO0O0(i16, list4.get(i17), g11VarOooo00o3);
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        v01Var.Oooo0O0(i3).getClass();
                        throw new ClassCastException();
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OO00O(i6, Double.doubleToRawLongBits(((Double) q11.OooO(j, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OOO0o(i6, Float.floatToRawIntBits(((Float) q11.OooO(j, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o00000O(i6, Oooo000(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o00000O(i6, Oooo000(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0O0O00(i6, OooOoo0(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OO00O(i6, Oooo000(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OOO0o(i6, OooOoo0(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0ooOOo(i6, ((Boolean) q11.OooO(j, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((rz0) rh0Var.f23865OooOo0O).o000000O(i6, (String) object3);
                            break;
                        } else {
                            ((rz0) rh0Var.f23865OooOo0O).o0ooOoO(i6, (jz0) object3);
                            break;
                        }
                    } else {
                        break;
                    }
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        g11 g11VarOooo00o4 = v01Var.Oooo00o(i3);
                        rh0Var.getClass();
                        ((rz0) rh0Var.f23865OooOo0O).o000000(i6, (bz0) object4, g11VarOooo00o4);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0ooOoO(i6, (jz0) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o00000(i6, OooOoo0(j, obj));
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0O0O00(i6, OooOoo0(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OOO0o(i6, OooOoo0(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        ((rz0) rh0Var.f23865OooOo0O).o0OO00O(i6, Oooo000(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        int iOooOoo0 = OooOoo0(j, obj);
                        ((rz0) rh0Var.f23865OooOo0O).o00000(i6, (iOooOoo0 >> 31) ^ (iOooOoo0 + iOooOoo0));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        long jOooo000 = Oooo000(j, obj);
                        ((rz0) rh0Var.f23865OooOo0O).o00000O(i6, (jOooo000 + jOooo000) ^ (jOooo000 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v01Var.OooOoO0(i6, i3, obj)) {
                        rh0Var.OooO0O0(i6, unsafe.getObject(obj, j), v01Var.Oooo00o(i3));
                        break;
                    } else {
                        break;
                    }
            }
            i3 += 3;
            i2 = 1048575;
            v01Var = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:206:0x01ea, B:164:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.g11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o(com.google.android.gms.internal.ads.zz0 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v01.OooO0o(com.google.android.gms.internal.ads.zz0):int");
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final boolean OooO0o0(zz0 zz0Var, zz0 zz0Var2) {
        boolean zOooO0oo;
        int i = 0;
        while (true) {
            int[] iArr = this.f24804OooO00o;
            if (i < iArr.length) {
                int iOooOooo = OooOooo(i);
                long j = iOooOooo & 1048575;
                switch (OooOooO(iOooOooo)) {
                    case 0:
                        if (!OooOo0(zz0Var, zz0Var2, i)) {
                            break;
                        } else {
                            p11 p11Var = q11.f23482OooO0OO;
                            if (Double.doubleToLongBits(p11Var.o0O0O00(j, zz0Var)) != Double.doubleToLongBits(p11Var.o0O0O00(j, zz0Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!OooOo0(zz0Var, zz0Var2, i)) {
                            break;
                        } else {
                            p11 p11Var2 = q11.f23482OooO0OO;
                            if (Float.floatToIntBits(p11Var2.o000OOo(j, zz0Var)) != Float.floatToIntBits(p11Var2.o000OOo(j, zz0Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0oO(j, zz0Var) != q11.OooO0oO(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0oO(j, zz0Var) != q11.OooO0oO(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0o0(j, zz0Var) != q11.OooO0o0(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0oO(j, zz0Var) != q11.OooO0oO(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0o0(j, zz0Var) != q11.OooO0o0(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!OooOo0(zz0Var, zz0Var2, i)) {
                            break;
                        } else {
                            p11 p11Var3 = q11.f23482OooO0OO;
                            if (p11Var3.o00000OO(j, zz0Var) != p11Var3.o00000OO(j, zz0Var2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (!OooOo0(zz0Var, zz0Var2, i) || !h11.OooO0oo(q11.OooO(j, zz0Var), q11.OooO(j, zz0Var2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (!OooOo0(zz0Var, zz0Var2, i) || !h11.OooO0oo(q11.OooO(j, zz0Var), q11.OooO(j, zz0Var2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (!OooOo0(zz0Var, zz0Var2, i) || !h11.OooO0oo(q11.OooO(j, zz0Var), q11.OooO(j, zz0Var2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0o0(j, zz0Var) != q11.OooO0o0(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0o0(j, zz0Var) != q11.OooO0o0(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0o0(j, zz0Var) != q11.OooO0o0(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0oO(j, zz0Var) != q11.OooO0oO(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0o0(j, zz0Var) != q11.OooO0o0(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (!OooOo0(zz0Var, zz0Var2, i) || q11.OooO0oO(j, zz0Var) != q11.OooO0oO(j, zz0Var2)) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (!OooOo0(zz0Var, zz0Var2, i) || !h11.OooO0oo(q11.OooO(j, zz0Var), q11.OooO(j, zz0Var2))) {
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
                        zOooO0oo = h11.OooO0oo(q11.OooO(j, zz0Var), q11.OooO(j, zz0Var2));
                        break;
                    case 50:
                        zOooO0oo = h11.OooO0oo(q11.OooO(j, zz0Var), q11.OooO(j, zz0Var2));
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
                        if (q11.OooO0o0(j2, zz0Var) != q11.OooO0o0(j2, zz0Var2) || !h11.OooO0oo(q11.OooO(j, zz0Var), q11.OooO(j, zz0Var2))) {
                            break;
                        } else {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (zOooO0oo) {
                    i += 3;
                }
            } else if (zz0Var.zzt.equals(zz0Var2.zzt)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final boolean OooO0oO(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.f24811OooO0oo) {
            int i7 = this.f24810OooO0oO[i5];
            int[] iArr = this.f24804OooO00o;
            int i8 = iArr[i7];
            int iOooOooo = OooOooo(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = OooOO0o.getInt(obj, i10);
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
            if ((268435456 & iOooOooo) == 0 || OooOo0o(obj, i2, i, i3, i11)) {
                int iOooOooO = OooOooO(iOooOooo);
                if (iOooOooO != 9 && iOooOooO != 17) {
                    if (iOooOooO != 27) {
                        if (iOooOooO == 60 || iOooOooO == 68) {
                            if (!OooOoO0(i8, i2, obj) || Oooo00o(i2).OooO0oO(q11.OooO(iOooOooo & 1048575, obj))) {
                            }
                        } else if (iOooOooO != 49) {
                            if (iOooOooO == 50 && !((q01) q11.OooO(iOooOooo & 1048575, obj)).isEmpty()) {
                                Oooo0O0(i2).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) q11.OooO(iOooOooo & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        g11 g11VarOooo00o = Oooo00o(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (g11VarOooo00o.OooO0oO(list.get(i13))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else if (!OooOo0o(obj, i2, i, i3, i11) || Oooo00o(i2).OooO0oO(q11.OooO(iOooOooo & 1048575, obj))) {
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:504:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x04d8  */
    @Override // com.google.android.gms.internal.ads.g11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0oo(com.google.android.gms.internal.ads.zz0 r18) {
        /*
            Method dump skipped, instructions count: 1946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v01.OooO0oo(com.google.android.gms.internal.ads.zz0):int");
    }

    public final Object OooOO0(int i, Object obj) {
        g11 g11VarOooo00o = Oooo00o(i);
        int iOooOooo = OooOooo(i) & 1048575;
        if (!OooOo0O(i, obj)) {
            return g11VarOooo00o.zze();
        }
        Object object = OooOO0o.getObject(obj, iOooOooo);
        if (OooOo(object)) {
            return object;
        }
        zz0 zz0VarZze = g11VarOooo00o.zze();
        if (object != null) {
            g11VarOooo00o.OooO0O0(zz0VarZze, object);
        }
        return zz0VarZze;
    }

    public final Object OooOO0O(int i, int i2, Object obj) {
        g11 g11VarOooo00o = Oooo00o(i2);
        if (!OooOoO0(i, i2, obj)) {
            return g11VarOooo00o.zze();
        }
        Object object = OooOO0o.getObject(obj, OooOooo(i2) & 1048575);
        if (OooOo(object)) {
            return object;
        }
        zz0 zz0VarZze = g11VarOooo00o.zze();
        if (object != null) {
            g11VarOooo00o.OooO0O0(zz0VarZze, object);
        }
        return zz0VarZze;
    }

    public final void OooOOO(int i, Object obj, Object obj2) {
        if (OooOo0O(i, obj2)) {
            int iOooOooo = OooOooo(i) & 1048575;
            Unsafe unsafe = OooOO0o;
            long j = iOooOooo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f24804OooO00o[i] + " is present but null: " + obj2.toString());
            }
            g11 g11VarOooo00o = Oooo00o(i);
            if (!OooOo0O(i, obj)) {
                if (OooOo(object)) {
                    zz0 zz0VarZze = g11VarOooo00o.zze();
                    g11VarOooo00o.OooO0O0(zz0VarZze, object);
                    unsafe.putObject(obj, j, zz0VarZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                OooOOo0(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!OooOo(object2)) {
                zz0 zz0VarZze2 = g11VarOooo00o.zze();
                g11VarOooo00o.OooO0O0(zz0VarZze2, object2);
                unsafe.putObject(obj, j, zz0VarZze2);
                object2 = zz0VarZze2;
            }
            g11VarOooo00o.OooO0O0(object2, object);
        }
    }

    public final void OooOOOO(int i, Object obj, Object obj2) {
        int[] iArr = this.f24804OooO00o;
        int i2 = iArr[i];
        if (OooOoO0(i2, i, obj2)) {
            int iOooOooo = OooOooo(i) & 1048575;
            Unsafe unsafe = OooOO0o;
            long j = iOooOooo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            g11 g11VarOooo00o = Oooo00o(i);
            if (!OooOoO0(i2, i, obj)) {
                if (OooOo(object)) {
                    zz0 zz0VarZze = g11VarOooo00o.zze();
                    g11VarOooo00o.OooO0O0(zz0VarZze, object);
                    unsafe.putObject(obj, j, zz0VarZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                OooOOo(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!OooOo(object2)) {
                zz0 zz0VarZze2 = g11VarOooo00o.zze();
                g11VarOooo00o.OooO0O0(zz0VarZze2, object2);
                unsafe.putObject(obj, j, zz0VarZze2);
                object2 = zz0VarZze2;
            }
            g11VarOooo00o.OooO0O0(object2, object);
        }
    }

    public final void OooOOOo(int i, w10 w10Var, Object obj) {
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            w10Var.Oooo0oo(2);
            q11.OooOOO(j, obj, ((nz0) w10Var.f25174OooO0Oo).OoooOOo());
        } else if (this.f24808OooO0o) {
            w10Var.Oooo0oo(2);
            q11.OooOOO(j, obj, ((nz0) w10Var.f25174OooO0Oo).OoooOOO());
        } else {
            w10Var.Oooo0oo(2);
            q11.OooOOO(j, obj, ((nz0) w10Var.f25174OooO0Oo).o000oOoO());
        }
    }

    public final void OooOOo(int i, int i2, Object obj) {
        q11.OooOO0o(obj, i, this.f24804OooO00o[i2 + 2] & 1048575);
    }

    public final void OooOOo0(int i, Object obj) {
        int i2 = this.f24804OooO00o[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        q11.OooOO0o(obj, (1 << (i2 >>> 20)) | q11.OooO0o0(j, obj), j);
    }

    public final void OooOOoo(int i, Object obj, Object obj2) {
        OooOO0o.putObject(obj, OooOooo(i) & 1048575, obj2);
        OooOOo0(i, obj);
    }

    public final boolean OooOo0(zz0 zz0Var, zz0 zz0Var2, int i) {
        return OooOo0O(i, zz0Var) == OooOo0O(i, zz0Var2);
    }

    public final void OooOo00(int i, Object obj, int i2, Object obj2) {
        OooOO0o.putObject(obj, OooOooo(i2) & 1048575, obj2);
        OooOOo(i, i2, obj);
    }

    public final boolean OooOo0O(int i, Object obj) {
        int i2 = this.f24804OooO00o[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iOooOooo = OooOooo(i);
            long j2 = iOooOooo & 1048575;
            switch (OooOooO(iOooOooo)) {
                case 0:
                    if (Double.doubleToRawLongBits(q11.f23482OooO0OO.o0O0O00(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(q11.f23482OooO0OO.o000OOo(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (q11.OooO0oO(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (q11.OooO0oO(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (q11.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (q11.OooO0oO(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (q11.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return q11.f23482OooO0OO.o00000OO(j2, obj);
                case 8:
                    Object objOooO = q11.OooO(j2, obj);
                    if (objOooO instanceof String) {
                        if (((String) objOooO).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objOooO instanceof jz0)) {
                            throw new IllegalArgumentException();
                        }
                        if (jz0.f20406OooOo0o.equals(objOooO)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (q11.OooO(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (jz0.f20406OooOo0o.equals(q11.OooO(j2, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (q11.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (q11.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (q11.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (q11.OooO0oO(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (q11.OooO0o0(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (q11.OooO0oO(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (q11.OooO(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & q11.OooO0o0(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean OooOo0o(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? OooOo0O(i, obj) : (i3 & i4) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1210:0x0d3b, code lost:
    
        if (r9 == 1048575) goto L1212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1211:0x0d3d, code lost:
    
        r18.putInt(r10, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1212:0x0d43, code lost:
    
        r2 = r33.f24811OooO0oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1214:0x0d49, code lost:
    
        if (r2 >= r33.f24803OooO) goto L1312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1215:0x0d4b, code lost:
    
        Oooo0(r33.f24810OooO0oO[r2], r10, r36);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1217:0x0d59, code lost:
    
        if (r0 != 0) goto L1222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1218:0x0d5b, code lost:
    
        if (r4 != r5) goto L1220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1221:0x0d63, code lost:
    
        throw new com.google.android.gms.internal.ads.k01("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:1222:0x0d64, code lost:
    
        if (r4 > r5) goto L1225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1223:0x0d66, code lost:
    
        if (r15 != r0) goto L1225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1224:0x0d68, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1226:0x0d6e, code lost:
    
        throw new com.google.android.gms.internal.ads.k01("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x00da, code lost:
    
        r3 = r9;
        r9 = r10;
        r6 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x0137, code lost:
    
        r5 = r37;
        r3 = r9;
        r9 = r10;
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x013c, code lost:
    
        r8 = r12;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x023b, code lost:
    
        r5 = r37;
        r3 = r1;
        r14 = r2;
        r1 = r9;
        r9 = r10;
        r8 = r12;
        r2 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:774:0x0243, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x02d4, code lost:
    
        r9 = r10;
        r8 = r12;
        r3 = r13;
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x0346, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:1197:0x0cd4 A[PHI: r4 r8 r9 r12 r15 r19
  0x0cd4: PHI (r4v158 com.google.android.gms.internal.ads.ez0) = 
  (r4v130 com.google.android.gms.internal.ads.ez0)
  (r4v131 com.google.android.gms.internal.ads.ez0)
  (r4v132 com.google.android.gms.internal.ads.ez0)
  (r4v133 com.google.android.gms.internal.ads.ez0)
  (r4v134 com.google.android.gms.internal.ads.ez0)
  (r4v135 com.google.android.gms.internal.ads.ez0)
  (r4v136 com.google.android.gms.internal.ads.ez0)
  (r4v137 com.google.android.gms.internal.ads.ez0)
  (r4v139 com.google.android.gms.internal.ads.ez0)
  (r4v147 com.google.android.gms.internal.ads.ez0)
  (r4v159 com.google.android.gms.internal.ads.ez0)
 binds: [B:1195:0x0cbd, B:1192:0x0c9b, B:1189:0x0c7d, B:1186:0x0c5f, B:1183:0x0c41, B:1180:0x0c22, B:1173:0x0bfc, B:1159:0x0bbe, B:1157:0x0bac, B:1132:0x0b05, B:1121:0x0aac] A[DONT_GENERATE, DONT_INLINE]
  0x0cd4: PHI (r8v76 com.google.android.gms.internal.ads.l11) = 
  (r8v53 com.google.android.gms.internal.ads.l11)
  (r8v54 com.google.android.gms.internal.ads.l11)
  (r8v55 com.google.android.gms.internal.ads.l11)
  (r8v56 com.google.android.gms.internal.ads.l11)
  (r8v57 com.google.android.gms.internal.ads.l11)
  (r8v58 com.google.android.gms.internal.ads.l11)
  (r8v59 com.google.android.gms.internal.ads.l11)
  (r8v60 com.google.android.gms.internal.ads.l11)
  (r8v61 com.google.android.gms.internal.ads.l11)
  (r8v70 com.google.android.gms.internal.ads.l11)
  (r8v77 com.google.android.gms.internal.ads.l11)
 binds: [B:1195:0x0cbd, B:1192:0x0c9b, B:1189:0x0c7d, B:1186:0x0c5f, B:1183:0x0c41, B:1180:0x0c22, B:1173:0x0bfc, B:1159:0x0bbe, B:1157:0x0bac, B:1132:0x0b05, B:1121:0x0aac] A[DONT_GENERATE, DONT_INLINE]
  0x0cd4: PHI (r9v122 byte[]) = 
  (r9v99 byte[])
  (r9v100 byte[])
  (r9v101 byte[])
  (r9v102 byte[])
  (r9v103 byte[])
  (r9v104 byte[])
  (r9v105 byte[])
  (r9v106 byte[])
  (r9v107 byte[])
  (r9v113 byte[])
  (r9v123 byte[])
 binds: [B:1195:0x0cbd, B:1192:0x0c9b, B:1189:0x0c7d, B:1186:0x0c5f, B:1183:0x0c41, B:1180:0x0c22, B:1173:0x0bfc, B:1159:0x0bbe, B:1157:0x0bac, B:1132:0x0b05, B:1121:0x0aac] A[DONT_GENERATE, DONT_INLINE]
  0x0cd4: PHI (r12v18 int) = 
  (r12v4 int)
  (r12v5 int)
  (r12v6 int)
  (r12v7 int)
  (r12v8 int)
  (r12v9 int)
  (r12v10 int)
  (r12v11 int)
  (r12v12 int)
  (r12v14 int)
  (r12v19 int)
 binds: [B:1195:0x0cbd, B:1192:0x0c9b, B:1189:0x0c7d, B:1186:0x0c5f, B:1183:0x0c41, B:1180:0x0c22, B:1173:0x0bfc, B:1159:0x0bbe, B:1157:0x0bac, B:1132:0x0b05, B:1121:0x0aac] A[DONT_GENERATE, DONT_INLINE]
  0x0cd4: PHI (r15v101 int) = 
  (r15v78 int)
  (r15v79 int)
  (r15v80 int)
  (r15v81 int)
  (r15v82 int)
  (r15v83 int)
  (r15v84 int)
  (r15v85 int)
  (r15v86 int)
  (r15v92 int)
  (r15v102 int)
 binds: [B:1195:0x0cbd, B:1192:0x0c9b, B:1189:0x0c7d, B:1186:0x0c5f, B:1183:0x0c41, B:1180:0x0c22, B:1173:0x0bfc, B:1159:0x0bbe, B:1157:0x0bac, B:1132:0x0b05, B:1121:0x0aac] A[DONT_GENERATE, DONT_INLINE]
  0x0cd4: PHI (r19v50 int) = 
  (r19v31 int)
  (r19v32 int)
  (r19v33 int)
  (r19v34 int)
  (r19v35 int)
  (r19v36 int)
  (r19v37 int)
  (r19v38 int)
  (r19v39 int)
  (r19v43 int)
  (r19v51 int)
 binds: [B:1195:0x0cbd, B:1192:0x0c9b, B:1189:0x0c7d, B:1186:0x0c5f, B:1183:0x0c41, B:1180:0x0c22, B:1173:0x0bfc, B:1159:0x0bbe, B:1157:0x0bac, B:1132:0x0b05, B:1121:0x0aac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1264:0x0a19 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1265:0x0cd7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1300:0x0a2d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1305:0x0cee A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOoO(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.ez0 r39) {
        /*
            Method dump skipped, instructions count: 3584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v01.OooOoO(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.ez0):int");
    }

    public final boolean OooOoO0(int i, int i2, Object obj) {
        return q11.OooO0o0((long) (this.f24804OooO00o[i2 + 2] & 1048575), obj) == i;
    }

    public final int OooOoo(int i, int i2) {
        int[] iArr = this.f24804OooO00o;
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

    public final int OooOooo(int i) {
        return this.f24804OooO00o[i + 1];
    }

    public final void Oooo0(int i, Object obj, Object obj2) {
        int i2 = this.f24804OooO00o[i];
        Object objOooO = q11.OooO(OooOooo(i) & 1048575, obj);
        if (objOooO == null || Oooo00O(i) == null) {
            return;
        }
        Oooo0O0(i).getClass();
        throw new ClassCastException();
    }

    public final c01 Oooo00O(int i) {
        int i2 = i / 3;
        return (c01) this.f24805OooO0O0[i2 + i2 + 1];
    }

    public final g11 Oooo00o(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.f24805OooO0O0;
        g11 g11Var = (g11) objArr[i3];
        if (g11Var != null) {
            return g11Var;
        }
        g11 g11VarOooO00o = a11.f16875OooO0OO.OooO00o((Class) objArr[i3 + 1]);
        objArr[i3] = g11VarOooO00o;
        return g11VarOooO00o;
    }

    public final Object Oooo0O0(int i) {
        int i2 = i / 3;
        return this.f24805OooO0O0[i2 + i2];
    }

    @Override // com.google.android.gms.internal.ads.g11
    public final zz0 zze() {
        return ((zz0) this.f24809OooO0o0).OooOOO();
    }
}

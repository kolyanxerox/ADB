package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import com.ironsource.C3034d9;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q61 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final q61 f23514OooO0OO = new q61(rm0.OooOOo0(p61.f23231OooO0Oo));

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final gn0 f23515OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final mn0 f23516OooO0o0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SparseArray f23517OooO00o = new SparseArray();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f23518OooO0O0;

    static {
        Object[] objArr = {2, 5, 6};
        ii0.OooOooo(3, objArr);
        f23515OooO0Oo = rm0.OooOOO(3, objArr);
        oOo0o00 ooo0o00 = new oOo0o00(4);
        ooo0o00.OooO0o0(5, 6);
        ooo0o00.OooO0o0(17, 6);
        ooo0o00.OooO0o0(7, 6);
        ooo0o00.OooO0o0(30, 10);
        ooo0o00.OooO0o0(18, 6);
        ooo0o00.OooO0o0(6, 8);
        ooo0o00.OooO0o0(8, 8);
        ooo0o00.OooO0o0(14, 8);
        f23516OooO0o0 = ooo0o00.OooOO0o();
    }

    public q61(gn0 gn0Var) {
        for (int i = 0; i < gn0Var.f19390OooOoO0; i++) {
            p61 p61Var = (p61) gn0Var.get(i);
            this.f23517OooO00o.put(p61Var.f23232OooO00o, p61Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f23517OooO00o.size(); i2++) {
            iMax = Math.max(iMax, ((p61) this.f23517OooO00o.valueAt(i2)).f23233OooO0O0);
        }
        this.f23518OooO0O0 = iMax;
    }

    public static q61 OooO0O0(Context context, j50 j50Var, pd0 pd0Var) {
        return OooO0OO(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), j50Var, pd0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.q61 OooO0OO(android.content.Context r16, android.content.Intent r17, com.google.android.gms.internal.ads.j50 r18, com.google.android.gms.internal.ads.pd0 r19) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q61.OooO0OO(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.j50, com.google.android.gms.internal.ads.pd0):com.google.android.gms.internal.ads.q61");
    }

    public static gn0 OooO0Oo(int[] iArr, int i) {
        xh0.OooOOoo(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iArr.length) {
            p61 p61Var = new p61(iArr[i2], i);
            int length = objArrCopyOf.length;
            int i4 = i3 + 1;
            int iOooO0o = lm0.OooO0o(length, i4);
            if (iOooO0o > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iOooO0o);
            }
            objArrCopyOf[i3] = p61Var;
            i2++;
            i3 = i4;
        }
        return rm0.OooOOO(i3, objArrCopyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[PHI: r0
  0x0039: PHI (r0v3 int) = (r0v2 int), (r0v6 int) binds: [B:11:0x002d, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair OooO00o(com.google.android.gms.internal.ads.o0OoOo0 r10, com.google.android.gms.internal.ads.j50 r11) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q61.OooO00o(com.google.android.gms.internal.ads.o0OoOo0, com.google.android.gms.internal.ads.j50):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.q61
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.q61 r9 = (com.google.android.gms.internal.ads.q61) r9
            android.util.SparseArray r1 = r8.f23517OooO00o
            android.util.SparseArray r3 = r9.f23517OooO00o
            int r4 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = r1.contentEquals(r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = r2
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.f23518OooO0O0
            int r9 = r9.f23518OooO0O0
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q61.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        int i = i80.f19994OooO00o;
        SparseArray sparseArray = this.f23517OooO00o;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i2)) + ((sparseArray.keyAt(i2) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f23518OooO0O0;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f23518OooO0O0 + ", audioProfiles=" + this.f23517OooO00o.toString() + C3034d9.i.f8179e;
    }
}

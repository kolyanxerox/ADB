package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ja1 implements za1 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C1421bg f20233OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f20234OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int[] f20235OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OoOo0[] f20236OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f20237OooO0o0;

    public ja1(C1421bg c1421bg, int[] iArr) {
        o0OoOo0[] o0oooo0Arr;
        int length = iArr.length;
        af0.OooooO0(length > 0);
        c1421bg.getClass();
        this.f20233OooO00o = c1421bg;
        this.f20234OooO0O0 = length;
        this.f20236OooO0Oo = new o0OoOo0[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            o0oooo0Arr = c1421bg.f17495OooO0Oo;
            if (i >= length2) {
                break;
            }
            this.f20236OooO0Oo[i] = o0oooo0Arr[iArr[i]];
            i++;
        }
        Arrays.sort(this.f20236OooO0Oo, new oO00Oo00(5));
        this.f20235OooO0OO = new int[this.f20234OooO0O0];
        for (int i2 = 0; i2 < this.f20234OooO0O0; i2++) {
            int[] iArr2 = this.f20235OooO0OO;
            o0OoOo0 o0oooo0 = this.f20236OooO0Oo[i2];
            int i3 = 0;
            while (true) {
                if (i3 >= o0oooo0Arr.length) {
                    i3 = -1;
                    break;
                } else if (o0oooo0 == o0oooo0Arr[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            iArr2[i2] = i3;
        }
    }

    public static void OooO0OO(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            om0 om0Var = (om0) arrayList.get(i2);
            if (om0Var != null) {
                om0Var.OooO00o(new ia1(j, jArr[i2]));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final int OooO00o(int i) {
        return this.f20235OooO0OO[i];
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final int OooO0O0(int i) {
        for (int i2 = 0; i2 < this.f20234OooO0O0; i2++) {
            if (this.f20235OooO0OO[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ja1 ja1Var = (ja1) obj;
            if (this.f20233OooO00o.equals(ja1Var.f20233OooO00o) && Arrays.equals(this.f20235OooO0OO, ja1Var.f20235OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f20237OooO0o0;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f20235OooO0OO) + (System.identityHashCode(this.f20233OooO00o) * 31);
        this.f20237OooO0o0 = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final int zzb() {
        return this.f20235OooO0OO[0];
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final int zzd() {
        return this.f20235OooO0OO.length;
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final o0OoOo0 zze(int i) {
        return this.f20236OooO0Oo[i];
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final o0OoOo0 zzf() {
        return this.f20236OooO0Oo[0];
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final C1421bg zzg() {
        return this.f20233OooO00o;
    }
}

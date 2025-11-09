package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes2.dex */
public final class da1 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Random f18221OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f18222OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int[] f18223OooO0OO;

    public da1() {
        this(new Random());
    }

    public final da1 OooO00o(int i) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        while (true) {
            random = this.f18221OooO00o;
            iArr = this.f18222OooO0O0;
            if (i2 >= i) {
                break;
            }
            iArr2[i2] = random.nextInt(iArr.length + 1);
            int i3 = i2 + 1;
            int iNextInt = random.nextInt(i3);
            iArr3[i2] = iArr3[iNextInt];
            iArr3[iNextInt] = i2;
            i2 = i3;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length + i; i6++) {
            if (i4 >= i || i5 != iArr2[i4]) {
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            } else {
                iArr4[i6] = iArr3[i4];
                i4++;
            }
        }
        return new da1(iArr4, new Random(random.nextLong()));
    }

    public da1(Random random) {
        this(new int[0], random);
    }

    public da1(int[] iArr, Random random) {
        this.f18222OooO0O0 = iArr;
        this.f18221OooO00o = random;
        this.f18223OooO0OO = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f18223OooO0OO[iArr[i]] = i;
        }
    }
}

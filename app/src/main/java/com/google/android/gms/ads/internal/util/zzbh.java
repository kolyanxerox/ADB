package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbh {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String[] f16227OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final double[] f16228OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final double[] f16229OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int[] f16230OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f16231OooO0o0;

    public zzbh(zzbf zzbfVar) {
        ArrayList arrayList = zzbfVar.f16225OooO0O0;
        int size = arrayList.size();
        this.f16227OooO00o = (String[]) zzbfVar.f16224OooO00o.toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.f16228OooO0O0 = dArr;
        ArrayList arrayList2 = zzbfVar.f16226OooO0OO;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            dArr2[i2] = ((Double) arrayList2.get(i2)).doubleValue();
        }
        this.f16229OooO0OO = dArr2;
        this.f16230OooO0Oo = new int[size];
        this.f16231OooO0o0 = 0;
    }

    public final List zza() {
        String[] strArr = this.f16227OooO00o;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            double d = this.f16229OooO0OO[i];
            double d2 = this.f16228OooO0O0[i];
            int i2 = this.f16230OooO0Oo[i];
            arrayList.add(new zzbe(str, d, d2, i2 / this.f16231OooO0o0, i2));
        }
        return arrayList;
    }

    public final void zzb(double d) {
        this.f16231OooO0o0++;
        int i = 0;
        while (true) {
            double[] dArr = this.f16229OooO0OO;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.f16228OooO0O0[i]) {
                int[] iArr = this.f16230OooO0Oo;
                iArr[i] = iArr[i] + 1;
            }
            if (d < d2) {
                return;
            } else {
                i++;
            }
        }
    }
}

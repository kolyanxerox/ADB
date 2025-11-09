package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzbf {

    /* renamed from: OooO00o */
    public final ArrayList f16224OooO00o = new ArrayList();

    /* renamed from: OooO0O0 */
    public final ArrayList f16225OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO */
    public final ArrayList f16226OooO0OO = new ArrayList();

    public final zzbf zza(String str, double d, double d2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = 0;
        while (true) {
            arrayList = this.f16224OooO00o;
            int size = arrayList.size();
            arrayList2 = this.f16225OooO0O0;
            arrayList3 = this.f16226OooO0OO;
            if (i >= size) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            }
            i++;
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d));
        arrayList2.add(i, Double.valueOf(d2));
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this);
    }
}

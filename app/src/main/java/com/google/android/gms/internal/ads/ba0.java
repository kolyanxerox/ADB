package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ba0 extends ta0 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final long f17462OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f17463OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f17464OooO0o0;

    public ba0(int i, long j) {
        super(i);
        this.f17462OooO0OO = j;
        this.f17463OooO0Oo = new ArrayList();
        this.f17464OooO0o0 = new ArrayList();
    }

    public final ba0 OooO0Oo(int i) {
        ArrayList arrayList = this.f17464OooO0o0;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ba0 ba0Var = (ba0) arrayList.get(i2);
            if (ba0Var.f24281OooO0O0 == i) {
                return ba0Var;
            }
        }
        return null;
    }

    public final ia0 OooO0o0(int i) {
        ArrayList arrayList = this.f17463OooO0Oo;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ia0 ia0Var = (ia0) arrayList.get(i2);
            if (ia0Var.f24281OooO0O0 == i) {
                return ia0Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final String toString() {
        ArrayList arrayList = this.f17463OooO0Oo;
        return ta0.OooO0O0(this.f24281OooO0O0) + " leaves: " + Arrays.toString(arrayList.toArray()) + " containers: " + Arrays.toString(this.f17464OooO0o0.toArray());
    }
}

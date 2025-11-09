package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class lb1 {

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final oO00Oo00 f20840OooO0oO = new oO00Oo00(13);

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final oO00Oo00 f20841OooO0oo = new oO00Oo00(14);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f20845OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f20846OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f20847OooO0o0;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final kb1[] f20843OooO0O0 = new kb1[5];

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f20842OooO00o = new ArrayList();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f20844OooO0OO = -1;

    public final float OooO00o() {
        int i = this.f20844OooO0OO;
        ArrayList arrayList = this.f20842OooO00o;
        if (i != 0) {
            Collections.sort(arrayList, f20841OooO0oo);
            this.f20844OooO0OO = 0;
        }
        float f = this.f20847OooO0o0;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            float f2 = 0.5f * f;
            kb1 kb1Var = (kb1) arrayList.get(i3);
            i2 += kb1Var.f20473OooO0O0;
            if (i2 >= f2) {
                return kb1Var.f20474OooO0OO;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((kb1) arrayList.get(arrayList.size() - 1)).f20474OooO0OO;
    }

    public final void OooO0O0(float f, int i) {
        kb1 kb1Var;
        int i2 = this.f20844OooO0OO;
        ArrayList arrayList = this.f20842OooO00o;
        if (i2 != 1) {
            Collections.sort(arrayList, f20840OooO0oO);
            this.f20844OooO0OO = 1;
        }
        int i3 = this.f20846OooO0o;
        kb1[] kb1VarArr = this.f20843OooO0O0;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f20846OooO0o = i4;
            kb1Var = kb1VarArr[i4];
        } else {
            kb1Var = new kb1();
        }
        int i5 = this.f20845OooO0Oo;
        this.f20845OooO0Oo = i5 + 1;
        kb1Var.f20472OooO00o = i5;
        kb1Var.f20473OooO0O0 = i;
        kb1Var.f20474OooO0OO = f;
        arrayList.add(kb1Var);
        this.f20847OooO0o0 += i;
        while (true) {
            int i6 = this.f20847OooO0o0;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            kb1 kb1Var2 = (kb1) arrayList.get(0);
            int i8 = kb1Var2.f20473OooO0O0;
            if (i8 <= i7) {
                this.f20847OooO0o0 -= i8;
                arrayList.remove(0);
                int i9 = this.f20846OooO0o;
                if (i9 < 5) {
                    this.f20846OooO0o = i9 + 1;
                    kb1VarArr[i9] = kb1Var2;
                }
            } else {
                kb1Var2.f20473OooO0O0 = i8 - i7;
                this.f20847OooO0o0 -= i7;
            }
        }
    }
}

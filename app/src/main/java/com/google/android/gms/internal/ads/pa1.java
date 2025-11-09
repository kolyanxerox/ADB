package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pa1 extends C1938pi {
    public final boolean OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final boolean f23260OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f23261OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f23262OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f23263OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public final boolean f23264OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f23265OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public final SparseArray f23266OooOOoo;

    /* renamed from: OooOo00, reason: collision with root package name */
    public final SparseBooleanArray f23267OooOo00;

    public pa1() {
        this.f23266OooOOoo = new SparseArray();
        this.f23267OooOo00 = new SparseBooleanArray();
        this.OooOO0o = true;
        this.f23261OooOOO0 = true;
        this.f23260OooOOO = true;
        this.f23262OooOOOO = true;
        this.f23263OooOOOo = true;
        this.f23265OooOOo0 = true;
        this.f23264OooOOo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public pa1(android.content.Context r10) throws java.lang.ClassNotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pa1.<init>(android.content.Context):void");
    }

    public /* synthetic */ pa1(qa1 qa1Var) {
        super(qa1Var);
        this.OooOO0o = qa1Var.OooOO0o;
        this.f23261OooOOO0 = qa1Var.f23558OooOOO0;
        this.f23260OooOOO = qa1Var.f23557OooOOO;
        this.f23262OooOOOO = qa1Var.f23559OooOOOO;
        this.f23263OooOOOo = qa1Var.f23560OooOOOo;
        this.f23265OooOOo0 = qa1Var.f23562OooOOo0;
        this.f23264OooOOo = qa1Var.f23561OooOOo;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = qa1Var.f23563OooOOoo;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.f23266OooOOoo = sparseArray;
                this.f23267OooOo00 = qa1Var.f23564OooOo00.clone();
                return;
            }
        }
    }
}

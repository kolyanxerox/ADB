package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class xa1 {

    /* renamed from: OooOO0 */
    public static final gm0 f25584OooOO0 = new gm0(new oO00Oo00(6));

    /* renamed from: OooO */
    public final g61 f25585OooO;

    /* renamed from: OooO00o */
    public b51 f25586OooO00o;

    /* renamed from: OooO0O0 */
    public gb1 f25587OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f25588OooO0OO;

    /* renamed from: OooO0Oo */
    public final Context f25589OooO0Oo;

    /* renamed from: OooO0o */
    public qa1 f25590OooO0o;

    /* renamed from: OooO0o0 */
    public final boolean f25591OooO0o0;

    /* renamed from: OooO0oO */
    public final OoooOOO.o0O0oo00 f25592OooO0oO;

    /* renamed from: OooO0oo */
    public j50 f25593OooO0oo;

    public xa1(Context context) {
        g61 g61Var = new g61(7);
        int i = qa1.OooOo0;
        qa1 qa1Var = new qa1(new pa1(context));
        this.f25588OooO0OO = new Object();
        this.f25589OooO0Oo = context.getApplicationContext();
        this.f25585OooO = g61Var;
        this.f25590OooO0o = qa1Var;
        this.f25593OooO0oo = j50.f20184OooO0O0;
        boolean zOooO0o0 = i80.OooO0o0(context);
        this.f25591OooO0o0 = zOooO0o0;
        if (!zOooO0o0 && i80.f19994OooO00o >= 32) {
            this.f25592OooO0oO = OoooOOO.o0O0oo00.OooO0O0(context);
        }
        boolean z = this.f25590OooO0o.f23560OooOOOo;
    }

    public static int OooO00o(o0OoOo0 o0oooo0, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(o0oooo0.f22214OooO0Oo)) {
            return 4;
        }
        String strOooO0O0 = OooO0O0(str);
        String strOooO0O02 = OooO0O0(o0oooo0.f22214OooO0Oo);
        if (strOooO0O02 == null || strOooO0O0 == null) {
            return (z && strOooO0O02 == null) ? 1 : 0;
        }
        if (strOooO0O02.startsWith(strOooO0O0) || strOooO0O0.startsWith(strOooO0O02)) {
            return 3;
        }
        int i = i80.f19994OooO00o;
        return strOooO0O02.split("-", 2)[0].equals(strOooO0O0.split("-", 2)[0]) ? 2 : 0;
    }

    public static String OooO0O0(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static final Pair OooO0Oo(int i, OooOOo0.o0OOO0o o0ooo0o, int[][][] iArr, ua1 ua1Var, Comparator comparator) {
        RandomAccess randomAccessOooOOo0;
        OooOOo0.o0OOO0o o0ooo0o2 = o0ooo0o;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == ((int[]) o0ooo0o2.f13518OooOo0o)[i2]) {
                ha1 ha1Var = ((ha1[]) o0ooo0o2.f13516OooOo)[i2];
                for (int i3 = 0; i3 < ha1Var.f19674OooO00o; i3++) {
                    C1421bg c1421bgOooO00o = ha1Var.OooO00o(i3);
                    gn0 gn0VarOooO0o = ua1Var.OooO0o(i2, c1421bgOooO00o, iArr[i2][i3]);
                    int i4 = c1421bgOooO00o.f17492OooO00o;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        va1 va1Var = (va1) gn0VarOooO0o.get(i5);
                        int iOooO00o = va1Var.OooO00o();
                        if (!zArr[i5] && iOooO00o != 0) {
                            if (iOooO00o == 1) {
                                randomAccessOooOOo0 = rm0.OooOOo0(va1Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(va1Var);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    va1 va1Var2 = (va1) gn0VarOooO0o.get(i7);
                                    if (va1Var2.OooO00o() == 2 && va1Var.OooO0O0(va1Var2)) {
                                        arrayList2.add(va1Var2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccessOooOOo0 = arrayList2;
                            }
                            arrayList.add(randomAccessOooOOo0);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            o0ooo0o2 = o0ooo0o;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((va1) list.get(i8)).f24938OooOo;
        }
        va1 va1Var3 = (va1) list.get(0);
        return Pair.create(new ya1(va1Var3.f24940OooOo0o, iArr2), Integer.valueOf(va1Var3.f24939OooOo0O));
    }

    public final void OooO0OO() {
        boolean z;
        b51 b51Var;
        OoooOOO.o0O0oo00 o0o0oo00;
        synchronized (this.f25588OooO0OO) {
            try {
                z = false;
                if (this.f25590OooO0o.f23560OooOOOo && !this.f25591OooO0o0 && i80.f19994OooO00o >= 32 && (o0o0oo00 = this.f25592OooO0oO) != null && o0o0oo00.f14469OooOo0O) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (b51Var = this.f25586OooO00o) == null) {
            return;
        }
        b51Var.f17380OooOoo.OooO0OO(10);
    }
}

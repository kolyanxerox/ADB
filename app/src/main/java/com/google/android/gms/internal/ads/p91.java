package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class p91 extends t81 {

    /* renamed from: OooOOo, reason: collision with root package name */
    public static final C1550f f23250OooOOo;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final n81[] f23251OooOO0O;
    public final ArrayList OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList f23252OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final AbstractC1787lf[] f23253OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public int f23254OooOOOO = -1;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public long[][] f23255OooOOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public pz0 f23256OooOOo0;

    static {
        pm0 pm0Var = rm0.f23913OooOo0o;
        gn0 gn0Var = gn0.f19388OooOoO;
        List list = Collections.EMPTY_LIST;
        oOO00000 ooo00000 = oOO00000.f22776OooO00o;
        f23250OooOOo = new C1550f("MergingMediaSource", new o0O0O0Oo(), null, new oO000Oo0(), C1626h1.f19498OooOoO);
    }

    public p91(g61 g61Var, n81... n81VarArr) {
        this.f23251OooOO0O = n81VarArr;
        this.f23252OooOOO = new ArrayList(Arrays.asList(n81VarArr));
        this.OooOO0o = new ArrayList(n81VarArr.length);
        int i = 0;
        while (true) {
            int length = n81VarArr.length;
            if (i >= length) {
                this.f23253OooOOO0 = new AbstractC1787lf[length];
                this.f23255OooOOOo = new long[0][];
                new HashMap();
                ii0.OoooOo0(new fm0().isEmpty());
                return;
            }
            this.OooOO0o.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooO00o(g91 g91Var) {
        n91 n91Var = (n91) g91Var;
        int i = 0;
        while (true) {
            n81[] n81VarArr = this.f23251OooOO0O;
            if (i >= n81VarArr.length) {
                return;
            }
            List list = (List) this.OooOO0o.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((o91) list.get(i2)).f22371OooO0O0.equals(g91Var)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            n81 n81Var = n81VarArr[i];
            g91 g91Var2 = n91Var.f21449OooOo0O[i];
            if (g91Var2 instanceof ga1) {
                g91Var2 = ((ga1) g91Var2).f19286OooOo0O;
            }
            n81Var.OooO00o(g91Var2);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final g91 OooO0O0(h91 h91Var, eb1 eb1Var, long j) {
        n81[] n81VarArr = this.f23251OooOO0O;
        int length = n81VarArr.length;
        g91[] g91VarArr = new g91[length];
        AbstractC1787lf[] abstractC1787lfArr = this.f23253OooOOO0;
        int iOooO00o = abstractC1787lfArr[0].OooO00o(h91Var.f19657OooO00o);
        for (int i = 0; i < length; i++) {
            h91 h91VarOooO00o = h91Var.OooO00o(abstractC1787lfArr[i].OooO0o(iOooO00o));
            g91VarArr[i] = n81VarArr[i].OooO0O0(h91VarOooO00o, eb1Var, j - this.f23255OooOOOo[iOooO00o][i]);
            ((List) this.OooOO0o.get(i)).add(new o91(h91VarOooO00o, g91VarArr[i]));
        }
        return new n91(this.f23255OooOOOo[iOooO00o], g91VarArr);
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final C1550f OooO0OO() {
        n81[] n81VarArr = this.f23251OooOO0O;
        return n81VarArr.length > 0 ? n81VarArr[0].OooO0OO() : f23250OooOOo;
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooOO0(gb1 gb1Var) {
        this.f24273OooOO0 = gb1Var;
        int i = i80.f19994OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        af0.OooOo0O(looperMyLooper);
        this.f24271OooO = new Handler(looperMyLooper, null);
        int i2 = 0;
        while (true) {
            n81[] n81VarArr = this.f23251OooOO0O;
            if (i2 >= n81VarArr.length) {
                return;
            }
            OooOo00(Integer.valueOf(i2), n81VarArr[i2]);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.t81, com.google.android.gms.internal.ads.n81
    public final void OooOOO0() {
        super.OooOOO0();
        Arrays.fill(this.f23253OooOOO0, (Object) null);
        this.f23254OooOOOO = -1;
        this.f23256OooOOo0 = null;
        ArrayList arrayList = this.f23252OooOOO;
        arrayList.clear();
        Collections.addAll(arrayList, this.f23251OooOO0O);
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooOOOo(C1550f c1550f) {
        this.f23251OooOO0O[0].OooOOOo(c1550f);
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooOOo() throws pz0 {
        pz0 pz0Var = this.f23256OooOOo0;
        if (pz0Var != null) {
            throw pz0Var;
        }
        Iterator it = this.f24272OooO0oo.values().iterator();
        while (it.hasNext()) {
            ((s81) it.next()).f24036OooO00o.OooOOo();
        }
    }

    @Override // com.google.android.gms.internal.ads.t81
    public final void OooOOoo(Integer num, n81 n81Var, AbstractC1787lf abstractC1787lf) {
        int iOooO0O0;
        if (this.f23256OooOOo0 != null) {
            return;
        }
        if (this.f23254OooOOOO == -1) {
            iOooO0O0 = abstractC1787lf.OooO0O0();
            this.f23254OooOOOO = iOooO0O0;
        } else {
            int iOooO0O02 = abstractC1787lf.OooO0O0();
            int i = this.f23254OooOOOO;
            if (iOooO0O02 != i) {
                this.f23256OooOOo0 = new pz0();
                return;
            }
            iOooO0O0 = i;
        }
        int length = this.f23255OooOOOo.length;
        AbstractC1787lf[] abstractC1787lfArr = this.f23253OooOOO0;
        if (length == 0) {
            this.f23255OooOOOo = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iOooO0O0, abstractC1787lfArr.length);
        }
        ArrayList arrayList = this.f23252OooOOO;
        arrayList.remove(n81Var);
        abstractC1787lfArr[num.intValue()] = abstractC1787lf;
        if (arrayList.isEmpty()) {
            OooOO0O(abstractC1787lfArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.t81
    public final /* bridge */ /* synthetic */ h91 OooOo0o(Integer num, h91 h91Var) {
        int iIntValue = num.intValue();
        ArrayList arrayList = this.OooOO0o;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((o91) list.get(i)).f22370OooO00o.equals(h91Var)) {
                return ((o91) ((List) arrayList.get(0)).get(i)).f22370OooO00o;
            }
        }
        return null;
    }
}

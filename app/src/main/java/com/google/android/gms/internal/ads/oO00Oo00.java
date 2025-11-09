package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class oO00Oo00 implements Comparator {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f22509OooOo0O;

    public /* synthetic */ oO00Oo00(int i) {
        this.f22509OooOo0O = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f22509OooOo0O) {
            case 0:
                return Integer.compare(((oO00Oo0) obj).f22507OooO00o.f22858OooO0O0, ((oO00Oo0) obj2).f22507OooO00o.f22858OooO0O0);
            case 1:
                return Long.compare(((oO00OOo0) obj).f22504OooO0O0, ((oO00OOo0) obj2).f22504OooO0O0);
            case 2:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 3:
                C1960q3 c1960q3 = (C1960q3) obj;
                C1960q3 c1960q32 = (C1960q3) obj2;
                int i = c1960q3.f23497OooO0OO - c1960q32.f23497OooO0OO;
                return i != 0 ? i : Long.compare(c1960q3.f23495OooO00o, c1960q32.f23495OooO00o);
            case 4:
                C1886o3 c1886o3 = (C1886o3) obj;
                C1886o3 c1886o32 = (C1886o3) obj2;
                float f = c1886o3.f22318OooO0O0;
                float f2 = c1886o32.f22318OooO0O0;
                if (f < f2) {
                    return -1;
                }
                if (f <= f2) {
                    float f3 = c1886o3.f22317OooO00o;
                    float f4 = c1886o32.f22317OooO00o;
                    if (f3 < f4) {
                        return -1;
                    }
                    if (f3 <= f4) {
                        float f5 = (c1886o3.f22320OooO0Oo - f) * (c1886o3.f22319OooO0OO - f3);
                        float f6 = (c1886o32.f22320OooO0Oo - f2) * (c1886o32.f22319OooO0OO - f4);
                        if (f5 > f6) {
                            return -1;
                        }
                        if (f5 >= f6) {
                            return 0;
                        }
                    }
                }
                return 1;
            case 5:
                return ((o0OoOo0) obj2).f22210OooO - ((o0OoOo0) obj).f22210OooO;
            case 6:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 7:
                return Integer.compare(((na1) ((List) obj).get(0)).f21459OooOoOO, ((na1) ((List) obj2).get(0)).f21459OooOoOO);
            case 8:
                List list = (List) obj;
                List list2 = (List) obj2;
                return hm0.OooO0o(new oO00Oo00(11).compare((wa1) Collections.max(list, new oO00Oo00(11)), (wa1) Collections.max(list2, new oO00Oo00(11)))).OooO0O0(list.size(), list2.size()).OooO0OO((wa1) Collections.max(list, new oO00Oo00(12)), (wa1) Collections.max(list2, new oO00Oo00(12)), new oO00Oo00(12)).OooO00o();
            case 9:
                return ((ma1) Collections.max((List) obj)).compareTo((ma1) Collections.max((List) obj2));
            case 10:
                return ((ta1) ((List) obj).get(0)).compareTo((ta1) ((List) obj2).get(0));
            case 11:
                wa1 wa1Var = (wa1) obj;
                wa1 wa1Var2 = (wa1) obj2;
                km0 km0VarOooO0Oo = km0.f20621OooO00o.OooO0Oo(wa1Var.f25274OooOoo, wa1Var2.f25274OooOoo);
                Integer numValueOf = Integer.valueOf(wa1Var.f25282Oooo00o);
                Integer numValueOf2 = Integer.valueOf(wa1Var2.f25282Oooo00o);
                en0 en0Var = en0.f18630OooOo;
                km0 km0VarOooO0OO = km0VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, en0Var).OooO0O0(wa1Var.f25279Oooo0, wa1Var2.f25279Oooo0).OooO0O0(wa1Var.f25283Oooo0O0, wa1Var2.f25283Oooo0O0).OooO0Oo(wa1Var.f25284Oooo0OO, wa1Var2.f25284Oooo0OO).OooO0O0(wa1Var.f25286Oooo0o0, wa1Var2.f25286Oooo0o0).OooO0Oo(wa1Var.f25276OooOooO, wa1Var2.f25276OooOooO).OooO0Oo(wa1Var.f25272OooOoO, wa1Var2.f25272OooOoO).OooO0Oo(wa1Var.f25275OooOoo0, wa1Var2.f25275OooOoo0).OooO0OO(Integer.valueOf(wa1Var.f25281Oooo00O), Integer.valueOf(wa1Var2.f25281Oooo00O), en0Var);
                boolean z = wa1Var2.f25287Oooo0oO;
                boolean z2 = wa1Var.f25287Oooo0oO;
                km0 km0VarOooO0Oo2 = km0VarOooO0OO.OooO0Oo(z2, z);
                boolean z3 = wa1Var2.f25288Oooo0oo;
                boolean z4 = wa1Var.f25288Oooo0oo;
                km0 km0VarOooO0Oo3 = km0VarOooO0Oo2.OooO0Oo(z4, z3);
                if (z2 && z4) {
                    km0VarOooO0Oo3 = km0VarOooO0Oo3.OooO0O0(wa1Var.f25278Oooo, wa1Var2.f25278Oooo);
                }
                return km0VarOooO0Oo3.OooO00o();
            case 12:
                wa1 wa1Var3 = (wa1) obj;
                wa1 wa1Var4 = (wa1) obj2;
                boolean z5 = wa1Var3.f25272OooOoO;
                Comparator on0Var = xa1.f25584OooOO0;
                if (!z5 || !wa1Var3.f25274OooOoo) {
                    on0Var = new on0();
                }
                wa1Var3.f25273OooOoOO.getClass();
                return hm0.OooO0o(on0Var.compare(Integer.valueOf(wa1Var3.f25280Oooo000), Integer.valueOf(wa1Var4.f25280Oooo000))).OooO0OO(Integer.valueOf(wa1Var3.f25277OooOooo), Integer.valueOf(wa1Var4.f25277OooOooo), on0Var).OooO00o();
            case 13:
                return ((kb1) obj).f20472OooO00o - ((kb1) obj2).f20472OooO00o;
            default:
                return Float.compare(((kb1) obj).f20474OooO0OO, ((kb1) obj2).f20474OooO0OO);
        }
    }
}

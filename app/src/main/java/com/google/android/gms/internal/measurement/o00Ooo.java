package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C2051sk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00Ooo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f26533OooO00o = new ArrayList();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f26534OooO0O0;

    public o00Ooo(int i) {
        this.f26534OooO0O0 = i;
    }

    public static Oooo000 OooO0OO(C2051sk c2051sk, ArrayList arrayList) {
        o0OOO0o o0ooo0o = o0OOO0o.ADD;
        o00O0.o000OOo.OooOOOO("FN", arrayList, 2);
        Oooo0 oooo0OooO0OO = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0));
        Oooo0 oooo0OooO0OO2 = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(1));
        if (!(oooo0OooO0OO2 instanceof OooO0o)) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0("FN requires an ArrayValue of parameter names found ", oooo0OooO0OO2.getClass().getCanonicalName()));
        }
        List listOooO0oO = ((OooO0o) oooo0OooO0OO2).OooO0oO();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new Oooo000(oooo0OooO0OO.zzc(), (ArrayList) listOooO0oO, arrayList2, c2051sk);
    }

    public static boolean OooO0Oo(Oooo0 oooo0, Oooo0 oooo02) {
        if (oooo0 instanceof OooOOOO) {
            oooo0 = new o00O0O(oooo0.zzc());
        }
        if (oooo02 instanceof OooOOOO) {
            oooo02 = new o00O0O(oooo02.zzc());
        }
        if ((oooo0 instanceof o00O0O) && (oooo02 instanceof o00O0O)) {
            return ((o00O0O) oooo0).f26532OooOo0O.compareTo(((o00O0O) oooo02).f26532OooOo0O) < 0;
        }
        double dDoubleValue = oooo0.zzd().doubleValue();
        double dDoubleValue2 = oooo02.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean OooO0o(Oooo0 oooo0, Oooo0 oooo02) {
        if (oooo0.getClass().equals(oooo02.getClass())) {
            if ((oooo0 instanceof o00Oo0) || (oooo0 instanceof OooOo)) {
                return true;
            }
            return oooo0 instanceof OooOO0O ? (Double.isNaN(oooo0.zzd().doubleValue()) || Double.isNaN(oooo02.zzd().doubleValue()) || oooo0.zzd().doubleValue() != oooo02.zzd().doubleValue()) ? false : true : oooo0 instanceof o00O0O ? oooo0.zzc().equals(oooo02.zzc()) : oooo0 instanceof OooO ? oooo0.zze().equals(oooo02.zze()) : oooo0 == oooo02;
        }
        if (((oooo0 instanceof o00Oo0) || (oooo0 instanceof OooOo)) && ((oooo02 instanceof o00Oo0) || (oooo02 instanceof OooOo))) {
            return true;
        }
        boolean z = oooo0 instanceof OooOO0O;
        if (z && (oooo02 instanceof o00O0O)) {
            return OooO0o(oooo0, new OooOO0O(oooo02.zzd()));
        }
        boolean z2 = oooo0 instanceof o00O0O;
        if (z2 && (oooo02 instanceof OooOO0O)) {
            return OooO0o(new OooOO0O(oooo0.zzd()), oooo02);
        }
        if (oooo0 instanceof OooO) {
            return OooO0o(new OooOO0O(oooo0.zzd()), oooo02);
        }
        if (oooo02 instanceof OooO) {
            return OooO0o(oooo0, new OooOO0O(oooo02.zzd()));
        }
        if ((z2 || z) && (oooo02 instanceof OooOOOO)) {
            return OooO0o(oooo0, new o00O0O(oooo02.zzc()));
        }
        if ((oooo0 instanceof OooOOOO) && ((oooo02 instanceof o00O0O) || (oooo02 instanceof OooOO0O))) {
            return OooO0o(new o00O0O(oooo0.zzc()), oooo02);
        }
        return false;
    }

    public static Oooo0 OooO0o0(o0ooOOo o0ooooo, Oooo0 oooo0, Oooo0 oooo02) {
        if (oooo0 instanceof Iterable) {
            return OooO0oO(o0ooooo, ((Iterable) oooo0).iterator(), oooo02);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static Oooo0 OooO0oO(o0ooOOo o0ooooo, Iterator it, Oooo0 oooo0) {
        C2051sk c2051skOooOOOo;
        if (it != null) {
            while (it.hasNext()) {
                Oooo0 oooo02 = (Oooo0) it.next();
                switch (o0ooooo.f26658OooO00o) {
                    case 0:
                        c2051skOooOOOo = o0ooooo.f26659OooO0O0.OooOOOo();
                        String str = o0ooooo.f26660OooO0OO;
                        c2051skOooOOOo.OooOoOO(str, oooo02);
                        ((HashMap) c2051skOooOOOo.f24099OooOoO).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        c2051skOooOOOo = o0ooooo.f26659OooO0O0.OooOOOo();
                        c2051skOooOOOo.OooOoOO(o0ooooo.f26660OooO0OO, oooo02);
                        break;
                    default:
                        String str2 = o0ooooo.f26660OooO0OO;
                        c2051skOooOOOo = o0ooooo.f26659OooO0O0;
                        c2051skOooOOOo.OooOoOO(str2, oooo02);
                        break;
                }
                Oooo0 oooo0OooOO0o = c2051skOooOOOo.OooOO0o((OooO0o) oooo0);
                if (oooo0OooOO0o instanceof OooOO0) {
                    OooOO0 oooOO0 = (OooOO0) oooo0OooOO0o;
                    if ("break".equals(oooOO0.f26424OooOo0o)) {
                        return Oooo0.OooOO0o;
                    }
                    if ("return".equals(oooOO0.f26424OooOo0o)) {
                        return oooOO0;
                    }
                }
            }
        }
        return Oooo0.OooOO0o;
    }

    public static boolean OooO0oo(Oooo0 oooo0, Oooo0 oooo02) {
        if (oooo0 instanceof OooOOOO) {
            oooo0 = new o00O0O(oooo0.zzc());
        }
        if (oooo02 instanceof OooOOOO) {
            oooo02 = new o00O0O(oooo02.zzc());
        }
        return (((oooo0 instanceof o00O0O) && (oooo02 instanceof o00O0O)) || !(Double.isNaN(oooo0.zzd().doubleValue()) || Double.isNaN(oooo02.zzd().doubleValue()))) && !OooO0Oo(oooo02, oooo0);
    }

    /* JADX WARN: Removed duplicated region for block: B:504:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.Oooo0 OooO00o(java.lang.String r13, com.google.android.gms.internal.ads.C2051sk r14, java.util.ArrayList r15) {
        /*
            Method dump skipped, instructions count: 3862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.o00Ooo.OooO00o(java.lang.String, com.google.android.gms.internal.ads.sk, java.util.ArrayList):com.google.android.gms.internal.measurement.Oooo0");
    }

    public final void OooO0O0(String str) {
        if (!this.f26533OooO00o.contains(o00O0.o000OOo.OooOOo(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}

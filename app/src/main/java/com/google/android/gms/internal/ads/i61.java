package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class i61 {

    /* renamed from: OooO00o */
    public final String f19962OooO00o;

    /* renamed from: OooO0O0 */
    public int f19963OooO0O0;

    /* renamed from: OooO0OO */
    public long f19964OooO0OO;

    /* renamed from: OooO0Oo */
    public final h91 f19965OooO0Oo;

    /* renamed from: OooO0o */
    public boolean f19966OooO0o;

    /* renamed from: OooO0o0 */
    public boolean f19967OooO0o0;

    /* renamed from: OooO0oO */
    public final /* synthetic */ j61 f19968OooO0oO;

    public i61(j61 j61Var, String str, int i, h91 h91Var) {
        this.f19968OooO0oO = j61Var;
        this.f19962OooO00o = str;
        this.f19963OooO0O0 = i;
        this.f19964OooO0OO = h91Var == null ? -1L : h91Var.f19660OooO0Oo;
        if (h91Var == null || !h91Var.OooO0O0()) {
            return;
        }
        this.f19965OooO0Oo = h91Var;
    }

    public final boolean OooO00o(d61 d61Var) {
        h91 h91Var = d61Var.f18181OooO0Oo;
        if (h91Var == null) {
            return this.f19963OooO0O0 != d61Var.f18180OooO0OO;
        }
        long j = this.f19964OooO0OO;
        if (j == -1) {
            return false;
        }
        if (h91Var.f19660OooO0Oo > j) {
            return true;
        }
        h91 h91Var2 = this.f19965OooO0Oo;
        if (h91Var2 == null) {
            return false;
        }
        AbstractC1787lf abstractC1787lf = d61Var.f18179OooO0O0;
        int iOooO00o = abstractC1787lf.OooO00o(h91Var.f19657OooO00o);
        int iOooO00o2 = abstractC1787lf.OooO00o(h91Var2.f19657OooO00o);
        if (h91Var.f19660OooO0Oo < h91Var2.f19660OooO0Oo || iOooO00o < iOooO00o2) {
            return false;
        }
        if (iOooO00o > iOooO00o2) {
            return true;
        }
        boolean zOooO0O0 = h91Var.OooO0O0();
        int i = h91Var2.f19658OooO0O0;
        if (!zOooO0O0) {
            int i2 = h91Var.f19661OooO0o0;
            return i2 == -1 || i2 > i;
        }
        int i3 = h91Var.f19658OooO0O0;
        if (i3 > i) {
            return true;
        }
        if (i3 == i) {
            return h91Var.f19659OooO0OO > h91Var2.f19659OooO0OO;
        }
        return false;
    }

    public final boolean OooO0O0(AbstractC1787lf abstractC1787lf, AbstractC1787lf abstractC1787lf2) {
        h91 h91Var;
        int i = this.f19963OooO0O0;
        if (i < abstractC1787lf.OooO0OO()) {
            j61 j61Var = this.f19968OooO0oO;
            abstractC1787lf.OooO0o0(i, j61Var.f20204OooO00o, 0L);
            C2045se c2045se = j61Var.f20204OooO00o;
            for (int i2 = c2045se.f24079OooOO0O; i2 <= c2045se.OooOO0o; i2++) {
                int iOooO00o = abstractC1787lf2.OooO00o(abstractC1787lf.OooO0o(i2));
                if (iOooO00o != -1) {
                    i = abstractC1787lf2.OooO0Oo(iOooO00o, j61Var.f20205OooO0O0, false).f18576OooO0OO;
                    break;
                }
            }
            i = -1;
        } else if (i >= abstractC1787lf2.OooO0OO()) {
            i = -1;
        }
        this.f19963OooO0O0 = i;
        return i != -1 && ((h91Var = this.f19965OooO0Oo) == null || abstractC1787lf2.OooO00o(h91Var.f19657OooO00o) != -1);
    }
}

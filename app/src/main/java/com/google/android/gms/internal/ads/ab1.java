package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ab1 implements oO0OO0O {

    /* renamed from: OooOo */
    public final Object f17020OooOo;

    /* renamed from: OooOo0O */
    public int f17021OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f17022OooOo0o;

    /* renamed from: OooOoO */
    public Object f17023OooOoO;

    /* renamed from: OooOoO0 */
    public final Object f17024OooOoO0;

    public ab1(o000O0o o000o0o2, p80 p80Var, byte[] bArr, o0000o0.OooOOO[] oooOOOArr, int i) {
        this.f17022OooOo0o = o000o0o2;
        this.f17020OooOo = p80Var;
        this.f17024OooOoO0 = bArr;
        this.f17023OooOoO = oooOOOArr;
        this.f17021OooOo0O = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:255:0x01fb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:256:0x01fe. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0337  */
    @Override // com.google.android.gms.internal.ads.oO0OO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0O0(com.google.android.gms.internal.ads.r40 r32) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ab1.OooO0O0(com.google.android.gms.internal.ads.r40):void");
    }

    public boolean OooO0OO(ab1 ab1Var, int i) {
        return ab1Var != null && Objects.equals(((y51[]) this.f17022OooOo0o)[i], ((y51[]) ab1Var.f17022OooOo0o)[i]) && Objects.equals(((za1[]) this.f17020OooOo)[i], ((za1[]) ab1Var.f17020OooOo)[i]);
    }

    public boolean OooO0Oo(int i) {
        return ((y51[]) this.f17022OooOo0o)[i] != null;
    }

    public synchronized void OooO0o0() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooo0O)).booleanValue() && !zzv.zzp().OooO0Oo().zzg().f21511OooOO0) {
            ((ArrayDeque) this.f17024OooOoO0).clear();
            return;
        }
        synchronized (this) {
            try {
                if (((gh0) this.f17023OooOoO) == null) {
                    while (!((ArrayDeque) this.f17024OooOoO0).isEmpty()) {
                        kc0 kc0Var = (kc0) ((ArrayDeque) this.f17024OooOoO0).pollFirst();
                        if (kc0Var != null) {
                            pe0 pe0Var = kc0Var.f20482OooO0oO;
                            if (pe0Var != null) {
                                de0 de0Var = (de0) this.f17022OooOo0o;
                                synchronized (de0Var) {
                                    ie0 ie0Var = (ie0) ((ConcurrentHashMap) de0Var.f18242OooOo0o).get(pe0Var);
                                    if (ie0Var != null) {
                                        ne0 ne0Var = (ne0) de0Var.f18240OooOo;
                                        ie0Var.OooO00o();
                                        if (ie0Var.f20032OooO00o.size() < ne0Var.zzd) {
                                        }
                                    }
                                }
                            }
                        }
                        gh0 gh0Var = new gh0((de0) this.f17022OooOo0o, (p80) this.f17020OooOo, kc0Var);
                        this.f17023OooOoO = gh0Var;
                        C1548ey c1548ey = new C1548ey(this, false, kc0Var, 20);
                        synchronized (gh0Var) {
                            dp0 dp0VarOoOO = ii0.ooOO((ko0) gh0Var.f19351OooO0Oo, new C2094tq(14), kc0Var.f20481OooO0o0);
                            dp0VarOoOO.addListener(new wp0(0, dp0VarOoOO, c1548ey), kc0Var.f20481OooO0o0);
                        }
                        return;
                    }
                }
            } finally {
            }
        }
    }

    public ab1(oO0o0000 oo0o0000, int i) {
        this.f17023OooOoO = oo0o0000;
        this.f17022OooOo0o = new o000OOo0(new byte[5], 5);
        this.f17020OooOo = new SparseArray();
        this.f17024OooOoO0 = new SparseIntArray();
        this.f17021OooOo0O = i;
    }

    public ab1(de0 de0Var, he0 he0Var, p80 p80Var) {
        this.f17021OooOo0O = 1;
        this.f17022OooOo0o = de0Var;
        this.f17020OooOo = p80Var;
        this.f17024OooOoO0 = new ArrayDeque();
        he0Var.f19717OooO00o = new C1847n1(this, 28);
    }

    public ab1(y51[] y51VarArr, za1[] za1VarArr, C1977qk c1977qk, OooOOo0.o0OOO0o o0ooo0o) {
        int length = y51VarArr.length;
        af0.OoooO0(length == za1VarArr.length);
        this.f17022OooOo0o = y51VarArr;
        this.f17020OooOo = (za1[]) za1VarArr.clone();
        this.f17024OooOoO0 = c1977qk;
        this.f17023OooOoO = o0ooo0o;
        this.f17021OooOo0O = length;
    }

    @Override // com.google.android.gms.internal.ads.oO0OO0O
    public void OooO00o(h70 h70Var, o0000Ooo o0000ooo, oOo00o00 ooo00o00) {
    }
}

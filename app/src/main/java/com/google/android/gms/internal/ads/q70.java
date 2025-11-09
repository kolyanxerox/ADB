package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class q70 {

    /* renamed from: OooO */
    public final int f23524OooO;

    /* renamed from: OooO0OO */
    public final jq0 f23527OooO0OO;

    /* renamed from: OooO0o */
    public y70 f23529OooO0o;

    /* renamed from: OooO0oo */
    public final String f23532OooO0oo;

    /* renamed from: OooOO0 */
    public final x70 f23533OooOO0;

    /* renamed from: OooOO0O */
    public kd0 f23534OooOO0O;

    /* renamed from: OooO00o */
    public final HashMap f23525OooO00o = new HashMap();

    /* renamed from: OooO0O0 */
    public final ArrayList f23526OooO0O0 = new ArrayList();

    /* renamed from: OooO0Oo */
    public final ArrayList f23528OooO0Oo = new ArrayList();

    /* renamed from: OooO0o0 */
    public final HashSet f23530OooO0o0 = new HashSet();

    /* renamed from: OooO0oO */
    public int f23531OooO0oO = Integer.MAX_VALUE;
    public boolean OooOO0o = false;

    public q70(rd0 rd0Var, x70 x70Var, jq0 jq0Var) {
        int i = 0;
        this.f23524OooO = ((md0) rd0Var.f23849OooO0O0.f24096OooOo).f21218OooOOo;
        this.f23533OooOO0 = x70Var;
        this.f23527OooO0OO = jq0Var;
        this.f23532OooO0oo = a80.OooO00o(rd0Var);
        C2051sk c2051sk = rd0Var.f23849OooO0O0;
        while (true) {
            List list = (List) c2051sk.f24098OooOo0o;
            if (i >= list.size()) {
                this.f23526OooO0O0.addAll(list);
                return;
            } else {
                this.f23525OooO00o.put((kd0) list.get(i), Integer.valueOf(i));
                i++;
            }
        }
    }

    public final synchronized kd0 OooO00o() {
        try {
            if (OooO0o()) {
                for (int i = 0; i < this.f23526OooO0O0.size(); i++) {
                    kd0 kd0Var = (kd0) this.f23526OooO0O0.get(i);
                    String str = kd0Var.f20549o00oO0O;
                    if (!this.f23530OooO0o0.contains(str)) {
                        if (kd0Var.o0ooOOo) {
                            this.OooOO0o = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            this.f23530OooO0o0.add(str);
                        }
                        this.f23528OooO0Oo.add(kd0Var);
                        return (kd0) this.f23526OooO0O0.remove(i);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0057 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {, blocks: (B:62:0x0002, B:63:0x0010, B:65:0x0017, B:67:0x001a, B:85:0x004f, B:92:0x0057, B:89:0x0053, B:99:0x0060, B:104:0x0065, B:64:0x0011, B:69:0x001c, B:71:0x0022, B:82:0x004c, B:84:0x004e, B:88:0x0052), top: B:111:0x0002, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void OooO0O0(com.google.android.gms.internal.ads.kd0 r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r6.OooOO0o = r0     // Catch: java.lang.Throwable -> L5c
            java.util.ArrayList r1 = r6.f23528OooO0Oo     // Catch: java.lang.Throwable -> L5c
            r1.remove(r7)     // Catch: java.lang.Throwable -> L5c
            java.util.HashSet r1 = r6.f23530OooO0o0     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r7.f20549o00oO0O     // Catch: java.lang.Throwable -> L5c
            r1.remove(r7)     // Catch: java.lang.Throwable -> L5c
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.ads.jq0 r7 = r6.f23527OooO0OO     // Catch: java.lang.Throwable -> L63
            boolean r7 = r7.isDone()     // Catch: java.lang.Throwable -> L63
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            if (r7 != 0) goto L61
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5c
            r7 = 1
            boolean r1 = r6.OooO0o0(r7)     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L53
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r1 = r6.f23528OooO0Oo     // Catch: java.lang.Throwable -> L43
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L43
            r3 = r0
        L2a:
            if (r3 >= r2) goto L4e
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L43
            int r3 = r3 + 1
            com.google.android.gms.internal.ads.kd0 r4 = (com.google.android.gms.internal.ads.kd0) r4     // Catch: java.lang.Throwable -> L43
            java.util.HashMap r5 = r6.f23525OooO00o     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L45
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L43
            goto L48
        L43:
            r7 = move-exception
            goto L51
        L45:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L48:
            int r5 = r6.f23531OooO0oO     // Catch: java.lang.Throwable -> L43
            if (r4 >= r5) goto L2a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5e
            goto L53
        L4e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            goto L55
        L51:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L43
            throw r7     // Catch: java.lang.Throwable -> L5e
        L53:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            r0 = r7
        L55:
            if (r0 != 0) goto L61
            r6.OooO0Oo()     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r6)
            return
        L5c:
            r7 = move-exception
            goto L66
        L5e:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5e
            throw r7     // Catch: java.lang.Throwable -> L5c
        L61:
            monitor-exit(r6)
            return
        L63:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L63
            throw r7     // Catch: java.lang.Throwable -> L5c
        L66:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q70.OooO0O0(com.google.android.gms.internal.ads.kd0):void");
    }

    public final synchronized void OooO0OO(y70 y70Var, kd0 kd0Var) {
        boolean z;
        z = false;
        this.OooOO0o = false;
        this.f23528OooO0Oo.remove(kd0Var);
        synchronized (this) {
        }
        if (this.f23527OooO0OO.isDone()) {
            y70Var.zzr();
            return;
        }
        Integer num = (Integer) this.f23525OooO00o.get(kd0Var);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.f23531OooO0oO) {
            this.f23533OooOO0.OooO0Oo(kd0Var);
            return;
        }
        if (this.f23529OooO0o != null) {
            this.f23533OooOO0.OooO0Oo(this.f23534OooOO0O);
        }
        this.f23531OooO0oO = iIntValue;
        this.f23529OooO0o = y70Var;
        this.f23534OooOO0O = kd0Var;
        synchronized (this) {
            if (OooO0o0(true)) {
                z = true;
                break;
            }
            synchronized (this) {
                try {
                    ArrayList arrayList = this.f23528OooO0Oo;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        Integer num2 = (Integer) this.f23525OooO00o.get((kd0) obj);
                        if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) < this.f23531OooO0oO) {
                            z = true;
                            break;
                        }
                    }
                } finally {
                }
            }
            if (z) {
                return;
            }
            OooO0Oo();
        }
    }

    public final synchronized void OooO0Oo() {
        x70 x70Var = this.f23533OooOO0;
        kd0 kd0Var = this.f23534OooOO0O;
        synchronized (x70Var) {
            try {
                ((Oooo0OO.oo000o) x70Var.f25540OooO00o).getClass();
                x70Var.f25547OooO0oo = SystemClock.elapsedRealtime() - x70Var.f25539OooO;
                if (kd0Var != null) {
                    x70Var.f25544OooO0o.OooO00o(kd0Var);
                }
                x70Var.f25546OooO0oO = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        y70 y70Var = this.f23529OooO0o;
        if (y70Var != null) {
            this.f23527OooO0OO.OooO0o(y70Var);
        } else {
            this.f23527OooO0OO.OooO0oO(new z70(3, this.f23532OooO0oo));
        }
    }

    public final synchronized boolean OooO0o() {
        if (this.OooOO0o) {
            return false;
        }
        if (!this.f23526OooO0O0.isEmpty() && ((kd0) this.f23526OooO0O0.get(0)).o0ooOOo && !this.f23528OooO0Oo.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.f23527OooO0OO.isDone()) {
                ArrayList arrayList = this.f23528OooO0Oo;
                if (arrayList.size() < this.f23524OooO && OooO0o0(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized boolean OooO0o0(boolean z) {
        try {
            ArrayList arrayList = this.f23526OooO0O0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kd0 kd0Var = (kd0) obj;
                Integer num = (Integer) this.f23525OooO00o.get(kd0Var);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z || !this.f23530OooO0o0.contains(kd0Var.f20549o00oO0O)) {
                    int i2 = this.f23531OooO0oO;
                    if (iIntValue < i2) {
                        return true;
                    }
                    if (iIntValue > i2) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}

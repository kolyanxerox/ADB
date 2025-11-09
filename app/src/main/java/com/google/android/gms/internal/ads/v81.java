package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class v81 implements ca1 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final gn0 f24889OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public long f24890OooOo0o;

    public v81(List list, List list2) {
        xh0.OooOOoo(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        af0.OoooO0(list.size() == list2.size());
        int i2 = 0;
        while (i < list.size()) {
            u81 u81Var = new u81((ca1) list.get(i), (List) list2.get(i));
            int length = objArrCopyOf.length;
            int i3 = i2 + 1;
            int iOooO0o = lm0.OooO0o(length, i3);
            if (iOooO0o > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iOooO0o);
            }
            objArrCopyOf[i2] = u81Var;
            i++;
            i2 = i3;
        }
        this.f24889OooOo0O = rm0.OooOOO(i2, objArrCopyOf);
        this.f24890OooOo0o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final void OooO0o0(long j) {
        int i = 0;
        while (true) {
            gn0 gn0Var = this.f24889OooOo0O;
            if (i >= gn0Var.f19390OooOoO0) {
                return;
            }
            ((u81) gn0Var.get(i)).OooO0o0(j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean OooOO0(f51 f51Var) {
        boolean zOooOO0;
        boolean z = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zOooOO0 = false;
            while (true) {
                gn0 gn0Var = this.f24889OooOo0O;
                if (i >= gn0Var.f19390OooOoO0) {
                    break;
                }
                long jZzc2 = ((u81) gn0Var.get(i)).f24600OooOo0O.zzc();
                boolean z2 = jZzc2 != Long.MIN_VALUE && jZzc2 <= f51Var.f18788OooO00o;
                if (jZzc2 == jZzc || z2) {
                    zOooOO0 |= ((u81) gn0Var.get(i)).f24600OooOo0O.OooOO0(f51Var);
                }
                i++;
            }
            z |= zOooOO0;
        } while (zOooOO0);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzb() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            gn0 gn0Var = this.f24889OooOo0O;
            if (i >= gn0Var.f19390OooOoO0) {
                break;
            }
            u81 u81Var = (u81) gn0Var.get(i);
            long jZzb = u81Var.f24600OooOo0O.zzb();
            rm0 rm0Var = u81Var.f24601OooOo0o;
            if ((rm0Var.contains(1) || rm0Var.contains(2) || rm0Var.contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i++;
        }
        if (jMin != LocationRequestCompat.PASSIVE_INTERVAL) {
            this.f24890OooOo0o = jMin;
            return jMin;
        }
        if (jMin2 == LocationRequestCompat.PASSIVE_INTERVAL) {
            return Long.MIN_VALUE;
        }
        long j = this.f24890OooOo0o;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzc() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            gn0 gn0Var = this.f24889OooOo0O;
            if (i >= gn0Var.f19390OooOoO0) {
                break;
            }
            long jZzc = ((u81) gn0Var.get(i)).f24600OooOo0O.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i++;
        }
        if (jMin == LocationRequestCompat.PASSIVE_INTERVAL) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean zzp() {
        int i = 0;
        while (true) {
            gn0 gn0Var = this.f24889OooOo0O;
            if (i >= gn0Var.f19390OooOoO0) {
                return false;
            }
            if (((u81) gn0Var.get(i)).f24600OooOo0O.zzp()) {
                return true;
            }
            i++;
        }
    }
}

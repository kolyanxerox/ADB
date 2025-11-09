package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class h70 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f19584OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f19585OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f19586OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final ThreadLocal f19587OooO0Oo = new ThreadLocal();

    public h70() {
        OooO0o0(0L);
    }

    public final synchronized long OooO00o(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f19585OooO0O0 != -9223372036854775807L)) {
                    long jLongValue = this.f19584OooO00o;
                    if (jLongValue == 9223372036854775806L) {
                        Long l = (Long) this.f19587OooO0Oo.get();
                        if (l == null) {
                            throw null;
                        }
                        jLongValue = l.longValue();
                    }
                    this.f19585OooO0O0 = jLongValue - j;
                    notifyAll();
                }
                this.f19586OooO0OO = j;
                j2 = j + this.f19585OooO0O0;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long OooO0O0(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f19586OooO0OO;
            if (j2 != -9223372036854775807L) {
                long jOooOo0 = i80.OooOo0(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + jOooOo0) / 8589934592L;
                long j4 = (((-1) + j3) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - jOooOo0) < Math.abs(j5 - jOooOo0) ? j4 : j5;
            }
            return OooO00o(i80.OooOo0(j, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long OooO0OO(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f19586OooO0OO;
            if (j2 != -9223372036854775807L) {
                long jOooOo0 = i80.OooOo0(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = jOooOo0 / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= jOooOo0 ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            return OooO00o(i80.OooOo0(j, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long OooO0Oo() {
        long j = this.f19584OooO00o;
        if (j == LocationRequestCompat.PASSIVE_INTERVAL || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void OooO0o0(long j) {
        this.f19584OooO00o = j;
        this.f19585OooO0O0 = j == LocationRequestCompat.PASSIVE_INTERVAL ? 0L : -9223372036854775807L;
        this.f19586OooO0OO = -9223372036854775807L;
    }
}

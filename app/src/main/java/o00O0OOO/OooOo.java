package o00O0oOO;

import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.internal.measurement.o0OO0O0;

/* loaded from: classes3.dex */
public final class OooOo implements OooOo00, Comparable {

    /* renamed from: OooOo0O */
    public final long f31475OooOo0O;

    public /* synthetic */ OooOo(long j) {
        this.f31475OooOo0O = j;
    }

    public static long OooO00o(long j) {
        long jOooO0O0 = OooOOOO.OooO0O0();
        OooOOO unit = OooOOO.f31465OooOo0o;
        kotlin.jvm.internal.OooOo.OooO0o0(unit, "unit");
        return (1 | (j - 1)) == LocationRequestCompat.PASSIVE_INTERVAL ? OooOO0O.OooO(o0OO0O0.OooOO0O(j)) : o0OO0O0.OooOOO0(jOooO0O0, j, unit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jOooOO0O;
        OooOo other = (OooOo) obj;
        kotlin.jvm.internal.OooOo.OooO0o0(other, "other");
        int i = OooOOOO.f31474OooO0O0;
        OooOOO unit = OooOOO.f31465OooOo0o;
        kotlin.jvm.internal.OooOo.OooO0o0(unit, "unit");
        long j = other.f31475OooOo0O;
        long j2 = (j - 1) | 1;
        long j3 = this.f31475OooOo0O;
        if (j2 != LocationRequestCompat.PASSIVE_INTERVAL) {
            jOooOO0O = (1 | (j3 - 1)) == LocationRequestCompat.PASSIVE_INTERVAL ? o0OO0O0.OooOO0O(j3) : o0OO0O0.OooOOO0(j3, j, unit);
        } else if (j3 == j) {
            int i2 = OooOO0O.f31462OooOoO0;
            jOooOO0O = 0;
        } else {
            jOooOO0O = OooOO0O.OooO(o0OO0O0.OooOO0O(j));
        }
        return OooOO0O.OooO0OO(jOooOO0O, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOo) {
            return this.f31475OooOo0O == ((OooOo) obj).f31475OooOo0O;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31475OooOo0O);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f31475OooOo0O + ')';
    }
}

package o00O0oOO;

import Oooo0oO.o00000;
import androidx.core.location.LocationRequestCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.google.android.gms.internal.measurement.o0OO00OO;
import o00Oo0oo.o00oO0o;

/* loaded from: classes3.dex */
public final class OooOO0O implements Comparable {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final long f31460OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final long f31461OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f31462OooOoO0 = 0;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final long f31463OooOo0O;

    static {
        int i = OooOOO0.f31472OooO00o;
        f31461OooOo0o = o00000.OooO0Oo(4611686018427387903L);
        f31460OooOo = o00000.OooO0Oo(-4611686018427387903L);
    }

    public static final long OooO(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = OooOOO0.f31472OooO00o;
        return j2;
    }

    public static final long OooO00o(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return o00000.OooO0Oo(o00oO0o.OooO0OO(j5));
        }
        return o00000.OooO0o0((j5 * j3) + (j2 - (j4 * j3)));
    }

    public static final void OooO0O0(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            kotlin.jvm.internal.OooOo.OooO0o0(strValueOf, "<this>");
            if (i3 < 0) {
                throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i3, "Desired length ", " is less than zero."));
            }
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                int i4 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i5 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i5 = length2;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length2 = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) string, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) string, 0, i7);
            }
        }
        sb.append(str);
    }

    public static int OooO0OO(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            return j < 0 ? -i : i;
        }
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final long OooO0Oo(long j) {
        return ((((int) j) & 1) != 1 || OooO0o0(j)) ? OooO0oo(j, OooOOO.f31464OooOo) : j >> 1;
    }

    public static final long OooO0o(long j, long j2) {
        if (OooO0o0(j)) {
            if (!OooO0o0(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (OooO0o0(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? OooO00o(j >> 1, j2 >> 1) : OooO00o(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        return i == 0 ? (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? o00000.OooO0Oo(j3 / 1000000) : o00000.OooO0o0(j3) : (-4611686018426L > j3 || j3 >= 4611686018427L) ? o00000.OooO0Oo(o00oO0o.OooO0OO(j3)) : o00000.OooO0o0(j3 * 1000000);
    }

    public static final boolean OooO0o0(long j) {
        return j == f31461OooOo0o || j == f31460OooOo;
    }

    public static final double OooO0oO(long j, OooOOO targetUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(targetUnit, "unit");
        if (j == f31461OooOo0o) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f31460OooOo) {
            return Double.NEGATIVE_INFINITY;
        }
        double d = j >> 1;
        OooOOO sourceUnit = (((int) j) & 1) == 0 ? OooOOO.f31465OooOo0o : OooOOO.f31464OooOo;
        kotlin.jvm.internal.OooOo.OooO0o0(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(targetUnit, "targetUnit");
        long jConvert = targetUnit.f31471OooOo0O.convert(1L, sourceUnit.f31471OooOo0O);
        return jConvert > 0 ? d * jConvert : d / r9.convert(1L, r10);
    }

    public static final long OooO0oo(long j, OooOOO unit) {
        kotlin.jvm.internal.OooOo.OooO0o0(unit, "unit");
        if (j == f31461OooOo0o) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        if (j == f31460OooOo) {
            return Long.MIN_VALUE;
        }
        return o0OO00OO.OooO0Oo(j >> 1, (((int) j) & 1) == 0 ? OooOOO.f31465OooOo0o : OooOOO.f31464OooOo, unit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return OooO0OO(this.f31463OooOo0O, ((OooOO0O) obj).f31463OooOo0O);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOO0O) {
            return this.f31463OooOo0O == ((OooOO0O) obj).f31463OooOo0O;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31463OooOo0O);
    }

    public final String toString() {
        long j;
        int iOooO0oo;
        long jOooO = this.f31463OooOo0O;
        if (jOooO == 0) {
            return "0s";
        }
        if (jOooO == f31461OooOo0o) {
            return "Infinity";
        }
        if (jOooO == f31460OooOo) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = jOooO < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jOooO < 0) {
            jOooO = OooO(jOooO);
        }
        long jOooO0oo = OooO0oo(jOooO, OooOOO.f31470OooOoo0);
        int iOooO0oo2 = OooO0o0(jOooO) ? 0 : (int) (OooO0oo(jOooO, OooOOO.f31468OooOoOO) % 24);
        if (OooO0o0(jOooO)) {
            j = 0;
            iOooO0oo = 0;
        } else {
            j = 0;
            iOooO0oo = (int) (OooO0oo(jOooO, OooOOO.f31466OooOoO) % 60);
        }
        int iOooO0oo3 = OooO0o0(jOooO) ? 0 : (int) (OooO0oo(jOooO, OooOOO.f31467OooOoO0) % 60);
        if (!OooO0o0(jOooO)) {
            i = (int) (((((int) jOooO) & 1) == 1 ? 1 : 0) != 0 ? ((jOooO >> 1) % 1000) * 1000000 : (jOooO >> 1) % Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        }
        boolean z2 = jOooO0oo != j;
        boolean z3 = iOooO0oo2 != 0;
        boolean z4 = iOooO0oo != 0;
        boolean z5 = (iOooO0oo3 == 0 && i == 0) ? false : true;
        if (z2) {
            sb.append(jOooO0oo);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iOooO0oo2);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iOooO0oo);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iOooO0oo3 != 0 || z2 || z3 || z4) {
                OooO0O0(sb, iOooO0oo3, i, 9, "s", false);
            } else if (i >= 1000000) {
                OooO0O0(sb, i / 1000000, i % 1000000, 6, "ms", false);
            } else if (i >= 1000) {
                OooO0O0(sb, i / 1000, i % 1000, 3, "us", false);
            } else {
                sb.append(i);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}

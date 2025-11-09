package OooOOo0;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class OooOo00 {

    /* renamed from: OooO */
    public final byte[] f13489OooO;

    /* renamed from: OooO00o */
    public final String f13490OooO00o;

    /* renamed from: OooO0O0 */
    public final Integer f13491OooO0O0;

    /* renamed from: OooO0OO */
    public final o000oOoO f13492OooO0OO;

    /* renamed from: OooO0Oo */
    public final long f13493OooO0Oo;

    /* renamed from: OooO0o */
    public final HashMap f13494OooO0o;

    /* renamed from: OooO0o0 */
    public final long f13495OooO0o0;

    /* renamed from: OooO0oO */
    public final Integer f13496OooO0oO;

    /* renamed from: OooO0oo */
    public final String f13497OooO0oo;

    /* renamed from: OooOO0 */
    public final byte[] f13498OooOO0;

    public OooOo00(String str, Integer num, o000oOoO o000oooo2, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f13490OooO00o = str;
        this.f13491OooO0O0 = num;
        this.f13492OooO0OO = o000oooo2;
        this.f13493OooO0Oo = j;
        this.f13495OooO0o0 = j2;
        this.f13494OooO0o = map;
        this.f13496OooO0oO = num2;
        this.f13497OooO0oo = str2;
        this.f13489OooO = bArr;
        this.f13498OooOO0 = bArr2;
    }

    public final String OooO00o(String str) {
        String str2 = (String) this.f13494OooO0o.get(str);
        return str2 == null ? "" : str2;
    }

    public final int OooO0O0(String str) {
        String str2 = (String) this.f13494OooO0o.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final OooOOOO OooO0OO() {
        OooOOOO oooOOOO = new OooOOOO();
        String str = this.f13490OooO00o;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        oooOOOO.f13477OooO00o = str;
        oooOOOO.f13478OooO0O0 = this.f13491OooO0O0;
        oooOOOO.f13483OooO0oO = this.f13496OooO0oO;
        oooOOOO.f13484OooO0oo = this.f13497OooO0oo;
        oooOOOO.f13476OooO = this.f13489OooO;
        oooOOOO.f13485OooOO0 = this.f13498OooOO0;
        o000oOoO o000oooo2 = this.f13492OooO0OO;
        if (o000oooo2 == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        oooOOOO.f13479OooO0OO = o000oooo2;
        oooOOOO.f13480OooO0Oo = Long.valueOf(this.f13493OooO0Oo);
        oooOOOO.f13482OooO0o0 = Long.valueOf(this.f13495OooO0o0);
        oooOOOO.f13481OooO0o = new HashMap(this.f13494OooO0o);
        return oooOOOO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOo00)) {
            return false;
        }
        OooOo00 oooOo00 = (OooOo00) obj;
        if (!this.f13490OooO00o.equals(oooOo00.f13490OooO00o)) {
            return false;
        }
        Integer num = oooOo00.f13491OooO0O0;
        Integer num2 = this.f13491OooO0O0;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        if (!this.f13492OooO0OO.equals(oooOo00.f13492OooO0OO) || this.f13493OooO0Oo != oooOo00.f13493OooO0Oo || this.f13495OooO0o0 != oooOo00.f13495OooO0o0 || !this.f13494OooO0o.equals(oooOo00.f13494OooO0o)) {
            return false;
        }
        Integer num3 = oooOo00.f13496OooO0oO;
        Integer num4 = this.f13496OooO0oO;
        if (num4 == null) {
            if (num3 != null) {
                return false;
            }
        } else if (!num4.equals(num3)) {
            return false;
        }
        String str = oooOo00.f13497OooO0oo;
        String str2 = this.f13497OooO0oo;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return Arrays.equals(this.f13489OooO, oooOo00.f13489OooO) && Arrays.equals(this.f13498OooOO0, oooOo00.f13498OooOO0);
    }

    public final int hashCode() {
        int iHashCode = (this.f13490OooO00o.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f13491OooO0O0;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f13492OooO0OO.hashCode()) * 1000003;
        long j = this.f13493OooO0Oo;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f13495OooO0o0;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f13494OooO0o.hashCode()) * 1000003;
        Integer num2 = this.f13496OooO0oO;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f13497OooO0oo;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f13489OooO)) * 1000003) ^ Arrays.hashCode(this.f13498OooOO0);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f13490OooO00o + ", code=" + this.f13491OooO0O0 + ", encodedPayload=" + this.f13492OooO0OO + ", eventMillis=" + this.f13493OooO0Oo + ", uptimeMillis=" + this.f13495OooO0o0 + ", autoMetadata=" + this.f13494OooO0o + ", productId=" + this.f13496OooO0oO + ", pseudonymousId=" + this.f13497OooO0oo + ", experimentIdsClear=" + Arrays.toString(this.f13489OooO) + ", experimentIdsEncrypted=" + Arrays.toString(this.f13498OooOO0) + "}";
    }
}

package OooOOOo;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o0OOO0o extends o0000Ooo {

    /* renamed from: OooO, reason: collision with root package name */
    public final o00Ooo f13413OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f13414OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f13415OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo0 f13416OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f13417OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f13418OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f13419OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final long f13420OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final oo0o0Oo f13421OooO0oo;

    public o0OOO0o(long j, Integer num, o00Oo0 o00oo0, long j2, byte[] bArr, String str, long j3, oo0o0Oo oo0o0oo, o00Ooo o00ooo2) {
        this.f13414OooO00o = j;
        this.f13415OooO0O0 = num;
        this.f13416OooO0OO = o00oo0;
        this.f13417OooO0Oo = j2;
        this.f13419OooO0o0 = bArr;
        this.f13418OooO0o = str;
        this.f13420OooO0oO = j3;
        this.f13421OooO0oo = oo0o0oo;
        this.f13413OooO = o00ooo2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0000Ooo)) {
            return false;
        }
        o0000Ooo o0000ooo = (o0000Ooo) obj;
        o0OOO0o o0ooo0o = (o0OOO0o) o0000ooo;
        if (this.f13414OooO00o != o0ooo0o.f13414OooO00o) {
            return false;
        }
        Integer num = this.f13415OooO0O0;
        if (num == null) {
            if (o0ooo0o.f13415OooO0O0 != null) {
                return false;
            }
        } else if (!num.equals(o0ooo0o.f13415OooO0O0)) {
            return false;
        }
        o00Oo0 o00oo0 = this.f13416OooO0OO;
        if (o00oo0 == null) {
            if (o0ooo0o.f13416OooO0OO != null) {
                return false;
            }
        } else if (!o00oo0.equals(o0ooo0o.f13416OooO0OO)) {
            return false;
        }
        if (this.f13417OooO0Oo != o0ooo0o.f13417OooO0Oo) {
            return false;
        }
        if (!Arrays.equals(this.f13419OooO0o0, o0000ooo instanceof o0OOO0o ? ((o0OOO0o) o0000ooo).f13419OooO0o0 : o0ooo0o.f13419OooO0o0)) {
            return false;
        }
        String str = o0ooo0o.f13418OooO0o;
        String str2 = this.f13418OooO0o;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f13420OooO0oO != o0ooo0o.f13420OooO0oO) {
            return false;
        }
        oo0o0Oo oo0o0oo = o0ooo0o.f13421OooO0oo;
        oo0o0Oo oo0o0oo2 = this.f13421OooO0oo;
        if (oo0o0oo2 == null) {
            if (oo0o0oo != null) {
                return false;
            }
        } else if (!oo0o0oo2.equals(oo0o0oo)) {
            return false;
        }
        o00Ooo o00ooo2 = o0ooo0o.f13413OooO;
        o00Ooo o00ooo3 = this.f13413OooO;
        return o00ooo3 == null ? o00ooo2 == null : o00ooo3.equals(o00ooo2);
    }

    public final int hashCode() {
        long j = this.f13414OooO00o;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f13415OooO0O0;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        o00Oo0 o00oo0 = this.f13416OooO0OO;
        int iHashCode2 = (iHashCode ^ (o00oo0 == null ? 0 : o00oo0.hashCode())) * 1000003;
        long j2 = this.f13417OooO0Oo;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f13419OooO0o0)) * 1000003;
        String str = this.f13418OooO0o;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f13420OooO0oO;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        oo0o0Oo oo0o0oo = this.f13421OooO0oo;
        int iHashCode5 = (i2 ^ (oo0o0oo == null ? 0 : oo0o0oo.hashCode())) * 1000003;
        o00Ooo o00ooo2 = this.f13413OooO;
        return iHashCode5 ^ (o00ooo2 != null ? o00ooo2.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f13414OooO00o + ", eventCode=" + this.f13415OooO0O0 + ", complianceData=" + this.f13416OooO0OO + ", eventUptimeMs=" + this.f13417OooO0Oo + ", sourceExtension=" + Arrays.toString(this.f13419OooO0o0) + ", sourceExtensionJsonProto3=" + this.f13418OooO0o + ", timezoneOffsetSeconds=" + this.f13420OooO0oO + ", networkConnectionInfo=" + this.f13421OooO0oo + ", experimentIds=" + this.f13413OooO + "}";
    }
}

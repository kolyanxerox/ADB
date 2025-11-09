package o000Oo0o;

import OooO0oO.OooOo;
import OooOOo.OooOOO;
import o000Oo.o0OO00O;

/* loaded from: classes2.dex */
public final class o0ooOOo {

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f30405OooO0oo = 0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30406OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f30407OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f30408OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f30409OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final long f30410OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f30411OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final String f30412OooO0oO;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(o0OO00O.OooO0OO(sb, "Missing required properties:"));
    }

    public o0ooOOo(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.f30406OooO00o = str;
        this.f30407OooO0O0 = i;
        this.f30408OooO0OO = str2;
        this.f30409OooO0Oo = str3;
        this.f30411OooO0o0 = j;
        this.f30410OooO0o = j2;
        this.f30412OooO0oO = str4;
    }

    public final o00oO0o OooO00o() {
        o00oO0o o00oo0o = new o00oO0o();
        o00oo0o.f30394OooO00o = this.f30406OooO00o;
        o00oo0o.f30395OooO0O0 = this.f30407OooO0O0;
        o00oo0o.f30396OooO0OO = this.f30408OooO0OO;
        o00oo0o.f30397OooO0Oo = this.f30409OooO0Oo;
        o00oo0o.f30399OooO0o0 = this.f30411OooO0o0;
        o00oo0o.f30398OooO0o = this.f30410OooO0o;
        o00oo0o.f30400OooO0oO = this.f30412OooO0oO;
        o00oo0o.f30401OooO0oo = (byte) 3;
        return o00oo0o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0ooOOo)) {
            return false;
        }
        o0ooOOo o0ooooo = (o0ooOOo) obj;
        String str = this.f30406OooO00o;
        if (str == null) {
            if (o0ooooo.f30406OooO00o != null) {
                return false;
            }
        } else if (!str.equals(o0ooooo.f30406OooO00o)) {
            return false;
        }
        if (!OooOOO.OooO00o(this.f30407OooO0O0, o0ooooo.f30407OooO0O0)) {
            return false;
        }
        String str2 = o0ooooo.f30408OooO0OO;
        String str3 = this.f30408OooO0OO;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = o0ooooo.f30409OooO0Oo;
        String str5 = this.f30409OooO0Oo;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (this.f30411OooO0o0 != o0ooooo.f30411OooO0o0 || this.f30410OooO0o != o0ooooo.f30410OooO0o) {
            return false;
        }
        String str6 = o0ooooo.f30412OooO0oO;
        String str7 = this.f30412OooO0oO;
        return str7 == null ? str6 == null : str7.equals(str6);
    }

    public final int hashCode() {
        String str = this.f30406OooO00o;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ OooOOO.OooO0O0(this.f30407OooO0O0)) * 1000003;
        String str2 = this.f30408OooO0OO;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f30409OooO0Oo;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f30411OooO0o0;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f30410OooO0o;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f30412OooO0oO;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f30406OooO00o);
        sb.append(", registrationStatus=");
        int i = this.f30407OooO0O0;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f30408OooO0OO);
        sb.append(", refreshToken=");
        sb.append(this.f30409OooO0Oo);
        sb.append(", expiresInSecs=");
        sb.append(this.f30411OooO0o0);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f30410OooO0o);
        sb.append(", fisError=");
        return OooOo.OooOOOo(sb, this.f30412OooO0oO, "}");
    }
}

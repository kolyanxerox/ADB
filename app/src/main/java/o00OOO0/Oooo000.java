package o00OOO0;

import com.ironsource.C3037dc;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class Oooo000 {

    /* renamed from: OooOO0 */
    public static final Pattern f32196OooOO0 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: OooOO0O */
    public static final Pattern f32197OooOO0O = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern OooOO0o = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: OooOOO0 */
    public static final Pattern f32198OooOOO0 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: OooO */
    public final boolean f32199OooO;

    /* renamed from: OooO00o */
    public final String f32200OooO00o;

    /* renamed from: OooO0O0 */
    public final String f32201OooO0O0;

    /* renamed from: OooO0OO */
    public final long f32202OooO0OO;

    /* renamed from: OooO0Oo */
    public final String f32203OooO0Oo;

    /* renamed from: OooO0o */
    public final boolean f32204OooO0o;

    /* renamed from: OooO0o0 */
    public final String f32205OooO0o0;

    /* renamed from: OooO0oO */
    public final boolean f32206OooO0oO;

    /* renamed from: OooO0oo */
    public final boolean f32207OooO0oo;

    public Oooo000(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f32200OooO00o = str;
        this.f32201OooO0O0 = str2;
        this.f32202OooO0OO = j;
        this.f32203OooO0Oo = str3;
        this.f32205OooO0o0 = str4;
        this.f32204OooO0o = z;
        this.f32206OooO0oO = z2;
        this.f32199OooO = z3;
        this.f32207OooO0oo = z4;
    }

    public static int OooO00o(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long OooO0O0(int r14, java.lang.String r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOO0.Oooo000.OooO0O0(int, java.lang.String):long");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        return oooo000.f32200OooO00o.equals(this.f32200OooO00o) && oooo000.f32201OooO0O0.equals(this.f32201OooO0O0) && oooo000.f32203OooO0Oo.equals(this.f32203OooO0Oo) && oooo000.f32205OooO0o0.equals(this.f32205OooO0o0) && oooo000.f32202OooO0OO == this.f32202OooO0OO && oooo000.f32204OooO0o == this.f32204OooO0o && oooo000.f32206OooO0oO == this.f32206OooO0oO && oooo000.f32207OooO0oo == this.f32207OooO0oo && oooo000.f32199OooO == this.f32199OooO;
    }

    public final int hashCode() {
        int iOooO0O0 = androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f32200OooO00o), 31, this.f32201OooO0O0), 31, this.f32203OooO0Oo), 31, this.f32205OooO0o0);
        long j = this.f32202OooO0OO;
        return ((((((((iOooO0O0 + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f32204OooO0o ? 1 : 0)) * 31) + (!this.f32206OooO0oO ? 1 : 0)) * 31) + (!this.f32207OooO0oo ? 1 : 0)) * 31) + (!this.f32199OooO ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32200OooO00o);
        sb.append(C3037dc.f8244T);
        sb.append(this.f32201OooO0O0);
        if (this.f32207OooO0oo) {
            long j = this.f32202OooO0OO;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) o00OOOO0.OooO0o.f32375OooO00o.get()).format(new Date(j)));
            }
        }
        if (!this.f32199OooO) {
            sb.append("; domain=");
            sb.append(this.f32203OooO0Oo);
        }
        sb.append("; path=");
        sb.append(this.f32205OooO0o0);
        if (this.f32204OooO0o) {
            sb.append("; secure");
        }
        if (this.f32206OooO0oO) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}

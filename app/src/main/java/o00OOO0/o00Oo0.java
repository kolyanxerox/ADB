package o00OOO0;

import com.ironsource.C3037dc;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class o00Oo0 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Pattern f32244OooO0OO = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f32245OooO0Oo = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f32246OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f32247OooO0O0;

    public o00Oo0(String str, String str2) {
        this.f32246OooO00o = str;
        this.f32247OooO0O0 = str2;
    }

    public static o00Oo0 OooO00o(String str) {
        Matcher matcher = f32244OooO0OO.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.OooO00o.OooO0o('\"', "No subtype found for: \"", str));
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f32245OooO0Oo.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase(C3037dc.f8237M)) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.OooO00o.OooO0oO('\"', str, androidx.datastore.preferences.protobuf.OooO00o.OooOOo0("Multiple charsets defined: \"", str2, "\" and: \"", strGroup3, "\" for: \"")));
                }
                str2 = strGroup3;
            }
        }
        return new o00Oo0(str, str2);
    }

    public static o00Oo0 OooO0O0(String str) {
        try {
            return OooO00o(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o00Oo0) && ((o00Oo0) obj).f32246OooO00o.equals(this.f32246OooO00o);
    }

    public final int hashCode() {
        return this.f32246OooO00o.hashCode();
    }

    public final String toString() {
        return this.f32246OooO00o;
    }
}

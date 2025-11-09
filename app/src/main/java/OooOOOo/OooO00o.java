package OooOOOO;

import Oooo0oO.o00000;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class OooO00o {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final String f13321OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final Set f13322OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f13323OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f13324OooO0o0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f13325OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f13326OooO0O0;

    static {
        String strOooOO0O = o00000.OooOO0O("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f13321OooO0OO = strOooOO0O;
        String strOooOO0O2 = o00000.OooOO0O("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strOooOO0O3 = o00000.OooOO0O("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f13322OooO0Oo = Collections.unmodifiableSet(new HashSet(Arrays.asList(new OooOOO.OooO0O0("proto"), new OooOOO.OooO0O0("json"))));
        f13324OooO0o0 = new OooO00o(strOooOO0O, null);
        f13323OooO0o = new OooO00o(strOooOO0O2, strOooOO0O3);
    }

    public OooO00o(String str, String str2) {
        this.f13325OooO00o = str;
        this.f13326OooO0O0 = str2;
    }

    public static OooO00o OooO00o(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new OooO00o(str2, str3);
    }
}

package o000OO0O;

import o0000O.OooOo00;

/* loaded from: classes2.dex */
public final class OooO00o {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000O00O.OooO00o f30197OooO0O0 = new o000O00O.OooO00o();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final String f30198OooO0OO = OooO00o("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final String f30199OooO0Oo = OooO00o("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final OooOo00 f30200OooO0o0 = new OooOo00(24);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f30201OooO00o;

    public OooO00o(OooO0OO oooO0OO) {
        this.f30201OooO00o = oooO0OO;
    }

    public static String OooO00o(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}

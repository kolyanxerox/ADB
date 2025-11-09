package OooO0oO;

import com.android.billingclient.api.BillingResult;
import o00O0Oo.o00O0O;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OooOo {
    public static String OooO(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static float OooO00o(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int OooO0O0(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static BillingResult OooO0OO(int i, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }

    public static String OooO0Oo(char c, String str, StringBuilder sb) {
        sb.append(c);
        String string = sb.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, str);
        return string;
    }

    public static String OooO0o(int i, String str) {
        return str + i;
    }

    public static String OooO0o0(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String OooO0oO(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String OooO0oo(long j, String str) {
        return str + j;
    }

    public static String OooOO0(String str, String str2) {
        return str + str2;
    }

    public static String OooOO0O(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String OooOO0o(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String OooOOO(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String OooOOO0(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String OooOOOO(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String OooOOOo(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder OooOOo(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder OooOOo0(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder OooOOoo(CharSequence charSequence, String str, CharSequence charSequence2, String str2, CharSequence charSequence3) {
        kotlin.jvm.internal.OooOo.OooO0o0(charSequence, str);
        kotlin.jvm.internal.OooOo.OooO0o0(charSequence2, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence3);
        return sb;
    }

    public static StringBuilder OooOo(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder OooOo0(CharSequence charSequence, String str, o00O0O o00o0o, String str2, CharSequence charSequence2) {
        kotlin.jvm.internal.OooOo.OooO0o0(charSequence, str);
        kotlin.jvm.internal.OooOo.OooO0o0(o00o0o, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        return sb;
    }

    public static StringBuilder OooOo00(CharSequence charSequence, String str, o00O0Oo.Oooo000 oooo000, String str2, CharSequence charSequence2) {
        kotlin.jvm.internal.OooOo.OooO0o0(charSequence, str);
        kotlin.jvm.internal.OooOo.OooO0o0(oooo000, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        return sb;
    }

    public static StringBuilder OooOo0O(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder OooOo0o(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void OooOoO(int i, int i2, o00O0Oo.Oooo000 oooo000) {
        oooo000.invoke(Integer.valueOf(i + i2));
    }

    public static StringBuilder OooOoO0(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static int OooOoOO(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static String OooOoo(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String OooOoo0(String str, String str2) {
        return str + str2;
    }
}

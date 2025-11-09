package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public final class oo0o0Oo {
    public static String OooO00o(OooOOO oooOOO) {
        String string = oooOOO.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}

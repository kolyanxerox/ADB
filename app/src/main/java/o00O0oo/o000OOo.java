package o00O0oO;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o000OOo implements Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Pattern f31445OooOo0O;

    public o000OOo(String str) {
        Pattern patternCompile = Pattern.compile(str);
        OooOo.OooO0Oo(patternCompile, "compile(...)");
        this.f31445OooOo0O = patternCompile;
    }

    public final String OooO00o(String input) {
        OooOo.OooO0o0(input, "input");
        String strReplaceAll = this.f31445OooOo0O.matcher(input).replaceAll("");
        OooOo.OooO0Oo(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f31445OooOo0O.toString();
        OooOo.OooO0Oo(string, "toString(...)");
        return string;
    }
}

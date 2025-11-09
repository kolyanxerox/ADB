package o000Oooo;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class o00000O {

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final Charset f30605OooO0o0 = Charset.forName("UTF-8");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f30606OooO00o = new HashSet();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f30607OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o000OOo f30608OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OOo f30609OooO0Oo;

    static {
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public o00000O(Executor executor, o000OOo o000ooo2, o000OOo o000ooo3) {
        this.f30607OooO0O0 = executor;
        this.f30608OooO0OO = o000ooo2;
        this.f30609OooO0Oo = o000ooo3;
    }

    public static HashSet OooO00o(o000OOo o000ooo2) {
        HashSet hashSet = new HashSet();
        o000000 o000000VarOooO0OO = o000ooo2.OooO0OO();
        if (o000000VarOooO0OO != null) {
            Iterator<String> itKeys = o000000VarOooO0OO.f30594OooO0O0.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }
}

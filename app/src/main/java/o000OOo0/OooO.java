package o000Ooo0;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class OooO {

    /* renamed from: OooO00o */
    public final String f30532OooO00o;

    /* renamed from: OooO0O0 */
    public final OooOO0 f30533OooO0O0;

    public OooO(Set set, OooOO0 oooOO0) {
        this.f30532OooO00o = OooO00o(set);
        this.f30533OooO0O0 = oooOO0;
    }

    public static String OooO00o(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            OooO0o oooO0o = (OooO0o) it.next();
            sb.append(oooO0o.f30534OooO00o);
            sb.append('/');
            sb.append(oooO0o.f30535OooO0O0);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}

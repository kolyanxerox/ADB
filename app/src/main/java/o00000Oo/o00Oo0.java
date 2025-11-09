package o00000oo;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import o0000O0O.OooO0OO;

/* loaded from: classes2.dex */
public abstract class o00Oo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final CopyOnWriteArrayList f29294OooO00o = new CopyOnWriteArrayList();

    public static OooO0OO OooO00o(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        Iterator it = f29294OooO00o.iterator();
        while (it.hasNext()) {
            OooO0OO oooO0OO = (OooO0OO) it.next();
            synchronized (oooO0OO) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return oooO0OO;
            }
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0("No KMS client does support: ", str));
    }
}

package o000Ooo;

import android.util.Log;
import com.applovin.impl.o000O0O0;
import java.io.IOException;
import o000O0Oo.OooO00o;
import o000O0Oo.OooO0o;

/* loaded from: classes2.dex */
public final class o00Oo0 {

    /* renamed from: OooO0Oo */
    public static final OooO00o f30479OooO0Oo = new OooO00o(2);

    /* renamed from: OooO0o0 */
    public static final o000O0O0 f30480OooO0o0 = new o000O0O0(3);

    /* renamed from: OooO00o */
    public final OooO0o f30481OooO00o;

    /* renamed from: OooO0O0 */
    public String f30482OooO0O0 = null;

    /* renamed from: OooO0OO */
    public String f30483OooO0OO = null;

    public o00Oo0(OooO0o oooO0o) {
        this.f30481OooO00o = oooO0o;
    }

    public static void OooO00o(OooO0o oooO0o, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            oooO0o.OooOOOO(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e);
        }
    }
}

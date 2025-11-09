package OoooOOO;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oOo00o00 implements oOO00O0, o0O0OOO0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ oOO0000 f14868OooOo0O;

    public oOo00o00(oOO0000 ooo0000, int i) {
        switch (i) {
            case 1:
                this.f14868OooOo0O = ooo0000;
                break;
            default:
                Objects.requireNonNull(ooo0000);
                this.f14868OooOo0O = ooo0000;
                break;
        }
    }

    @Override // OoooOOO.o0O0OOO0
    public /* synthetic */ void OooO00o(String str, int i, IOException iOException, byte[] bArr, Map map) {
        this.f14868OooOo0O.OooOoOO(str, i, iOException, bArr, map);
    }

    @Override // OoooOOO.oOO00O0
    public void OooOO0(String str, Bundle bundle, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        oOO0000 ooo0000 = this.f14868OooOo0O;
        if (!zIsEmpty) {
            ooo0000.OooO0O0().OooOo00(new o0OOOO0o(this, str, str2, bundle));
            return;
        }
        o0OO0oO0 o0oo0oo0 = ooo0000.f14805Oooo00O;
        if (o0oo0oo0 != null) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0OO(str2, "AppId not known when logging event");
        }
    }
}

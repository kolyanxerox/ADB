package OoooOOO;

import OooOOo0.Oooo000;
import Oooo0o0.OooOO0;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3126fq;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o0OO000o implements oO00O0o {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14483OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o0OO0oO0 f14484OooOo0o;

    public /* synthetic */ o0OO000o(o0OO0oO0 o0oo0oo0, int i) {
        this.f14483OooOo0O = i;
        this.f14484OooOo0o = o0oo0oo0;
    }

    @Override // OoooOOO.oO00O0o, OoooOOO.o0O0OOO0
    public /* synthetic */ void OooO00o(String str, int i, IOException iOException, byte[] bArr, Map map) {
        this.f14484OooOo0o.OooO(i, iOException, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean OooO0O0() {
        switch (this.f14483OooOo0O) {
            case 0:
                o0OO0oO0 o0oo0oo0 = this.f14484OooOo0o;
                boolean z = false;
                try {
                    Oooo000 oooo000OooO00o = OooOO0.OooO00o(o0oo0oo0.f14516OooOo0O);
                    if (oooo000OooO00o == null) {
                        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o0);
                        o0o0o0o0.f14398Oooo0.OooO0O0("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        o0oo0oo0 = o0oo0oo0;
                    } else {
                        int i = oooo000OooO00o.OooO0OO(128, C3126fq.f8595b).versionCode;
                        o0oo0oo0 = i;
                        if (i >= 80837300) {
                            z = true;
                            o0oo0oo0 = i;
                        }
                    }
                } catch (Exception e) {
                    o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14398Oooo0.OooO0OO(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z;
            default:
                o0O0O0o0 o0o0o0o03 = this.f14484OooOo0o.f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o03);
                return Log.isLoggable(o0o0o0o03.OooOo0(), 3);
        }
    }

    public void OooO0OO(Bundle bundle, String str) {
        String string;
        o0OO0oO0 o0oo0oo0 = this.f14484OooOo0o;
        o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
        o0OO0oO0.OooOOO0(o0oo0o00);
        o0oo0o00.OooOO0O();
        if (o0oo0oo0.OooO0o()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        o0O o0o = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        o0o.f14203OoooO0.OooO0o0(string);
        o0oo0oo0.f14527Oooo000.getClass();
        o0o.f14205OoooO0O.OooO0O0(System.currentTimeMillis());
    }

    public boolean OooO0Oo() {
        if (!OooO0o0()) {
            return false;
        }
        o0OO0oO0 o0oo0oo0 = this.f14484OooOo0o;
        o0oo0oo0.f14527Oooo000.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        o0O o0o = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        return jCurrentTimeMillis - o0o.f14205OoooO0O.OooO00o() > o0oo0oo0.f14519OooOoO0.OooOOo(null, o0O000O.f14282Ooooooo);
    }

    public boolean OooO0o0() {
        o0O o0o = this.f14484OooOo0o.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        return o0o.f14205OoooO0O.OooO00o() > 0;
    }

    public o0OO000o(oOO0000 ooo0000) {
        this.f14483OooOo0O = 0;
        this.f14484OooOo0o = ooo0000.f14805Oooo00O;
    }

    public o0OO000o(o0OO0oO0 o0oo0oo0, oO0000o0 oo0000o0) {
        this.f14483OooOo0O = 2;
        this.f14484OooOo0o = o0oo0oo0;
    }
}

package OoooO0O;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.internal.ads.C2051sk;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class o0000Ooo implements o000O00 {

    /* renamed from: OooOo */
    public final Handler f13942OooOo;

    /* renamed from: OooOo0O */
    public final Application f13943OooOo0O;

    /* renamed from: OooOo0o */
    public final o00000O f13944OooOo0o;

    /* renamed from: OooOoO */
    public final o00O000o f13945OooOoO;

    /* renamed from: OooOoO0 */
    public final o000O000 f13946OooOoO0;

    /* renamed from: OooOoOO */
    public final C2051sk f13947OooOoOO;

    /* renamed from: OooOoo */
    public final o0OOO0o f13948OooOoo;

    /* renamed from: OooOoo0 */
    public final oo0o0Oo f13949OooOoo0;

    public o0000Ooo(Application application, o00000O o00000o, Handler handler, o000O000 o000o0002, o00O000o o00o000o, C2051sk c2051sk, oo0o0Oo oo0o0oo, o0OOO0o o0ooo0o) {
        this.f13943OooOo0O = application;
        this.f13944OooOo0o = o00000o;
        this.f13942OooOo = handler;
        this.f13946OooOoO0 = o000o0002;
        this.f13945OooOoO = o00o000o;
        this.f13947OooOoOO = c2051sk;
        this.f13949OooOoo0 = oo0o0oo;
        this.f13948OooOoo = o0ooo0o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x014e  */
    @Override // OoooO0O.o000O00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO00o(java.lang.String r10, org.json.JSONObject r11) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooO0O.o0000Ooo.OooO00o(java.lang.String, org.json.JSONObject):boolean");
    }

    public final void OooO0O0(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("action");
        String queryParameter2 = uri.getQueryParameter("args");
        o000O00[] o000o00Arr = {this, this.f13947OooOoOO};
        o00O000o o00o000o = this.f13945OooOoO;
        o00o000o.getClass();
        o00o000o.f13992OooO00o.execute(new o00000OO(queryParameter, queryParameter2, o000o00Arr, 0));
    }

    @Override // OoooO0O.o000O00
    public final Executor zza() {
        Handler handler = this.f13942OooOo;
        Objects.requireNonNull(handler);
        return new OooOOo0.o00Ooo(handler, 1);
    }
}

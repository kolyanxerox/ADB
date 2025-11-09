package o000oo0O;

import io.flutter.plugin.common.MethodChannel;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class o0OO00O implements o0O0O00 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final MethodChannel.Result f31107OooOo0O;

    public o0OO00O(MethodChannel.Result result) {
        this.f31107OooOo0O = result;
    }

    @Override // o000oo0O.o0O0O00
    public final void OooO00o(Serializable serializable) {
        this.f31107OooOo0O.success(serializable);
    }

    @Override // o000oo0O.o0O0O00
    public final void OooO0o0(String str, HashMap map) {
        this.f31107OooOo0O.error("sqlite_error", str, map);
    }
}

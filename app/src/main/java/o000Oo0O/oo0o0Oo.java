package o000oo0O;

import Oooo0o0.OooO;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes2.dex */
public final class oo0o0Oo extends OooO {

    /* renamed from: OooOoO */
    public final MethodCall f31111OooOoO;

    /* renamed from: OooOoO0 */
    public final o0OO00O f31112OooOoO0;

    public oo0o0Oo(MethodCall methodCall, MethodChannel.Result result) {
        super(6);
        this.f31111OooOoO = methodCall;
        this.f31112OooOoO0 = new o0OO00O(result);
    }

    @Override // Oooo0o0.OooO
    public final Object OooOO0(String str) {
        return this.f31111OooOoO.argument(str);
    }

    @Override // Oooo0o0.OooO
    public final String OooOO0O() {
        return this.f31111OooOoO.method;
    }

    @Override // Oooo0o0.OooO
    public final boolean OooOOO() {
        return this.f31111OooOoO.hasArgument("transactionId");
    }

    @Override // Oooo0o0.OooO
    public final o0O0O00 OooOOO0() {
        return this.f31112OooOoO0;
    }
}

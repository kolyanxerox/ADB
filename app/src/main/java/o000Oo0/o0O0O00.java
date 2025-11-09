package o000oo0;

import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes2.dex */
public final class o0O0O00 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ o000000 f31044OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ oo000o f31045OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ MethodChannel.Result f31046OooOo0o;

    public o0O0O00(o000000 o000000Var, oo000o oo000oVar, MethodChannel.Result result) {
        this.f31044OooOo = o000000Var;
        this.f31045OooOo0O = oo000oVar;
        this.f31046OooOo0o = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (o000000.f31023OooOoOO) {
            o000000.OooO00o(this.f31044OooOo, this.f31045OooOo0O);
        }
        this.f31046OooOo0o.success(null);
    }
}

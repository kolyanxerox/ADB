package o000OOoO;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import o0000o0.Oooo0;
import o0000oo0.o00000OO;
import o0000oo0.o00oO0o;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0O0 implements o00oO0o {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30289OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00000OO f30290OooOo0o;

    public /* synthetic */ OooO0O0(o00000OO o00000oo2, int i) {
        this.f30289OooOo0O = i;
        this.f30290OooOo0o = o00000oo2;
    }

    @Override // o0000oo0.o00oO0o
    public final Object OooO0OO(o000O0Oo.OooO0o oooO0o) {
        switch (this.f30289OooOo0O) {
            case 0:
                return new OooO0o((Context) oooO0o.get(Context.class), ((Oooo0) oooO0o.get(Oooo0.class)).OooO0o(), oooO0o.OooO00o(o00000OO.OooO00o(OooO.class)), oooO0o.OooO0o0(o000Ooo0.OooO.class), (Executor) oooO0o.OooO0o(this.f30290OooOo0o));
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f30290OooOo0o, oooO0o);
        }
    }
}

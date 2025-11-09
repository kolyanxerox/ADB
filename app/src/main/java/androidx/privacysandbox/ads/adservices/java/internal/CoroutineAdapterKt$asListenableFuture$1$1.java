package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Oooo000;
import o00O0oOo.o000O0o;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class CoroutineAdapterKt$asListenableFuture$1$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    final /* synthetic */ o000O0o $this_asListenableFuture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer<T> completer, o000O0o o000o0o2) {
        super(1);
        this.$completer = completer;
        this.$this_asListenableFuture = o000o0o2;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(Throwable th) {
        if (th == null) {
            this.$completer.set(this.$this_asListenableFuture.OooO0O0());
        } else if (th instanceof CancellationException) {
            this.$completer.setCancelled();
        } else {
            this.$completer.setException(th);
        }
    }
}

package androidx.lifecycle;

import kotlin.jvm.internal.Oooo000;
import o00O0O0O.OooOOO;
import o00O0oOo.o0000O00;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ o0000O00 $lifecycleDispatcher;
    final /* synthetic */ C0570xfdb59cc4 $observer;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(o0000O00 o0000o00, Lifecycle lifecycle, C0570xfdb59cc4 c0570xfdb59cc4) {
        super(1);
        this.$lifecycleDispatcher = o0000o00;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$observer = c0570xfdb59cc4;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(Throwable th) {
        o0000O00 o0000o00 = this.$lifecycleDispatcher;
        OooOOO oooOOO = OooOOO.f31358OooOo0O;
        if (!o0000o00.isDispatchNeeded(oooOOO)) {
            this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this.$observer);
            return;
        }
        o0000O00 o0000o002 = this.$lifecycleDispatcher;
        final Lifecycle lifecycle = this.$this_suspendWithStateAtLeastUnchecked;
        final C0570xfdb59cc4 c0570xfdb59cc4 = this.$observer;
        o0000o002.dispatch(oooOOO, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$invoke$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                lifecycle.removeObserver(c0570xfdb59cc4);
            }
        });
    }
}

package androidx.core.os;

/* loaded from: classes.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ o00O0Oo.OooO0O0 $action;

    public HandlerKt$postDelayed$runnable$1(o00O0Oo.OooO0O0 oooO0O0) {
        this.$action = oooO0O0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}

package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import o00O0oo.o00oOoo;
import o00O0ooo.oO00000o;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements LifecycleEventObserver {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15308OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15309OooOo0o;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f15308OooOo0O = i;
        this.f15309OooOo0o = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f15308OooOo0O) {
            case 0:
                LifecycleKt$eventFlow$1.invokeSuspend$lambda$0((o00oOoo) this.f15309OooOo0o, lifecycleOwner, event);
                break;
            default:
                Lifecycle._get_currentStateFlow_$lambda$0((oO00000o) this.f15309OooOo0o, lifecycleOwner, event);
                break;
        }
    }
}

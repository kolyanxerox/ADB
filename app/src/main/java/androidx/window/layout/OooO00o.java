package androidx.window.layout;

import androidx.core.util.Consumer;
import androidx.window.layout.WindowInfoTrackerImpl;
import o00O0oo.o00oOoo;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Consumer {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15360OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00oOoo f15361OooOo0o;

    public /* synthetic */ OooO00o(o00oOoo o00oooo, int i) {
        this.f15360OooOo0O = i;
        this.f15361OooOo0o = o00oooo;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f15360OooOo0O) {
            case 0:
                WindowInfoTrackerImpl.C08591.invokeSuspend$lambda$0(this.f15361OooOo0o, (WindowLayoutInfo) obj);
                break;
            default:
                WindowInfoTrackerImpl.C08602.invokeSuspend$lambda$0(this.f15361OooOo0o, (WindowLayoutInfo) obj);
                break;
        }
    }
}

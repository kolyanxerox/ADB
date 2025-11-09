package o00O0oOo;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public class o0000Ooo {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31506OooO0O0 = AtomicIntegerFieldUpdater.newUpdater(o0000Ooo.class, "_handled$volatile");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Throwable f31507OooO00o;
    private volatile /* synthetic */ int _handled$volatile;

    public o0000Ooo(boolean z, Throwable th) {
        this.f31507OooO00o = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f31507OooO00o + ']';
    }
}

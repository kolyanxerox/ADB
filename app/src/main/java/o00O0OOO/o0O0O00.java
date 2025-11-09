package o00O0oOo;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class o0O0O00 extends o0000Ooo {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31560OooO0OO = AtomicIntegerFieldUpdater.newUpdater(o0O0O00.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public o0O0O00(oo0o0Oo oo0o0oo, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + oo0o0oo + " was cancelled normally");
        }
        super(z, th);
        this._resumed$volatile = 0;
    }
}

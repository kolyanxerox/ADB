package o00O0oOo;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class o00Ooo {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31555OooO0O0 = AtomicIntegerFieldUpdater.newUpdater(o00Ooo.class, "notCompletedCount$volatile");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000O0o[] f31556OooO00o;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public o00Ooo(o000O0o[] o000o0oArr) {
        this.f31556OooO00o = o000o0oArr;
        this.notCompletedCount$volatile = o000o0oArr.length;
    }
}

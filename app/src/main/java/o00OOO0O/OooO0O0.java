package o00OOO0O;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class OooO0O0 implements ThreadFactory {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f32332OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f32333OooO0O0;

    public OooO0O0(String str, boolean z) {
        this.f32332OooO00o = str;
        this.f32333OooO0O0 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f32332OooO00o);
        thread.setDaemon(this.f32333OooO0O0);
        return thread;
    }
}

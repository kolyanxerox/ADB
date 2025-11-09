package o000oo0;

import android.os.Handler;
import android.os.HandlerThread;
import io.flutter.plugins.webviewflutter.OooOOOO;

/* loaded from: classes2.dex */
public final class o0ooOOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f31055OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f31056OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public HandlerThread f31057OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public Handler f31058OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public o00oO0o f31059OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public OooOOOO f31060OooO0o0;

    public o0ooOOo(String str, int i) {
        this.f31055OooO00o = str;
        this.f31056OooO0O0 = i;
    }

    public final synchronized void OooO00o(OooOOOO oooOOOO) {
        HandlerThread handlerThread = new HandlerThread(this.f31055OooO00o, this.f31056OooO0O0);
        this.f31057OooO0OO = handlerThread;
        handlerThread.start();
        this.f31058OooO0Oo = new Handler(this.f31057OooO0OO.getLooper());
        this.f31060OooO0o0 = oooOOOO;
    }
}

package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28745OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28746OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCorePlugin f28747OooOo0o;

    public /* synthetic */ OooO0O0(FlutterFirebaseCorePlugin flutterFirebaseCorePlugin, TaskCompletionSource taskCompletionSource, int i) {
        this.f28746OooOo0O = i;
        this.f28747OooOo0o = flutterFirebaseCorePlugin;
        this.f28745OooOo = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28746OooOo0O) {
            case 0:
                this.f28747OooOo0o.lambda$optionsFromResource$5(this.f28745OooOo);
                break;
            default:
                this.f28747OooOo0o.lambda$initializeCore$4(this.f28745OooOo);
                break;
        }
    }
}

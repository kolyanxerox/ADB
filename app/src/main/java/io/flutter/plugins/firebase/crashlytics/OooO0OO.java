package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28759OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28760OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin f28761OooOo0o;

    public /* synthetic */ OooO0OO(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, TaskCompletionSource taskCompletionSource, int i) {
        this.f28760OooOo0O = i;
        this.f28761OooOo0o = flutterFirebaseCrashlyticsPlugin;
        this.f28759OooOo = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28760OooOo0O) {
            case 0:
                this.f28761OooOo0o.lambda$checkForUnsentReports$0(this.f28759OooOo);
                break;
            default:
                this.f28761OooOo0o.lambda$didCrashOnPreviousExecution$3(this.f28759OooOo);
                break;
        }
    }
}

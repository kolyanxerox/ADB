package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28756OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28757OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Map f28758OooOo0o;

    public /* synthetic */ OooO0O0(Map map, TaskCompletionSource taskCompletionSource, int i) {
        this.f28757OooOo0O = i;
        this.f28758OooOo0o = map;
        this.f28756OooOo = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28757OooOo0O) {
            case 0:
                FlutterFirebaseCrashlyticsPlugin.lambda$log$5(this.f28758OooOo0o, this.f28756OooOo);
                break;
            case 1:
                FlutterFirebaseCrashlyticsPlugin.lambda$setUserIdentifier$8(this.f28758OooOo0o, this.f28756OooOo);
                break;
            default:
                FlutterFirebaseCrashlyticsPlugin.lambda$setCustomKey$9(this.f28758OooOo0o, this.f28756OooOo);
                break;
        }
    }
}

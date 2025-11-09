package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28725OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28726OooOo0o;

    public /* synthetic */ OooO(TaskCompletionSource taskCompletionSource, int i) {
        this.f28725OooOo0O = i;
        this.f28726OooOo0o = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28725OooOo0O) {
            case 0:
                FlutterFirebaseAnalyticsPlugin.getPluginConstantsForFirebaseApp$lambda$0(this.f28726OooOo0o);
                break;
            case 1:
                FlutterFirebaseAnalyticsPlugin.didReinitializeFirebaseCore$lambda$1(this.f28726OooOo0o);
                break;
            case 2:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(this.f28726OooOo0o);
                break;
            case 3:
                FlutterFirebaseCrashlyticsPlugin.lambda$deleteUnsentReports$2(this.f28726OooOo0o);
                break;
            case 4:
                FlutterFirebaseCrashlyticsPlugin.lambda$sendUnsentReports$6(this.f28726OooOo0o);
                break;
            default:
                FlutterFirebaseCrashlyticsPlugin.lambda$didReinitializeFirebaseCore$12(this.f28726OooOo0o);
                break;
        }
    }
}

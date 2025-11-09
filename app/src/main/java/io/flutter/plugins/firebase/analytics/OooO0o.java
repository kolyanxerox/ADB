package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Map f28734OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28735OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f28736OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28737OooOoO0;

    public /* synthetic */ OooO0o(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        this.f28735OooOo0O = 1;
        this.f28736OooOo0o = flutterFirebaseAnalyticsPlugin;
        this.f28734OooOo = map;
        this.f28737OooOoO0 = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28735OooOo0O) {
            case 0:
                FlutterFirebaseAnalyticsPlugin.handleLogEvent$lambda$3(this.f28734OooOo, this.f28736OooOo0o, this.f28737OooOoO0);
                break;
            case 1:
                FlutterFirebaseAnalyticsPlugin.handleSetDefaultEventParameters$lambda$10(this.f28736OooOo0o, this.f28734OooOo, this.f28737OooOoO0);
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.handleSetConsent$lambda$9(this.f28734OooOo, this.f28736OooOo0o, this.f28737OooOoO0);
                break;
        }
    }

    public /* synthetic */ OooO0o(Map map, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource, int i) {
        this.f28735OooOo0O = i;
        this.f28734OooOo = map;
        this.f28736OooOo0o = flutterFirebaseAnalyticsPlugin;
        this.f28737OooOoO0 = taskCompletionSource;
    }
}

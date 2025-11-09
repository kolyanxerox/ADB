package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28738OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28739OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f28740OooOo0o;

    public /* synthetic */ OooOO0(TaskCompletionSource taskCompletionSource, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin) {
        this.f28739OooOo0O = 1;
        this.f28740OooOo0o = flutterFirebaseAnalyticsPlugin;
        this.f28738OooOo = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28739OooOo0O) {
            case 0:
                FlutterFirebaseAnalyticsPlugin.handleGetAppInstanceId$lambda$11(this.f28738OooOo, this.f28740OooOo0o);
                break;
            case 1:
                FlutterFirebaseAnalyticsPlugin.handleResetAnalyticsData$lambda$8(this.f28740OooOo0o, this.f28738OooOo);
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.handleGetSessionId$lambda$2(this.f28738OooOo, this.f28740OooOo0o);
                break;
        }
    }

    public /* synthetic */ OooOO0(TaskCompletionSource taskCompletionSource, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, int i) {
        this.f28739OooOo0O = i;
        this.f28738OooOo = taskCompletionSource;
        this.f28740OooOo0o = flutterFirebaseAnalyticsPlugin;
    }
}

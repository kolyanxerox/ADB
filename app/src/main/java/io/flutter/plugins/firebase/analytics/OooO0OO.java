package io.flutter.plugins.firebase.analytics;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements OnCompleteListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f28731OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28732OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseAnalyticsPlugin f28733OooOo0o;

    public /* synthetic */ OooO0OO(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, int i) {
        this.f28732OooOo0O = i;
        this.f28733OooOo0o = flutterFirebaseAnalyticsPlugin;
        this.f28731OooOo = oooo000;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f28732OooOo0O) {
            case 0:
                FlutterFirebaseAnalyticsPlugin.setConsent$lambda$18(this.f28733OooOo0o, this.f28731OooOo, task);
                break;
            case 1:
                FlutterFirebaseAnalyticsPlugin.setDefaultEventParameters$lambda$19(this.f28733OooOo0o, this.f28731OooOo, task);
                break;
            case 2:
                FlutterFirebaseAnalyticsPlugin.resetAnalyticsData$lambda$16(this.f28733OooOo0o, this.f28731OooOo, task);
                break;
            case 3:
                FlutterFirebaseAnalyticsPlugin.logEvent$lambda$12(this.f28733OooOo0o, this.f28731OooOo, task);
                break;
            case 4:
                FlutterFirebaseAnalyticsPlugin.getSessionId$lambda$21(this.f28733OooOo0o, this.f28731OooOo, task);
                break;
            case 5:
                FlutterFirebaseAnalyticsPlugin.setUserProperty$lambda$14(this.f28733OooOo0o, this.f28731OooOo, task);
                break;
            case 6:
                FlutterFirebaseAnalyticsPlugin.setAnalyticsCollectionEnabled$lambda$15(this.f28733OooOo0o, this.f28731OooOo, task);
                break;
            case 7:
                FlutterFirebaseAnalyticsPlugin.setUserId$lambda$13(this.f28733OooOo0o, this.f28731OooOo, task);
                break;
            case 8:
                FlutterFirebaseAnalyticsPlugin.setSessionTimeoutDuration$lambda$17(this.f28733OooOo0o, this.f28731OooOo, task);
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.getAppInstanceId$lambda$20(this.f28733OooOo0o, this.f28731OooOo, task);
                break;
        }
    }
}

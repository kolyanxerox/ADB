package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Map f28752OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28753OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FlutterFirebaseCrashlyticsPlugin f28754OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28755OooOoO0;

    public /* synthetic */ OooO00o(FlutterFirebaseCrashlyticsPlugin flutterFirebaseCrashlyticsPlugin, Map map, TaskCompletionSource taskCompletionSource, int i) {
        this.f28753OooOo0O = i;
        this.f28754OooOo0o = flutterFirebaseCrashlyticsPlugin;
        this.f28752OooOo = map;
        this.f28755OooOoO0 = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28753OooOo0O) {
            case 0:
                this.f28754OooOo0o.lambda$recordError$4(this.f28752OooOo, this.f28755OooOoO0);
                break;
            default:
                this.f28754OooOo0o.lambda$setCrashlyticsCollectionEnabled$7(this.f28752OooOo, this.f28755OooOoO0);
                break;
        }
    }
}

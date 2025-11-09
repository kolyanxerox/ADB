package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Boolean f28741OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28742OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f28743OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f28744OooOoO0;

    public /* synthetic */ OooO00o(String str, Boolean bool, TaskCompletionSource taskCompletionSource, int i) {
        this.f28742OooOo0O = i;
        this.f28743OooOo0o = str;
        this.f28741OooOo = bool;
        this.f28744OooOoO0 = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28742OooOo0O) {
            case 0:
                FlutterFirebaseCorePlugin.lambda$setAutomaticResourceManagementEnabled$7(this.f28743OooOo0o, this.f28741OooOo, this.f28744OooOoO0);
                break;
            default:
                FlutterFirebaseCorePlugin.lambda$setAutomaticDataCollectionEnabled$6(this.f28743OooOo0o, this.f28741OooOo, this.f28744OooOoO0);
                break;
        }
    }
}

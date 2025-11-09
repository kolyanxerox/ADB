package OooO;

import com.applovin.applovin_max.AppLovinMAX;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements AppLovinCmpService.OnCompletedListener, OnCompleteListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f13246OooOo0O;

    public /* synthetic */ OooO00o(MethodChannel.Result result) {
        this.f13246OooOo0O = result;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseCrashlyticsPlugin.lambda$onMethodCall$10(this.f13246OooOo0O, task);
    }

    @Override // com.applovin.sdk.AppLovinCmpService.OnCompletedListener
    public void onCompleted(AppLovinCmpError appLovinCmpError) {
        AppLovinMAX.lambda$showCmpForExistingUser$1(this.f13246OooOo0O, appLovinCmpError);
    }
}

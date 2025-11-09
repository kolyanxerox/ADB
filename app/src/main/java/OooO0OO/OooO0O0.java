package OooO0Oo;

import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.browser.trusted.TrustedWebActivityServiceConnectionPool;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.DispatchQueue;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.sidecar.SidecarWindowBackend;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.C1093m2;
import com.applovin.impl.adview.C0962a;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.C1234b;
import com.applovin.mediation.adapters.AppLovinAdapterAdViewListener;
import com.applovin.sdk.AppLovinAd;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.sdk.controller.C3657v;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import o0000o0.Oooo0;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f13257OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13258OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f13259OooOo0o;

    public /* synthetic */ OooO0O0(int i, Object obj, Object obj2) {
        this.f13258OooOo0O = i;
        this.f13257OooOo = obj;
        this.f13259OooOo0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f13257OooOo;
        Object obj2 = this.f13259OooOo0o;
        switch (this.f13258OooOo0O) {
            case 0:
                FragmentStrictMode.handlePolicyViolation$lambda$0((FragmentStrictMode.Policy) obj, (Violation) obj2);
                break;
            case 1:
                FragmentStrictMode.handlePolicyViolation$lambda$1((String) obj, (Violation) obj2);
                break;
            case 2:
                int i = JobInfoSchedulerService.f15873OooOo0O;
                ((JobInfoSchedulerService) obj).jobFinished((JobParameters) obj2, false);
                break;
            case 3:
                ((TrustedWebActivityServiceConnectionPool) obj).lambda$connect$0((Uri) obj2);
                break;
            case 4:
                ((ResourcesCompat.FontCallback) obj).lambda$callbackSuccessAsync$0((Typeface) obj2);
                break;
            case 5:
                DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1((DispatchQueue) obj, (Runnable) obj2);
                break;
            case 6:
                ((ProfileInstallerInitializer) obj).lambda$delayAfterFirstFrame$0((Context) obj2);
                break;
            case 7:
                ((WebViewCompat.WebViewStartUpCallback) obj).onSuccess((WebViewStartUpResult) obj2);
                break;
            case 8:
                ExtensionEmbeddingBackend.SplitListenerWrapper.accept$lambda$1((ExtensionEmbeddingBackend.SplitListenerWrapper) obj, (ArrayList) obj2);
                break;
            case 9:
                SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.accept$lambda$0((SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) obj, (WindowLayoutInfo) obj2);
                break;
            case 10:
                ((AppLovinFullscreenActivity) obj).m53a((Long) obj2);
                break;
            case 11:
                ((AppLovinFullscreenActivity) obj).m50a((C1093m2) obj2);
                break;
            case 12:
                ((C0962a) obj).m170b((MotionEvent) obj2);
                break;
            case 13:
                ((C0962a) obj).m172b((WebView) obj2);
                break;
            case 14:
                ((C0962a) obj).m163a((AppLovinAd) obj2);
                break;
            case 15:
                ((C1234b) obj).m3066b((AppLovinNativeAdImpl) obj2);
                break;
            case 16:
                ((ImageView) obj).setImageBitmap((Bitmap) obj2);
                break;
            case 17:
                ((AppLovinAdapterAdViewListener) obj).lambda$adReceived$0((AppLovinAd) obj2);
                break;
            case 18:
                IronSourceThreadManager.m8533a((Runnable) obj, (CountDownLatch) obj2);
                break;
            case 19:
                ((C3657v) obj).m12162j((String) obj2);
                break;
            case 20:
                ((C3657v.r) obj).m12245b((String) obj2);
                break;
            case 21:
                UnityAdsImplementation.lambda$load$1((IUnityAdsLoadListener) obj, (String) obj2);
                break;
            case 22:
                ((BiddingBaseManager) obj).lambda$uploadSignals$2((BiddingSignals) obj2);
                break;
            case 23:
                ((BiddingBaseManager) obj).lambda$onUnityAdsTokenReady$0((String) obj2);
                break;
            case 24:
                ((ShowOperationState) obj).lambda$onUnityAdsShowStart$2((String) obj2);
                break;
            case 25:
                ((ShowOperationState) obj).lambda$onUnityAdsShowComplete$3((UnityAds.UnityAdsShowCompletionState) obj2);
                break;
            case 26:
                FlutterFirebaseCorePlugin.lambda$delete$8((String) obj, (TaskCompletionSource) obj2);
                break;
            case 27:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0((Oooo0) obj, (TaskCompletionSource) obj2);
                break;
            case 28:
                FirebaseRemoteConfigPlugin.didReinitializeFirebaseCore$lambda$1((FirebaseRemoteConfigPlugin) obj, (TaskCompletionSource) obj2);
                break;
            default:
                ((EventChannel.EventSink) obj).success((ArrayList) obj2);
                break;
        }
    }
}

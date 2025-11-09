package OooOo0o;

import OooO0oo.o00Oo0;
import OoooOOO.o0O0oo00;
import androidx.core.util.Consumer;
import androidx.webkit.WebViewCompat;
import androidx.window.area.WindowAreaControllerImpl;
import androidx.window.area.WindowAreaPresentationSessionCallback;
import androidx.window.area.WindowAreaSessionCallback;
import androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi0;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1211b;
import com.applovin.impl.sdk.C1215f;
import com.applovin.impl.sdk.C1221l;
import com.applovin.impl.sdk.network.C1236b;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.view.ScarBannerContainer;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import o00000O0.OooO0o;
import o000oOoo.o000O00O;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13644OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f13645OooOo0o;

    public /* synthetic */ o000oOoO(Object obj, int i) {
        this.f13644OooOo0O = i;
        this.f13645OooOo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        String str;
        switch (this.f13644OooOo0O) {
            case 0:
                o0OoOo0 o0oooo0 = (o0OoOo0) this.f13645OooOo0o;
                o0oooo0.getClass();
                ((OooOo.OooOo) o0oooo0.f13649OooO0Oo).OooO0o(new o00Oo0(o0oooo0, 5));
                return;
            case 1:
                WebViewCompat.lambda$startUpWebView$2((WebViewCompat.WebViewStartUpCallback) this.f13645OooOo0o);
                return;
            case 2:
                WindowAreaControllerImpl.presentContentOnWindowArea$lambda$2((WindowAreaPresentationSessionCallback) this.f13645OooOo0o);
                return;
            case 3:
                WindowAreaControllerImpl.transferActivityToWindowArea$lambda$1((WindowAreaSessionCallback) this.f13645OooOo0o);
                return;
            case 4:
                WindowAreaControllerImpl.RearDisplaySessionConsumer.onSessionFinished$lambda$2((WindowAreaControllerImpl.RearDisplaySessionConsumer) this.f13645OooOo0o);
                return;
            case 5:
                ExtensionWindowBackendApi0.registerLayoutChangeCallback$lambda$0((Consumer) this.f13645OooOo0o);
                return;
            case 6:
                ((AppLovinFullscreenActivity) this.f13645OooOo0o).m55c();
                return;
            case 7:
                AppLovinBroadcastManager.sendBroadcastSync((CommunicatorMessageImpl) this.f13645OooOo0o, null);
                return;
            case 8:
                ((MaxFullscreenAdImpl) this.f13645OooOo0o).m1630c();
                return;
            case 9:
                ((MaxFullscreenAdImpl.C1111b) this.f13645OooOo0o).m1646a();
                return;
            case 10:
                ((C1211b) this.f13645OooOo0o).m2656c();
                return;
            case 11:
                ((C1215f) this.f13645OooOo0o).m2711i();
                return;
            case 12:
                ((C1221l) this.f13645OooOo0o).m2948S();
                return;
            case 13:
                ((C1236b) this.f13645OooOo0o).m3125e();
                return;
            case 14:
                ((MaxNativeAdView) this.f13645OooOo0o).m3927a();
                return;
            case 15:
                ((MaxAdPlacer) this.f13645OooOo0o).m3936b();
                return;
            case 16:
                ((IUnityAdsTokenListener) this.f13645OooOo0o).onUnityAdsTokenReady(null);
                return;
            case 17:
                ((BiddingBaseManager) this.f13645OooOo0o).lambda$fetchSignals$1();
                return;
            case 18:
                ((ShowOperationState) this.f13645OooOo0o).lambda$onUnityAdsShowClick$1();
                return;
            case 19:
                ((BannerView) this.f13645OooOo0o).lambda$addScarContainer$0();
                return;
            case 20:
                ScarBannerContainer.lambda$destroy$0((ScarBannerContainer) this.f13645OooOo0o);
                return;
            case 21:
                ((PlatformViewsController) this.f13645OooOo0o).lambda$onEndFrame$3();
                return;
            case 22:
                ((OooO0o) this.f13645OooOo0o).OooOo00(true);
                return;
            case 23:
                o00000O0.OooOOO0 oooOOO0 = (o00000O0.OooOOO0) this.f13645OooOo0o;
                boolean zIsPopupShowing = oooOOO0.f29161OooO0o0.isPopupShowing();
                oooOOO0.OooOo00(zIsPopupShowing);
                oooOOO0.f29164OooOO0 = zIsPopupShowing;
                return;
            case 24:
                o000O0Oo.OooO0o oooO0o = (o000O0Oo.OooO0o) this.f13645OooOo0o;
                synchronized (((AtomicMarkableReference) oooO0o.f30142OooOoo)) {
                    try {
                        z = false;
                        if (((AtomicMarkableReference) oooO0o.f30142OooOoo).isMarked()) {
                            str = (String) ((AtomicMarkableReference) oooO0o.f30142OooOoo).getReference();
                            ((AtomicMarkableReference) oooO0o.f30142OooOoo).set(str, false);
                            z = true;
                        } else {
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    ((o000Oo0.OooOOO0) oooO0o.f30136OooOo).OooOO0((String) oooO0o.f30138OooOo0o, str);
                    return;
                }
                return;
            case 25:
                o0O0oo00 o0o0oo00 = (o0O0oo00) this.f13645OooOo0o;
                Map mapUnmodifiableMap = null;
                ((AtomicReference) o0o0oo00.f14468OooOo).set(null);
                synchronized (o0o0oo00) {
                    if (((AtomicMarkableReference) o0o0oo00.f14470OooOo0o).isMarked()) {
                        o000Oo0.OooO oooO = (o000Oo0.OooO) ((AtomicMarkableReference) o0o0oo00.f14470OooOo0o).getReference();
                        synchronized (oooO) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(oooO.f30324OooO00o));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) o0o0oo00.f14470OooOo0o;
                        atomicMarkableReference.set((o000Oo0.OooO) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    o000O0Oo.OooO0o oooO0o2 = (o000O0Oo.OooO0o) o0o0oo00.f14471OooOoO0;
                    ((o000Oo0.OooOOO0) oooO0o2.f30136OooOo).OooO0oo((String) oooO0o2.f30138OooOo0o, mapUnmodifiableMap, o0o0oo00.f14469OooOo0O);
                    return;
                }
                return;
            case 26:
                LevelPlayNativeAd.m10054a((LevelPlayNativeAd) this.f13645OooOo0o);
                return;
            case 27:
                ((MethodChannel.Result) this.f13645OooOo0o).notImplemented();
                return;
            default:
                ((o000O00O) this.f13645OooOo0o).f31002OooO00o.notImplemented();
                return;
        }
    }
}

package com.unity3d.services.ads.gmascar;

import OooO0oO.OooOo;
import OooO0oO.Oooo0;
import Oooo.OooOOOO;
import Oooo0oO.o00000;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.unity3d.scar.adapter.common.OooO;
import com.unity3d.scar.adapter.common.OooO00o;
import com.unity3d.scar.adapter.common.OooO0O0;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.ads.gmascar.finder.GMAInitializer;
import com.unity3d.services.ads.gmascar.finder.PresenceDetector;
import com.unity3d.services.ads.gmascar.finder.ScarVersionFinder;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.ads.gmascar.handlers.SignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.timer.DefaultIntervalTimerFactory;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import o00000oO.OooOOO0;
import o000Oo0O.OooOo00;
import o000ooOO.o000O0;
import o000ooOO.o000O0Oo;
import o000ooOO.o000OO0O;
import o000ooo.o0000O00;
import o00Oo0oo.o00oO0o;

/* loaded from: classes3.dex */
public class GMAScarAdapterBridge {
    private final AdapterStatusBridge _adapterStatusBridge;
    private final GMAEventSender _gmaEventSender;
    private final GMAInitializer _gmaInitializer;
    private final InitializeListenerBridge _initializationListenerBridge;
    private final InitializationStatusBridge _initializationStatusBridge;
    private final MobileAdsBridgeBase _mobileAdsBridge;
    private final PresenceDetector _presenceDetector;
    private OooO _scarAdapter;
    private final ScarAdapterFactory _scarAdapterFactory;
    private final ScarVersionFinder _scarVersionFinder;
    private final WebViewErrorHandler _webViewErrorHandler;

    public GMAScarAdapterBridge(MobileAdsBridgeBase mobileAdsBridgeBase, InitializeListenerBridge initializeListenerBridge, InitializationStatusBridge initializationStatusBridge, AdapterStatusBridge adapterStatusBridge, WebViewErrorHandler webViewErrorHandler, ScarAdapterFactory scarAdapterFactory, GMAEventSender gMAEventSender) {
        this._initializationStatusBridge = initializationStatusBridge;
        this._initializationListenerBridge = initializeListenerBridge;
        this._adapterStatusBridge = adapterStatusBridge;
        this._webViewErrorHandler = webViewErrorHandler;
        this._scarAdapterFactory = scarAdapterFactory;
        this._mobileAdsBridge = mobileAdsBridgeBase;
        this._gmaEventSender = gMAEventSender;
        PresenceDetector presenceDetector = new PresenceDetector(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge);
        this._presenceDetector = presenceDetector;
        GMAInitializer gMAInitializer = new GMAInitializer(mobileAdsBridgeBase, initializeListenerBridge, initializationStatusBridge, adapterStatusBridge, gMAEventSender);
        this._gmaInitializer = gMAInitializer;
        this._scarVersionFinder = new ScarVersionFinder(mobileAdsBridgeBase, presenceDetector, gMAInitializer, gMAEventSender);
    }

    private OooO getScarAdapterObject() {
        MobileAdsBridgeBase mobileAdsBridgeBase;
        if (this._scarAdapter == null && (mobileAdsBridgeBase = this._mobileAdsBridge) != null) {
            this._scarAdapter = this._scarAdapterFactory.createScarAdapter(mobileAdsBridgeBase.getAdapterVersion(this._scarVersionFinder.getVersionCode()), this._webViewErrorHandler);
        }
        return this._scarAdapter;
    }

    private EventSubject getScarEventSubject(Integer num) {
        return new EventSubject(new ArrayDeque(Arrays.asList(OooO0O0.f28645OoooO00, OooO0O0.f28644OoooO0, OooO0O0.f28646OoooO0O, OooO0O0.f28643OoooO)), num, new DefaultIntervalTimerFactory());
    }

    private void loadInterstitialAd(o000O0Oo o000o0oo2) {
        this._scarAdapter.OooO00o(ClientProperties.getApplicationContext(), o000o0oo2, new ScarInterstitialAdHandler(o000o0oo2, getScarEventSubject(o000o0oo2.f31117OooO0o0), this._gmaEventSender));
    }

    private void loadRewardedAd(o000O0Oo o000o0oo2) {
        this._scarAdapter.OooO0OO(ClientProperties.getApplicationContext(), o000o0oo2, new ScarRewardedAdHandler(o000o0oo2, getScarEventSubject(o000o0oo2.f31117OooO0o0), this._gmaEventSender));
    }

    public void getSCARBiddingSignals(List<o000OO0O> list, BiddingSignalsHandler biddingSignalsHandler) throws IllegalAccessException, Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, OooOOOO, InvocationTargetException {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase == null || !mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
            return;
        }
        OooO scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        Context applicationContext = ClientProperties.getApplicationContext();
        o00000 o00000Var = ((o0000O00) scarAdapterObject).f31122OooO00o;
        o00000Var.getClass();
        Oooo0 oooo0 = new Oooo0(9, (byte) 0);
        OooOo00 oooOo00 = new OooOo00(11);
        for (o000OO0O o000oo0o : list) {
            oooo0.OooO0Oo();
            o00000Var.OooO(applicationContext, o000oo0o, oooo0, oooOo00);
        }
        OooOOO0 oooOOO0 = new OooOOO0(24, biddingSignalsHandler, oooOo00);
        oooo0.f13283OooOo = oooOOO0;
        if (oooo0.f13285OooOo0o <= 0) {
            oooOOO0.run();
        }
    }

    public void getSCARSignal(String str, o000OO0O o000oo0o) throws IllegalAccessException, Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, OooOOOO, InvocationTargetException {
        this._scarAdapter = getScarAdapterObject();
        SignalsHandler signalsHandler = new SignalsHandler(this._gmaEventSender);
        OooO oooO = this._scarAdapter;
        if (oooO == null) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.OooOOO0) new OooO00o(OooO0O0.f28631OooOooo, "Could not create SCAR adapter object", "Could not create SCAR adapter object"));
            return;
        }
        Context applicationContext = ClientProperties.getApplicationContext();
        o00000 o00000Var = ((o0000O00) oooO).f31122OooO00o;
        o00000Var.getClass();
        Oooo0 oooo0 = new Oooo0(9, (byte) 0);
        OooOo00 oooOo00 = new OooOo00(11);
        oooo0.OooO0Oo();
        o00000Var.OooO0oo(applicationContext, str, o000oo0o, oooo0, oooOo00);
        OooOOO0 oooOOO0 = new OooOOO0(24, signalsHandler, oooOo00);
        oooo0.f13283OooOo = oooOOO0;
        if (oooo0.f13285OooOo0o <= 0) {
            oooOOO0.run();
        }
    }

    public void getVersion() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this._scarVersionFinder.getVersion();
    }

    public boolean hasSCARBiddingSupport() {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            OooO scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                return true;
            }
        }
        return false;
    }

    public void initializeScar() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this._presenceDetector.areGMAClassesPresent()) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.OooOOO0) new OooO00o(OooO0O0.f28624OooOo0o, null, new Object[0]));
        } else {
            this._gmaEventSender.send(OooO0O0.f28623OooOo0O, new Object[0]);
            this._gmaInitializer.initializeGMA();
        }
    }

    public boolean isInitialized() {
        return this._gmaInitializer.isInitialized();
    }

    public void load(boolean z, String str, String str2, String str3, String str4, int i) {
        o000O0Oo o000o0oo2 = new o000O0Oo(str, str2, str4, str3, Integer.valueOf(i));
        OooO scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.OooOOO0) new OooO00o(OooO0O0.f28633Oooo0, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
        } else if (z) {
            loadInterstitialAd(o000o0oo2);
        } else {
            loadRewardedAd(o000o0oo2);
        }
    }

    public void loadBanner(Context context, BannerView bannerView, String str, o000O0Oo o000o0oo2, UnityBannerSize unityBannerSize) {
        this._scarAdapter = getScarAdapterObject();
        ScarBannerAdHandler scarBannerAdHandler = new ScarBannerAdHandler(this._gmaEventSender, str);
        OooO oooO = this._scarAdapter;
        if (oooO != null) {
            oooO.OooO0O0(context, bannerView, o000o0oo2, unityBannerSize.getWidth(), unityBannerSize.getHeight(), scarBannerAdHandler);
        } else {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.BANNER, BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, str);
        }
    }

    public void show(String str, String str2) {
        OooO scarAdapterObject = getScarAdapterObject();
        this._scarAdapter = scarAdapterObject;
        if (scarAdapterObject == null) {
            this._webViewErrorHandler.handleError((com.unity3d.scar.adapter.common.OooOOO0) new OooO00o(OooO0O0.f28639Oooo0o, "Scar Adapter object is null", str, str2, "Scar Adapter object is null"));
            return;
        }
        Activity activity = ClientProperties.getActivity();
        o0000O00 o0000o00 = (o0000O00) scarAdapterObject;
        o000O0 o000o0 = (o000O0) o0000o00.f31123OooO0O0.get(str);
        if (o000o0 != null) {
            o0000o00.f31124OooO0OO = o000o0;
            o00oO0o.OooOO0(new OooOOO0(o0000o00, false, activity, 22));
        } else {
            String strOooOO0O = OooOo.OooOO0O("Could not find ad for placement '", str, "'.");
            o0000o00.f31125OooO0Oo.handleError(new OooO00o(OooO0O0.f28638Oooo0OO, strOooOO0O, str, str2, strOooOO0O));
        }
    }

    public void getSCARBiddingSignals(boolean z, BiddingSignalsHandler biddingSignalsHandler) throws IllegalAccessException, Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, OooOOOO, InvocationTargetException {
        MobileAdsBridgeBase mobileAdsBridgeBase = this._mobileAdsBridge;
        if (mobileAdsBridgeBase != null && mobileAdsBridgeBase.hasSCARBiddingSupport()) {
            OooO scarAdapterObject = getScarAdapterObject();
            this._scarAdapter = scarAdapterObject;
            if (scarAdapterObject != null) {
                Context applicationContext = ClientProperties.getApplicationContext();
                o00000 o00000Var = ((o0000O00) scarAdapterObject).f31122OooO00o;
                o00000Var.getClass();
                Oooo0 oooo0 = new Oooo0(9, (byte) 0);
                OooOo00 oooOo00 = new OooOo00(11);
                oooo0.OooO0Oo();
                o00000Var.OooO(applicationContext, o000OO0O.f31119OooOo0O, oooo0, oooOo00);
                oooo0.OooO0Oo();
                o00000Var.OooO(applicationContext, o000OO0O.f31120OooOo0o, oooo0, oooOo00);
                if (z) {
                    oooo0.OooO0Oo();
                    o00000Var.OooO(applicationContext, o000OO0O.f31118OooOo, oooo0, oooOo00);
                }
                OooOOO0 oooOOO0 = new OooOOO0(24, biddingSignalsHandler, oooOo00);
                oooo0.f13283OooOo = oooOOO0;
                if (oooo0.f13285OooOo0o <= 0) {
                    oooOOO0.run();
                    return;
                }
                return;
            }
            biddingSignalsHandler.onSignalsCollectionFailed("Could not create SCAR adapter object.");
            return;
        }
        biddingSignalsHandler.onSignalsCollectionFailed("SCAR bidding unsupported.");
    }
}

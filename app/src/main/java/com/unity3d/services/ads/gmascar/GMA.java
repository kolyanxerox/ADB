package com.unity3d.services.ads.gmascar;

import Oooo.OooOOOO;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory;
import com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge;
import com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeFactory;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import o000ooOO.o000OO0O;

/* loaded from: classes3.dex */
public class GMA {
    private static GMA instance;
    private final GMAScarAdapterBridge _gmaScarAdapterBridge;

    private GMA(GMAEventSender gMAEventSender) {
        this._gmaScarAdapterBridge = new GMAScarAdapterBridge(new MobileAdsBridgeFactory().createMobileAdsBridge(), new InitializeListenerBridge(), new InitializationStatusBridge(), new AdapterStatusBridge(), new WebViewErrorHandler(gMAEventSender), new ScarAdapterFactory(), gMAEventSender);
    }

    public static GMA getInstance() {
        return getInstance(new GMAEventSender());
    }

    public GMAScarAdapterBridge getBridge() {
        return this._gmaScarAdapterBridge;
    }

    public void getSCARBiddingSignals(boolean z, IBiddingSignalsListener iBiddingSignalsListener) throws IllegalAccessException, Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException, IllegalArgumentException, OooOOOO, InvocationTargetException {
        this._gmaScarAdapterBridge.getSCARBiddingSignals(z, new BiddingSignalsHandler(z, iBiddingSignalsListener));
    }

    public boolean hasSCARBiddingSupport() {
        return this._gmaScarAdapterBridge.hasSCARBiddingSupport();
    }

    public static GMA getInstance(GMAEventSender gMAEventSender) {
        if (instance == null) {
            instance = new GMA(gMAEventSender);
        }
        return instance;
    }

    public void getSCARBiddingSignals(List<o000OO0O> list, IBiddingSignalsListener iBiddingSignalsListener) {
        this._gmaScarAdapterBridge.getSCARBiddingSignals(list, new BiddingSignalsHandler(list.contains(o000OO0O.f31118OooOo), iBiddingSignalsListener));
    }
}

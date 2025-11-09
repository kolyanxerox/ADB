package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.banners.BannerViewCache;
import kotlin.jvm.internal.OooOo;
import o00O0oOo.o0000O00;
import o00O0oOo.o000OO;

/* loaded from: classes3.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {
    private final o000OO adPlayerScope;
    private final AdRepository adRepository;
    private final o0000O00 defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final LifecycleDataSource lifecycleDataSource;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, SendDiagnosticEvent sendDiagnosticEvent, o0000O00 defaultDispatcher, o000OO adPlayerScope, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, AdRepository adRepository, LifecycleDataSource lifecycleDataSource) {
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        OooOo.OooO0o0(adPlayerScope, "adPlayerScope");
        OooOo.OooO0o0(openMeasurementRepository, "openMeasurementRepository");
        OooOo.OooO0o0(scarManager, "scarManager");
        OooOo.OooO0o0(offerwallManager, "offerwallManager");
        OooOo.OooO0o0(adRepository, "adRepository");
        OooOo.OooO0o0(lifecycleDataSource, "lifecycleDataSource");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = defaultDispatcher;
        this.adPlayerScope = adPlayerScope;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.adRepository = adRepository;
        this.lifecycleDataSource = lifecycleDataSource;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    public AdPlayer invoke(WebViewBridge webviewBridge, AndroidWebViewContainer webviewContainer, ByteString opportunityId) {
        OooOo.OooO0o0(webviewBridge, "webviewBridge");
        OooOo.OooO0o0(webviewContainer, "webviewContainer");
        OooOo.OooO0o0(opportunityId, "opportunityId");
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webviewBridge, this.deviceInfoRepository, this.sessionRepository, this.defaultDispatcher, this.sendDiagnosticEvent, webviewContainer, this.adPlayerScope);
        if (BannerViewCache.getInstance().getBannerView(ProtobufExtensionsKt.toUUID(opportunityId).toString()) != null) {
            String string = ProtobufExtensionsKt.toUUID(opportunityId).toString();
            OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            ScarManager scarManager = this.scarManager;
            LifecycleDataSource lifecycleDataSource = this.lifecycleDataSource;
            OooOo.OooO0Oo(string, "toString()");
            return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, string, webviewContainer, openMeasurementRepository, scarManager, lifecycleDataSource);
        }
        String string2 = ProtobufExtensionsKt.toUUID(opportunityId).toString();
        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        SessionRepository sessionRepository = this.sessionRepository;
        OpenMeasurementRepository openMeasurementRepository2 = this.openMeasurementRepository;
        ScarManager scarManager2 = this.scarManager;
        OfferwallManager offerwallManager = this.offerwallManager;
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        AdRepository adRepository = this.adRepository;
        OooOo.OooO0Oo(string2, "toString()");
        return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, string2, webviewContainer, deviceInfoRepository, sessionRepository, openMeasurementRepository2, scarManager2, offerwallManager, sendDiagnosticEvent, adRepository);
    }
}

package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.OooO0O0;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import o000ooOO.o000O0Oo;

/* loaded from: classes3.dex */
public class ScarInterstitialAdHandler extends ScarAdHandlerBase {
    public ScarInterstitialAdHandler(o000O0Oo o000o0oo2, EventSubject<OooO0O0> eventSubject, GMAEventSender gMAEventSender) {
        super(o000o0oo2, eventSubject, gMAEventSender);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.OooO0o
    public void onAdClosed() {
        if (!this._eventSubject.eventQueueIsEmpty()) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    public void onAdFailedToShow(int i, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        OooO0O0 oooO0O0 = OooO0O0.f28632Oooo;
        o000O0Oo o000o0oo2 = this._scarAdMetadata;
        gMAEventSender.send(oooO0O0, o000o0oo2.f31113OooO00o, o000o0oo2.f31114OooO0O0, str, Integer.valueOf(i));
    }

    public void onAdImpression() {
        this._gmaEventSender.send(OooO0O0.f28635Oooo00O, new Object[0]);
    }

    public void onAdLeftApplication() {
        this._gmaEventSender.send(OooO0O0.f28649OoooOOo, new Object[0]);
    }

    public void onAdSkipped() {
        this._gmaEventSender.send(OooO0O0.f28648OoooOOO, new Object[0]);
    }
}

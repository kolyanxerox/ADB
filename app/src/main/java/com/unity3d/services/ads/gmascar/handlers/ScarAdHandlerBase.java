package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.OooO0O0;
import com.unity3d.scar.adapter.common.OooO0o;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import o000ooOO.o000O0Oo;

/* loaded from: classes3.dex */
public abstract class ScarAdHandlerBase implements OooO0o {
    protected final EventSubject<OooO0O0> _eventSubject;
    protected final GMAEventSender _gmaEventSender;
    protected final o000O0Oo _scarAdMetadata;

    public ScarAdHandlerBase(o000O0Oo o000o0oo2, EventSubject<OooO0O0> eventSubject, GMAEventSender gMAEventSender) {
        this._scarAdMetadata = o000o0oo2;
        this._eventSubject = eventSubject;
        this._gmaEventSender = gMAEventSender;
    }

    @Override // com.unity3d.scar.adapter.common.OooO0o
    public void onAdClicked() {
        this._gmaEventSender.send(OooO0O0.o000oOoO, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.OooO0o
    public void onAdClosed() {
        this._gmaEventSender.send(OooO0O0.f28650OoooOo0, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    @Override // com.unity3d.scar.adapter.common.OooO0o
    public void onAdFailedToLoad(int i, String str) {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        OooO0O0 oooO0O0 = OooO0O0.f28637Oooo0O0;
        o000O0Oo o000o0oo2 = this._scarAdMetadata;
        gMAEventSender.send(oooO0O0, o000o0oo2.f31113OooO00o, o000o0oo2.f31114OooO0O0, str, Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.OooO0o
    public void onAdLoaded() {
        GMAEventSender gMAEventSender = this._gmaEventSender;
        OooO0O0 oooO0O0 = OooO0O0.f28634Oooo000;
        o000O0Oo o000o0oo2 = this._scarAdMetadata;
        gMAEventSender.send(oooO0O0, o000o0oo2.f31113OooO00o, o000o0oo2.f31114OooO0O0);
    }

    @Override // com.unity3d.scar.adapter.common.OooO0o
    public void onAdOpened() {
        this._gmaEventSender.send(OooO0O0.f28640Oooo0o0, new Object[0]);
        this._eventSubject.subscribe(new IEventListener<OooO0O0>() { // from class: com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase.1
            @Override // com.unity3d.services.core.misc.IEventListener
            public void onNextEvent(OooO0O0 oooO0O0) {
                ScarAdHandlerBase.this._gmaEventSender.send(oooO0O0, new Object[0]);
            }
        });
    }
}

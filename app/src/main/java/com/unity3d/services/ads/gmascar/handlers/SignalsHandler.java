package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.OooO0O0;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import o000ooo0.OooOO0O;

/* loaded from: classes3.dex */
public class SignalsHandler implements OooOO0O {
    private GMAEventSender _gmaEventSender;

    public SignalsHandler(GMAEventSender gMAEventSender) {
        this._gmaEventSender = gMAEventSender;
    }

    @Override // o000ooo0.OooOO0O
    public void onSignalsCollected(String str) {
        this._gmaEventSender.send(OooO0O0.f28628OooOoo, str);
    }

    @Override // o000ooo0.OooOO0O
    public void onSignalsCollectionFailed(String str) {
        this._gmaEventSender.send(OooO0O0.f28630OooOooO, str);
    }
}

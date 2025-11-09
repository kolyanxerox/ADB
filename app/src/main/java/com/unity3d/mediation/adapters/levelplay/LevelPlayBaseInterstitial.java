package com.unity3d.mediation.adapters.levelplay;

import com.ironsource.InterfaceC2634a8;
import com.ironsource.mediationsdk.adunit.adapter.BaseInterstitial;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public abstract class LevelPlayBaseInterstitial<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseInterstitial<NetworkAdapter> implements InterfaceC2634a8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseInterstitial(NetworkSettings networkSettings) {
        super(networkSettings);
        OooOo.OooO0o0(networkSettings, "networkSettings");
    }

    @Override // com.ironsource.InterfaceC2634a8
    public void collectBiddingData(AdData adData, BiddingDataCallback biddingDataCallback) {
        OooOo.OooO0o0(biddingDataCallback, "biddingDataCallback");
    }
}

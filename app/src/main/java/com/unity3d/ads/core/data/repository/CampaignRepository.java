package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import gatewayprotocol.p014v1.CampaignStateOuterClass;

/* loaded from: classes3.dex */
public interface CampaignRepository {
    CampaignStateOuterClass.Campaign getCampaign(ByteString byteString);

    CampaignStateOuterClass.CampaignState getCampaignState();

    void removeState(ByteString byteString);

    void setCampaign(ByteString byteString, CampaignStateOuterClass.Campaign campaign);

    void setLoadTimestamp(ByteString byteString);

    void setShowTimestamp(ByteString byteString);
}

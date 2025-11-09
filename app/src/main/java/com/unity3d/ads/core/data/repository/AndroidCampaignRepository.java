package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.p014v1.CampaignKt;
import gatewayprotocol.p014v1.CampaignStateKt;
import gatewayprotocol.p014v1.CampaignStateOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;
import o00O0.o0O0O00;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public final class AndroidCampaignRepository implements CampaignRepository {
    private final o0OO campaigns;
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(GetSharedDataTimestamps getSharedDataTimestamps) {
        OooOo.OooO0o0(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.campaigns = o0o0000.OooO0OO(o00oO0o.f31247OooOo0O);
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.Campaign getCampaign(ByteString opportunityId) {
        OooOo.OooO0o0(opportunityId, "opportunityId");
        return (CampaignStateOuterClass.Campaign) ((Map) ((oO00000o) this.campaigns).getValue()).get(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Collection collectionValues = ((Map) ((oO00000o) this.campaigns).getValue()).values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionValues) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder builderNewBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        CampaignStateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllShownCampaigns(dsl_create.getShownCampaigns(), arrayList);
        dsl_create.addAllLoadedCampaigns(dsl_create.getLoadedCampaigns(), arrayList2);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(ByteString opportunityId) {
        oO00000o oo00000o;
        Object value;
        LinkedHashMap linkedHashMapOooOoO0;
        OooOo.OooO0o0(opportunityId, "opportunityId");
        o0OO o0oo = this.campaigns;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            Map map = (Map) value;
            String stringUtf8 = opportunityId.toStringUtf8();
            OooOo.OooO0Oo(stringUtf8, "opportunityId.toStringUtf8()");
            OooOo.OooO0o0(map, "<this>");
            linkedHashMapOooOoO0 = o0O0O00.OooOoO0(map);
            linkedHashMapOooOoO0.remove(stringUtf8);
        } while (!oo00000o.OooO0oO(value, o0O0O00.OooOOoo(linkedHashMapOooOoO0)));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(ByteString opportunityId, CampaignStateOuterClass.Campaign campaign) {
        oO00000o oo00000o;
        Object value;
        OooOo.OooO0o0(opportunityId, "opportunityId");
        OooOo.OooO0o0(campaign, "campaign");
        o0OO o0oo = this.campaigns;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value, o0O0O00.OooOo0((Map) value, new OooOO0(opportunityId.toStringUtf8(), campaign))));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(ByteString opportunityId) {
        OooOo.OooO0o0(opportunityId, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            OooOo.OooO0Oo(builder, "this.toBuilder()");
            CampaignKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            setCampaign(opportunityId, dsl_create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(ByteString opportunityId) {
        OooOo.OooO0o0(opportunityId, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            OooOo.OooO0Oo(builder, "this.toBuilder()");
            CampaignKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            setCampaign(opportunityId, dsl_create._build());
        }
    }
}

package gatewayprotocol.p014v1;

import gatewayprotocol.p014v1.CampaignKt;
import gatewayprotocol.p014v1.CampaignStateOuterClass;
import gatewayprotocol.p014v1.TimestampsOuterClass;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes3.dex */
public final class CampaignKtKt {
    /* renamed from: -initializecampaign */
    public static final CampaignStateOuterClass.Campaign m13812initializecampaign(Oooo000 block) {
        OooOo.OooO0o0(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
        CampaignStateOuterClass.Campaign.Builder builderNewBuilder = CampaignStateOuterClass.Campaign.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        CampaignKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CampaignStateOuterClass.Campaign copy(CampaignStateOuterClass.Campaign campaign, Oooo000 block) {
        OooOo.OooO0o0(campaign, "<this>");
        OooOo.OooO0o0(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
        CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
        OooOo.OooO0Oo(builder, "this.toBuilder()");
        CampaignKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TimestampsOuterClass.Timestamps getLoadTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        OooOo.OooO0o0(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasLoadTimestamp()) {
            return campaignOrBuilder.getLoadTimestamp();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getShowTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        OooOo.OooO0o0(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasShowTimestamp()) {
            return campaignOrBuilder.getShowTimestamp();
        }
        return null;
    }
}

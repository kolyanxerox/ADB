package gatewayprotocol.p014v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.p014v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.p014v1.CampaignStateOuterClass;
import gatewayprotocol.p014v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.p014v1.SessionCountersOuterClass;
import gatewayprotocol.p014v1.StaticDeviceInfoOuterClass;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class AdDataRefreshRequestKt {
    public static final AdDataRefreshRequestKt INSTANCE = new AdDataRefreshRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builder) {
                OooOo.OooO0o0(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builder, OooOO0O oooOO0O) {
            this(builder);
        }

        public final /* synthetic */ AdDataRefreshRequestOuterClass.AdDataRefreshRequest _build() {
            AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequestBuild = this._builder.build();
            OooOo.OooO0Oo(adDataRefreshRequestBuild, "_builder.build()");
            return adDataRefreshRequestBuild;
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
        }

        public final void clearCampaignState() {
            this._builder.clearCampaignState();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final ByteString getAdDataRefreshToken() {
            ByteString adDataRefreshToken = this._builder.getAdDataRefreshToken();
            OooOo.OooO0Oo(adDataRefreshToken, "_builder.getAdDataRefreshToken()");
            return adDataRefreshToken;
        }

        public final CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this._builder.getCampaignState();
            OooOo.OooO0Oo(campaignState, "_builder.getCampaignState()");
            return campaignState;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            OooOo.OooO0Oo(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            OooOo.OooO0Oo(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            OooOo.OooO0Oo(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            OooOo.OooO0Oo(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final boolean hasCampaignState() {
            return this._builder.hasCampaignState();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setAdDataRefreshToken(ByteString value) {
            OooOo.OooO0o0(value, "value");
            this._builder.setAdDataRefreshToken(value);
        }

        public final void setCampaignState(CampaignStateOuterClass.CampaignState value) {
            OooOo.OooO0o0(value, "value");
            this._builder.setCampaignState(value);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo value) {
            OooOo.OooO0o0(value, "value");
            this._builder.setDynamicDeviceInfo(value);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            OooOo.OooO0o0(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
            OooOo.OooO0o0(value, "value");
            this._builder.setSessionCounters(value);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo value) {
            OooOo.OooO0o0(value, "value");
            this._builder.setStaticDeviceInfo(value);
        }

        private Dsl(AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private AdDataRefreshRequestKt() {
    }
}

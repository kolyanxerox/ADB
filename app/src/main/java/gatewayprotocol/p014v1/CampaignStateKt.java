package gatewayprotocol.p014v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.p014v1.CampaignStateOuterClass;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class CampaignStateKt {
    public static final CampaignStateKt INSTANCE = new CampaignStateKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.CampaignState.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.CampaignState.Builder builder) {
                OooOo.OooO0o0(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class LoadedCampaignsProxy extends DslProxy {
            private LoadedCampaignsProxy() {
            }
        }

        public static final class ShownCampaignsProxy extends DslProxy {
            private ShownCampaignsProxy() {
            }
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.CampaignState.Builder builder, OooOO0O oooOO0O) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.CampaignState _build() {
            CampaignStateOuterClass.CampaignState campaignStateBuild = this._builder.build();
            OooOo.OooO0Oo(campaignStateBuild, "_builder.build()");
            return campaignStateBuild;
        }

        public final /* synthetic */ void addAllLoadedCampaigns(DslList dslList, Iterable values) {
            OooOo.OooO0o0(dslList, "<this>");
            OooOo.OooO0o0(values, "values");
            this._builder.addAllLoadedCampaigns(values);
        }

        public final /* synthetic */ void addAllShownCampaigns(DslList dslList, Iterable values) {
            OooOo.OooO0o0(dslList, "<this>");
            OooOo.OooO0o0(values, "values");
            this._builder.addAllShownCampaigns(values);
        }

        public final /* synthetic */ void addLoadedCampaigns(DslList dslList, CampaignStateOuterClass.Campaign value) {
            OooOo.OooO0o0(dslList, "<this>");
            OooOo.OooO0o0(value, "value");
            this._builder.addLoadedCampaigns(value);
        }

        public final /* synthetic */ void addShownCampaigns(DslList dslList, CampaignStateOuterClass.Campaign value) {
            OooOo.OooO0o0(dslList, "<this>");
            OooOo.OooO0o0(value, "value");
            this._builder.addShownCampaigns(value);
        }

        public final /* synthetic */ void clearLoadedCampaigns(DslList dslList) {
            OooOo.OooO0o0(dslList, "<this>");
            this._builder.clearLoadedCampaigns();
        }

        public final /* synthetic */ void clearShownCampaigns(DslList dslList) {
            OooOo.OooO0o0(dslList, "<this>");
            this._builder.clearShownCampaigns();
        }

        public final /* synthetic */ DslList getLoadedCampaigns() {
            List<CampaignStateOuterClass.Campaign> loadedCampaignsList = this._builder.getLoadedCampaignsList();
            OooOo.OooO0Oo(loadedCampaignsList, "_builder.getLoadedCampaignsList()");
            return new DslList(loadedCampaignsList);
        }

        public final /* synthetic */ DslList getShownCampaigns() {
            List<CampaignStateOuterClass.Campaign> shownCampaignsList = this._builder.getShownCampaignsList();
            OooOo.OooO0Oo(shownCampaignsList, "_builder.getShownCampaignsList()");
            return new DslList(shownCampaignsList);
        }

        public final /* synthetic */ void plusAssignAllLoadedCampaigns(DslList<CampaignStateOuterClass.Campaign, LoadedCampaignsProxy> dslList, Iterable<CampaignStateOuterClass.Campaign> values) {
            OooOo.OooO0o0(dslList, "<this>");
            OooOo.OooO0o0(values, "values");
            addAllLoadedCampaigns(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllShownCampaigns(DslList<CampaignStateOuterClass.Campaign, ShownCampaignsProxy> dslList, Iterable<CampaignStateOuterClass.Campaign> values) {
            OooOo.OooO0o0(dslList, "<this>");
            OooOo.OooO0o0(values, "values");
            addAllShownCampaigns(dslList, values);
        }

        public final /* synthetic */ void plusAssignLoadedCampaigns(DslList<CampaignStateOuterClass.Campaign, LoadedCampaignsProxy> dslList, CampaignStateOuterClass.Campaign value) {
            OooOo.OooO0o0(dslList, "<this>");
            OooOo.OooO0o0(value, "value");
            addLoadedCampaigns(dslList, value);
        }

        public final /* synthetic */ void plusAssignShownCampaigns(DslList<CampaignStateOuterClass.Campaign, ShownCampaignsProxy> dslList, CampaignStateOuterClass.Campaign value) {
            OooOo.OooO0o0(dslList, "<this>");
            OooOo.OooO0o0(value, "value");
            addShownCampaigns(dslList, value);
        }

        public final /* synthetic */ void setLoadedCampaigns(DslList dslList, int i, CampaignStateOuterClass.Campaign value) {
            OooOo.OooO0o0(dslList, "<this>");
            OooOo.OooO0o0(value, "value");
            this._builder.setLoadedCampaigns(i, value);
        }

        public final /* synthetic */ void setShownCampaigns(DslList dslList, int i, CampaignStateOuterClass.Campaign value) {
            OooOo.OooO0o0(dslList, "<this>");
            OooOo.OooO0o0(value, "value");
            this._builder.setShownCampaigns(i, value);
        }

        private Dsl(CampaignStateOuterClass.CampaignState.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignStateKt() {
    }
}

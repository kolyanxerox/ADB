package com.unity3d.ironsourceads;

import com.unity3d.ironsourceads.IronSourceAds;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.oo000o;

/* loaded from: classes3.dex */
public final class InitRequest {

    /* renamed from: a */
    private final String f13064a;

    /* renamed from: b */
    private final List<IronSourceAds.AdFormat> f13065b;

    /* renamed from: c */
    private final LogLevel f13066c;

    public static final class Builder {

        /* renamed from: a */
        private final String f13067a;

        /* renamed from: b */
        private List<? extends IronSourceAds.AdFormat> f13068b;

        /* renamed from: c */
        private LogLevel f13069c;

        public Builder(String appKey) {
            OooOo.OooO0o0(appKey, "appKey");
            this.f13067a = appKey;
        }

        public final InitRequest build() {
            String str = this.f13067a;
            List list = this.f13068b;
            if (list == null) {
                list = oo000o.f31251OooOo0O;
            }
            LogLevel logLevel = this.f13069c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, list, logLevel, null);
        }

        public final String getAppKey() {
            return this.f13067a;
        }

        public final Builder withLegacyAdFormats(List<? extends IronSourceAds.AdFormat> legacyAdFormats) {
            OooOo.OooO0o0(legacyAdFormats, "legacyAdFormats");
            this.f13068b = legacyAdFormats;
            return this;
        }

        public final Builder withLogLevel(LogLevel logLevel) {
            OooOo.OooO0o0(logLevel, "logLevel");
            this.f13069c = logLevel;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f13064a = str;
        this.f13065b = list;
        this.f13066c = logLevel;
    }

    public final String getAppKey() {
        return this.f13064a;
    }

    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.f13065b;
    }

    public final LogLevel getLogLevel() {
        return this.f13066c;
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, OooOO0O oooOO0O) {
        this(str, list, logLevel);
    }
}

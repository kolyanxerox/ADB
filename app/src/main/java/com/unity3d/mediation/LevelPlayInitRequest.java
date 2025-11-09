package com.unity3d.mediation;

import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.oo000o;

/* loaded from: classes3.dex */
public final class LevelPlayInitRequest {

    /* renamed from: a */
    private final String f13144a;

    /* renamed from: b */
    private final String f13145b;

    /* renamed from: c */
    private final List<LevelPlay.AdFormat> f13146c;

    public static final class Builder {

        /* renamed from: a */
        private final String f13147a;

        /* renamed from: b */
        private String f13148b;

        /* renamed from: c */
        private List<? extends LevelPlay.AdFormat> f13149c;

        public Builder(String appKey) {
            OooOo.OooO0o0(appKey, "appKey");
            this.f13147a = appKey;
        }

        public final LevelPlayInitRequest build() {
            String str = this.f13147a;
            String str2 = this.f13148b;
            List list = this.f13149c;
            if (list == null) {
                list = oo000o.f31251OooOo0O;
            }
            return new LevelPlayInitRequest(str, str2, list, null);
        }

        public final String getAppKey() {
            return this.f13147a;
        }

        public final Builder withLegacyAdFormats(List<? extends LevelPlay.AdFormat> legacyAdFormats) {
            OooOo.OooO0o0(legacyAdFormats, "legacyAdFormats");
            this.f13149c = legacyAdFormats;
            return this;
        }

        public final Builder withUserId(String userId) {
            OooOo.OooO0o0(userId, "userId");
            this.f13148b = userId;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.f13144a = str;
        this.f13145b = str2;
        this.f13146c = list;
    }

    public final String getAppKey() {
        return this.f13144a;
    }

    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.f13146c;
    }

    public final String getUserId() {
        return this.f13145b;
    }

    public /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, OooOO0O oooOO0O) {
        this(str, str2, list);
    }
}

package com.unity3d.ironsourceads.rewarded;

import android.os.Bundle;
import com.ironsource.C2945ap;
import com.ironsource.C3259jk;
import com.ironsource.InterfaceC2947ar;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class RewardedAdRequest {

    /* renamed from: a */
    private final String f13108a;

    /* renamed from: b */
    private final String f13109b;

    /* renamed from: c */
    private final Bundle f13110c;

    /* renamed from: d */
    private final InterfaceC2947ar f13111d;

    /* renamed from: e */
    private final String f13112e;

    public static final class Builder {

        /* renamed from: a */
        private final String f13113a;

        /* renamed from: b */
        private final String f13114b;

        /* renamed from: c */
        private Bundle f13115c;

        public Builder(String instanceId, String adm) {
            OooOo.OooO0o0(instanceId, "instanceId");
            OooOo.OooO0o0(adm, "adm");
            this.f13113a = instanceId;
            this.f13114b = adm;
        }

        public final RewardedAdRequest build() {
            IronLog.API.info("instanceId: " + this.f13113a);
            return new RewardedAdRequest(this.f13113a, this.f13114b, this.f13115c, null);
        }

        public final String getAdm() {
            return this.f13114b;
        }

        public final String getInstanceId() {
            return this.f13113a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            OooOo.OooO0o0(extraParams, "extraParams");
            this.f13115c = extraParams;
            return this;
        }
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f13108a = str;
        this.f13109b = str2;
        this.f13110c = bundle;
        this.f13111d = new C2945ap(str);
        String strM9519b = C3259jk.m9519b();
        OooOo.OooO0Oo(strM9519b, "generateMultipleUniqueInstanceId()");
        this.f13112e = strM9519b;
    }

    public final String getAdId$mediationsdk_release() {
        return this.f13112e;
    }

    public final String getAdm() {
        return this.f13109b;
    }

    public final Bundle getExtraParams() {
        return this.f13110c;
    }

    public final String getInstanceId() {
        return this.f13108a;
    }

    public final InterfaceC2947ar getProviderName$mediationsdk_release() {
        return this.f13111d;
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, OooOO0O oooOO0O) {
        this(str, str2, bundle);
    }
}

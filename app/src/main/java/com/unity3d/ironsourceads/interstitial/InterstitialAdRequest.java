package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.C2945ap;
import com.ironsource.C3259jk;
import com.ironsource.InterfaceC2947ar;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class InterstitialAdRequest {

    /* renamed from: a */
    private final String f13095a;

    /* renamed from: b */
    private final String f13096b;

    /* renamed from: c */
    private final Bundle f13097c;

    /* renamed from: d */
    private final InterfaceC2947ar f13098d;

    /* renamed from: e */
    private final String f13099e;

    public static final class Builder {

        /* renamed from: a */
        private final String f13100a;

        /* renamed from: b */
        private final String f13101b;

        /* renamed from: c */
        private Bundle f13102c;

        public Builder(String instanceId, String adm) {
            OooOo.OooO0o0(instanceId, "instanceId");
            OooOo.OooO0o0(adm, "adm");
            this.f13100a = instanceId;
            this.f13101b = adm;
        }

        public final InterstitialAdRequest build() {
            IronLog.API.info("instanceId: " + this.f13100a);
            return new InterstitialAdRequest(this.f13100a, this.f13101b, this.f13102c, null);
        }

        public final String getAdm() {
            return this.f13101b;
        }

        public final String getInstanceId() {
            return this.f13100a;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            OooOo.OooO0o0(extraParams, "extraParams");
            this.f13102c = extraParams;
            return this;
        }
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f13095a = str;
        this.f13096b = str2;
        this.f13097c = bundle;
        this.f13098d = new C2945ap(str);
        String strM9519b = C3259jk.m9519b();
        OooOo.OooO0Oo(strM9519b, "generateMultipleUniqueInstanceId()");
        this.f13099e = strM9519b;
    }

    public final String getAdId$mediationsdk_release() {
        return this.f13099e;
    }

    public final String getAdm() {
        return this.f13096b;
    }

    public final Bundle getExtraParams() {
        return this.f13097c;
    }

    public final String getInstanceId() {
        return this.f13095a;
    }

    public final InterfaceC2947ar getProviderName$mediationsdk_release() {
        return this.f13098d;
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, OooOO0O oooOO0O) {
        this(str, str2, bundle);
    }
}

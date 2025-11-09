package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C2945ap;
import com.ironsource.C3259jk;
import com.ironsource.InterfaceC2947ar;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class BannerAdRequest {

    /* renamed from: a */
    private final Context f13076a;

    /* renamed from: b */
    private final String f13077b;

    /* renamed from: c */
    private final String f13078c;

    /* renamed from: d */
    private final AdSize f13079d;

    /* renamed from: e */
    private final Bundle f13080e;

    /* renamed from: f */
    private final InterfaceC2947ar f13081f;

    /* renamed from: g */
    private final String f13082g;

    public static final class Builder {

        /* renamed from: a */
        private final Context f13083a;

        /* renamed from: b */
        private final String f13084b;

        /* renamed from: c */
        private final String f13085c;

        /* renamed from: d */
        private final AdSize f13086d;

        /* renamed from: e */
        private Bundle f13087e;

        public Builder(Context context, String instanceId, String adm, AdSize size) {
            OooOo.OooO0o0(context, "context");
            OooOo.OooO0o0(instanceId, "instanceId");
            OooOo.OooO0o0(adm, "adm");
            OooOo.OooO0o0(size, "size");
            this.f13083a = context;
            this.f13084b = instanceId;
            this.f13085c = adm;
            this.f13086d = size;
        }

        public final BannerAdRequest build() {
            IronLog.API.info("instanceId: " + this.f13084b + ", size: " + this.f13086d.getSizeDescription());
            return new BannerAdRequest(this.f13083a, this.f13084b, this.f13085c, this.f13086d, this.f13087e, null);
        }

        public final String getAdm() {
            return this.f13085c;
        }

        public final Context getContext() {
            return this.f13083a;
        }

        public final String getInstanceId() {
            return this.f13084b;
        }

        public final AdSize getSize() {
            return this.f13086d;
        }

        public final Builder withExtraParams(Bundle extraParams) {
            OooOo.OooO0o0(extraParams, "extraParams");
            this.f13087e = extraParams;
            return this;
        }
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f13076a = context;
        this.f13077b = str;
        this.f13078c = str2;
        this.f13079d = adSize;
        this.f13080e = bundle;
        this.f13081f = new C2945ap(str);
        String strM9519b = C3259jk.m9519b();
        OooOo.OooO0Oo(strM9519b, "generateMultipleUniqueInstanceId()");
        this.f13082g = strM9519b;
    }

    public final String getAdId$mediationsdk_release() {
        return this.f13082g;
    }

    public final String getAdm() {
        return this.f13078c;
    }

    public final Context getContext() {
        return this.f13076a;
    }

    public final Bundle getExtraParams() {
        return this.f13080e;
    }

    public final String getInstanceId() {
        return this.f13077b;
    }

    public final InterfaceC2947ar getProviderName$mediationsdk_release() {
        return this.f13081f;
    }

    public final AdSize getSize() {
        return this.f13079d;
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, OooOO0O oooOO0O) {
        this(context, str, str2, adSize, bundle);
    }
}

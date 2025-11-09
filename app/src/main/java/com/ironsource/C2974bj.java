package com.ironsource;

import com.ironsource.C3571qt;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.bj */
/* loaded from: classes2.dex */
public final class C2974bj {

    /* renamed from: com.ironsource.bj$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7603a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7603a = iArr;
        }
    }

    /* renamed from: a */
    public final IronSourceError m7932a(C3535ps error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        return (error.m11458c() == 2070 || error.m11458c() == 2110) ? C3797wb.f12445a.m12863b() : (error.m11458c() == 2080 || error.m11458c() == 2100) ? C3797wb.f12445a.m12866c() : error.m11458c() == 2090 ? C3797wb.f12445a.m12860a() : new IronSourceError(510, error.m11459d());
    }

    /* renamed from: b */
    public final void m7937b(Runnable callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        C3523pg.f10822a.mo11396a(callback);
    }

    /* renamed from: a */
    public final void m7933a(long j, C3571qt.a responseOrigin) {
        kotlin.jvm.internal.OooOo.OooO0o0(responseOrigin, "responseOrigin");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put("isMultipleAdObjects", 1);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j);
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, responseOrigin.m11645a());
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C3495on.f10667s.m11213d().mo8698z().mo12605a(new C3899zb(EnumC2638ac.SDK_INIT_SUCCESS, mediationAdditionalData));
    }

    /* renamed from: a */
    public final void m7934a(C3535ps error, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(true);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, error.m11458c());
            mediationAdditionalData.put("reason", error.m11459d());
            mediationAdditionalData.put(IronSourceConstants.EVENTS_DURATION, j);
            mediationAdditionalData.put("isMultipleAdObjects", 1);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        C3495on.f10667s.m11213d().mo8698z().mo12605a(new C3899zb(EnumC2638ac.SDK_INIT_FAILED, mediationAdditionalData));
    }

    /* renamed from: a */
    public final void m7935a(Runnable runnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
        C3523pg.m11390a(C3523pg.f10822a, runnable, 0L, 2, (Object) null);
    }

    /* renamed from: a */
    public final IronSource.AD_UNIT[] m7936a(List<? extends IronSourceAds.AdFormat> adFormats) {
        IronSource.AD_UNIT ad_unit;
        kotlin.jvm.internal.OooOo.OooO0o0(adFormats, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = adFormats.iterator();
        while (it.hasNext()) {
            int i = a.f7603a[it.next().ordinal()];
            if (i == 1) {
                ad_unit = IronSource.AD_UNIT.BANNER;
            } else if (i == 2) {
                ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            } else if (i == 3) {
                ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            }
            arrayList.add(ad_unit);
        }
        return (IronSource.AD_UNIT[]) arrayList.toArray(new IronSource.AD_UNIT[0]);
    }
}

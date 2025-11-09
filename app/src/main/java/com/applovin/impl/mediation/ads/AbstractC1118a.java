package com.applovin.impl.mediation.ads;

import android.app.Activity;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1186s2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.applovin.impl.mediation.ads.a */
/* loaded from: classes.dex */
public abstract class AbstractC1118a {
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;
    protected MaxAdExpirationListener expirationListener;
    protected final C1240o logger;
    protected MaxAdRequestListener requestListener;
    protected MaxAdRevenueListener revenueListener;
    protected final C1220k sdk;
    protected final String tag;
    protected final Map<String, Object> localExtraParameters = Collections.synchronizedMap(new HashMap());
    protected final Map<String, Object> extraParameters = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.applovin.impl.mediation.ads.a$a */
    public interface a extends MaxAdListener, MaxAdRevenueListener, MaxAdRequestListener {
    }

    public AbstractC1118a(String str, MaxAdFormat maxAdFormat, String str2, C1220k c1220k) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = c1220k;
        this.tag = str2;
        this.logger = c1220k.m2847O();
    }

    /* renamed from: a */
    private void m1673a(String str, String str2, String str3, MaxAdFormat maxAdFormat, String str4, C1220k c1220k) {
        c1220k.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(c1220k, "reportExtraParameter", new com.applovin.impl.mediation.OooO0O0(str, str2, maxAdFormat, str3, c1220k, str4, 2)), C0987b6.b.OTHER);
    }

    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.expirationListener = null;
        this.adReviewListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Setting expiration listener: " + maxAdExpirationListener);
        }
        this.expirationListener = maxAdExpirationListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (AbstractC1078k7.m1228c(this.sdk) && ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str))) {
            throw new IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
        }
        if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
            int i = Integer.parseInt(str2);
            if (i > TimeUnit.MINUTES.toSeconds(2L)) {
                C1240o.m3207h(this.tag, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + i + "s) - this will be ignored");
            }
        }
        m1673a(str, str2, this.adUnitId, this.adFormat, "extraParameter", this.sdk);
        this.extraParameters.put(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (obj instanceof Activity) {
            if (C1240o.m3200a()) {
                this.logger.m3214b(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
            }
        } else {
            if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                setExtraParameter("is_amazon_integration", Boolean.toString(true));
            }
            m1673a(str, String.valueOf(obj), this.adUnitId, this.adFormat, "localExtraParameter", this.sdk);
            this.localExtraParameters.put(str, obj);
        }
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }

    public static void logApiCall(String str, String str2) {
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k == null) {
            return;
        }
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            C1220k.f2089D0.m2847O().m3211a(str, str2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m1672a(String str, String str2, MaxAdFormat maxAdFormat, String str3, C1220k c1220k, String str4) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), mapHashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", str3, mapHashMap);
        c1220k.m2848P().m572a(C0993c2.f522j0, str4, mapHashMap);
    }

    /* renamed from: a */
    public void m1674a(AbstractC1266v2 abstractC1266v2) {
        C1186s2 c1186s2 = new C1186s2();
        c1186s2.m2361a().m2367a("MAX Ad").m2366a(abstractC1266v2).m2361a();
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, c1186s2.toString());
        }
    }
}

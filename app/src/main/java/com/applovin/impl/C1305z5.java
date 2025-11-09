package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.network.C1238d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.z5 */
/* loaded from: classes.dex */
public class C1305z5 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final String f3237g;

    /* renamed from: h */
    private final List f3238h;

    /* renamed from: i */
    private final C1044h3 f3239i;

    /* renamed from: j */
    private final Map f3240j;

    /* renamed from: k */
    private final Map f3241k;

    /* renamed from: l */
    private final Map f3242l;

    /* renamed from: m */
    private final MaxError f3243m;

    public C1305z5(String str, List list, Map map, Map map2, MaxError maxError, C1044h3 c1044h3, C1220k c1220k, boolean z) {
        super("TaskFireMediationPostbacks", c1220k);
        this.f3237g = OooO0oO.OooOo.OooOoo0(str, "_urls");
        this.f3238h = list;
        this.f3240j = AbstractC1078k7.m1181a(map, c1220k);
        this.f3241k = map2 == null ? new HashMap() : map2;
        this.f3243m = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f3239i = c1044h3;
        HashMap map3 = new HashMap(7);
        map3.put("AppLovin-Event-Type", str);
        if (z && c1044h3 != null) {
            map3.put("AppLovin-Ad-Network-Name", c1044h3.m899c());
        }
        if (c1044h3 instanceof AbstractC1266v2) {
            AbstractC1266v2 abstractC1266v2 = (AbstractC1266v2) c1044h3;
            map3.put("AppLovin-Ad-Unit-Id", abstractC1266v2.getAdUnitId());
            map3.put("AppLovin-Ad-Format", abstractC1266v2.getFormat().getLabel());
            if (z) {
                map3.put("AppLovin-Third-Party-Ad-Placement-Id", abstractC1266v2.m3519Q());
            }
        }
        if (maxError != null) {
            map3.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map3.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f3242l = map3;
    }

    /* renamed from: a */
    private void m3881a(String str, Map map) {
        m795b().m2896f0().m3131e(C1238d.m3134b().m3174d(str).m3171c("POST").m3165a(this.f3242l).m3166a(false).m3172c(map).m3173c(((Boolean) this.f776a.m2866a(AbstractC1144o3.f1658p8)).booleanValue()).m3167a());
    }

    /* renamed from: b */
    private String m3882b(String str, Map map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull((String) map.get(str2)));
        }
        return str;
    }

    /* renamed from: e */
    private Map m3883e() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f776a.m2866a(AbstractC1144o3.f1651m7)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    /* renamed from: f */
    private List m3884f() {
        List list = this.f3238h;
        if (list != null) {
            return list;
        }
        C1044h3 c1044h3 = this.f3239i;
        if (c1044h3 != null) {
            return c1044h3.m897b(this.f3237g);
        }
        return null;
    }

    /* renamed from: g */
    private C1040h m3885g() {
        C1044h3 c1044h3 = this.f3239i;
        if (c1044h3 instanceof AbstractC1266v2) {
            return ((AbstractC1266v2) c1044h3).m3515M().m3646f();
        }
        if (c1044h3 instanceof C0986b5) {
            return ((C0986b5) c1044h3).m384u().m3646f();
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        C1040h c1040hM3885g;
        List listM3884f = m3884f();
        if (CollectionUtils.isEmpty(listM3884f)) {
            return;
        }
        Map mapM3883e = m3883e();
        Iterator it = listM3884f.iterator();
        while (it.hasNext()) {
            Uri uri = Uri.parse(m3880a(m3882b((String) it.next(), this.f3240j), this.f3243m));
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            HashMap map = new HashMap(this.f3241k);
            for (String str : uri.getQueryParameterNames()) {
                String queryParameter = uri.getQueryParameter(str);
                if (mapM3883e.containsKey(queryParameter)) {
                    C1044h3 c1044h3 = this.f3239i;
                    if (c1044h3 != null) {
                        map.put(str, c1044h3.m886a((String) mapM3883e.get(queryParameter)));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(str, queryParameter);
                }
            }
            map.putAll(this.f776a.m2827B().m2996e());
            if (((Boolean) this.f776a.m2866a(AbstractC1144o3.f1644i8)).booleanValue() && (c1040hM3885g = m3885g()) != null) {
                map.put("arn_info", c1040hM3885g.m818e());
            }
            m3881a(builderClearQuery.build().toString(), map);
        }
    }

    /* renamed from: a */
    private String m3880a(String str, MaxError maxError) {
        int mediatedNetworkErrorCode;
        String mediatedNetworkErrorMessage;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            mediatedNetworkErrorCode = maxAdapterError.getMediatedNetworkErrorCode();
            mediatedNetworkErrorMessage = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            mediatedNetworkErrorCode = 0;
            mediatedNetworkErrorMessage = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(mediatedNetworkErrorCode)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(mediatedNetworkErrorMessage));
    }
}

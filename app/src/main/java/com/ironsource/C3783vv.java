package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.vv */
/* loaded from: classes2.dex */
public final class C3783vv {

    /* renamed from: a */
    public static final C3783vv f12423a = new C3783vv();

    /* renamed from: b */
    private static final String f12424b = ",";

    /* renamed from: c */
    private static final String f12425c = "[";

    /* renamed from: d */
    private static final String f12426d = "]";

    /* renamed from: e */
    private static final int f12427e = 118;

    private C3783vv() {
    }

    /* renamed from: a */
    private final int m12825a(Context context, int i) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }

    /* renamed from: b */
    public final String m12832b(List<? extends Object> methodArgs) {
        kotlin.jvm.internal.OooOo.OooO0o0(methodArgs, "methodArgs");
        String str = new String();
        for (Object obj : methodArgs) {
            StringBuilder sbOooOo0O = OooO0oO.OooOo.OooOo0O(str);
            sbOooOo0O.append(obj instanceof List ? f12423a.m12827a((List<?>) obj) : f12423a.m12826a(obj));
            str = sbOooOo0O.toString() + ',';
        }
        return o00O0oO.o000000.OoooOoO(str, f12424b);
    }

    /* renamed from: a */
    public final ViewGroup.LayoutParams m12828a(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = m12825a(context, f12427e);
        return layoutParams;
    }

    /* renamed from: a */
    public final AdInfo m12829a(LevelPlayAdInfo levelPlayAdInfo) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(levelPlayAdInfo, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auctionId", levelPlayAdInfo.getAuctionId());
        jSONObject.put("adUnit", levelPlayAdInfo.getAdFormat());
        jSONObject.put("country", levelPlayAdInfo.getCountry());
        jSONObject.put("ab", levelPlayAdInfo.getAb());
        jSONObject.put("segmentName", levelPlayAdInfo.getSegmentName());
        jSONObject.put("placement", levelPlayAdInfo.getPlacementName());
        jSONObject.put("adNetwork", levelPlayAdInfo.getAdNetwork());
        jSONObject.put("instanceName", levelPlayAdInfo.getInstanceName());
        jSONObject.put("instanceId", levelPlayAdInfo.getInstanceId());
        jSONObject.put("precision", levelPlayAdInfo.getPrecision());
        jSONObject.put("encryptedCPM", levelPlayAdInfo.getEncryptedCPM());
        jSONObject.put("revenue", levelPlayAdInfo.getRevenue());
        return new AdInfo(new ImpressionData(jSONObject), null);
    }

    /* renamed from: a */
    public final IronSourceError m12830a(LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.OooOo.OooO0o0(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    /* renamed from: a */
    private final String m12826a(Object obj) {
        if (!(obj instanceof String)) {
            return String.valueOf(obj);
        }
        return "'" + obj + '\'';
    }

    /* renamed from: a */
    private final String m12827a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = str + f12423a.m12826a(it.next()) + ',';
        }
        return o00O0oO.o000000.OoooOoO(str, f12424b).concat("]");
    }

    /* renamed from: a */
    public final List<Object> m12831a(Object... items) {
        kotlin.jvm.internal.OooOo.OooO0o0(items, "items");
        return o00O0.OooOo.OooOOo(Arrays.copyOf(items, items.length));
    }
}

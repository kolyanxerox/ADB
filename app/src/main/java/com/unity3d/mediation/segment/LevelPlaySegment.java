package com.unity3d.mediation.segment;

import android.text.TextUtils;
import com.ironsource.C3551q9;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.Oooo000;
import oo00o.OooOO0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LevelPlaySegment {
    public static final C4203a Companion = new C4203a(null);
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String SEGMENT_NAME = "segName";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: h */
    private static final int f13171h = 999999;

    /* renamed from: i */
    private static final double f13172i = 999999.99d;

    /* renamed from: j */
    private static final int f13173j = 5;

    /* renamed from: k */
    private static final String f13174k = "custom";

    /* renamed from: c */
    private boolean f13177c;

    /* renamed from: d */
    private String f13178d;

    /* renamed from: g */
    private long f13181g;

    /* renamed from: a */
    private final ArrayList<OooOO0> f13175a = new ArrayList<>();

    /* renamed from: b */
    private final AtomicBoolean f13176b = new AtomicBoolean(false);

    /* renamed from: e */
    private int f13179e = -1;

    /* renamed from: f */
    private double f13180f = -1.0d;

    /* renamed from: com.unity3d.mediation.segment.LevelPlaySegment$a */
    public static final class C4203a {
        private C4203a() {
        }

        public /* synthetic */ C4203a(OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: a */
    private final boolean m13455a(String str) {
        if (str == null) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9]*$");
        OooOo.OooO0Oo(patternCompile, "compile(...)");
        return patternCompile.matcher(str).matches();
    }

    public final ArrayList<OooOO0> getCustoms$mediationsdk_release() {
        return this.f13175a;
    }

    public final double getIapTotal() {
        return this.f13180f;
    }

    public final int getLevel() {
        return this.f13179e;
    }

    public final ArrayList<OooOO0> getSegmentData() {
        IronLog.API.info("");
        ArrayList<OooOO0> arrayList = new ArrayList<>();
        int i = this.f13179e;
        if (i != -1) {
            arrayList.add(new OooOO0("lvl", String.valueOf(i)));
        }
        if (this.f13177c) {
            arrayList.add(new OooOO0("pay", String.valueOf(isPaying())));
        }
        double d = this.f13180f;
        if (d != -1.0d) {
            arrayList.add(new OooOO0("iapt", String.valueOf(d)));
        }
        long j = this.f13181g;
        if (j != 0) {
            arrayList.add(new OooOO0("ucd", String.valueOf(j)));
        }
        String str = this.f13178d;
        if (str != null && !TextUtils.isEmpty(str)) {
            arrayList.add(new OooOO0(SEGMENT_NAME, str));
        }
        ArrayList<OooOO0> arrayList2 = this.f13175a;
        ArrayList arrayList3 = new ArrayList(Oooo000.OooOo0(arrayList2, 10));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            OooOO0 oooOO0 = arrayList2.get(i2);
            i2++;
            OooOO0 oooOO02 = oooOO0;
            arrayList3.add(new OooOO0("custom_" + ((String) oooOO02.f33185OooOo0O), oooOO02.f33186OooOo0o));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final String getSegmentName() {
        return this.f13178d;
    }

    public final long getUserCreationDate() {
        return this.f13181g;
    }

    public final boolean isPaying() {
        return this.f13176b.get();
    }

    public final void setCustom(String key, String value) {
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(value, "value");
        IronLog.API.info("");
        try {
            if (m13455a(key) && m13456a(key, 1, 32) && m13455a(value) && m13456a(value, 1, 32)) {
                if (this.f13175a.size() >= 5) {
                    this.f13175a.remove(0);
                }
                this.f13175a.add(new OooOO0(key, value));
                return;
            }
            IronLog.INTERNAL.warning(key + ", " + value + " must be alphanumeric and 1-32 in length");
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public final void setIapTotal(double d) {
        IronLog.API.info("");
        if (0.0d <= d && d <= f13172i) {
            double d2 = 100;
            this.f13180f = Math.floor(d * d2) / d2;
            return;
        }
        IronLog.INTERNAL.warning(d + " must be between 0-999999.99");
    }

    public final void setLevel(int i) {
        IronLog.API.info("");
        if (1 <= i && i < 1000000) {
            this.f13179e = i;
            return;
        }
        IronLog.INTERNAL.warning(i + " must be between 1-999999");
    }

    public final void setPaying(boolean z) {
        IronLog.API.info("");
        this.f13177c = true;
        this.f13176b.set(z);
    }

    public final void setSegmentName(String str) {
        IronLog.API.info("");
        if (m13455a(str) && m13456a(str, 1, 32)) {
            this.f13178d = str;
            return;
        }
        IronLog.INTERNAL.warning(str + " must be alphanumeric and 1-32 in length");
    }

    public final void setUserCreationDate(long j) {
        IronLog.API.info("");
        if (j > 0) {
            this.f13181g = j;
            return;
        }
        IronLog.INTERNAL.warning(j + " is an invalid timestamp");
    }

    public final JSONObject toJson() throws JSONException {
        IronLog.API.info("");
        JSONObject jSONObject = new JSONObject();
        ArrayList<OooOO0> segmentData = getSegmentData();
        int size = segmentData.size();
        int i = 0;
        while (i < size) {
            OooOO0 oooOO0 = segmentData.get(i);
            i++;
            OooOO0 oooOO02 = oooOO0;
            try {
                jSONObject.put((String) oooOO02.f33185OooOo0O, (String) oooOO02.f33186OooOo0o);
            } catch (JSONException e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final boolean m13456a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }
}

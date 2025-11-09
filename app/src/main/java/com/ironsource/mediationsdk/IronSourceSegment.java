package com.ironsource.mediationsdk;

import OooO0oO.OooOo;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C3551q9;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: m */
    private static final String f9535m = "segName";

    /* renamed from: a */
    private String f9536a;

    /* renamed from: g */
    private String f9542g;

    /* renamed from: b */
    private int f9537b = 999999;

    /* renamed from: c */
    private double f9538c = 999999.99d;

    /* renamed from: d */
    private final String f9539d = "custom";

    /* renamed from: e */
    private final int f9540e = 5;

    /* renamed from: f */
    private int f9541f = -1;

    /* renamed from: h */
    private int f9543h = -1;

    /* renamed from: i */
    private AtomicBoolean f9544i = null;

    /* renamed from: j */
    private double f9545j = -1.0d;

    /* renamed from: k */
    private long f9546k = 0;

    /* renamed from: l */
    private ArrayList<Pair<String, String>> f9547l = new ArrayList<>();

    /* renamed from: a */
    private boolean m10028a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    @Deprecated
    public int getAge() {
        return this.f9541f;
    }

    @Deprecated
    public String getGender() {
        return this.f9542g;
    }

    public double getIapt() {
        return this.f9545j;
    }

    public AtomicBoolean getIsPaying() {
        return this.f9544i;
    }

    public int getLevel() {
        return this.f9543h;
    }

    public ArrayList<Pair<String, String>> getSegmentData() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f9541f != -1) {
            arrayList.add(new Pair<>(AGE, OooOo.OooOOO(new StringBuilder(), this.f9541f, "")));
        }
        if (!TextUtils.isEmpty(this.f9542g)) {
            arrayList.add(new Pair<>(GENDER, this.f9542g));
        }
        if (this.f9543h != -1) {
            arrayList.add(new Pair<>("lvl", OooOo.OooOOO(new StringBuilder(), this.f9543h, "")));
        }
        if (this.f9544i != null) {
            arrayList.add(new Pair<>("pay", this.f9544i + ""));
        }
        if (this.f9545j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.f9545j + ""));
        }
        if (this.f9546k != 0) {
            arrayList.add(new Pair<>("ucd", OooOo.OooOOOO(new StringBuilder(), this.f9546k, "")));
        }
        if (!TextUtils.isEmpty(this.f9536a)) {
            arrayList.add(new Pair<>("segName", this.f9536a));
        }
        arrayList.addAll(this.f9547l);
        return arrayList;
    }

    public String getSegmentName() {
        return this.f9536a;
    }

    public long getUcd() {
        return this.f9546k;
    }

    @Deprecated
    public void setAge(int i) {
        if (i <= 0 || i > 199) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, OooOo.OooO0oO(i, "setAge( ", " ) age must be between 1-199"), 2);
        } else {
            this.f9541f = i;
        }
    }

    public void setCustom(String str, String str2) {
        try {
            if (m10028a(str) && m10028a(str2) && m10029a(str, 1, 32) && m10029a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f9547l.size() >= 5) {
                    this.f9547l.remove(0);
                }
                this.f9547l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Deprecated
    public void setGender(String str) {
        if (TextUtils.isEmpty(str) || !(StringUtils.toLowerCase(str).equals(IronSourceConstants.C3411a.f10173b) || StringUtils.toLowerCase(str).equals(IronSourceConstants.C3411a.f10174c))) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, OooOo.OooOO0O("setGender( ", str, " ) is invalid"), 2);
        } else {
            this.f9542g = str;
        }
    }

    public void setIAPTotal(double d) {
        if (d > 0.0d && d < this.f9538c) {
            this.f9545j = Math.floor(d * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.f9538c, 2);
    }

    public void setIsPaying(boolean z) {
        if (this.f9544i == null) {
            this.f9544i = new AtomicBoolean();
        }
        this.f9544i.set(z);
    }

    public void setLevel(int i) {
        if (i > 0 && i < this.f9537b) {
            this.f9543h = i;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        StringBuilder sbOooOOo0 = OooOo.OooOOo0(i, "setLevel( ", " ) level must be between 1-");
        sbOooOOo0.append(this.f9537b);
        logger.log(ironSourceTag, sbOooOOo0.toString(), 2);
    }

    public void setSegmentName(String str) {
        if (m10028a(str) && m10029a(str, 1, 32)) {
            this.f9536a = str;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, OooOo.OooOO0O("setSegmentName( ", str, " ) segment name must be alphanumeric and 1-32 in length"), 2);
        }
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.f9546k = j;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setUserCreationDate( " + j + " ) is an invalid timestamp", 2);
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList<Pair<String, String>> segmentData = getSegmentData();
        int size = segmentData.size();
        int i = 0;
        while (i < size) {
            Pair<String, String> pair = segmentData.get(i);
            i++;
            Pair<String, String> pair2 = pair;
            try {
                jSONObject.put((String) pair2.first, pair2.second);
            } catch (JSONException e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private boolean m10029a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }
}

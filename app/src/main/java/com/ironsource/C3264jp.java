package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.jp */
/* loaded from: classes2.dex */
public class C3264jp {

    /* renamed from: d */
    public static final String f9136d = "Ironsrc";

    /* renamed from: e */
    public static final String f9137e = "7";

    /* renamed from: f */
    public static final String f9138f = Omid.getVersion();

    /* renamed from: g */
    public static final String f9139g = "omidVersion";

    /* renamed from: h */
    public static final String f9140h = "omidPartnerName";

    /* renamed from: i */
    public static final String f9141i = "omidPartnerVersion";

    /* renamed from: j */
    public static final String f9142j = "omidActiveAdSessions";

    /* renamed from: k */
    private static final String f9143k = "Invalid OMID impressionOwner";

    /* renamed from: l */
    private static final String f9144l = "Invalid OMID videoEventsOwner";

    /* renamed from: m */
    private static final String f9145m = "Missing OMID impressionOwner";

    /* renamed from: n */
    private static final String f9146n = "Missing OMID videoEventsOwner";

    /* renamed from: o */
    private static final String f9147o = "OMID has not been activated";

    /* renamed from: p */
    private static final String f9148p = "Missing OMID creativeType";

    /* renamed from: q */
    private static final String f9149q = "Missing adview id in OMID params";

    /* renamed from: r */
    private static final String f9150r = "No adview found with the provided adViewId";

    /* renamed from: s */
    private static final String f9151s = "OMID Session has already started";

    /* renamed from: t */
    private static final String f9152t = "OMID Session has not started";

    /* renamed from: a */
    private final Partner f9153a = Partner.createPartner(f9136d, f9137e);

    /* renamed from: c */
    private boolean f9155c = false;

    /* renamed from: b */
    private final HashMap<String, AdSession> f9154b = new HashMap<>();

    /* renamed from: com.ironsource.jp$a */
    public static class a {

        /* renamed from: i */
        private static final String f9156i = "isolateVerificationScripts";

        /* renamed from: j */
        private static final String f9157j = "impressionOwner";

        /* renamed from: k */
        private static final String f9158k = "videoEventsOwner";

        /* renamed from: l */
        private static final String f9159l = "customReferenceData";

        /* renamed from: m */
        private static final String f9160m = "creativeType";

        /* renamed from: n */
        private static final String f9161n = "impressionType";

        /* renamed from: o */
        public static final String f9162o = "adViewId";

        /* renamed from: a */
        public boolean f9163a;

        /* renamed from: b */
        public Owner f9164b;

        /* renamed from: c */
        public Owner f9165c;

        /* renamed from: d */
        public String f9166d;

        /* renamed from: e */
        public ImpressionType f9167e;

        /* renamed from: f */
        public CreativeType f9168f;

        /* renamed from: g */
        public String f9169g;

        /* renamed from: h */
        public Owner f9170h;

        /* renamed from: a */
        public static a m9529a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.f9163a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String strOptString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(C3264jp.f9145m);
            }
            try {
                aVar.f9164b = Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
                String strOptString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(strOptString)) {
                    throw new IllegalArgumentException(C3264jp.f9146n);
                }
                try {
                    aVar.f9165c = Owner.valueOf(strOptString2.toUpperCase(Locale.getDefault()));
                    aVar.f9166d = jSONObject.optString("customReferenceData", "");
                    aVar.f9168f = m9530b(jSONObject);
                    aVar.f9167e = m9531c(jSONObject);
                    aVar.f9169g = m9533e(jSONObject);
                    aVar.f9170h = m9532d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e) {
                    C3551q9.m11517d().m11519a(e);
                    throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0("Invalid OMID videoEventsOwner ", strOptString2));
                }
            } catch (IllegalArgumentException e2) {
                C3551q9.m11517d().m11519a(e2);
                throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0("Invalid OMID impressionOwner ", strOptString));
            }
        }

        /* renamed from: b */
        private static CreativeType m9530b(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0(C3264jp.f9148p, strOptString));
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (strOptString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0(C3264jp.f9148p, strOptString));
        }

        /* renamed from: c */
        private static ImpressionType m9531c(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0(C3264jp.f9148p, strOptString));
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (strOptString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0(C3264jp.f9148p, strOptString));
        }

        /* renamed from: d */
        private static Owner m9532d(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e) {
                C3551q9.m11517d().m11519a(e);
                return owner;
            }
        }

        /* renamed from: e */
        private static String m9533e(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("adViewId", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0(C3264jp.f9149q, strOptString));
            }
            return strOptString;
        }
    }

    /* renamed from: a */
    private AdSession m9521a(a aVar, InterfaceC3043di interfaceC3043di) throws IllegalArgumentException {
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f9168f, aVar.f9167e, aVar.f9164b, aVar.f9165c, aVar.f9163a), AdSessionContext.createHtmlAdSessionContext(this.f9153a, interfaceC3043di.getPresentingView(), null, aVar.f9166d));
        adSessionCreateAdSession.registerAdView(interfaceC3043di.getPresentingView());
        return adSessionCreateAdSession;
    }

    /* renamed from: b */
    public void m9526b(JSONObject jSONObject) throws IllegalStateException {
        m9522a(jSONObject);
        String strOptString = jSONObject.optString("adViewId");
        AdSession adSession = this.f9154b.get(strOptString);
        if (adSession == null) {
            throw new IllegalStateException(f9152t);
        }
        adSession.finish();
        this.f9154b.remove(strOptString);
    }

    /* renamed from: c */
    public void m9527c(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        m9522a(jSONObject);
        AdSession adSession = this.f9154b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException(f9152t);
        }
        AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            adEventsCreateAdEvents.loaded();
        }
        adEventsCreateAdEvents.impressionOccurred();
    }

    /* renamed from: d */
    public void m9528d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        m9525a(a.m9529a(jSONObject));
    }

    /* renamed from: a */
    public C3233is m9523a() throws JSONException {
        C3233is c3233is = new C3233is();
        c3233is.m9391b(f9139g, SDKUtils.encodeString(f9138f));
        c3233is.m9391b(f9140h, SDKUtils.encodeString(f9136d));
        c3233is.m9391b(f9141i, SDKUtils.encodeString(f9137e));
        c3233is.m9391b(f9142j, SDKUtils.encodeString(Arrays.toString(this.f9154b.keySet().toArray())));
        return c3233is;
    }

    /* renamed from: a */
    public void m9524a(Context context) throws IllegalArgumentException {
        if (this.f9155c) {
            return;
        }
        Omid.activate(context);
        this.f9155c = true;
    }

    /* renamed from: a */
    public void m9525a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (!this.f9155c) {
            throw new IllegalStateException(f9147o);
        }
        if (TextUtils.isEmpty(aVar.f9169g)) {
            throw new IllegalStateException(f9149q);
        }
        String str = aVar.f9169g;
        if (this.f9154b.containsKey(str)) {
            throw new IllegalStateException(f9151s);
        }
        InterfaceC3043di interfaceC3043diMo9491a = C3256jh.m9487a().mo9491a(str);
        if (interfaceC3043diMo9491a == null) {
            throw new IllegalStateException(f9150r);
        }
        AdSession adSessionM9521a = m9521a(aVar, interfaceC3043diMo9491a);
        adSessionM9521a.start();
        this.f9154b.put(str, adSessionM9521a);
    }

    /* renamed from: a */
    private void m9522a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.f9155c) {
            throw new IllegalStateException(f9147o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(f9152t);
        }
    }
}

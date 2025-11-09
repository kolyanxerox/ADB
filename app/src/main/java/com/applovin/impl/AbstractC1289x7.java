package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.network.C1238d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.x7 */
/* loaded from: classes.dex */
public abstract class AbstractC1289x7 {

    /* renamed from: a */
    private static final DateFormat f3084a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b */
    private static final Random f3085b = new Random(System.currentTimeMillis());

    /* renamed from: a */
    public static void m3669a(AbstractC1157p7 abstractC1157p7, AppLovinAdLoadListener appLovinAdLoadListener, EnumC1173q7 enumC1173q7, int i, C1220k c1220k) {
        if (c1220k == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
        Set setM3667a = m3667a(abstractC1157p7, c1220k);
        if (CollectionUtils.isEmpty(setM3667a)) {
            return;
        }
        m3672a(setM3667a, enumC1173q7, c1220k);
    }

    /* renamed from: b */
    public static boolean m3677b(C1088l7 c1088l7) {
        C1298y7 c1298y7M1345B1;
        List listM3815g;
        return (c1088l7 == null || (c1298y7M1345B1 = c1088l7.m1345B1()) == null || (listM3815g = c1298y7M1345B1.m3815g()) == null || listM3815g.isEmpty()) ? false : true;
    }

    /* renamed from: c */
    public static EnumC1173q7 m3679c(C1088l7 c1088l7) {
        if (m3677b(c1088l7) || m3674a(c1088l7)) {
            return null;
        }
        return EnumC1173q7.GENERAL_WRAPPER_ERROR;
    }

    /* renamed from: b */
    private static String m3676b() {
        DateFormat dateFormat = f3084a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    /* renamed from: a */
    public static boolean m3674a(C1088l7 c1088l7) {
        C1148o7 c1148o7M1368s1;
        C1253t7 c1253t7M2026e;
        if (c1088l7 == null || (c1148o7M1368s1 = c1088l7.m1368s1()) == null || (c1253t7M2026e = c1148o7M1368s1.m2026e()) == null) {
            return false;
        }
        return c1253t7M2026e.m3357c() != null || StringUtils.isValidString(c1253t7M2026e.m3356b());
    }

    /* renamed from: b */
    public static boolean m3678b(C1099m8 c1099m8) {
        if (c1099m8 != null) {
            return c1099m8.m1513b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    /* renamed from: a */
    public static Uri m3661a(String str, long j, Uri uri, EnumC1173q7 enumC1173q7, C1220k c1220k) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String string = Integer.toString(enumC1173q7.m2282b());
                String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
                if (j >= 0) {
                    strReplace = strReplace.replace("[CONTENTPLAYHEAD]", m3663a(j));
                }
                if (uri != null) {
                    strReplace = strReplace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(strReplace.replace("[CACHEBUSTING]", m3662a()).replace("[TIMESTAMP]", m3676b()));
            } catch (Throwable th) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                c1220k.m2832E().m2152a("VastUtils", th);
                return null;
            }
        }
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3214b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    /* renamed from: a */
    private static String m3663a(long j) {
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j);
            long minutes = timeUnit.toMinutes(j);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    /* renamed from: a */
    private static String m3662a() {
        return Integer.toString(f3085b.nextInt(89999999) + 10000000);
    }

    /* renamed from: a */
    public static void m3673a(Set set, C1220k c1220k) {
        m3671a(set, -1L, (Uri) null, EnumC1173q7.UNSPECIFIED, c1220k);
    }

    /* renamed from: a */
    public static void m3672a(Set set, EnumC1173q7 enumC1173q7, C1220k c1220k) {
        m3671a(set, -1L, (Uri) null, enumC1173q7, c1220k);
    }

    /* renamed from: a */
    public static void m3671a(Set set, long j, Uri uri, EnumC1173q7 enumC1173q7, C1220k c1220k) {
        if (c1220k != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C1271v7 c1271v7 = (C1271v7) it.next();
                long j2 = j;
                Uri uri2 = uri;
                EnumC1173q7 enumC1173q72 = enumC1173q7;
                C1220k c1220k2 = c1220k;
                Uri uriM3661a = m3661a(c1271v7.m3578c(), j2, uri2, enumC1173q72, c1220k2);
                if (uriM3661a != null) {
                    c1220k2.m2896f0().m3127a(C1238d.m3134b().m3174d(uriM3661a.toString()).m3166a(false).m3170b(c1271v7.m3579d()).m3167a(), false);
                }
                j = j2;
                uri = uri2;
                enumC1173q7 = enumC1173q72;
                c1220k = c1220k2;
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    /* renamed from: a */
    public static void m3668a(C1099m8 c1099m8, Map map, AbstractC1157p7 abstractC1157p7, C1220k c1220k) {
        List<C1099m8> listM1511a;
        if (c1220k == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (c1099m8 == null) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3214b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3214b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        C1099m8 c1099m8M1515c = c1099m8.m1515c("TrackingEvents");
        if (c1099m8M1515c == null || (listM1511a = c1099m8M1515c.m1511a("Tracking")) == null) {
            return;
        }
        for (C1099m8 c1099m82 : listM1511a) {
            String str = (String) c1099m82.m1512a().get(NotificationCompat.CATEGORY_EVENT);
            if (StringUtils.isValidString(str)) {
                C1271v7 c1271v7M3574a = C1271v7.m3574a(c1099m82, abstractC1157p7, c1220k);
                if (c1271v7M3574a != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(c1271v7M3574a);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(c1271v7M3574a);
                        map.put(str, hashSet);
                    }
                }
            } else {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3214b("VastUtils", "Could not find event for tracking node = " + c1099m82);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3670a(List list, Set set, AbstractC1157p7 abstractC1157p7, C1220k c1220k) {
        if (c1220k == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3214b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3214b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1271v7 c1271v7M3574a = C1271v7.m3574a((C1099m8) it.next(), abstractC1157p7, c1220k);
            if (c1271v7M3574a != null) {
                set.add(c1271v7M3574a);
            }
        }
    }

    /* renamed from: a */
    public static boolean m3675a(C1099m8 c1099m8) {
        if (c1099m8 != null) {
            return c1099m8.m1513b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    /* renamed from: a */
    public static String m3665a(AbstractC1157p7 abstractC1157p7) {
        C1099m8 c1099m8M1513b;
        if (abstractC1157p7 != null) {
            List listM2079a = abstractC1157p7.m2079a();
            int size = abstractC1157p7.m2079a().size();
            if (size <= 0 || (c1099m8M1513b = ((C1099m8) listM2079a.get(size - 1)).m1513b("VASTAdTagURI")) == null) {
                return null;
            }
            return c1099m8M1513b.m1517d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    /* renamed from: a */
    public static String m3664a(C1099m8 c1099m8, String str, String str2) {
        C1099m8 c1099m8M1515c = c1099m8.m1515c(str);
        if (c1099m8M1515c != null) {
            String strM1517d = c1099m8M1515c.m1517d();
            if (StringUtils.isValidString(strM1517d)) {
                return strM1517d;
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static Set m3667a(AbstractC1157p7 abstractC1157p7, C1220k c1220k) {
        List listM1511a;
        if (abstractC1157p7 == null) {
            return null;
        }
        List<C1099m8> listM2079a = abstractC1157p7.m2079a();
        HashSet hashSet = new HashSet(listM2079a.size());
        for (C1099m8 c1099m8 : listM2079a) {
            C1099m8 c1099m8M1513b = c1099m8.m1513b("Wrapper");
            if (c1099m8M1513b == null) {
                c1099m8M1513b = c1099m8.m1513b("InLine");
            }
            if (c1099m8M1513b != null) {
                listM1511a = c1099m8M1513b.m1511a("Error");
            } else {
                listM1511a = c1099m8.m1511a("Error");
            }
            hashSet = m3666a(hashSet, listM1511a, abstractC1157p7, c1220k);
        }
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3211a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    /* renamed from: a */
    private static HashSet m3666a(HashSet hashSet, List list, AbstractC1157p7 abstractC1157p7, C1220k c1220k) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1271v7 c1271v7M3574a = C1271v7.m3574a((C1099m8) it.next(), abstractC1157p7, c1220k);
                if (c1271v7M3574a != null) {
                    hashSet.add(c1271v7M3574a);
                }
            }
        }
        return hashSet;
    }
}

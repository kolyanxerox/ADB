package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.v */
/* loaded from: classes.dex */
public abstract class AbstractC1263v {

    /* renamed from: a */
    private static boolean f2458a = true;

    /* renamed from: b */
    private static final Object f2459b = new Object();

    /* renamed from: c */
    private static final Collection f2460c = new HashSet();

    /* renamed from: d */
    private static boolean f2461d = false;

    /* renamed from: e */
    private static a f2462e = null;

    /* renamed from: com.applovin.impl.v$a */
    public static class a {

        /* renamed from: a */
        private boolean f2463a;

        /* renamed from: b */
        private String f2464b = "";

        /* renamed from: c */
        private EnumC4554a f2465c = EnumC4554a.NOT_SET;

        /* renamed from: com.applovin.impl.v$a$a, reason: collision with other inner class name */
        public enum EnumC4554a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* renamed from: a */
            private final String f2470a;

            EnumC4554a(String str) {
                this.f2470a = str;
            }

            /* renamed from: b */
            public String m3421b() {
                return this.f2470a;
            }
        }

        /* renamed from: a */
        public boolean m3417a(Object obj) {
            return obj instanceof a;
        }

        /* renamed from: b */
        public EnumC4554a m3418b() {
            return this.f2465c;
        }

        /* renamed from: c */
        public boolean m3419c() {
            return this.f2463a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.m3417a(this) || m3419c() != aVar.m3419c()) {
                return false;
            }
            String strM3413a = m3413a();
            String strM3413a2 = aVar.m3413a();
            if (strM3413a != null ? !strM3413a.equals(strM3413a2) : strM3413a2 != null) {
                return false;
            }
            EnumC4554a enumC4554aM3418b = m3418b();
            EnumC4554a enumC4554aM3418b2 = aVar.m3418b();
            return enumC4554aM3418b != null ? enumC4554aM3418b.equals(enumC4554aM3418b2) : enumC4554aM3418b2 == null;
        }

        public int hashCode() {
            int i = m3419c() ? 79 : 97;
            String strM3413a = m3413a();
            int iHashCode = ((i + 59) * 59) + (strM3413a == null ? 43 : strM3413a.hashCode());
            EnumC4554a enumC4554aM3418b = m3418b();
            return (iHashCode * 59) + (enumC4554aM3418b != null ? enumC4554aM3418b.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + m3419c() + ", advertisingId=" + m3413a() + ", dntCode=" + m3418b() + ")";
        }

        /* renamed from: a */
        public void m3416a(boolean z) {
            this.f2463a = z;
        }

        /* renamed from: a */
        public void m3415a(String str) {
            this.f2464b = str;
        }

        /* renamed from: a */
        public void m3414a(EnumC4554a enumC4554a) {
            this.f2465c = enumC4554a;
        }

        /* renamed from: a */
        public String m3413a() {
            return this.f2464b;
        }
    }

    /* renamed from: a */
    private static a m3409a(Context context) {
        a aVar;
        HashSet hashSet;
        AbstractC1078k7.m1182a();
        Object obj = f2459b;
        synchronized (obj) {
            try {
                if (f2461d) {
                    return f2462e;
                }
                Collection collection = f2460c;
                boolean zIsEmpty = collection.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                collection.add(countDownLatch);
                if (zIsEmpty) {
                    a aVarM3412c = m3412c(context);
                    synchronized (obj) {
                        f2461d = true;
                        f2462e = aVarM3412c;
                        hashSet = new HashSet(collection);
                        collection.clear();
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((CountDownLatch) it.next()).countDown();
                    }
                }
                try {
                    if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                        C1240o.m3207h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                    }
                } catch (InterruptedException e) {
                    C1240o.m3204c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e);
                }
                synchronized (f2459b) {
                    aVar = f2462e;
                }
                return aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static a m3411b(Context context) {
        return m3409a(context);
    }

    /* renamed from: c */
    private static a m3412c(Context context) {
        a aVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (aVarCollectGoogleAdvertisingInfo == null) {
            aVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        return aVarCollectGoogleAdvertisingInfo == null ? new a() : aVarCollectGoogleAdvertisingInfo;
    }

    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f2458a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.m3415a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.m3416a(z);
                aVar.m3414a(z ? a.EnumC4554a.ON : a.EnumC4554a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e) {
                C1240o.m3204c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e);
            } catch (Throwable th) {
                C1240o.m3204c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f2458a = false;
        return null;
    }

    private static a collectGoogleAdvertisingInfo(Context context) {
        AbstractC1078k7.m1182a();
        if (!m3410a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            C1240o.m3207h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.m3416a(zIsLimitAdTrackingEnabled);
            aVar.m3414a(zIsLimitAdTrackingEnabled ? a.EnumC4554a.ON : a.EnumC4554a.OFF);
            aVar.m3415a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            C1240o.m3204c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m3410a() {
        return AbstractC1078k7.m1203a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}

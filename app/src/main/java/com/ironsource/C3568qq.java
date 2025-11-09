package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.InterfaceC3255jg;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.BasePlacement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.ironsource.qq */
/* loaded from: classes2.dex */
public class C3568qq implements InterfaceC3255jg, InterfaceC3255jg.a {

    /* renamed from: a */
    private static final String f10965a = "CappingManager.IS_DELIVERY_ENABLED";

    /* renamed from: b */
    private static final String f10966b = "CappingManager.IS_CAPPING_ENABLED";

    /* renamed from: c */
    private static final String f10967c = "CappingManager.IS_PACING_ENABLED";

    /* renamed from: d */
    private static final String f10968d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* renamed from: e */
    private static final String f10969e = "CappingManager.CAPPING_TYPE";

    /* renamed from: f */
    private static final String f10970f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* renamed from: g */
    private static final String f10971g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* renamed from: h */
    private static final String f10972h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* renamed from: i */
    private static final String f10973i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* renamed from: com.ironsource.qq$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10974a;

        static {
            int[] iArr = new int[EnumC3603rq.values().length];
            f10974a = iArr;
            try {
                iArr[EnumC3603rq.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10974a[EnumC3603rq.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.ironsource.qq$b */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    /* renamed from: a */
    private long m11599a(EnumC3603rq enumC3603rq) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i = a.f10974a[enumC3603rq.ordinal()];
        if (i == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    /* renamed from: b */
    private b m11604b(Context context, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.getBooleanFromSharedPrefs(context, m11601a(str, f10965a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m11601a(str, f10967c, str2), false)) {
            if (jCurrentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, m11601a(str, f10973i, str2), 0L) < IronSourceUtils.getIntFromSharedPrefs(context, m11601a(str, f10970f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m11601a(str, f10966b, str2), false)) {
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, m11601a(str, f10968d, str2), 0);
            String strM11601a = m11601a(str, f10971g, str2);
            int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, strM11601a, 0);
            String strM11601a2 = m11601a(str, f10972h, str2);
            if (jCurrentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, strM11601a2, 0L)) {
                IronSourceUtils.saveIntToSharedPrefs(context, strM11601a, 0);
                IronSourceUtils.saveLongToSharedPrefs(context, strM11601a2, 0L);
            } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.InterfaceC3255jg.a
    /* renamed from: c */
    public synchronized void mo9485c(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        if (context == null || basePlacement == null) {
            return;
        }
        C3463nq placementAvailabilitySettings = basePlacement.getPlacementAvailabilitySettings();
        if (placementAvailabilitySettings == null) {
            return;
        }
        m11603a(context, m11600a(ad_unit), basePlacement.getPlacementName(), placementAvailabilitySettings);
    }

    @Override // com.ironsource.InterfaceC3255jg
    /* renamed from: a */
    public synchronized b mo9482a(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        if (context == null) {
            return b.NOT_CAPPED;
        }
        if (basePlacement == null) {
            return b.NOT_CAPPED;
        }
        String strM11600a = m11600a(ad_unit);
        if (basePlacement.getPlacementName() == null) {
            return b.NOT_CAPPED;
        }
        if (basePlacement.getPlacementAvailabilitySettings() == null) {
            return b.NOT_CAPPED;
        }
        return m11604b(context, strM11600a, basePlacement.getPlacementName());
    }

    @Override // com.ironsource.InterfaceC3255jg
    /* renamed from: b */
    public synchronized boolean mo9483b(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        return mo9482a(context, basePlacement, ad_unit) != b.NOT_CAPPED;
    }

    /* renamed from: a */
    private String m11600a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? "Interstitial" : ad_unit == IronSource.AD_UNIT.BANNER ? "Banner" : ad_unit == IronSource.AD_UNIT.NATIVE_AD ? IronSourceConstants.NATIVE_AD_UNIT : ad_unit.toString();
    }

    /* renamed from: a */
    private String m11601a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    @Override // com.ironsource.InterfaceC3255jg.a
    /* renamed from: a */
    public synchronized void mo9484a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m11602a(context, m11600a(ad_unit), str);
    }

    /* renamed from: a */
    private void m11602a(Context context, String str, String str2) {
        EnumC3603rq enumC3603rq;
        int i = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m11601a(str, f10967c, str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, m11601a(str, f10973i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m11601a(str, f10966b, str2), false)) {
            String strM11601a = m11601a(str, f10971g, str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, strM11601a, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, m11601a(str, f10969e, str2), EnumC3603rq.PER_DAY.toString());
                EnumC3603rq[] enumC3603rqArrValues = EnumC3603rq.values();
                int length = enumC3603rqArrValues.length;
                while (true) {
                    if (i >= length) {
                        enumC3603rq = null;
                        break;
                    }
                    enumC3603rq = enumC3603rqArrValues[i];
                    if (enumC3603rq.f11207a.equals(stringFromSharedPrefs)) {
                        break;
                    } else {
                        i++;
                    }
                }
                IronSourceUtils.saveLongToSharedPrefs(context, m11601a(str, f10972h, str2), m11599a(enumC3603rq));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, strM11601a, intFromSharedPrefs + 1);
        }
    }

    /* renamed from: a */
    private void m11603a(Context context, String str, String str2, C3463nq c3463nq) {
        boolean zM11041e = c3463nq.m11041e();
        IronSourceUtils.saveBooleanToSharedPrefs(context, m11601a(str, f10965a, str2), zM11041e);
        if (zM11041e) {
            boolean zM11040d = c3463nq.m11040d();
            IronSourceUtils.saveBooleanToSharedPrefs(context, m11601a(str, f10966b, str2), zM11040d);
            if (zM11040d) {
                IronSourceUtils.saveIntToSharedPrefs(context, m11601a(str, f10968d, str2), c3463nq.m11038b());
                IronSourceUtils.saveStringToSharedPrefs(context, m11601a(str, f10969e, str2), c3463nq.m11037a().toString());
            }
            boolean zM11042f = c3463nq.m11042f();
            IronSourceUtils.saveBooleanToSharedPrefs(context, m11601a(str, f10967c, str2), zM11042f);
            if (zM11042f) {
                IronSourceUtils.saveIntToSharedPrefs(context, m11601a(str, f10970f, str2), c3463nq.m11039c());
            }
        }
    }
}

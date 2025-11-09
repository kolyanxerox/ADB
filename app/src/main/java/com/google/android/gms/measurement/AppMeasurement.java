package com.google.android.gms.measurement;

import Oooo00O.o000000O;
import OoooOO0.o00000;
import OoooOO0.o000000;
import OoooOOO.o0OO0oO0;
import OoooOOO.oO0000O;
import OoooOOO.oO00O0o0;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.o000O0o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C3037dc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static volatile AppMeasurement f27222OooO0O0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00000 f27223OooO00o;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @NonNull
        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        public String mName;

        @NonNull
        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        public Object mValue;
    }

    public AppMeasurement(o0OO0oO0 o0oo0oo0) {
        this.f27223OooO00o = new o000000(o0oo0oo0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @NonNull
    @Keep
    @Deprecated
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurement getInstance(@NonNull Context context) {
        if (f27222OooO0O0 == null) {
            synchronized (AppMeasurement.class) {
                if (f27222OooO0O0 == null) {
                    oO00O0o0 oo00o0o0 = (oO00O0o0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (oo00o0o0 != null) {
                        f27222OooO0O0 = new AppMeasurement(oo00o0o0);
                    } else {
                        f27222OooO0O0 = new AppMeasurement(o0OO0oO0.OooOOoo(context, new o000O0o(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f27222OooO0O0;
    }

    @Keep
    public void beginAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f27223OooO00o.OooO(str);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull @Size(max = 24, min = 1) String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f27223OooO00o.OooOOo(str, bundle, str2);
    }

    @Keep
    public void endAdUnitExposure(@NonNull @Size(min = 1) String str) {
        this.f27223OooO00o.OooO0oo(str);
    }

    @Keep
    public long generateEventId() {
        return this.f27223OooO00o.zzl();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f27223OooO00o.zzj();
    }

    @NonNull
    @Keep
    @WorkerThread
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull @Size(max = 23, min = 1) String str2) {
        List<Bundle> listOooOOOO = this.f27223OooO00o.OooOOOO(str, str2);
        ArrayList arrayList = new ArrayList(listOooOOOO == null ? 0 : listOooOOOO.size());
        for (Bundle bundle : listOooOOOO) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            o000000O.OooO0oo(bundle);
            conditionalUserProperty.mAppId = (String) oO0000O.OooO0o0(bundle, "app_id", String.class, null);
            conditionalUserProperty.mOrigin = (String) oO0000O.OooO0o0(bundle, C3037dc.f8261p, String.class, null);
            conditionalUserProperty.mName = (String) oO0000O.OooO0o0(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = oO0000O.OooO0o0(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) oO0000O.OooO0o0(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) oO0000O.OooO0o0(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) oO0000O.OooO0o0(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) oO0000O.OooO0o0(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) oO0000O.OooO0o0(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) oO0000O.OooO0o0(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) oO0000O.OooO0o0(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) oO0000O.OooO0o0(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) oO0000O.OooO0o0(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) oO0000O.OooO0o0(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) oO0000O.OooO0o0(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) oO0000O.OooO0o0(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f27223OooO00o.zzi();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f27223OooO00o.zzh();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f27223OooO00o.zzk();
    }

    @Keep
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size(min = 1) String str) {
        return this.f27223OooO00o.zzr(str);
    }

    @NonNull
    @Keep
    @VisibleForTesting
    @WorkerThread
    public Map<String, Object> getUserProperties(@NonNull String str, @NonNull @Size(max = 24, min = 1) String str2, boolean z) {
        return this.f27223OooO00o.OooOOo0(str, str2, z);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f27223OooO00o.OooOO0(str, bundle, str2);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        o000000O.OooO0oo(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(C3037dc.f8261p, str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            oO0000O.OooO0Oo(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f27223OooO00o.OooOOOo(bundle);
    }

    public AppMeasurement(oO00O0o0 oo00o0o0) {
        this.f27223OooO00o = new OoooOO0.o000000O(oo00o0o0);
    }
}

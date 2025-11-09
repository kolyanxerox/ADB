package com.google.android.ump;

import OoooO0O.o000OO;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ConsentDebugSettings {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f27995OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f27996OooO0O0;

    public static class Builder {

        /* renamed from: OooO0O0, reason: collision with root package name */
        public final Context f27998OooO0O0;

        /* renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f28000OooO0Oo;

        /* renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f27997OooO00o = new ArrayList();

        /* renamed from: OooO0OO, reason: collision with root package name */
        public int f27999OooO0OO = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f27998OooO0O0 = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f27997OooO00o.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z = true;
            if (!o000OO.OooO0OO() && !this.f27997OooO00o.contains(o000OO.OooO00o(this.f27998OooO0O0)) && !this.f28000OooO0Oo) {
                z = false;
            }
            return new ConsentDebugSettings(z, this);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i) {
            this.f27999OooO0OO = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setForceTesting(boolean z) {
            this.f28000OooO0Oo = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z, Builder builder) {
        this.f27995OooO00o = z;
        this.f27996OooO0O0 = builder.f27999OooO0OO;
    }

    public int getDebugGeography() {
        return this.f27996OooO0O0;
    }

    public boolean isTestDevice() {
        return this.f27995OooO00o;
    }
}

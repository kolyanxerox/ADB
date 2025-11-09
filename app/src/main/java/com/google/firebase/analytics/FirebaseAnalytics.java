package com.google.firebase.analytics;

import Oooo00O.o000000O;
import OoooOOO.oO00O0o0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.o000O0;
import com.google.android.gms.internal.measurement.o000O00;
import com.google.android.gms.internal.measurement.o000O0Oo;
import com.google.android.gms.internal.measurement.o00O00OO;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0000o.o00Oo0;
import o0000o.o00Ooo;
import o0000o.o0ooOOo;
import o0000o.oo000o;
import o000Oo0O.Oooo000;

/* loaded from: classes2.dex */
public final class FirebaseAnalytics {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static volatile FirebaseAnalytics f28136OooO0OO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00O00OO f28137OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public oo000o f28138OooO0O0;

    public FirebaseAnalytics(o00O00OO o00o00oo) {
        o000000O.OooO0oo(o00o00oo);
        this.f28137OooO00o = o00o00oo;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f28136OooO0OO == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f28136OooO0OO == null) {
                        f28136OooO0OO = new FirebaseAnalytics(o00O00OO.OooO0o0(context, null));
                    }
                } finally {
                }
            }
        }
        return f28136OooO0OO;
    }

    @Nullable
    @Keep
    public static oO00O0o0 getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        o00O00OO o00o00ooOooO0o0 = o00O00OO.OooO0o0(context, bundle);
        if (o00o00ooOooO0o0 == null) {
            return null;
        }
        return new o0ooOOo(o00o00ooOooO0o0);
    }

    public final void OooO00o(HashMap map) {
        Bundle bundle = new Bundle();
        o00Oo0 o00oo0 = (o00Oo0) map.get(o00Ooo.f29569OooOo0O);
        if (o00oo0 != null) {
            int iOrdinal = o00oo0.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        o00Oo0 o00oo02 = (o00Oo0) map.get(o00Ooo.f29570OooOo0o);
        if (o00oo02 != null) {
            int iOrdinal2 = o00oo02.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        o00Oo0 o00oo03 = (o00Oo0) map.get(o00Ooo.f29568OooOo);
        if (o00oo03 != null) {
            int iOrdinal3 = o00oo03.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        o00Oo0 o00oo04 = (o00Oo0) map.get(o00Ooo.f29572OooOoO0);
        if (o00oo04 != null) {
            int iOrdinal4 = o00oo04.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        o00O00OO o00o00oo = this.f28137OooO00o;
        o00o00oo.getClass();
        o00o00oo.OooO0OO(new o000O0(o00o00oo, bundle, 1));
    }

    public final ExecutorService OooO0O0() {
        oo000o oo000oVar;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f28138OooO0O0 == null) {
                    this.f28138OooO0O0 = new oo000o(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                oo000oVar = this.f28138OooO0O0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oo000oVar;
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(Oooo000.OooO0Oo().OooO0OO(), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @MainThread
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        o000O00 o000o00OooO0o0 = o000O00.OooO0o0(activity);
        o00O00OO o00o00oo = this.f28137OooO00o;
        o00o00oo.getClass();
        o00o00oo.OooO0OO(new o000O0Oo(o00o00oo, o000o00OooO0o0, str, str2));
    }
}

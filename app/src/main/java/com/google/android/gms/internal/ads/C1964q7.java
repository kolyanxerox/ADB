package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.q7 */
/* loaded from: classes2.dex */
public final class C1964q7 extends CustomTabsCallback {

    /* renamed from: OooO00o */
    public final AtomicBoolean f23519OooO00o = new AtomicBoolean(false);

    /* renamed from: OooO0O0 */
    public final List f23520OooO0O0 = Arrays.asList(((String) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoOo0)).split(","));

    /* renamed from: OooO0OO */
    public final C2001r7 f23521OooO0OO;

    /* renamed from: OooO0Oo */
    public final CustomTabsCallback f23522OooO0Oo;

    /* renamed from: OooO0o0 */
    public final k20 f23523OooO0o0;

    public C1964q7(C2001r7 c2001r7, CustomTabsCallback customTabsCallback, k20 k20Var) {
        this.f23522OooO0Oo = customTabsCallback;
        this.f23521OooO0OO = c2001r7;
        this.f23523OooO0o0 = k20Var;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void extraCallback(String str, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.f23522OooO0Oo;
        if (customTabsCallback != null) {
            customTabsCallback.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.f23522OooO0Oo;
        if (customTabsCallback != null) {
            return customTabsCallback.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityResized(int i, int i2, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.f23522OooO0Oo;
        if (customTabsCallback != null) {
            customTabsCallback.onActivityResized(i, i2, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle) {
        this.f23519OooO00o.set(false);
        CustomTabsCallback customTabsCallback = this.f23522OooO0Oo;
        if (customTabsCallback != null) {
            customTabsCallback.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        this.f23519OooO00o.set(false);
        CustomTabsCallback customTabsCallback = this.f23522OooO0Oo;
        if (customTabsCallback != null) {
            customTabsCallback.onNavigationEvent(i, bundle);
        }
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2001r7 c2001r7 = this.f23521OooO0OO;
        c2001r7.f23793OooOO0 = jCurrentTimeMillis;
        List list = this.f23520OooO0O0;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        c2001r7.f23784OooO = SystemClock.elapsedRealtime() + ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoO)).intValue();
        if (c2001r7.f23790OooO0o0 == null) {
            c2001r7.f23790OooO0o0 = new RunnableC1442c1(c2001r7, 10);
        }
        c2001r7.OooO0Oo();
        zzaa.zzd(this.f23523OooO0o0, null, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f23519OooO00o.set(true);
                zzaa.zzd(this.f23523OooO0o0, null, "pact_action", new Pair("pe", "pact_con"));
                this.f23521OooO0OO.OooO0OO(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            zze.zzb("Message is not in JSON format: ", e);
        }
        CustomTabsCallback customTabsCallback = this.f23522OooO0Oo;
        if (customTabsCallback != null) {
            customTabsCallback.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.f23522OooO0Oo;
        if (customTabsCallback != null) {
            customTabsCallback.onRelationshipValidationResult(i, uri, z, bundle);
        }
    }
}

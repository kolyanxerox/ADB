package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

/* loaded from: classes2.dex */
public abstract class oOO00O {

    /* renamed from: OooO00o */
    public static final int f27203OooO00o = Runtime.getRuntime().availableProcessors();

    public static void OooO(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static int OooO00o(Bundle bundle, String str) {
        if (bundle == null) {
            OooO0oo(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            OooO0oO(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        OooO0oo(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void OooO0O0(String str, long j, Bundle bundle) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle OooO0OO(boolean z, boolean z2, boolean z3, String str, long j) {
        Bundle bundle = new Bundle();
        OooO0O0(str, j, bundle);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z3) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle OooO0Oo(long j, String str) {
        Bundle bundle = new Bundle();
        OooO0O0(str, j, bundle);
        return bundle;
    }

    public static String OooO0o(Bundle bundle, String str) {
        if (bundle == null) {
            OooO0oo(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            OooO0oO(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        OooO0oo(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static BillingResult OooO0o0(Intent intent, String str) {
        if (intent != null) {
            BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
            builderNewBuilder.setResponseCode(OooO00o(intent.getExtras(), str));
            builderNewBuilder.setDebugMessage(OooO0o(intent.getExtras(), str));
            return builderNewBuilder.build();
        }
        OooO0oo("BillingHelper", "Got null intent!");
        BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(6);
        builderNewBuilder2.setDebugMessage("An internal error occurred.");
        return builderNewBuilder2.build();
    }

    public static void OooO0oO(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i -= iMin;
            }
        }
    }

    public static void OooO0oo(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static Bundle OooOO0(BillingResult billingResult, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", billingResult.getResponseCode());
        bundle.putString("DEBUG_MESSAGE", billingResult.getDebugMessage());
        bundle.putInt("LOG_REASON", i - 1);
        return bundle;
    }

    public static Purchase OooOO0O(String str, String str2) {
        if (str == null || str2 == null) {
            OooO0oO("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            OooO0oo("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}

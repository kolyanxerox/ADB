package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.o0OOO0;
import com.google.android.gms.internal.play_billing.o0OOO00;
import com.google.android.gms.internal.play_billing.o0OOO0OO;
import com.google.android.gms.internal.play_billing.o0OOOO00;
import com.google.android.gms.internal.play_billing.o0OOOO0o;
import com.google.android.gms.internal.play_billing.o0OOo000;
import com.google.android.gms.internal.play_billing.oOO00O;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public final /* synthetic */ class zzcg {
    public static final /* synthetic */ int zza = 0;

    static {
        int i = OooO0oO.OooOo00.f13282OooO00o;
    }

    public static String zza(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + message;
            int i = oOO00O.f27203OooO00o;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            oOO00O.OooO("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static o0OOO0 zzb(int i, int i2, BillingResult billingResult) {
        try {
            o0OOO00 o0ooo00OooOOo = o0OOO0.OooOOo();
            o0OOOO0o o0oooo0oOooOOo = o0OOo000.OooOOo();
            o0oooo0oOooOOo.OooO0o0(billingResult.getResponseCode());
            String debugMessage = billingResult.getDebugMessage();
            o0oooo0oOooOOo.OooO0Oo();
            o0OOo000.OooOOOO((o0OOo000) o0oooo0oOooOOo.f27076OooOo0o, debugMessage);
            o0oooo0oOooOOo.OooO0o(i);
            o0ooo00OooOOo.OooO0o0(o0oooo0oOooOOo);
            o0ooo00OooOOo.OooO0o(i2);
            return (o0OOO0) o0ooo00OooOOo.OooO0O0();
        } catch (Exception e) {
            oOO00O.OooO("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static o0OOO0 zzc(int i, int i2, BillingResult billingResult, String str) {
        try {
            o0OOOO0o o0oooo0oOooOOo = o0OOo000.OooOOo();
            o0oooo0oOooOOo.OooO0o0(billingResult.getResponseCode());
            String debugMessage = billingResult.getDebugMessage();
            o0oooo0oOooOOo.OooO0Oo();
            o0OOo000.OooOOOO((o0OOo000) o0oooo0oOooOOo.f27076OooOo0o, debugMessage);
            o0oooo0oOooOOo.OooO0o(i);
            if (str != null) {
                o0oooo0oOooOOo.OooO0Oo();
                o0OOo000.OooOOO((o0OOo000) o0oooo0oOooOOo.f27076OooOo0o, str);
            }
            o0OOO00 o0ooo00OooOOo = o0OOO0.OooOOo();
            o0ooo00OooOOo.OooO0o0(o0oooo0oOooOOo);
            o0ooo00OooOOo.OooO0o(i2);
            return (o0OOO0) o0ooo00OooOOo.OooO0O0();
        } catch (Throwable th) {
            oOO00O.OooO("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static o0OOOO00 zzd(int i) {
        try {
            o0OOO0OO o0ooo0ooOooOOo0 = o0OOOO00.OooOOo0();
            o0ooo0ooOooOOo0.OooO0Oo();
            o0OOOO00.OooOOOo((o0OOOO00) o0ooo0ooOooOOo0.f27076OooOo0o, i);
            return (o0OOOO00) o0ooo0ooOooOOo0.OooO0O0();
        } catch (Exception e) {
            oOO00O.OooO("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}

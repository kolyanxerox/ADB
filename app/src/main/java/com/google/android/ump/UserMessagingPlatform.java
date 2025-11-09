package com.google.android.ump;

import OooO0oO.OooOOO0;
import Oooo.OooOOO;
import OoooO0O.o000O0o;
import OoooO0O.o000OOo;
import OoooO0O.o00O00O;
import OoooO0O.o00O0O0;
import OoooO0O.o00O0O0O;
import OoooO0O.o00Ooo;
import OoooO0O.o0O0ooO;
import OoooO0O.oOO00O;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import java.util.Objects;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class UserMessagingPlatform {

    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(@RecentlyNonNull FormError formError);
    }

    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(@RecentlyNonNull ConsentForm consentForm);
    }

    @RecentlyNonNull
    public static ConsentInformation getConsentInformation(@RecentlyNonNull Context context) {
        return (oOO00O) ((o0O0ooO) o00Ooo.OooO0O0(context).f14030OooO0oO).zza();
    }

    public static void loadAndShowConsentFormIfRequired(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        if (((oOO00O) ((o0O0ooO) o00Ooo.OooO0O0(activity).f14030OooO0oO).zza()).canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        o000OOo o000ooo2 = (o000OOo) ((o0O0ooO) o00Ooo.OooO0O0(activity).f14029OooO0o0).zza();
        o000O0o.OooO00o();
        OooOOO0 oooOOO0 = new OooOOO0(activity, false, onConsentFormDismissedListener, 12);
        Objects.requireNonNull(onConsentFormDismissedListener);
        o000ooo2.OooO00o(oooOOO0, new OooOO0(onConsentFormDismissedListener, 6));
    }

    public static void loadConsentForm(@RecentlyNonNull Context context, @RecentlyNonNull OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, @RecentlyNonNull OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        ((o000OOo) ((o0O0ooO) o00Ooo.OooO0O0(context).f14029OooO0o0).zza()).OooO00o(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public static void showPrivacyOptionsForm(@RecentlyNonNull Activity activity, @RecentlyNonNull final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        boolean z;
        boolean z2;
        o000OOo o000ooo2 = (o000OOo) ((o0O0ooO) o00Ooo.OooO0O0(activity).f14029OooO0o0).zza();
        o000ooo2.getClass();
        o000O0o.OooO00o();
        oOO00O ooo00o = (oOO00O) ((o0O0ooO) o00Ooo.OooO0O0(activity).f14030OooO0oO).zza();
        if (ooo00o == null) {
            final int i = 0;
            o000O0o.f13967OooO00o.post(new Runnable() { // from class: OoooO0O.o0O0O00
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(1, "No consentInformation.").OooO00o());
                            break;
                        case 1:
                            onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "No valid response received yet.").OooO00o());
                            break;
                        case 2:
                            onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "Privacy options form is not required.").OooO00o());
                            break;
                        default:
                            onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "Privacy options form is being loading. Please try again later.").OooO00o());
                            break;
                    }
                }
            });
            return;
        }
        if (ooo00o.isConsentFormAvailable() || ooo00o.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            if (ooo00o.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                final int i2 = 2;
                o000O0o.f13967OooO00o.post(new Runnable() { // from class: OoooO0O.o0O0O00
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(1, "No consentInformation.").OooO00o());
                                break;
                            case 1:
                                onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "No valid response received yet.").OooO00o());
                                break;
                            case 2:
                                onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "Privacy options form is not required.").OooO00o());
                                break;
                            default:
                                onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "Privacy options form is being loading. Please try again later.").OooO00o());
                                break;
                        }
                    }
                });
                return;
            }
            ConsentForm consentForm = (ConsentForm) o000ooo2.f13978OooO0Oo.get();
            if (consentForm == null) {
                final int i3 = 3;
                o000O0o.f13967OooO00o.post(new Runnable() { // from class: OoooO0O.o0O0O00
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(1, "No consentInformation.").OooO00o());
                                break;
                            case 1:
                                onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "No valid response received yet.").OooO00o());
                                break;
                            case 2:
                                onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "Privacy options form is not required.").OooO00o());
                                break;
                            default:
                                onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "Privacy options form is being loading. Please try again later.").OooO00o());
                                break;
                        }
                    }
                });
                return;
            } else {
                consentForm.show(activity, onConsentFormDismissedListener);
                o000ooo2.f13976OooO0O0.execute(new OooOOO(o000ooo2, 2));
                return;
            }
        }
        final int i4 = 1;
        o000O0o.f13967OooO00o.post(new Runnable() { // from class: OoooO0O.o0O0O00
            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(1, "No consentInformation.").OooO00o());
                        break;
                    case 1:
                        onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "No valid response received yet.").OooO00o());
                        break;
                    case 2:
                        onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "Privacy options form is not required.").OooO00o());
                        break;
                    default:
                        onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "Privacy options form is being loading. Please try again later.").OooO00o());
                        break;
                }
            }
        });
        if (ooo00o.OooO00o()) {
            synchronized (ooo00o.f14059OooO0o0) {
                z2 = ooo00o.f14060OooO0oO;
            }
            if (!z2) {
                synchronized (ooo00o.f14059OooO0o0) {
                    ooo00o.f14060OooO0oO = true;
                }
                ConsentRequestParameters consentRequestParameters = ooo00o.f14061OooO0oo;
                o00O00O o00o00o = new o00O00O(ooo00o);
                o00O00O o00o00o2 = new o00O00O(ooo00o);
                o00O0O0O o00o0o0o = ooo00o.f14055OooO0O0;
                o00o0o0o.getClass();
                o00o0o0o.f14013OooO0OO.execute(new o00O0O0(o00o0o0o, activity, consentRequestParameters, o00o00o, o00o00o2, 0));
                return;
            }
        }
        boolean zOooO00o = ooo00o.OooO00o();
        synchronized (ooo00o.f14059OooO0o0) {
            z = ooo00o.f14060OooO0oO;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zOooO00o + ", retryRequestIsInProgress=" + z);
    }
}

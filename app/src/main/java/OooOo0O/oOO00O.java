package OoooO0O;

import android.app.Activity;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class oOO00O implements ConsentInformation {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0OOO0o f14054OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O0O f14055OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o000OOo f14056OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f14057OooO0Oo = new Object();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Object f14059OooO0o0 = new Object();

    /* renamed from: OooO0o, reason: collision with root package name */
    public boolean f14058OooO0o = false;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public boolean f14060OooO0oO = false;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public ConsentRequestParameters f14061OooO0oo = new ConsentRequestParameters.Builder().build();

    public oOO00O(o0OOO0o o0ooo0o, o00O0O0O o00o0o0o, o000OOo o000ooo2) {
        this.f14054OooO00o = o0ooo0o;
        this.f14055OooO0O0 = o00o0o0o;
        this.f14056OooO0OO = o000ooo2;
    }

    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f14057OooO0Oo) {
            z = this.f14058OooO0o;
        }
        return z;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean canRequestAds() {
        o0OOO0o o0ooo0o = this.f14054OooO00o;
        if (!o0ooo0o.f14048OooO0O0.getBoolean("is_pub_misconfigured", false)) {
            int i = !OooO00o() ? 0 : o0ooo0o.f14048OooO0O0.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final int getConsentStatus() {
        if (OooO00o()) {
            return this.f14054OooO00o.f14048OooO0O0.getInt("consent_status", 0);
        }
        return 0;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus() {
        if (!OooO00o()) {
            return ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;
        }
        o0OOO0o o0ooo0o = this.f14054OooO00o;
        o0ooo0o.getClass();
        return ConsentInformation.PrivacyOptionsRequirementStatus.valueOf(o0ooo0o.f14048OooO0O0.getString("privacy_options_requirement_status", ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN.name()));
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean isConsentFormAvailable() {
        return this.f14056OooO0OO.f13977OooO0OO.get() != null;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void requestConsentInfoUpdate(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        synchronized (this.f14057OooO0Oo) {
            this.f14058OooO0o = true;
        }
        this.f14061OooO0oo = consentRequestParameters;
        o00O0O0O o00o0o0o = this.f14055OooO0O0;
        o00o0o0o.getClass();
        o00o0o0o.f14013OooO0OO.execute(new o00O0O0(o00o0o0o, activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener, 0));
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void reset() {
        this.f14056OooO0OO.f13977OooO0OO.set(null);
        o0OOO0o o0ooo0o = this.f14054OooO00o;
        HashSet hashSet = o0ooo0o.f14049OooO0OO;
        o000Oo0.OooO0Oo(o0ooo0o.f14047OooO00o, hashSet);
        hashSet.clear();
        o0ooo0o.f14048OooO0O0.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
        synchronized (this.f14057OooO0Oo) {
            this.f14058OooO0o = false;
        }
    }
}

package OoooO0O;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* loaded from: classes2.dex */
public final class o0OO00O implements UserMessagingPlatform.OnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final UserMessagingPlatform.OnConsentFormLoadSuccessListener f14044OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final UserMessagingPlatform.OnConsentFormLoadFailureListener f14045OooOo0o;

    public /* synthetic */ o0OO00O(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        this.f14044OooOo0O = onConsentFormLoadSuccessListener;
        this.f14045OooOo0o = onConsentFormLoadFailureListener;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public final void onConsentFormLoadFailure(FormError formError) {
        this.f14045OooOo0o.onConsentFormLoadFailure(formError);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        this.f14044OooOo0O.onConsentFormLoadSuccess(consentForm);
    }
}

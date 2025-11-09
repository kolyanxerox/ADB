package com.applovin.impl.privacy.cmp;

import com.applovin.impl.privacy.cmp.C1164a;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements ConsentInformation.OnConsentInfoUpdateFailureListener, UserMessagingPlatform.OnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ C1164a f15808OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1164a.a f15809OooOo0o;

    public /* synthetic */ OooO00o(C1164a c1164a, C1164a.a aVar) {
        this.f15808OooOo0O = c1164a;
        this.f15809OooOo0o = aVar;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        this.f15808OooOo0O.m2102a(this.f15809OooOo0o, formError);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        this.f15808OooOo0O.m2101a(this.f15809OooOo0o, consentForm);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        this.f15808OooOo0O.m2107b(this.f15809OooOo0o, formError);
    }
}

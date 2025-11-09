package OoooO0O;

import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00O00O implements ConsentInformation.OnConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ oOO00O f13993OooOo0O;

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        oOO00O ooo00o = this.f13993OooOo0O;
        synchronized (ooo00o.f14059OooO0o0) {
            ooo00o.f14060OooO0oO = false;
        }
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        oOO00O ooo00o = this.f13993OooOo0O;
        synchronized (ooo00o.f14059OooO0o0) {
            ooo00o.f14060OooO0oO = false;
        }
    }
}

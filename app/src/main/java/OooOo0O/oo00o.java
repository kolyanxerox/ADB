package OoooO0O;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;

/* loaded from: classes2.dex */
public final class oo00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Application f14063OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o f14064OooO0O0;

    public oo00o(Application application, o0OOO0o o0ooo0o) {
        this.f14063OooO00o = application;
        this.f14064OooO0O0 = o0ooo0o;
    }

    public final OooOOOo.o0ooOOo OooO00o(Activity activity, ConsentRequestParameters consentRequestParameters) {
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        if (consentDebugSettings == null) {
            consentDebugSettings = new ConsentDebugSettings.Builder(this.f14063OooO00o).build();
        }
        return o00O0.OooO00o(new o00O0(this, activity, consentDebugSettings, consentRequestParameters));
    }
}

package OoooO0O;

import OooO0oO.OooOOO0;
import Oooo.OooOOO;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.work.WorkRequest;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class oo0o0Oo implements ConsentForm {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Application f14066OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O f14067OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOO0o f14068OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o000000 f14069OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public Dialog f14070OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO0 f14071OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public o00000O0 f14072OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicBoolean f14073OooO0oo = new AtomicBoolean();

    /* renamed from: OooO, reason: collision with root package name */
    public final AtomicReference f14065OooO = new AtomicReference();

    /* renamed from: OooOO0, reason: collision with root package name */
    public final AtomicReference f14074OooOO0 = new AtomicReference();

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicReference f14075OooOO0O = new AtomicReference();
    public boolean OooOO0o = false;

    public oo0o0Oo(Application application, o00000O o00000o, o0OOO0o o0ooo0o, o000000 o000000Var, OooOOO0 oooOOO0) {
        this.f14066OooO00o = application;
        this.f14067OooO0O0 = o00000o;
        this.f14068OooO0OO = o0ooo0o;
        this.f14069OooO0Oo = o000000Var;
        this.f14071OooO0o0 = oooOOO0;
    }

    public final void OooO00o(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        o00000O0 o00000o0Zza = this.f14071OooO0o0.zza();
        this.f14072OooO0oO = o00000o0Zza;
        o00000o0Zza.setBackgroundColor(0);
        o00000o0Zza.getSettings().setJavaScriptEnabled(true);
        o00000o0Zza.getSettings().setAllowFileAccess(false);
        o00000o0Zza.getSettings().setAllowContentAccess(false);
        o00000o0Zza.setWebViewClient(new o00000(o00000o0Zza));
        this.f14065OooO.set(new o0OO00O(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener));
        o00000O0 o00000o02 = this.f14072OooO0oO;
        o000000 o000000Var = this.f14069OooO0Oo;
        o00000o02.loadDataWithBaseURL(o000000Var.f13910OooO00o, o000000Var.f13911OooO0O0, "text/html", "UTF-8", null);
        o000O0o.f13967OooO00o.postDelayed(new OooOOO(this, 1), WorkRequest.MIN_BACKOFF_MILLIS);
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        o000O0o.OooO00o();
        if (!this.f14073OooO0oo.compareAndSet(false, true)) {
            onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, true != this.OooOO0o ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").OooO00o());
            return;
        }
        o00000O0 o00000o02 = this.f14072OooO0oO;
        o0000Ooo o0000ooo = o00000o02.f13918OooOo0o;
        Objects.requireNonNull(o0000ooo);
        o00000o02.f13917OooOo0O.post(new o000000O(o0000ooo, 0));
        o0Oo0oo o0oo0oo = new o0Oo0oo(this, activity);
        this.f14066OooO00o.registerActivityLifecycleCallbacks(o0oo0oo);
        this.f14075OooOO0O.set(o0oo0oo);
        this.f14067OooO0O0.f13914OooO00o = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f14072OooO0oO);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            onConsentFormDismissedListener.onConsentFormDismissed(new o00O00(3, "Activity with null windows is passed in.").OooO00o());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        this.f14074OooOO0.set(onConsentFormDismissedListener);
        dialog.show();
        this.f14070OooO0o = dialog;
        this.f14072OooO0oO.OooO00o("UMP_messagePresented", "");
    }
}

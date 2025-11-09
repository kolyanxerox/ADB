package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.C1246t0;
import com.applovin.impl.C1255u0;
import com.applovin.impl.C1273w0;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.C1333R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.y0 */
/* loaded from: classes.dex */
public class C1291y0 {

    /* renamed from: a */
    private final C1220k f3092a;

    /* renamed from: b */
    private final int f3093b;

    /* renamed from: c */
    private List f3094c;

    /* renamed from: d */
    private String f3095d;

    /* renamed from: e */
    private C1255u0 f3096e;

    /* renamed from: f */
    private C1246t0.c f3097f;

    /* renamed from: g */
    private C1255u0 f3098g;

    /* renamed from: h */
    private Dialog f3099h;

    /* renamed from: i */
    private C1246t0.b f3100i = new C1246t0.b();

    /* renamed from: j */
    private final AbstractC0980b f3101j = new a();

    /* renamed from: com.applovin.impl.y0$a */
    public class a extends AbstractC0980b {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || C1291y0.this.f3098g == null) {
                return;
            }
            if (C1291y0.this.f3099h != null) {
                C1291y0 c1291y0 = C1291y0.this;
                if (!AbstractC1000d.m510d(c1291y0.m3684a(c1291y0.f3099h))) {
                    C1291y0.this.f3099h.dismiss();
                }
                C1291y0.this.f3099h = null;
            }
            C1255u0 c1255u0 = C1291y0.this.f3098g;
            C1291y0.this.f3098g = null;
            C1291y0 c1291y02 = C1291y0.this;
            c1291y02.m3694a(c1291y02.f3096e, c1255u0, activity);
        }
    }

    /* renamed from: com.applovin.impl.y0$b */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C1273w0 f3103a;

        /* renamed from: b */
        final /* synthetic */ C1255u0 f3104b;

        /* renamed from: c */
        final /* synthetic */ Activity f3105c;

        public b(C1273w0 c1273w0, C1255u0 c1255u0, Activity activity) {
            this.f3103a = c1273w0;
            this.f3104b = c1255u0;
            this.f3105c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C1291y0.this.f3098g = null;
            C1291y0.this.f3099h = null;
            C1255u0 c1255u0M3686a = C1291y0.this.m3686a(this.f3103a.m3582a());
            if (c1255u0M3686a == null) {
                C1291y0.this.m3699a("Destination state for TOS/PP alert is null");
                return;
            }
            C1291y0.this.m3694a(this.f3104b, c1255u0M3686a, this.f3105c);
            if (c1255u0M3686a.m3386c() != C1255u0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.applovin.impl.y0$c */
    public class c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Uri f3107a;

        /* renamed from: b */
        final /* synthetic */ Activity f3108b;

        public c(Uri uri, Activity activity) {
            this.f3107a = uri;
            this.f3108b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC1078k7.m1185a(this.f3107a, this.f3108b, C1291y0.this.f3092a);
        }
    }

    /* renamed from: com.applovin.impl.y0$d */
    public class d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Uri f3110a;

        /* renamed from: b */
        final /* synthetic */ Activity f3111b;

        public d(Uri uri, Activity activity) {
            this.f3110a = uri;
            this.f3111b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC1078k7.m1185a(this.f3110a, this.f3111b, C1291y0.this.f3092a);
        }
    }

    /* renamed from: com.applovin.impl.y0$e */
    public class e implements CmpServiceImpl.InterfaceC1162e {

        /* renamed from: a */
        final /* synthetic */ C1255u0 f3113a;

        /* renamed from: b */
        final /* synthetic */ Activity f3114b;

        public e(C1255u0 c1255u0, Activity activity) {
            this.f3113a = c1255u0;
            this.f3114b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.InterfaceC1162e
        /* renamed from: a */
        public void mo2095a(AppLovinCmpError appLovinCmpError) {
            C1291y0.this.f3100i.m3290a(appLovinCmpError);
            C1291y0.this.m3693a(this.f3113a, this.f3114b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* renamed from: com.applovin.impl.y0$f */
    public class f implements CmpServiceImpl.InterfaceC1162e {

        /* renamed from: a */
        final /* synthetic */ C1255u0 f3116a;

        /* renamed from: b */
        final /* synthetic */ Activity f3117b;

        public f(C1255u0 c1255u0, Activity activity) {
            this.f3116a = c1255u0;
            this.f3117b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.InterfaceC1162e
        /* renamed from: a */
        public void mo2095a(AppLovinCmpError appLovinCmpError) {
            C1291y0.this.f3100i.m3290a(appLovinCmpError);
            C1291y0.this.m3693a(this.f3116a, this.f3117b, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    /* renamed from: com.applovin.impl.y0$g */
    public class g implements CmpServiceImpl.InterfaceC1163f {

        /* renamed from: a */
        final /* synthetic */ C1255u0 f3119a;

        /* renamed from: b */
        final /* synthetic */ Activity f3120b;

        public g(C1255u0 c1255u0, Activity activity) {
            this.f3119a = c1255u0;
            this.f3120b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.InterfaceC1163f
        /* renamed from: a */
        public void mo2096a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                C1291y0.this.f3100i.m3290a(appLovinCmpError);
            } else {
                C1291y0.this.f3100i.m3293c();
            }
            C1291y0.this.m3703b(this.f3119a, this.f3120b);
        }
    }

    /* renamed from: com.applovin.impl.y0$h */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1255u0 f3122a;

        public h(C1255u0 c1255u0) {
            this.f3122a = c1255u0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1291y0 c1291y0 = C1291y0.this;
            c1291y0.m3694a(c1291y0.f3096e, this.f3122a, C1291y0.this.f3092a.m2926v0());
        }
    }

    public C1291y0(C1220k c1220k) {
        this.f3092a = c1220k;
        this.f3093b = ((Integer) c1220k.m2866a(C1268v4.f2641N6)).intValue();
    }

    /* renamed from: c */
    private void m3705c(C1255u0 c1255u0, Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new androidx.webkit.OooO00o(this, c1255u0, activity, 19));
    }

    /* renamed from: b */
    public void m3703b(C1255u0 c1255u0, Activity activity) {
        m3693a(c1255u0, activity, (Boolean) null);
    }

    /* renamed from: b */
    private void m3702b() {
        this.f3094c = null;
        this.f3096e = null;
        this.f3092a.m2893e().m440b(this.f3101j);
        C1246t0.c cVar = this.f3097f;
        if (cVar != null) {
            cVar.mo63a(this.f3100i);
            this.f3097f = null;
        }
        this.f3100i = new C1246t0.b();
    }

    /* renamed from: a */
    public void m3709a(Activity activity, C1246t0.c cVar) {
        m3708a(C1255u0.a.IS_AL_GDPR.m3388b(), activity, cVar);
    }

    /* renamed from: a */
    public void m3708a(int i, Activity activity, C1246t0.c cVar) {
        if (this.f3094c != null) {
            this.f3092a.m2847O();
            if (C1240o.m3200a()) {
                this.f3092a.m2847O().m3211a("ConsentFlowStateMachine", "Unable to start states: " + this.f3094c);
            }
            this.f3092a.m2847O();
            if (C1240o.m3200a()) {
                this.f3092a.m2847O().m3211a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f3094c);
            }
            cVar.mo63a(new C1246t0.b(new C1184s0(C1184s0.f1871d, "Consent flow is already in progress.")));
            return;
        }
        List listM3819a = AbstractC1300z0.m3819a(this.f3092a);
        this.f3094c = listM3819a;
        this.f3095d = String.valueOf(listM3819a);
        this.f3097f = cVar;
        C1255u0 c1255u0M3686a = m3686a(i);
        this.f3092a.m2847O();
        if (C1240o.m3200a()) {
            this.f3092a.m2847O().m3211a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f3094c + "\nInitial state: " + c1255u0M3686a);
        }
        C1220k.m2793a(activity).m438a(this.f3101j);
        m3694a((C1255u0) null, c1255u0M3686a, activity);
    }

    /* renamed from: a */
    public boolean m3710a() {
        return this.f3094c != null;
    }

    /* renamed from: a */
    public void m3693a(C1255u0 c1255u0, Activity activity, Boolean bool) {
        m3694a(c1255u0, m3686a(c1255u0.m3382a(bool)), activity);
    }

    /* renamed from: a */
    public void m3694a(C1255u0 c1255u0, C1255u0 c1255u02, Activity activity) {
        this.f3096e = c1255u0;
        m3705c(c1255u02, activity);
    }

    /* renamed from: a */
    public /* synthetic */ void m3692a(C1255u0 c1255u0, final Activity activity) {
        SpannableString spannableString;
        if (c1255u0 == null) {
            m3699a("Consent flow state is null");
            return;
        }
        this.f3092a.m2847O();
        if (C1240o.m3200a()) {
            this.f3092a.m2847O().m3211a("ConsentFlowStateMachine", "Transitioning to state: " + c1255u0);
        }
        if (c1255u0.m3386c() == C1255u0.b.ALERT) {
            if (AbstractC1000d.m510d(activity)) {
                m3691a(c1255u0);
                return;
            }
            this.f3092a.m2836G().trackEvent("cf_start");
            C1264v0 c1264v0 = (C1264v0) c1255u0;
            this.f3098g = c1264v0;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            for (C1273w0 c1273w0 : c1264v0.m3422d()) {
                b bVar = new b(c1273w0, c1255u0, activity);
                if (c1273w0.m3584c() == C1273w0.a.POSITIVE) {
                    builder.setPositiveButton(c1273w0.m3585d(), bVar);
                } else if (c1273w0.m3584c() == C1273w0.a.NEGATIVE) {
                    builder.setNegativeButton(c1273w0.m3585d(), bVar);
                } else {
                    builder.setNeutralButton(c1273w0.m3585d(), bVar);
                }
            }
            String strM3424f = c1264v0.m3424f();
            if (StringUtils.isValidString(strM3424f)) {
                spannableString = new SpannableString(strM3424f);
                String strM2796a = C1220k.m2796a(C1333R.string.applovin_terms_of_service_text);
                String strM2796a2 = C1220k.m2796a(C1333R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strM3424f, Arrays.asList(strM2796a, strM2796a2))) {
                    Uri uriM3282h = this.f3092a.m2931y().m3282h();
                    if (uriM3282h != null) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strM2796a), new c(uriM3282h, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strM2796a2), new d(this.f3092a.m2931y().m3280f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(c1264v0.m3423e()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.o000O0Oo
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f15754OooO00o.m3690a(alertDialogCreate, activity, dialogInterface);
                }
            });
            this.f3099h = alertDialogCreate;
            alertDialogCreate.show();
            this.f3100i.m3294d();
            return;
        }
        if (c1255u0.m3386c() == C1255u0.b.POST_ALERT) {
            if (this.f3092a.m2931y().m3285k() && this.f3092a.m2931y().m3287m()) {
                if (AbstractC1000d.m510d(activity)) {
                    m3691a(c1255u0);
                    return;
                } else {
                    this.f3092a.m2921t().loadCmp(activity, new e(c1255u0, activity));
                    return;
                }
            }
            m3693a(c1255u0, activity, Boolean.FALSE);
            return;
        }
        if (c1255u0.m3386c() == C1255u0.b.EVENT) {
            C1282x0 c1282x0 = (C1282x0) c1255u0;
            String strM3638e = c1282x0.m3638e();
            Map<String, ?> mapM3637d = c1282x0.m3637d();
            if (mapM3637d == null) {
                mapM3637d = new HashMap<>(1);
            }
            mapM3637d.put("flow_type", "unified");
            this.f3092a.m2836G().trackEvent(strM3638e, mapM3637d);
            m3703b(c1282x0, activity);
            return;
        }
        if (c1255u0.m3386c() == C1255u0.b.CMP_LOAD) {
            if (AbstractC1000d.m510d(activity)) {
                m3691a(c1255u0);
                return;
            } else if (this.f3092a.m2931y().m3287m()) {
                this.f3092a.m2921t().preloadCmp(activity);
                m3693a(c1255u0, activity, Boolean.FALSE);
                return;
            } else {
                this.f3092a.m2921t().loadCmp(activity, new f(c1255u0, activity));
                return;
            }
        }
        if (c1255u0.m3386c() == C1255u0.b.CMP_SHOW) {
            if (AbstractC1000d.m510d(activity)) {
                m3691a(c1255u0);
                return;
            }
            if (!this.f3092a.m2931y().m3287m()) {
                this.f3092a.m2836G().trackEvent("cf_start");
            }
            this.f3092a.m2921t().showCmp(activity, new g(c1255u0, activity));
            return;
        }
        if (c1255u0.m3386c() == C1255u0.b.DECISION) {
            C1255u0.a aVarM3383a = c1255u0.m3383a();
            if (aVarM3383a == C1255u0.a.IS_AL_GDPR) {
                m3693a(c1255u0, activity, Boolean.valueOf(this.f3092a.m2931y().m3285k()));
                return;
            }
            if (aVarM3383a == C1255u0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                m3693a(c1255u0, activity, Boolean.valueOf(!this.f3092a.m2826A0() || ((Boolean) this.f3092a.m2868a(C1286x4.f3064s, Boolean.FALSE)).booleanValue()));
                return;
            } else {
                if (aVarM3383a == C1255u0.a.HAS_TERMS_OF_SERVICE_URI) {
                    m3693a(c1255u0, activity, Boolean.valueOf(this.f3092a.m2931y().m3282h() != null));
                    return;
                }
                m3699a("Invalid consent flow decision type: " + aVarM3383a);
                return;
            }
        }
        if (c1255u0.m3386c() == C1255u0.b.REINIT) {
            m3702b();
            return;
        }
        m3699a("Invalid consent flow destination state: " + c1255u0);
    }

    /* renamed from: a */
    public /* synthetic */ void m3690a(AlertDialog alertDialog, Activity activity, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f3093b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
    }

    /* renamed from: a */
    private void m3691a(C1255u0 c1255u0) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(c1255u0), TimeUnit.SECONDS.toMillis(1L));
    }

    /* renamed from: a */
    public void m3699a(String str) {
        AbstractC1072k1.m1126a(str, new Object[0]);
        this.f3092a.m2832E().m572a(C0993c2.f468B0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f3095d + "\nLast successful state: " + this.f3096e));
        C1246t0.b bVar = this.f3100i;
        if (bVar != null) {
            bVar.m3289a(new C1184s0(C1184s0.f1872e, str));
        }
        m3702b();
    }

    /* renamed from: a */
    public C1255u0 m3686a(int i) {
        List<C1255u0> list = this.f3094c;
        if (list == null) {
            return null;
        }
        for (C1255u0 c1255u0 : list) {
            if (i == c1255u0.m3384b()) {
                return c1255u0;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Activity m3684a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }
}

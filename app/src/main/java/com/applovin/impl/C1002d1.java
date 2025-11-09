package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.net.MailTo;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.AbstractC1000d;
import com.applovin.impl.C1082l1;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1333R;
import com.ironsource.C3034d9;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.d1 */
/* loaded from: classes.dex */
public class C1002d1 implements C1082l1.a {

    /* renamed from: m */
    private static WeakReference f617m;

    /* renamed from: n */
    private static final AtomicBoolean f618n = new AtomicBoolean();

    /* renamed from: a */
    private final C1220k f619a;

    /* renamed from: b */
    private final Context f620b;

    /* renamed from: e */
    private final C0992c1 f623e;

    /* renamed from: g */
    private C1082l1 f625g;

    /* renamed from: h */
    private C1008d7 f626h;

    /* renamed from: i */
    private int f627i;

    /* renamed from: j */
    private boolean f628j;

    /* renamed from: k */
    private long f629k;

    /* renamed from: l */
    private boolean f630l;

    /* renamed from: c */
    private final List f621c = new ArrayList(10);

    /* renamed from: d */
    private final Object f622d = new Object();

    /* renamed from: f */
    private WeakReference f624f = new WeakReference(null);

    /* renamed from: com.applovin.impl.d1$a */
    public class a extends AbstractC0980b {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                C1240o.m3206g("AppLovinSdk", "Started Creative Debugger");
                if (!C1002d1.this.m542h() || C1002d1.f617m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = C1002d1.f617m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.m326a(C1002d1.this.f623e, C1002d1.this.f619a.m2893e());
                }
                C1002d1.f618n.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                C1240o.m3206g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = C1002d1.f617m = null;
            }
        }
    }

    /* renamed from: com.applovin.impl.d1$b */
    public class b implements AbstractC1000d.b {

        /* renamed from: a */
        final /* synthetic */ Object f632a;

        public b(Object obj) {
            this.f632a = obj;
        }

        @Override // com.applovin.impl.AbstractC1000d.b
        /* renamed from: a */
        public void mo327a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.m1885a(new C1151p1(this.f632a, C1002d1.this.f619a.m2839I().m3045b()), C1002d1.this.f619a);
            C1002d1.f618n.set(false);
        }
    }

    public C1002d1(C1220k c1220k) {
        this.f619a = c1220k;
        Context contextM2824o = C1220k.m2824o();
        this.f620b = contextM2824o;
        this.f623e = new C0992c1(contextM2824o);
    }

    /* renamed from: e */
    private void m540e(Object obj) {
        C1240o.m3206g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        AbstractC1000d.m506a(this.f620b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f619a.m2893e(), new b(obj));
    }

    /* renamed from: f */
    private Drawable m541f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* renamed from: h */
    public boolean m542h() {
        WeakReference weakReference = f617m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: i */
    public /* synthetic */ void m543i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f629k);
        if (this.f629k == 0 || seconds < 10) {
            return;
        }
        this.f619a.m2832E().m571a(C0993c2.f509d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f619a.m2863Y0();
    }

    /* renamed from: j */
    public /* synthetic */ void m544j() {
        this.f627i = 0;
    }

    /* renamed from: m */
    private void m545m() {
        this.f619a.m2893e().m438a(new a());
    }

    /* renamed from: g */
    public boolean m552g() {
        return ((Boolean) this.f619a.m2866a(C1268v4.f2805i1)).booleanValue() && this.f619a.m2912o0().isCreativeDebuggerEnabled();
    }

    /* renamed from: k */
    public void m553k() {
        C1082l1 c1082l1 = this.f625g;
        if (c1082l1 != null) {
            c1082l1.m1282b();
        }
    }

    /* renamed from: l */
    public void m554l() {
        if (m552g()) {
            this.f628j = ((Boolean) this.f619a.m2866a(C1268v4.f2813j1)).booleanValue();
            if (this.f625g == null) {
                this.f625g = new C1082l1(this.f619a, this);
            }
            this.f625g.m1281a();
        }
    }

    /* renamed from: n */
    public void m555n() {
        ArrayList arrayList;
        if (m542h() || !f618n.compareAndSet(false, true)) {
            C1240o.m3207h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objM3041a = this.f619a.m2839I().m3041a();
        if (objM3041a != null) {
            m540e(objM3041a);
            return;
        }
        synchronized (this.f622d) {
            arrayList = new ArrayList(this.f621c);
        }
        this.f623e.m444a(arrayList, this.f619a);
        if (!this.f630l) {
            m545m();
            this.f630l = true;
        }
        C1240o.m3206g("AppLovinSdk", "Starting Creative Debugger...");
        AbstractC1000d.m505a(this.f620b, MaxCreativeDebuggerActivity.class);
    }

    @Override // com.applovin.impl.C1082l1.a
    /* renamed from: b */
    public void mo550b() {
        if (this.f627i == 0) {
            this.f626h = C1008d7.m629a(TimeUnit.SECONDS.toMillis(3L), this.f619a, new OooOOO(this, 1));
        }
        int i = this.f627i;
        if (i % 2 == 0) {
            this.f627i = i + 1;
        }
    }

    /* renamed from: d */
    public void m551d(Object obj) {
        if (m552g() && obj != null) {
            if (!AbstractC1249t3.m3322a(obj) || m537c(obj)) {
                if (AbstractC1249t3.m3327b(obj) && m537c(obj)) {
                    return;
                }
                synchronized (this.f622d) {
                    try {
                        this.f621c.add(0, new C1151p1(obj, System.currentTimeMillis()));
                        if (this.f621c.size() > 10) {
                            this.f621c.remove(r6.size() - 1);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m537c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof AbstractC1207b) {
            format = ((AbstractC1207b) obj).getAdZone().m3374d();
        } else {
            format = obj instanceof AbstractC1266v2 ? ((AbstractC1266v2) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    /* renamed from: e */
    public void m539e() {
        if (m552g() && this.f624f.get() == null && !m542h()) {
            Activity activityM439b = this.f619a.m2893e().m439b();
            if (activityM439b == null) {
                this.f619a.m2847O();
                if (C1240o.m3200a()) {
                    this.f619a.m2847O().m3214b("AppLovinSdk", "Failed to display Creative Debugger button");
                }
            } else {
                View viewFindViewById = activityM439b.findViewById(R.id.content);
                if (viewFindViewById instanceof FrameLayout) {
                    FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                    View viewM526a = m526a(frameLayout, activityM439b);
                    frameLayout.addView(viewM526a);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150L);
                    viewM526a.startAnimation(alphaAnimation);
                    ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                    OooOOOO oooOOOO = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.OooOOOO

                        /* renamed from: OooOo */
                        public final /* synthetic */ FrameLayout f15590OooOo;

                        /* renamed from: OooOo0o */
                        public final /* synthetic */ View f15592OooOo0o;

                        public /* synthetic */ OooOOOO(View viewM526a2, FrameLayout frameLayout2) {
                            view = viewM526a2;
                            frameLayout = frameLayout2;
                        }

                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            this.f15591OooOo0O.m529a(view, frameLayout);
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(oooOOOO);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new OooOo00(this, viewM526a2, frameLayout2, viewTreeObserver, oooOOOO, 0), TimeUnit.SECONDS.toMillis(5L));
                    this.f624f = new WeakReference(viewM526a2);
                }
            }
        }
    }

    @Override // com.applovin.impl.C1082l1.a
    /* renamed from: a */
    public void mo547a() {
        int i = this.f627i;
        if (i % 2 == 1) {
            this.f627i = i + 1;
        }
        if (this.f627i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new OooOOO(this, 0));
            this.f627i = 0;
            this.f626h.m640a();
        }
    }

    /* renamed from: b */
    private void m534b(View view, FrameLayout frameLayout) {
        if (this.f628j) {
            view.setOnTouchListener(null);
            this.f629k = 0L;
        }
        frameLayout.removeView(view);
        this.f624f = new WeakReference(null);
    }

    /* renamed from: a */
    public /* synthetic */ void m529a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f624f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* renamed from: a */
    public /* synthetic */ void m530a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f629k > 0 && this.f628j) {
            view.setVisibility(4);
        } else {
            m534b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: b */
    public String m549b(Object obj) {
        JSONObject jSONObjectM1119a;
        if (obj instanceof AbstractC1207b) {
            return ((AbstractC1207b) obj).getOriginalFullResponse().toString();
        }
        if (!(obj instanceof AbstractC1266v2)) {
            return null;
        }
        String strM3508E = ((AbstractC1266v2) obj).m3508E();
        return (!AbstractC1249t3.m3327b(obj) || (jSONObjectM1119a = new C1070k(strM3508E, this.f619a).m1119a()) == null) ? strM3508E : jSONObjectM1119a.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.widget.ImageButton, android.widget.ImageView] */
    /* renamed from: a */
    private View m526a(final FrameLayout frameLayout, Activity activity) {
        Button button;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            ?? imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(C1333R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i, i, i, i * 2);
            button = imageButton;
        } catch (Throwable unused) {
            Button button2 = new Button(activity);
            button2.setText("ⓘ");
            button2.setTextColor(-1);
            button2.setAllCaps(false);
            button2.setTextSize(2, 20.0f);
            button2.setPadding(0, 0, 0, 0);
            button = button2;
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(m541f());
        if (this.f628j) {
            button.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.OooOo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f15593OooOo0O.m531a(frameLayout, view, motionEvent);
                }
            });
        } else {
            button.setOnClickListener(new Oooo000(this, 0));
        }
        if (AbstractC1141o0.m1949e()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    /* renamed from: a */
    public /* synthetic */ boolean m531a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f629k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new OooOOO(this, 2), TimeUnit.SECONDS.toMillis(10L));
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (view.getVisibility() == 0) {
            this.f629k = 0L;
            m555n();
            return true;
        }
        m534b(view, frameLayout);
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ void m528a(View view) {
        m555n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Serializable, java.lang.Object[]] */
    /* renamed from: a */
    public void m548a(C1151p1 c1151p1, Context context, boolean z) {
        Object objM2053a = c1151p1.m2053a();
        String strM546a = m546a(c1151p1);
        C1186s2 c1186s2 = new C1186s2();
        if (z) {
            c1186s2.m2371b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        c1186s2.m2371b(strM546a);
        String strM549b = this.f619a.m2933z().m549b(objM2053a);
        if (strM549b != null) {
            c1186s2.m2367a("\nBid Response:\n");
            c1186s2.m2367a(strM549b);
        }
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", objM2053a instanceof AbstractC1207b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", c1186s2.toString()).setPackage(null), "Share Ad Report");
        if (z) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME)).putExtra("android.intent.extra.SUBJECT", objM2053a instanceof AbstractC1207b ? "AppLovin Ad Report" : "MAX Ad Report").putExtra("android.intent.extra.TEXT", c1186s2.toString()).setPackage("com.google.android.gm");
                String str = this.f619a.m2912o0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str).toArray());
                }
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(intentCreateChooser);
                return;
            }
        }
        context.startActivity(intentCreateChooser);
    }

    /* renamed from: a */
    public String m546a(C1151p1 c1151p1) {
        Object objM2053a = c1151p1.m2053a();
        C1186s2 c1186s2 = new C1186s2();
        c1186s2.m2371b("Ad Info:\n");
        if (objM2053a instanceof AbstractC1207b) {
            AbstractC1207b abstractC1207b = (AbstractC1207b) objM2053a;
            c1186s2.m2368a(AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").m2364a(abstractC1207b).m2370b(abstractC1207b);
        } else if (objM2053a instanceof AbstractC1266v2) {
            c1186s2.m2366a((AbstractC1266v2) objM2053a);
        }
        c1186s2.m2365a(this.f619a);
        c1186s2.m2368a("Epoch Timestamp (ms)", Long.valueOf(c1151p1.m2054b()));
        c1186s2.m2367a("\nDebug Info:\n").m2368a("Platform", "fireos".equals(this.f619a.m2827B().m3000y()) ? "Fire OS" : C3034d9.f7893d).m2368a("AppLovin SDK Version", AppLovinSdk.VERSION).m2368a("Plugin Version", this.f619a.m2866a(C1268v4.f2598I3)).m2368a("App Package Name", this.f620b.getPackageName()).m2368a("Device", Build.BRAND + org.apache.tika.utils.StringUtils.SPACE + Build.MODEL + " (" + Build.DEVICE + ")").m2368a("OS Version", Build.VERSION.RELEASE).m2368a("AppLovin Random Token", this.f619a.m2902i0()).m2368a("Ad Review Version", C1060j.m1024b()).m2362a(m525a(objM2053a)).m2368a("User ID", this.f619a.m2930x0().m1108e() != null ? this.f619a.m2930x0().m1108e() : OfficeOpenXMLExtended.SECURITY_NONE).m2368a("MD", this.f619a.m2866a(C1268v4.f2891t));
        return c1186s2.toString();
    }

    /* renamed from: a */
    private Bundle m525a(Object obj) {
        this.f619a.m2847O();
        if (C1240o.m3200a()) {
            this.f619a.m2847O().m3211a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strM1172a = AbstractC1078k7.m1172a(obj);
        Bundle bundleM1027a = this.f619a.m2903j().m1027a(strM1172a);
        this.f619a.m2847O();
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Serve id: ", strM1172a, this.f619a.m2847O(), "CreativeDebuggerService");
        }
        this.f619a.m2847O();
        if (C1240o.m3200a()) {
            this.f619a.m2847O().m3211a("CreativeDebuggerService", "Public data: " + bundleM1027a);
        }
        if (bundleM1027a == null) {
            return null;
        }
        for (String str : bundleM1027a.keySet()) {
            Object obj2 = bundleM1027a.get(str);
            bundleM1027a.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleM1027a);
        }
        return bundleM1027a;
    }
}

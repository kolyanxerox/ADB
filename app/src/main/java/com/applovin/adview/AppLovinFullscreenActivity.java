package com.applovin.adview;

import OooO0Oo.OooO0O0;
import OooOo0o.o000oOoO;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import androidx.core.view.ViewCompat;
import com.applovin.impl.AbstractC0989b8;
import com.applovin.impl.AbstractC1000d;
import com.applovin.impl.AbstractC1013e2;
import com.applovin.impl.AbstractC1030g;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.AbstractC1265v1;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1010e;
import com.applovin.impl.C1031g0;
import com.applovin.impl.C1093m2;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1286x4;
import com.applovin.impl.InterfaceC1092m1;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.ServiceConnectionC0966a;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3034d9;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements InterfaceC1092m1 {

    /* renamed from: h */
    private static final Set f136h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    private static final Object f137i = new Object();
    public static C1093m2 parentInterstitialWrapper;

    /* renamed from: a */
    private C1220k f138a;

    /* renamed from: b */
    private AbstractC1265v1 f139b;

    /* renamed from: c */
    private final AtomicBoolean f140c = new AtomicBoolean(true);

    /* renamed from: d */
    private ServiceConnectionC0966a f141d;

    /* renamed from: e */
    private C0948c f142e;

    /* renamed from: f */
    private C1031g0 f143f;

    /* renamed from: g */
    private long f144g;

    /* renamed from: com.applovin.adview.AppLovinFullscreenActivity$a */
    public class ViewOnApplyWindowInsetsListenerC0946a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ Boolean f145a;

        /* renamed from: b */
        final /* synthetic */ boolean f146b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1207b f147c;

        public ViewOnApplyWindowInsetsListenerC0946a(Boolean bool, boolean z, AbstractC1207b abstractC1207b) {
            this.f145a = bool;
            this.f146b = z;
            this.f147c = abstractC1207b;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f145a.booleanValue()) {
                AppLovinFullscreenActivity.this.m48a(windowInsets);
            }
            if (!this.f146b) {
                Insets insets = windowInsets.getInsets(((Integer) AppLovinFullscreenActivity.this.f138a.m2866a(C1268v4.f2886s2)).intValue());
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                return windowInsets;
            }
            int iIntValue = ((Integer) AppLovinFullscreenActivity.this.f138a.m2866a(C1268v4.f2886s2)).intValue();
            Insets insets2 = windowInsets.getInsets(this.f147c.m2555R0() ? iIntValue & (~WindowInsets.Type.displayCutout()) : iIntValue | WindowInsets.Type.displayCutout());
            view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
            return windowInsets;
        }
    }

    /* renamed from: com.applovin.adview.AppLovinFullscreenActivity$c */
    public static class C0948c implements OnBackInvokedCallback {

        /* renamed from: a */
        private final Runnable f150a;

        public C0948c(Runnable runnable) {
            this.f150a = runnable;
        }

        public void onBackInvoked() {
            this.f150a.run();
        }
    }

    /* renamed from: b */
    private void m54b() {
        C1220k c1220k = this.f138a;
        if (c1220k == null || !((Boolean) c1220k.m2866a(C1268v4.f2918w2)).booleanValue()) {
            return;
        }
        Long l = (Long) this.f138a.m2866a(C1268v4.f2926x2);
        this.f143f = C1031g0.m769a(l.longValue(), true, this.f138a, new OooO0O0(10, this, l));
    }

    /* renamed from: c */
    public void m55c() {
        AbstractC1265v1 abstractC1265v1 = this.f139b;
        if (abstractC1265v1 != null) {
            abstractC1265v1.m3484p();
        }
        if (AbstractC1078k7.m1245g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    @Override // com.applovin.impl.InterfaceC1092m1
    public void dismiss(String str) {
        if (AbstractC1141o0.m1955k() && this.f142e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f142e);
            this.f142e = null;
        }
        AbstractC1265v1 abstractC1265v1 = this.f139b;
        if (abstractC1265v1 != null) {
            abstractC1265v1.mo3462a(str);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m55c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC1265v1 abstractC1265v1 = this.f139b;
        if (abstractC1265v1 != null) {
            abstractC1265v1.m3457a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            C1240o.m3209j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            C1240o.m3204c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            C1093m2 c1093m2 = parentInterstitialWrapper;
            if (c1093m2 != null && c1093m2.m1471f() != null) {
                C1093m2.m1453a(parentInterstitialWrapper.m1471f(), parentInterstitialWrapper.m1469c(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        this.f138a = AppLovinSdk.getInstance(this).m3943a();
        C1093m2 c1093m22 = parentInterstitialWrapper;
        AbstractC1207b abstractC1207bM1471f = c1093m22 != null ? c1093m22.m1471f() : null;
        Boolean bool = (Boolean) this.f138a.m2866a(C1268v4.f2543B4);
        boolean z = abstractC1207bM1471f != null && abstractC1207bM1471f.m2566X0();
        if (AbstractC1141o0.m1942b() && (bool.booleanValue() || z)) {
            getWindow().setDecorFitsSystemWindows(false);
            viewFindViewById.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0946a(bool, z, abstractC1207bM1471f));
            m51a(abstractC1207bM1471f);
        } else {
            viewFindViewById.setFitsSystemWindows(true);
            if (AbstractC1141o0.m1942b()) {
                AbstractC0989b8.m427a(viewFindViewById, this.f138a);
            }
            m51a(abstractC1207bM1471f);
        }
        if (abstractC1207bM1471f != null && abstractC1207bM1471f.m2529B0()) {
            AbstractC1030g.m766a(abstractC1207bM1471f, this, this.f138a);
        }
        if (AbstractC1141o0.m1955k() && ((Boolean) this.f138a.m2866a(C1268v4.f2696U5)).booleanValue()) {
            this.f142e = new C0948c(new o000oOoO(this, 6));
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f142e);
        }
        m47a();
        m54b();
        Integer num = (Integer) this.f138a.m2866a(C1268v4.f2914v6);
        if (num.intValue() > 0) {
            synchronized (f137i) {
                Set set = f136h;
                set.add(this);
                AbstractC1078k7.m1190a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.f138a.m2832E());
            }
        }
        C1093m2 c1093m23 = parentInterstitialWrapper;
        if (c1093m23 != null) {
            AbstractC1265v1.m3431a(c1093m23.m1471f(), parentInterstitialWrapper.m1468b(), parentInterstitialWrapper.m1469c(), parentInterstitialWrapper.m1470d(), parentInterstitialWrapper.m1472h(), this.f138a, this, new C0947b());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        ServiceConnectionC0966a serviceConnectionC0966a = new ServiceConnectionC0966a(this, this.f138a);
        this.f141d = serviceConnectionC0966a;
        bindService(intent, serviceConnectionC0966a, 1);
        if (AbstractC1141o0.m1953i()) {
            String str = this.f138a.m2912o0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C1220k c1220k = this.f138a;
        if (c1220k != null && ((Boolean) c1220k.m2866a(C1268v4.f2910v2)).booleanValue()) {
            this.f138a.m2916q0().m3800b(C1286x4.f3041M);
            this.f138a.m2916q0().m3800b(C1286x4.f3043O);
            this.f138a.m2916q0().m3800b(C1286x4.f3044P);
        }
        if (this.f143f != null) {
            this.f138a.m2916q0().m3800b(C1286x4.f3042N);
            this.f143f.m771a();
            this.f143f = null;
        }
        ServiceConnectionC0966a serviceConnectionC0966a = this.f141d;
        if (serviceConnectionC0966a != null) {
            try {
                unbindService(serviceConnectionC0966a);
            } catch (Throwable unused) {
            }
        }
        AbstractC1265v1 abstractC1265v1 = this.f139b;
        if (abstractC1265v1 != null) {
            if (abstractC1265v1.m3476f()) {
                this.f139b.mo3485q();
            } else {
                long jM3454a = this.f139b.m3454a();
                if (jM3454a >= 0) {
                    if (jM3454a == 0) {
                        this.f139b.m3473d(true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new OooO0O0(11, this, parentInterstitialWrapper), jM3454a);
                } else {
                    m52a(this.f139b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC1265v1 abstractC1265v1 = this.f139b;
        if (abstractC1265v1 != null) {
            abstractC1265v1.m3455a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        AbstractC1265v1 abstractC1265v1 = this.f139b;
        if (abstractC1265v1 != null) {
            abstractC1265v1.mo3486r();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        AbstractC1265v1 abstractC1265v1;
        try {
            super.onResume();
            if (this.f140c.get() || (abstractC1265v1 = this.f139b) == null) {
                return;
            }
            abstractC1265v1.mo3487s();
        } catch (IllegalArgumentException e) {
            this.f138a.m2847O();
            if (C1240o.m3200a()) {
                this.f138a.m2847O().m3212a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            this.f138a.m2832E().m2148a("AppLovinFullscreenActivity", C3034d9.h.f8134u0, e);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        AbstractC1265v1 abstractC1265v1 = this.f139b;
        if (abstractC1265v1 != null) {
            abstractC1265v1.m3488t();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.f139b != null) {
            if (!this.f140c.getAndSet(false)) {
                this.f139b.mo3468b(z);
            }
            if (z) {
                C1093m2 c1093m2 = parentInterstitialWrapper;
                m51a(c1093m2 != null ? c1093m2.m1471f() : null);
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void setPresenter(AbstractC1265v1 abstractC1265v1) {
        this.f139b = abstractC1265v1;
    }

    /* renamed from: com.applovin.adview.AppLovinFullscreenActivity$b */
    public class C0947b implements AbstractC1265v1.g {
        public C0947b() {
        }

        @Override // com.applovin.impl.AbstractC1265v1.g
        /* renamed from: a */
        public void mo56a(AbstractC1265v1 abstractC1265v1) {
            AppLovinFullscreenActivity.this.f139b = abstractC1265v1;
            abstractC1265v1.mo3490v();
        }

        @Override // com.applovin.impl.AbstractC1265v1.g
        /* renamed from: a */
        public void mo57a(String str, Throwable th) {
            AbstractC1207b abstractC1207bM1471f = AppLovinFullscreenActivity.parentInterstitialWrapper.m1471f();
            C1093m2.m1453a(abstractC1207bM1471f, AppLovinFullscreenActivity.parentInterstitialWrapper.m1469c(), str, th, AppLovinFullscreenActivity.this);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            AppLovinFullscreenActivity.this.f138a.m2897g().m706a(C0993c2.f539s, abstractC1207bM1471f, mapHashMap);
        }
    }

    /* renamed from: a */
    public void m48a(WindowInsets windowInsets) {
        AbstractC1141o0.a aVarM1932a = AbstractC1141o0.m1932a(windowInsets, this.f138a);
        AbstractC1141o0.a aVarM1943c = AbstractC1141o0.m1943c(windowInsets, this.f138a);
        AbstractC1141o0.a aVarM1939b = AbstractC1141o0.m1939b(windowInsets, this.f138a);
        String strM1213b = AbstractC1078k7.m1213b(this);
        AbstractC1141o0.m1936a(aVarM1932a, strM1213b);
        AbstractC1141o0.m1945c(aVarM1943c, strM1213b);
        AbstractC1141o0.m1941b(aVarM1939b, strM1213b);
        AbstractC1265v1 abstractC1265v1 = this.f139b;
        if (abstractC1265v1 != null) {
            abstractC1265v1.m3460a(aVarM1932a, aVarM1943c, aVarM1939b);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m50a(C1093m2 c1093m2) {
        boolean zM3492x = this.f139b.m3492x();
        boolean zM1473i = (c1093m2 == null || !zM3492x) ? false : c1093m2.m1473i();
        if (!zM1473i) {
            this.f139b.m3473d(false);
        }
        m52a(this.f139b, zM3492x, zM1473i);
    }

    /* renamed from: a */
    private void m52a(AbstractC1265v1 abstractC1265v1, boolean z, boolean z2) {
        abstractC1265v1.mo3462a("activity_destroyed_by_app_relaunch");
        if (this.f138a != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity");
            C1093m2 c1093m2 = parentInterstitialWrapper;
            AbstractC1207b abstractC1207bM1471f = c1093m2 != null ? c1093m2.m1471f() : null;
            mapHashMap.putAll(AbstractC1013e2.m675a((AppLovinAdImpl) abstractC1207bM1471f));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z2);
            if (abstractC1207bM1471f != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", abstractC1207bM1471f.m2583b0());
            }
            mapHashMap.put("details", jSONObject.toString());
            this.f138a.m2832E().m576d(C0993c2.f532o0, mapHashMap);
        }
        abstractC1265v1.mo3485q();
    }

    /* renamed from: a */
    private void m47a() {
        C1093m2 c1093m2;
        C1220k c1220k = this.f138a;
        if (c1220k == null || !((Boolean) c1220k.m2866a(C1268v4.f2910v2)).booleanValue() || (c1093m2 = parentInterstitialWrapper) == null || c1093m2.m1471f() == null) {
            return;
        }
        AbstractC1207b abstractC1207bM1471f = parentInterstitialWrapper.m1471f();
        List listM2609j = abstractC1207bM1471f.m2609j();
        if (CollectionUtils.isEmpty(listM2609j)) {
            return;
        }
        C1010e c1010e = (C1010e) listM2609j.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", c1010e.m656c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", c1010e.m654a());
        this.f138a.m2916q0().m3801b(C1286x4.f3043O, jSONObject.toString());
        this.f138a.m2916q0().m3801b(C1286x4.f3041M, Long.valueOf(System.currentTimeMillis()));
        this.f138a.m2916q0().m3801b(C1286x4.f3044P, CollectionUtils.toJsonString(AbstractC1013e2.m675a((AppLovinAdImpl) abstractC1207bM1471f), JsonUtils.EMPTY_JSON));
    }

    /* renamed from: a */
    public /* synthetic */ void m53a(Long l) {
        this.f144g = l.longValue() + this.f144g;
        this.f138a.m2916q0().m3801b(C1286x4.f3042N, Long.valueOf(this.f144g));
    }

    /* renamed from: a */
    private void m51a(AbstractC1207b abstractC1207b) {
        if (AbstractC1141o0.m1942b() && abstractC1207b != null && abstractC1207b.m2566X0()) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            if (abstractC1207b.m2605h1() && abstractC1207b.m2599f1()) {
                AbstractC1000d.m509c(this);
                return;
            } else if (abstractC1207b.m2605h1()) {
                AbstractC1000d.m508b((Activity) this);
                return;
            } else {
                if (abstractC1207b.m2599f1()) {
                    AbstractC1000d.m504a((Activity) this);
                    return;
                }
                return;
            }
        }
        getWindow().setFlags(1024, 1024);
        AbstractC1000d.m509c(this);
    }
}

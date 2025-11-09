package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.adview.C0962a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.C1333R;
import com.ironsource.C3034d9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.applovin.impl.e1 */
/* loaded from: classes.dex */
public class C1012e1 {

    /* renamed from: a */
    private final C1220k f713a;

    /* renamed from: b */
    private CustomTabsClient f714b;

    /* renamed from: com.applovin.impl.e1$a */
    public class a extends CustomTabsServiceConnection {
        public a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            C1012e1.this.f713a.m2847O();
            if (C1240o.m3200a()) {
                C1012e1.this.f713a.m2847O().m3211a("CustomTabsManager", "Connection successful: " + componentName);
            }
            C1012e1.this.f714b = customTabsClient;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1012e1.this.f713a.m2847O();
            if (C1240o.m3200a()) {
                C1012e1.this.f713a.m2847O().m3211a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            C1012e1.this.f714b = null;
        }
    }

    /* renamed from: com.applovin.impl.e1$b */
    public class b extends CustomTabsCallback {

        /* renamed from: a */
        private final WeakReference f716a;

        public b(C0962a c0962a) {
            this.f716a = new WeakReference(c0962a);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            C0962a c0962a = (C0962a) this.f716a.get();
            if (c0962a == null) {
                C1012e1.this.f713a.m2847O();
                if (C1240o.m3200a()) {
                    C1012e1.this.f713a.m2847O().m3214b("CustomTabsManager", "Unable to track navigation event (" + i + "). Controller is null.");
                }
                return;
            }
            AbstractC1207b abstractC1207bM226g = c0962a.m226g();
            if (abstractC1207bM226g == null) {
                C1012e1.this.f713a.m2847O();
                if (C1240o.m3200a()) {
                    C1012e1.this.f713a.m2847O().m3214b("CustomTabsManager", "Unable to track navigation event (" + i + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (abstractC1207bM226g.m2568Y0()) {
                        C1012e1.this.f713a.m2905k().trackCustomTabsNavigationStarted(abstractC1207bM226g);
                        break;
                    }
                    break;
                case 2:
                    if (abstractC1207bM226g.m2568Y0()) {
                        C1012e1.this.f713a.m2905k().trackCustomTabsNavigationFinished(abstractC1207bM226g);
                        break;
                    }
                    break;
                case 3:
                    if (abstractC1207bM226g.m2568Y0()) {
                        C1012e1.this.f713a.m2905k().trackCustomTabsNavigationFailed(abstractC1207bM226g);
                        break;
                    }
                    break;
                case 4:
                    if (abstractC1207bM226g.m2568Y0()) {
                        C1012e1.this.f713a.m2905k().trackCustomTabsNavigationAborted(abstractC1207bM226g);
                        break;
                    }
                    break;
                case 5:
                    if (abstractC1207bM226g.m2568Y0()) {
                        C1012e1.this.f713a.m2905k().trackCustomTabsTabShown(abstractC1207bM226g);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    AbstractC1168q2.m2226c(c0962a.m224e(), abstractC1207bM226g, c0962a.m228i());
                    break;
                case 6:
                    if (abstractC1207bM226g.m2568Y0()) {
                        C1012e1.this.f713a.m2905k().trackCustomTabsTabHidden(abstractC1207bM226g);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    AbstractC1168q2.m2158a(c0962a.m224e(), abstractC1207bM226g, c0962a.m228i());
                    break;
                default:
                    C1012e1.this.f713a.m2847O();
                    if (C1240o.m3200a()) {
                        C1012e1.this.f713a.m2847O().m3211a("CustomTabsManager", "Unknown navigation event: " + i);
                        break;
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            C1012e1.this.f713a.m2847O();
            if (C1240o.m3200a()) {
                C1240o c1240oM2847O = C1012e1.this.f713a.m2847O();
                StringBuilder sb = new StringBuilder("Validation ");
                sb.append(z ? "succeeded" : C3034d9.h.f8131t);
                sb.append(" for session-URL relation(");
                sb.append(i);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                c1240oM2847O.m3211a("CustomTabsManager", sb.toString());
            }
        }
    }

    public C1012e1(C1220k c1220k) {
        this.f713a = c1220k;
    }

    /* renamed from: b */
    public void m672b(List list, CustomTabsSession customTabsSession) {
        if (list.isEmpty()) {
            return;
        }
        if (customTabsSession != null) {
            m668a("warmup urls", new androidx.webkit.OooO00o(this, list, customTabsSession, 6));
            return;
        }
        this.f713a.m2847O();
        if (C1240o.m3200a()) {
            this.f713a.m2847O().m3211a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    /* renamed from: a */
    public void m670a() {
        if (((Boolean) this.f713a.m2866a(C1268v4.f2665Q6)).booleanValue() && this.f714b == null) {
            String packageName = CustomTabsClient.getPackageName(C1220k.m2824o(), this.f713a.m2888c(C1268v4.f2673R6), true);
            String packageName2 = CustomTabsClient.getPackageName(C1220k.m2824o(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f713a.m2866a(C1268v4.f2681S6)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.f713a.m2847O();
                if (C1240o.m3200a()) {
                    this.f713a.m2847O().m3214b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            m666a(linkedList);
        }
    }

    /* renamed from: a */
    private void m666a(LinkedList linkedList) {
        boolean zIsEmpty;
        boolean zBindCustomTabsService = false;
        try {
            zBindCustomTabsService = CustomTabsClient.bindCustomTabsService(C1220k.m2824o(), (String) linkedList.poll(), new a());
            if (!zBindCustomTabsService) {
                this.f713a.m2847O();
                if (C1240o.m3200a()) {
                    this.f713a.m2847O().m3214b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
        } catch (Throwable th) {
            try {
                this.f713a.m2847O();
                if (C1240o.m3200a()) {
                    this.f713a.m2847O().m3212a("CustomTabsManager", "Failed to bind to service", th);
                }
                if (zBindCustomTabsService) {
                    return;
                } else {
                    if (zIsEmpty) {
                        return;
                    }
                }
            } finally {
                if (!zBindCustomTabsService && !linkedList.isEmpty()) {
                    this.f713a.m2847O();
                    if (C1240o.m3200a()) {
                        this.f713a.m2847O().m3211a("CustomTabsManager", "Retrying with next package name...");
                    }
                    m666a(linkedList);
                }
            }
        }
        if (zBindCustomTabsService || linkedList.isEmpty()) {
            return;
        }
        this.f713a.m2847O();
        if (C1240o.m3200a()) {
        }
    }

    /* renamed from: a */
    public CustomTabsSession m669a(C0962a c0962a) {
        if (this.f714b == null) {
            this.f713a.m2847O();
            if (C1240o.m3200a()) {
                this.f713a.m2847O().m3211a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f713a.m2847O();
        if (C1240o.m3200a()) {
            this.f713a.m2847O().m3211a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession customTabsSessionNewSession = this.f714b.newSession(new b(c0962a));
            m663a(customTabsSessionNewSession, c0962a.m226g());
            return customTabsSessionNewSession;
        } catch (Exception e) {
            this.f713a.m2847O();
            if (C1240o.m3200a()) {
                this.f713a.m2847O().m3212a("CustomTabsManager", "Failed to create Custom Tabs session", e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m667a(List list, CustomTabsSession customTabsSession) {
        this.f713a.m2847O();
        if (C1240o.m3200a()) {
            this.f713a.m2847O().m3211a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CustomTabsService.KEY_URL, Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean zMayLaunchUrl = customTabsSession.mayLaunchUrl(Uri.parse(str), null, arrayList);
        this.f713a.m2847O();
        if (C1240o.m3200a()) {
            this.f713a.m2847O().m3211a("CustomTabsManager", "Warmup for URLs ".concat(zMayLaunchUrl ? "succeeded" : C3034d9.h.f8131t));
        }
    }

    /* renamed from: a */
    public void m671a(String str, C0962a c0962a, Activity activity) {
        if (m668a("launch url", new OooOo0O.OooO0O0(this, c0962a, activity, str, 2))) {
            this.f713a.m2911n0().pauseForClick();
        } else {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", str));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m664a(C0962a c0962a, Activity activity, String str) {
        m661a(c0962a, activity).launchUrl(activity, Uri.parse(str));
    }

    /* renamed from: a */
    private void m663a(CustomTabsSession customTabsSession, AbstractC1207b abstractC1207b) {
        if (abstractC1207b == null || !abstractC1207b.m2537F0()) {
            return;
        }
        m668a("client warmup", new androidx.webkit.OooO00o(this, abstractC1207b, customTabsSession, 5));
    }

    /* renamed from: a */
    public /* synthetic */ void m665a(AbstractC1207b abstractC1207b, CustomTabsSession customTabsSession) {
        this.f714b.warmup(0L);
        C1022f1 c1022f1M2526A = abstractC1207b.m2526A();
        if (c1022f1M2526A == null) {
            return;
        }
        Integer numM717e = c1022f1M2526A.m717e();
        String strM714b = c1022f1M2526A.m714b();
        if (numM717e == null || TextUtils.isEmpty(strM714b)) {
            return;
        }
        if (customTabsSession == null) {
            this.f713a.m2847O();
            if (C1240o.m3200a()) {
                this.f713a.m2847O().m3214b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f713a.m2847O();
        if (C1240o.m3200a()) {
            this.f713a.m2847O().m3211a("CustomTabsManager", "Validating session-URL relation: " + numM717e + " with digital asset link: " + strM714b);
        }
        customTabsSession.validateRelationship(numM717e.intValue(), Uri.parse(strM714b), null);
    }

    /* renamed from: a */
    private CustomTabsIntent m661a(C0962a c0962a, Activity activity) {
        this.f713a.m2847O();
        if (C1240o.m3200a()) {
            this.f713a.m2847O().m3211a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        AbstractC1207b abstractC1207bM226g = c0962a.m226g();
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(c0962a.m227h());
        C1022f1 c1022f1M2526A = abstractC1207bM226g != null ? abstractC1207bM226g.m2526A() : null;
        if (((Boolean) this.f713a.m2866a(C1268v4.f2689T6)).booleanValue()) {
            builder.setStartAnimations(activity, C1333R.anim.applovin_slide_up_animation, C1333R.anim.applovin_slide_down_animation);
            builder.setExitAnimations(activity, C1333R.anim.applovin_slide_up_animation, C1333R.anim.applovin_slide_down_animation);
        }
        if (c1022f1M2526A != null) {
            Integer numM720h = c1022f1M2526A.m720h();
            if (numM720h != null) {
                builder.setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder().setToolbarColor(numM720h.intValue()).build());
            }
            Integer numM713a = c1022f1M2526A.m713a();
            if (numM713a != null) {
                builder.setColorSchemeParams(2, new CustomTabColorSchemeParams.Builder().setToolbarColor(numM713a.intValue()).build());
            }
            Boolean boolM721i = c1022f1M2526A.m721i();
            if (boolM721i != null) {
                builder.setUrlBarHidingEnabled(boolM721i.booleanValue());
            }
            Boolean boolM719g = c1022f1M2526A.m719g();
            if (boolM719g != null) {
                builder.setShowTitle(boolM719g.booleanValue());
            }
            Boolean boolM715c = c1022f1M2526A.m715c();
            if (boolM715c != null) {
                builder.setInstantAppsEnabled(boolM715c.booleanValue());
            }
            Integer numM718f = c1022f1M2526A.m718f();
            if (numM718f != null) {
                builder.setShareState(numM718f.intValue());
            }
        }
        CustomTabsIntent customTabsIntentBuild = builder.build();
        if (c1022f1M2526A != null) {
            String strM716d = c1022f1M2526A.m716d();
            if (strM716d != null) {
                customTabsIntentBuild.intent.putExtra("android.intent.extra.REFERRER", Uri.parse(strM716d));
            }
            Bundle bundleM2638v = abstractC1207bM226g.m2638v();
            if (!bundleM2638v.isEmpty()) {
                customTabsIntentBuild.intent.putExtra("com.android.browser.headers", bundleM2638v);
            }
        }
        return customTabsIntentBuild;
    }

    /* renamed from: a */
    private boolean m668a(String str, Runnable runnable) {
        try {
            this.f713a.m2847O();
            if (C1240o.m3200a()) {
                this.f713a.m2847O().m3211a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f713a.m2847O();
            if (!C1240o.m3200a()) {
                return true;
            }
            this.f713a.m2847O().m3211a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th) {
            this.f713a.m2847O();
            if (C1240o.m3200a()) {
                this.f713a.m2847O().m3212a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f713a.m2832E().m2148a("CustomTabsManager", str, th);
            return false;
        }
    }
}

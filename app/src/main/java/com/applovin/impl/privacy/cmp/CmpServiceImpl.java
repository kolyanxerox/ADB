package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.C1071k0;
import com.applovin.impl.privacy.cmp.C1164a;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class CmpServiceImpl implements AppLovinCmpService, C1164a.a {

    /* renamed from: a */
    private final C1220k f1735a;

    /* renamed from: e */
    private AppLovinCmpError f1739e;

    /* renamed from: f */
    private InterfaceC1162e f1740f;

    /* renamed from: g */
    private InterfaceC1163f f1741g;

    /* renamed from: c */
    private final Object f1737c = new Object();

    /* renamed from: d */
    private EnumC1161d f1738d = EnumC1161d.NONE;

    /* renamed from: b */
    private final C1164a f1736b = m2093c();

    /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a */
    public class C1158a implements InterfaceC1162e {

        /* renamed from: a */
        final /* synthetic */ AppLovinCmpService.OnCompletedListener f1742a;

        /* renamed from: b */
        final /* synthetic */ Activity f1743b;

        /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a */
        public class a implements InterfaceC1163f {
            public a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.InterfaceC1163f
            /* renamed from: a */
            public void mo2096a(AppLovinCmpError appLovinCmpError) {
                C1158a.this.f1742a.onCompleted(appLovinCmpError);
            }
        }

        public C1158a(AppLovinCmpService.OnCompletedListener onCompletedListener, Activity activity) {
            this.f1742a = onCompletedListener;
            this.f1743b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.InterfaceC1162e
        /* renamed from: a */
        public void mo2095a(AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f1742a.onCompleted(appLovinCmpError);
            } else {
                CmpServiceImpl.this.showCmp(this.f1743b, new a());
            }
        }
    }

    /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$b */
    public class RunnableC1159b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f1746a;

        public RunnableC1159b(Activity activity) {
            this.f1746a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f1736b.m2114b(this.f1746a, CmpServiceImpl.this.m2086a(), CmpServiceImpl.this);
        }
    }

    /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$c */
    public class RunnableC1160c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f1748a;

        public RunnableC1160c(Activity activity) {
            this.f1748a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            CmpServiceImpl.this.f1736b.m2112a(this.f1748a, CmpServiceImpl.this.m2086a(), CmpServiceImpl.this);
        }
    }

    /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$d */
    public enum EnumC1161d {
        NONE,
        LOADING,
        COMPLETED
    }

    /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$e */
    public interface InterfaceC1162e {
        /* renamed from: a */
        void mo2095a(AppLovinCmpError appLovinCmpError);
    }

    /* renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$f */
    public interface InterfaceC1163f {
        /* renamed from: a */
        void mo2096a(AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(C1220k c1220k) {
        this.f1735a = c1220k;
    }

    /* renamed from: c */
    private C1164a m2093c() {
        if (AbstractC1078k7.m1203a("com.google.android.ump.ConsentForm")) {
            return new C1164a(this.f1735a);
        }
        if (!this.f1735a.m2931y().m3284j()) {
            return null;
        }
        C1240o.m3207h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    /* renamed from: d */
    private void m2094d() {
        if (hasSupportedCmp()) {
            this.f1736b.m2115c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.f1736b != null;
    }

    public void loadCmp(Activity activity, InterfaceC1162e interfaceC1162e) {
        m2088a(activity, interfaceC1162e);
    }

    @Override // com.applovin.impl.privacy.cmp.C1164a.a
    public void onFlowHidden(Bundle bundle) {
        m2092b((AppLovinCmpError) null);
        m2091b();
    }

    @Override // com.applovin.impl.privacy.cmp.C1164a.a
    public void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl) {
        m2091b();
        synchronized (this.f1737c) {
            try {
                if (this.f1740f == null) {
                    this.f1738d = EnumC1161d.COMPLETED;
                    this.f1739e = cmpErrorImpl;
                } else {
                    this.f1738d = EnumC1161d.NONE;
                    m2089a(cmpErrorImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.C1164a.a
    public void onFlowLoaded(Bundle bundle) {
        synchronized (this.f1737c) {
            try {
                if (this.f1740f == null) {
                    this.f1738d = EnumC1161d.COMPLETED;
                } else {
                    this.f1738d = EnumC1161d.NONE;
                    m2089a((AppLovinCmpError) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.privacy.cmp.C1164a.a
    public void onFlowShowFailed(CmpErrorImpl cmpErrorImpl) {
        m2092b(cmpErrorImpl);
        m2091b();
    }

    public void preloadCmp(Activity activity) {
        m2088a(activity, null);
    }

    public void showCmp(Activity activity, InterfaceC1163f interfaceC1163f) {
        RunnableC1159b runnableC1159b = new RunnableC1159b(activity);
        this.f1741g = interfaceC1163f;
        if (this.f1736b.m2117e()) {
            AppLovinSdkUtils.runOnUiThread(runnableC1159b);
        } else {
            runnableC1159b.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(Activity activity, AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f1735a.m2847O();
        if (C1240o.m3200a()) {
            this.f1735a.m2847O().m3211a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            m2094d();
            loadCmp(activity, new C1158a(onCompletedListener, activity));
        }
    }

    public String toString() {
        return "[CmpService]";
    }

    /* renamed from: a */
    private void m2089a(AppLovinCmpError appLovinCmpError) {
        InterfaceC1162e interfaceC1162e = this.f1740f;
        if (interfaceC1162e == null) {
            return;
        }
        interfaceC1162e.mo2095a(appLovinCmpError);
        this.f1740f = null;
        this.f1739e = null;
    }

    /* renamed from: b */
    private void m2092b(AppLovinCmpError appLovinCmpError) {
        InterfaceC1163f interfaceC1163f = this.f1741g;
        if (interfaceC1163f == null) {
            return;
        }
        interfaceC1163f.mo2096a(appLovinCmpError);
        this.f1741g = null;
    }

    /* renamed from: b */
    private void m2091b() {
        C1164a c1164a = this.f1736b;
        if (c1164a == null) {
            return;
        }
        c1164a.m2111a();
    }

    /* renamed from: a */
    private void m2088a(Activity activity, InterfaceC1162e interfaceC1162e) {
        boolean z;
        if (!hasSupportedCmp()) {
            if (interfaceC1162e != null) {
                interfaceC1162e.mo2095a(new CmpErrorImpl(AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
                return;
            }
            return;
        }
        synchronized (this.f1737c) {
            if (interfaceC1162e != null) {
                try {
                    this.f1740f = interfaceC1162e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            EnumC1161d enumC1161d = this.f1738d;
            EnumC1161d enumC1161d2 = EnumC1161d.NONE;
            if (enumC1161d == enumC1161d2) {
                this.f1738d = EnumC1161d.LOADING;
                z = false;
            } else {
                if (enumC1161d == EnumC1161d.LOADING) {
                    return;
                }
                this.f1738d = enumC1161d2;
                z = true;
            }
            if (z) {
                m2089a(this.f1739e);
                return;
            }
            RunnableC1160c runnableC1160c = new RunnableC1160c(activity);
            if (this.f1736b.m2116d()) {
                AppLovinSdkUtils.runOnUiThread(runnableC1160c);
            } else {
                runnableC1160c.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C1071k0 m2086a() {
        return new C1071k0(this.f1735a.m2931y().m3278d());
    }
}

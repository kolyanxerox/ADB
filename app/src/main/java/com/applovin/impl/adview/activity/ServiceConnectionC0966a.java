package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.AbstractC1013e2;
import com.applovin.impl.AbstractC1265v1;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C0997c6;
import com.applovin.impl.C1093m2;
import com.applovin.impl.C1254u;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.activity.a */
/* loaded from: classes.dex */
public class ServiceConnectionC0966a implements ServiceConnection {

    /* renamed from: a */
    private final C1220k f269a;

    /* renamed from: b */
    private final C1240o f270b;

    /* renamed from: c */
    private final WeakReference f271c;

    /* renamed from: d */
    private final AtomicBoolean f272d = new AtomicBoolean();

    /* renamed from: e */
    private Messenger f273e;

    /* renamed from: com.applovin.impl.adview.activity.a$a */
    public class a implements AppLovinAdLoadListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) ServiceConnectionC0966a.this.f271c.get();
            if (appLovinFullscreenActivity != null) {
                C1240o unused = ServiceConnectionC0966a.this.f270b;
                if (C1240o.m3200a()) {
                    ServiceConnectionC0966a.this.f270b.m3211a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(ServiceConnectionC0966a.this, null);
                AbstractC1265v1.m3431a((AbstractC1207b) appLovinAd, bVar, bVar, bVar, null, ServiceConnectionC0966a.this.f269a, appLovinFullscreenActivity, new C4548a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            C1240o unused2 = ServiceConnectionC0966a.this.f270b;
            if (C1240o.m3200a()) {
                ServiceConnectionC0966a.this.f270b.m3214b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            ServiceConnectionC0966a.this.m243a("failed_to_receive_ad");
        }

        /* renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        public class C4548a implements AbstractC1265v1.g {

            /* renamed from: a */
            final /* synthetic */ AppLovinFullscreenActivity f275a;

            /* renamed from: b */
            final /* synthetic */ AppLovinAd f276b;

            /* renamed from: c */
            final /* synthetic */ b f277c;

            public C4548a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f275a = appLovinFullscreenActivity;
                this.f276b = appLovinAd;
                this.f277c = bVar;
            }

            @Override // com.applovin.impl.AbstractC1265v1.g
            /* renamed from: a */
            public void mo56a(AbstractC1265v1 abstractC1265v1) {
                this.f275a.setPresenter(abstractC1265v1);
                abstractC1265v1.mo3490v();
            }

            @Override // com.applovin.impl.AbstractC1265v1.g
            /* renamed from: a */
            public void mo57a(String str, Throwable th) {
                C1093m2.m1453a((AbstractC1207b) this.f276b, this.f277c, str, th, this.f275a);
                Map mapM675a = AbstractC1013e2.m675a((AppLovinAdImpl) this.f276b);
                CollectionUtils.putStringIfValid("source", "processAdResponse", mapM675a);
                CollectionUtils.putStringIfValid("error_message", str, mapM675a);
                CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapM675a);
                ServiceConnectionC0966a.this.f269a.m2897g().m576d(C0993c2.f539s, mapM675a);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.a$b */
    public class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        /* renamed from: a */
        private void m250a(FullscreenAdService.EnumC0965c enumC0965c) throws RemoteException {
            m249a(null, enumC0965c);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) throws RemoteException {
            m250a(FullscreenAdService.EnumC0965c.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) throws RemoteException {
            m250a(FullscreenAdService.EnumC0965c.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) throws RemoteException {
            m250a(FullscreenAdService.EnumC0965c.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) throws RemoteException {
            m250a(FullscreenAdService.EnumC0965c.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d);
            bundle.putBoolean("fully_watched", z);
            m249a(bundle, FullscreenAdService.EnumC0965c.AD_VIDEO_ENDED);
        }

        public /* synthetic */ b(ServiceConnectionC0966a serviceConnectionC0966a, a aVar) {
            this();
        }

        /* renamed from: a */
        private void m249a(Bundle bundle, FullscreenAdService.EnumC0965c enumC0965c) throws RemoteException {
            Message messageObtain = Message.obtain((Handler) null, enumC0965c.m240b());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                ServiceConnectionC0966a.this.f273e.send(messageObtain);
            } catch (RemoteException e) {
                C1240o unused = ServiceConnectionC0966a.this.f270b;
                if (C1240o.m3200a()) {
                    ServiceConnectionC0966a.this.f270b.m3212a("AppLovinFullscreenActivity", "Failed to forward callback (" + enumC0965c.m240b() + ")", e);
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.a$c */
    public static class c extends Handler {

        /* renamed from: a */
        private final WeakReference f280a;

        public /* synthetic */ c(ServiceConnectionC0966a serviceConnectionC0966a, a aVar) {
            this(serviceConnectionC0966a);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ServiceConnectionC0966a serviceConnectionC0966a;
            if (message.what != FullscreenAdService.EnumC0965c.AD.m240b() || (serviceConnectionC0966a = (ServiceConnectionC0966a) this.f280a.get()) == null) {
                super.handleMessage(message);
            } else {
                serviceConnectionC0966a.m246b(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }

        private c(ServiceConnectionC0966a serviceConnectionC0966a) {
            this.f280a = new WeakReference(serviceConnectionC0966a);
        }
    }

    public ServiceConnectionC0966a(AppLovinFullscreenActivity appLovinFullscreenActivity, C1220k c1220k) {
        this.f269a = c1220k;
        this.f270b = c1220k.m2847O();
        this.f271c = new WeakReference(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        if (this.f272d.compareAndSet(false, true)) {
            if (C1240o.m3200a()) {
                this.f270b.m3211a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f273e = new Messenger(iBinder);
            Message messageObtain = Message.obtain((Handler) null, FullscreenAdService.EnumC0965c.AD.m240b());
            messageObtain.replyTo = new Messenger(new c(this, null));
            try {
                if (C1240o.m3200a()) {
                    this.f270b.m3211a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f273e.send(messageObtain);
            } catch (RemoteException e) {
                if (C1240o.m3200a()) {
                    this.f270b.m3212a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e);
                }
                m243a("failed_to_send_ad_request");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f272d.compareAndSet(true, false) && C1240o.m3200a()) {
            this.f270b.m3211a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m243a(String str) {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f271c.get();
        if (appLovinFullscreenActivity != null) {
            if (C1240o.m3200a()) {
                this.f270b.m3211a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss(str);
        } else if (C1240o.m3200a()) {
            this.f270b.m3214b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m246b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, "zone_id", "");
            if (TextUtils.isEmpty(string)) {
                throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
            }
            this.f269a.m2918r0().m402a(new C0997c6(jSONObject, C1254u.m3363a(string), true, new a(), this.f269a));
        } catch (JSONException e) {
            if (C1240o.m3200a()) {
                this.f270b.m3212a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e);
            }
            m243a("failed_to_process_ad");
        }
    }
}

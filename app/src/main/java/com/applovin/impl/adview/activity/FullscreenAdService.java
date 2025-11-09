package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.C1093m2;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;

/* loaded from: classes.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* renamed from: com.applovin.impl.adview.activity.FullscreenAdService$b */
    public static class HandlerC0964b extends Handler {
        private HandlerC0964b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                C1093m2 c1093m2 = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (c1093m2 == null) {
                    if (!AbstractC1078k7.m1199a(1.0d)) {
                        super.handleMessage(message);
                        return;
                    } else {
                        throw new RuntimeException("parentWrapper is null for " + message.what);
                    }
                }
                AbstractC1207b abstractC1207bM1471f = c1093m2.m1471f();
                int i = message.what;
                EnumC0965c enumC0965c = EnumC0965c.AD;
                if (i == enumC0965c.m240b()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, abstractC1207bM1471f.getRawFullResponse());
                    Message messageObtain = Message.obtain((Handler) null, enumC0965c.m240b());
                    messageObtain.setData(bundle);
                    try {
                        message.replyTo.send(messageObtain);
                        return;
                    } catch (RemoteException e) {
                        C1240o.m3204c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e);
                        return;
                    }
                }
                if (message.what == EnumC0965c.AD_DISPLAYED.m240b()) {
                    AbstractC1168q2.m2181a(c1093m2.m1469c(), abstractC1207bM1471f);
                    return;
                }
                if (message.what == EnumC0965c.AD_CLICKED.m240b()) {
                    AbstractC1168q2.m2180a(c1093m2.m1468b(), abstractC1207bM1471f);
                    return;
                }
                if (message.what == EnumC0965c.AD_VIDEO_STARTED.m240b()) {
                    AbstractC1168q2.m2185a(c1093m2.m1470d(), abstractC1207bM1471f);
                    return;
                }
                if (message.what == EnumC0965c.AD_VIDEO_ENDED.m240b()) {
                    Bundle data = message.getData();
                    AbstractC1168q2.m2186a(c1093m2.m1470d(), abstractC1207bM1471f, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    return;
                }
                if (message.what == EnumC0965c.AD_HIDDEN.m240b()) {
                    AbstractC1168q2.m2212b(c1093m2.m1469c(), abstractC1207bM1471f);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.FullscreenAdService$c */
    public enum EnumC0965c {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);


        /* renamed from: a */
        private final int f268a;

        EnumC0965c(int i) {
            this.f268a = i;
        }

        /* renamed from: b */
        public int m240b() {
            return this.f268a;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new HandlerC0964b()).getBinder();
    }
}

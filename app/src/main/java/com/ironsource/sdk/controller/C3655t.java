package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.C3523pg;
import com.ironsource.C3551q9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.services.core.device.MimeTypes;

/* renamed from: com.ironsource.sdk.controller.t */
/* loaded from: classes2.dex */
class C3655t {

    /* renamed from: com.ironsource.sdk.controller.t$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AudioManager f11654a;

        public a(AudioManager audioManager) {
            this.f11654a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3655t.m12070a(this.f11654a);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.t$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AudioManager f11655a;

        public b(AudioManager audioManager) {
            this.f11655a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3655t.m12074d(this.f11655a);
        }
    }

    /* renamed from: a */
    public static void m12069a(Activity activity) {
        C3523pg.f10822a.m11399b(new a((AudioManager) activity.getSystemService(MimeTypes.BASE_TYPE_AUDIO)));
    }

    /* renamed from: b */
    public static void m12071b(Activity activity) {
        C3523pg.f10822a.m11399b(new b((AudioManager) activity.getSystemService(MimeTypes.BASE_TYPE_AUDIO)));
    }

    /* renamed from: d */
    public static void m12074d(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }

    /* renamed from: a */
    public static void m12070a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}

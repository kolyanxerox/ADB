package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.view.WindowManager;
import com.unity3d.services.core.device.MimeTypes;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class nh0 implements il0 {

    /* renamed from: OooOo */
    public static final nh0 f21489OooOo = new nh0();

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f21490OooOo0O;

    /* renamed from: OooOo0o */
    public Context f21491OooOo0o;

    public /* synthetic */ nh0() {
        this.f21490OooOo0O = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.z71 OooO00o(OooOOo0.o0OOO0o r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nh0.OooO00o(OooOOo0.o0OOO0o):com.google.android.gms.internal.ads.z71");
    }

    @Override // com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public Object mo13704zza() {
        switch (this.f21490OooOo0O) {
            case 1:
                o0000o0.OooOOO oooOOO = ze0.f26157OooO0Oo;
                if (oooOOO.f29577OooOo0o) {
                    return Boolean.TRUE;
                }
                Context applicationContext = this.f21491OooOo0o.getApplicationContext();
                if (applicationContext == null) {
                    throw new IllegalArgumentException("Application Context cannot be null");
                }
                if (!oooOOO.f29577OooOo0o) {
                    oooOOO.f29577OooOo0o = true;
                    oh0 oh0VarOooO0O0 = oh0.OooO0O0();
                    oh0VarOooO0O0.getClass();
                    oh0VarOooO0O0.f22996OooO0O0 = new fh0(new Handler(), applicationContext, oh0VarOooO0O0);
                    hh0 hh0Var = hh0.f19779OooOoO0;
                    boolean z = applicationContext instanceof Application;
                    if (z) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(hh0Var);
                    }
                    af0.f17035OooO0oo = (UiModeManager) applicationContext.getSystemService("uimode");
                    WindowManager windowManager = wh0.f25313OooO00o;
                    wh0.f25315OooO0OO = applicationContext.getResources().getDisplayMetrics().density;
                    wh0.f25313OooO00o = (WindowManager) applicationContext.getSystemService("window");
                    applicationContext.registerReceiver(new ph0(1), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    f21489OooOo.f21491OooOo0o = applicationContext.getApplicationContext();
                    gh0 gh0Var = gh0.f19347OooO0o0;
                    if (!gh0Var.f19348OooO00o) {
                        kh0 kh0Var = (kh0) gh0Var.f19351OooO0Oo;
                        if (z) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(kh0Var);
                        }
                        kh0Var.f20606OooOo = gh0Var;
                        kh0Var.f20607OooOo0O = true;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        kh0Var.f20608OooOo0o = runningAppProcessInfo.importance == 100;
                        gh0Var.f19349OooO0O0 = kh0Var.f20608OooOo0o;
                        gh0Var.f19348OooO00o = true;
                    }
                    qh0.f23613OooO0Oo.f23614OooO00o = new WeakReference(applicationContext);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    applicationContext.registerReceiver(new ph0(0), intentFilter);
                }
                return Boolean.valueOf(oooOOO.f29577OooOo0o);
            case 2:
                AudioManager audioManager = (AudioManager) this.f21491OooOo0o.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                audioManager.getClass();
                return audioManager;
            default:
                return new xa1(this.f21491OooOo0o);
        }
    }

    public /* synthetic */ nh0(Context context, int i) {
        this.f21490OooOo0O = i;
        this.f21491OooOo0o = context;
    }
}

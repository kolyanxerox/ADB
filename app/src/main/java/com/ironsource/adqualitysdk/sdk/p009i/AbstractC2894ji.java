package com.ironsource.adqualitysdk.sdk.p009i;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ji */
/* loaded from: classes2.dex */
public abstract class AbstractC2894ji {

    /* renamed from: ﾒ */
    private static AbstractC2894ji f7061;

    /* renamed from: ﾇ */
    boolean f7063 = false;

    /* renamed from: ﻛ */
    private Set<InterfaceC2893jh> f7062 = new HashSet();

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ji$e */
    public static class e extends AbstractC2894ji {

        /* renamed from: ﮐ */
        private static int f7071 = 0;

        /* renamed from: ﱟ */
        private static int f7072 = 1;

        /* renamed from: ﻏ */
        private static char f7073 = 52991;

        /* renamed from: ﻐ */
        private static char f7074 = 18793;

        /* renamed from: ｋ */
        private static char f7075 = 49886;

        /* renamed from: ﾒ */
        private static char f7076 = 60324;

        /* renamed from: ﻛ */
        private Context f7077;

        public /* synthetic */ e(byte b) {
            this();
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2894ji
        /* renamed from: ﻛ */
        public final boolean mo7272() {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f7077.getSystemService(m7279("쇎\uf538잁✝㘹\u1a8b갞鋬", (ViewConfiguration.getTapTimeout() >> 16) + 8).intern())).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                int i = f7071 + 23;
                f7072 = i % 128;
                return i % 2 == 0;
            }
            String packageName = this.f7077.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                f7072 = (f7071 + 41) % 128;
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                    return true;
                }
                f7072 = (f7071 + 49) % 128;
            }
            return false;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2894ji
        /* renamed from: ｋ */
        public final synchronized void mo7273(Application application, Activity activity) {
            int i = f7072;
            f7071 = (i + 45) % 128;
            if (application == null) {
                if (activity != null) {
                    this.f7077 = activity.getApplicationContext();
                }
                f7072 = (f7071 + 63) % 128;
            } else {
                int i2 = i + 59;
                f7071 = i2 % 128;
                if (i2 % 2 == 0) {
                    this.f7077 = application.getApplicationContext();
                } else {
                    this.f7077 = application.getApplicationContext();
                    throw null;
                }
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2894ji
        /* renamed from: ﾒ */
        public final Activity mo7274() {
            int i = f7071;
            int i2 = i + 9;
            f7072 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 88 / 0;
            }
            f7072 = (i + 123) % 128;
            return null;
        }

        private e() {
        }

        /* renamed from: ﻛ */
        private static String m7279(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2920m.f7237) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    C2920m.f7236 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i2 = C2920m.f7236;
                        if (i2 < cArr.length) {
                            cArr3[0] = cArr[i2];
                            cArr3[1] = cArr[i2 + 1];
                            int i3 = 58224;
                            for (int i4 = 0; i4 < 16; i4++) {
                                char c = cArr3[1];
                                char c2 = cArr3[0];
                                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f7074)) ^ ((c2 >>> 5) + f7073)));
                                cArr3[1] = c3;
                                cArr3[0] = (char) (c2 - (((c3 >>> 5) + f7076) ^ ((c3 + i3) ^ ((c3 << 4) + f7075))));
                                i3 -= 40503;
                            }
                            int i5 = C2920m.f7236;
                            cArr2[i5] = cArr3[0];
                            cArr2[i5 + 1] = cArr3[1];
                            C2920m.f7236 = i5 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    /* renamed from: ｋ */
    public static synchronized AbstractC2894ji m7268() {
        try {
            if (f7061 == null) {
                f7061 = new d((byte) 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7061;
    }

    /* renamed from: ﻐ */
    public final synchronized void m7270(InterfaceC2893jh interfaceC2893jh) {
        this.f7062.remove(interfaceC2893jh);
    }

    /* renamed from: ﻛ */
    public final synchronized void m7271(InterfaceC2893jh interfaceC2893jh) {
        this.f7062.add(interfaceC2893jh);
    }

    /* renamed from: ﻛ */
    public abstract boolean mo7272();

    /* renamed from: ｋ */
    public abstract void mo7273(Application application, Activity activity);

    /* renamed from: ﾒ */
    public abstract Activity mo7274();

    @TargetApi(14)
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ji$d */
    public static class d extends AbstractC2894ji implements Application.ActivityLifecycleCallbacks {

        /* renamed from: ﺙ */
        private static int f7064 = 0;

        /* renamed from: ﻏ */
        private static int f7065 = 1;

        /* renamed from: ﾒ */
        private static long f7066 = -94023936668216804L;

        /* renamed from: ﻐ */
        private WeakReference<Activity> f7067;

        /* renamed from: ﻛ */
        private WeakReference<Application> f7068;

        /* renamed from: ｋ */
        private Map<Activity, Boolean> f7069;

        private d() {
            this.f7069 = new WeakHashMap();
        }

        /* renamed from: ﻐ */
        private void m7276(Activity activity) {
            f7065 = (f7064 + 119) % 128;
            Iterator<InterfaceC2893jh> it = m7269().iterator();
            while (it.hasNext()) {
                int i = f7065 + 73;
                f7064 = i % 128;
                if (i % 2 != 0) {
                    it.next().mo5068(activity);
                    throw null;
                }
                it.next().mo5068(activity);
            }
        }

        /* renamed from: ﾇ */
        private void m7278(final Activity activity) {
            this.f7067 = new WeakReference<>(activity);
            C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.d.3
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() throws Exception {
                    C2910jy.m7374(activity);
                }
            });
            f7065 = (f7064 + 49) % 128;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (AbstractC2894ji.class) {
                    try {
                        if (this.f7067 == null) {
                            m7278(activity);
                            AbstractC2894ji.class.notifyAll();
                        }
                    } finally {
                    }
                }
                Iterator<InterfaceC2893jh> it = m7269().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (Exception e) {
                C2914kb.m7426(m7275("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", ViewConfiguration.getTapTimeout() >> 16).intern(), m7275("튨튷틭Ù猗흝ၽ晆骪젛㮜껗䉨뀤\ue22bᜈ\u0b9b禯ꪼ徯\uf301℟ዜ蠪룪\uee9e\ud954\uf08d恭噯", (-1) - ImageFormat.getBitsPerPixel(0)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            f7064 = (f7065 + 55) % 128;
            try {
                Iterator<InterfaceC2893jh> it = m7269().iterator();
                while (it.hasNext()) {
                    int i = f7064 + 95;
                    f7065 = i % 128;
                    if (i % 2 == 0) {
                        it.next().onActivityDestroyed(activity);
                        throw null;
                    }
                    it.next().onActivityDestroyed(activity);
                }
            } catch (Exception e) {
                C2914kb.m7426(m7275("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m7275("숴ꁘ쉱父㜻鍱\ue343镸訶뫴羰巩勴싋ꘇ\ue436ᬇୀ\uee90겑\ue39d台困笓ꡡ鱧鵭ε烻⒝엌쯓", TextUtils.indexOf((CharSequence) "", '0') + 1).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            f7064 = (f7065 + InterfaceC3173h3.d.b.f8819b) % 128;
            try {
                Iterator<InterfaceC2893jh> it = m7269().iterator();
                while (it.hasNext()) {
                    int i = f7064 + 15;
                    f7065 = i % 128;
                    if (i % 2 == 0) {
                        it.next().onActivityPaused(activity);
                        int i2 = 4 / 0;
                    } else {
                        it.next().onActivityPaused(activity);
                    }
                }
            } catch (Exception e) {
                C2914kb.m7426(m7275("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern(), m7275("븞\udc72빛ผ完ￆ\udb63굘\uf61c웞ጇ旉⻞뻡쪰\udc16札睪舧钱龷\u2fda㩇䌧푏\ue04b\uf1dd㮂\u0cda", View.combineMeasuredStates(0, 0)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            int i = f7065 + 121;
            f7064 = i % 128;
            try {
                if (i % 2 != 0) {
                    m7278(activity);
                    m7269().iterator();
                    throw null;
                }
                m7278(activity);
                Iterator<InterfaceC2893jh> it = m7269().iterator();
                while (it.hasNext()) {
                    int i2 = f7065 + InterfaceC3173h3.d.b.f8821d;
                    f7064 = i2 % 128;
                    if (i2 % 2 != 0) {
                        it.next().onActivityResumed(activity);
                        throw null;
                    }
                    it.next().onActivityResumed(activity);
                }
                int i3 = f7065 + 113;
                f7064 = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
            } catch (Exception e) {
                C2914kb.m7426(m7275("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", ExpandableListView.getPackedPositionGroup(0L)).intern(), m7275("婬⨴娩\uf85a᰿롵ῡ槚ቮ\u3098咴ꅋ쪬䢧贃ᢔ荟脬얔倳篅\ud99c練螧〹ᘋ뙨（\ue8a9껬", Color.alpha(0)).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            f7065 = (f7064 + 15) % 128;
            try {
                Iterator<InterfaceC2893jh> it = m7269().iterator();
                while (it.hasNext()) {
                    f7065 = (f7064 + 77) % 128;
                    it.next().onActivitySaveInstanceState(activity, bundle);
                }
            } catch (Exception e) {
                C2914kb.m7426(m7275("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m7275("跙䢄趜髪镝ㄗØ監엛刨\uddd6빲ᴙ⨗ѡޭ哪\ue39c䳶伊거묬\uf496颟\ue788璾㼚\ue015㼗챋枻⡍皧藋긺燯츭嵹훛륩", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f7067 == null) {
                    m7278(activity);
                }
                synchronized (this) {
                    this.f7069.put(activity, Boolean.TRUE);
                }
                Iterator<InterfaceC2893jh> it = m7269().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m7275("䯏ಓ䮬\udee0氷졢\ue134靎ϊᙱ⒣径\udb56湜ﴞ\ue62e鋯ꞓ떋껩橪］ප祵↑ザ왾ǉ錄衃黛즹낺쇍坺逢ࠠ\u1977⾣墡쁜勫\uf823\ue306鿆ꪛ낃", TextUtils.indexOf("", "")).intern())) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f7069.size() == 1 && !this.f7063) {
                            m7276(activity);
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                C2914kb.m7426(m7275("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", ViewConfiguration.getKeyRepeatTimeout() >> 16).intern(), m7275("煂宀焇觮\uf127啭㢛亠㥀䄬리蘱\ue182㤓怛㿮ꡱ\uf098⢌睉僫꠨郬ꃜᬆ枭孷\ud86b쎇\udf58", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern(), (Throwable) e, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int size;
            try {
                Iterator<InterfaceC2893jh> it = m7269().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f7063 = activity.isChangingConfigurations();
                synchronized (this) {
                    try {
                        if (!this.f7069.containsKey(activity) || activity.getLocalClassName().equals(m7275("䯏ಓ䮬\udee0氷졢\ue134靎ϊᙱ⒣径\udb56湜ﴞ\ue62e鋯ꞓ떋껩橪］ප祵↑ザ왾ǉ錄衃黛즹낺쇍坺逢ࠠ\u1977⾣墡쁜勫\uf823\ue306鿆ꪛ낃", KeyEvent.getMaxKeyCode() >> 16).intern())) {
                            size = -1;
                        } else {
                            this.f7069.remove(activity);
                            size = this.f7069.size();
                        }
                    } finally {
                    }
                }
                if (size < 0 || size != 0 || this.f7063) {
                    return;
                }
                m7277(activity);
            } catch (Exception e) {
                C2914kb.m7426(m7275("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", TextUtils.indexOf("", "")).intern(), m7275("똾ꃀ뙻犮\ued04䥎瓽ˆ︼멬ꖏ쩗⛾쉓簸玈漍\u0bd8㒯㬯鞗卨賏\uecba\udc7a鳣䝖鐉ӻ␘", Color.green(0)).intern(), (Throwable) e, false);
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2894ji
        /* renamed from: ﻛ */
        public final synchronized boolean mo7272() {
            f7065 = (f7064 + 71) % 128;
            if (this.f7069.size() <= 0) {
                return false;
            }
            int i = f7064 + 1;
            f7065 = i % 128;
            if (i % 2 != 0) {
                return true;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2894ji
        /* renamed from: ｋ */
        public final synchronized void mo7273(Application application, Activity activity) {
            try {
                if (this.f7068 == null) {
                    this.f7068 = new WeakReference<>(application);
                    if (activity != null) {
                        m7278(activity);
                        synchronized (this) {
                            this.f7069.put(activity, Boolean.TRUE);
                        }
                    }
                    application.registerActivityLifecycleCallbacks(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2894ji
        /* renamed from: ﾒ */
        public final Activity mo7274() {
            int i = f7065;
            f7064 = (i + 99) % 128;
            WeakReference<Activity> weakReference = this.f7067;
            if (weakReference != null) {
                return weakReference.get();
            }
            f7064 = (i + 63) % 128;
            return null;
        }

        public /* synthetic */ d(byte b) {
            this();
        }

        /* renamed from: ﻐ */
        private static String m7275(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2777f.f6322) {
                try {
                    char[] cArrM6790 = C2777f.m6790(f7066, cArr, i);
                    C2777f.f6321 = 4;
                    while (true) {
                        int i2 = C2777f.f6321;
                        if (i2 < cArrM6790.length) {
                            C2777f.f6320 = i2 - 4;
                            cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f7066));
                            C2777f.f6321 = i2 + 1;
                        } else {
                            str2 = new String(cArrM6790, 4, cArrM6790.length - 4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        /* renamed from: ｋ */
        private void m7277(Activity activity) {
            Iterator<InterfaceC2893jh> it = m7269().iterator();
            f7065 = (f7064 + 51) % 128;
            while (it.hasNext()) {
                f7064 = (f7065 + InterfaceC3173h3.d.b.f8823f) % 128;
                it.next().mo5069(activity);
            }
        }
    }

    /* renamed from: ﻐ */
    public final synchronized List<InterfaceC2893jh> m7269() {
        return new ArrayList(this.f7062);
    }
}

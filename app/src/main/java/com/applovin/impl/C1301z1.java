package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C0954a1;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1069j8;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.adview.C0972g;
import com.applovin.impl.adview.C0976k;
import com.applovin.impl.adview.C0977l;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.p005ad.C1206a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1333R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.z1 */
/* loaded from: classes.dex */
public class C1301z1 extends AbstractC1265v1 implements AppLovinCommunicatorSubscriber {

    /* renamed from: M */
    private final C0955a2 f3173M;

    /* renamed from: N */
    private MediaPlayer f3174N;

    /* renamed from: O */
    private final View f3175O;

    /* renamed from: P */
    protected final AppLovinVideoView f3176P;

    /* renamed from: Q */
    protected final C0952a f3177Q;

    /* renamed from: R */
    protected final C0972g f3178R;

    /* renamed from: S */
    protected C1051i0 f3179S;

    /* renamed from: T */
    protected final ImageView f3180T;

    /* renamed from: U */
    protected C0977l f3181U;

    /* renamed from: V */
    protected final ProgressBar f3182V;

    /* renamed from: W */
    protected ProgressBar f3183W;

    /* renamed from: X */
    protected ImageView f3184X;

    /* renamed from: Y */
    private final e f3185Y;

    /* renamed from: Z */
    private final d f3186Z;

    /* renamed from: a0 */
    private final Handler f3187a0;

    /* renamed from: b0 */
    private final Handler f3188b0;

    /* renamed from: c0 */
    protected final C0954a1 f3189c0;

    /* renamed from: d0 */
    protected final C0954a1 f3190d0;

    /* renamed from: e0 */
    private final boolean f3191e0;

    /* renamed from: f0 */
    protected boolean f3192f0;

    /* renamed from: g0 */
    protected long f3193g0;

    /* renamed from: h0 */
    private int f3194h0;

    /* renamed from: i0 */
    private int f3195i0;

    /* renamed from: j0 */
    protected boolean f3196j0;

    /* renamed from: k0 */
    private boolean f3197k0;

    /* renamed from: l0 */
    private final AtomicBoolean f3198l0;

    /* renamed from: m0 */
    private final AtomicBoolean f3199m0;

    /* renamed from: n0 */
    private long f3200n0;

    /* renamed from: o0 */
    private long f3201o0;

    /* renamed from: com.applovin.impl.z1$a */
    public class a implements C0954a1.b {

        /* renamed from: a */
        final /* synthetic */ int f3202a;

        public a(int i) {
            this.f3202a = i;
        }

        @Override // com.applovin.impl.C0954a1.b
        /* renamed from: a */
        public void mo83a() {
            if (C1301z1.this.f3179S != null) {
                long seconds = this.f3202a - TimeUnit.MILLISECONDS.toSeconds(r0.f3176P.getCurrentPosition());
                if (seconds <= 0) {
                    C1301z1.this.f2504v = true;
                } else if (C1301z1.this.m3843P()) {
                    C1301z1.this.f3179S.setProgress((int) seconds);
                }
            }
        }

        @Override // com.applovin.impl.C0954a1.b
        /* renamed from: b */
        public boolean mo84b() {
            return C1301z1.this.m3843P();
        }
    }

    /* renamed from: com.applovin.impl.z1$b */
    public class b implements C0954a1.b {

        /* renamed from: a */
        final /* synthetic */ Integer f3204a;

        public b(Integer num) {
            this.f3204a = num;
        }

        @Override // com.applovin.impl.C0954a1.b
        /* renamed from: a */
        public void mo83a() {
            C1301z1 c1301z1 = C1301z1.this;
            if (c1301z1.f3196j0) {
                c1301z1.f3182V.setVisibility(8);
            } else {
                C1301z1.this.f3182V.setProgress((int) ((c1301z1.f3176P.getCurrentPosition() / C1301z1.this.f3193g0) * this.f3204a.intValue()));
            }
        }

        @Override // com.applovin.impl.C0954a1.b
        /* renamed from: b */
        public boolean mo84b() {
            return !C1301z1.this.f3196j0;
        }
    }

    /* renamed from: com.applovin.impl.z1$c */
    public class c implements C0954a1.b {

        /* renamed from: a */
        final /* synthetic */ long f3206a;

        /* renamed from: b */
        final /* synthetic */ Integer f3207b;

        /* renamed from: c */
        final /* synthetic */ Long f3208c;

        public c(long j, Integer num, Long l) {
            this.f3206a = j;
            this.f3207b = num;
            this.f3208c = l;
        }

        @Override // com.applovin.impl.C0954a1.b
        /* renamed from: a */
        public void mo83a() {
            C1301z1.this.f3183W.setProgress((int) ((C1301z1.this.f2500r / this.f3206a) * this.f3207b.intValue()));
            C1301z1 c1301z1 = C1301z1.this;
            c1301z1.f2500r = this.f3208c.longValue() + c1301z1.f2500r;
        }

        @Override // com.applovin.impl.C0954a1.b
        /* renamed from: b */
        public boolean mo84b() {
            return C1301z1.this.f2500r < this.f3206a;
        }
    }

    /* renamed from: com.applovin.impl.z1$d */
    public class d implements C1069j8.a {
        private d() {
        }

        @Override // com.applovin.impl.C1069j8.a
        /* renamed from: a */
        public void mo1112a(C0977l c0977l) {
            C1240o c1240o = C1301z1.this.f2485c;
            if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            C1301z1.this.mo3462a("video_button");
        }

        @Override // com.applovin.impl.C1069j8.a
        /* renamed from: b */
        public void mo1115b(C0977l c0977l) {
            C1240o c1240o = C1301z1.this.f2485c;
            if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            C1301z1.this.mo3729a(c0977l.getAndClearLastClickEvent(), (Bundle) null);
        }

        @Override // com.applovin.impl.C1069j8.a
        /* renamed from: c */
        public void mo1116c(C0977l c0977l) {
            C1240o c1240o = C1301z1.this.f2485c;
            if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Fully Watched from video button...");
            }
            C1301z1.this.f2480J = true;
        }

        @Override // com.applovin.impl.C1069j8.a
        /* renamed from: d */
        public void mo1117d(C0977l c0977l) {
            C1240o c1240o = C1301z1.this.f2485c;
            if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            C1301z1.this.m3844S();
        }

        public /* synthetic */ d(C1301z1 c1301z1, a aVar) {
            this();
        }

        @Override // com.applovin.impl.C1069j8.a
        /* renamed from: a */
        public void mo1113a(C0977l c0977l, Bundle bundle) {
            C1240o c1240o = C1301z1.this.f2485c;
            if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Attempting to launch Direct Download from video button...");
            }
            C1301z1.this.mo3729a(c0977l.getAndClearLastClickEvent(), bundle);
        }

        @Override // com.applovin.impl.C1069j8.a
        /* renamed from: b */
        public void mo1114b(Uri uri, C0977l c0977l) {
            C1240o c1240o = C1301z1.this.f2485c;
            if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Attempting to report a template error from video button...");
            }
            AbstractC1048h7.m954c(uri, C1301z1.this.f2491i.getController().m226g(), C1301z1.this.f2484b);
        }

        @Override // com.applovin.impl.C1069j8.a
        /* renamed from: a */
        public void mo1111a(Uri uri, C0977l c0977l) {
            C1240o c1240o = C1301z1.this.f2485c;
            if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            AbstractC1048h7.m941a(uri, C1301z1.this.f2491i.getController(), C1301z1.this.f2484b);
        }
    }

    /* renamed from: com.applovin.impl.z1$e */
    public class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener, AppLovinTouchToClickListener.OnClickListener {
        private e() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            C1301z1.this.mo3729a(motionEvent, (Bundle) null);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            C1240o c1240o = C1301z1.this.f2485c;
            if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3211a("AppLovinFullscreenActivity", "Video completed");
            }
            C1301z1.this.f3197k0 = true;
            C1301z1 c1301z1 = C1301z1.this;
            if (!c1301z1.f2502t) {
                c1301z1.mo3727R();
            } else if (c1301z1.m3477g()) {
                C1301z1.this.mo3493z();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C1301z1.this.mo3731g(OooO0oO.OooOo.OooO("Video view error (", i, ",", i2, ")"));
            C1301z1.this.f3176P.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            C1240o c1240o = C1301z1.this.f2485c;
            if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3211a("AppLovinFullscreenActivity", OooO0oO.OooOo.OooO("MediaPlayer Info: (", i, ", ", i2, ")"));
            }
            if (i == 701) {
                C1301z1.this.mo3726Q();
                return false;
            }
            if (i != 3) {
                if (i != 702) {
                    return false;
                }
                C1301z1.this.mo3724D();
                return false;
            }
            C1301z1.this.f3189c0.m81b();
            C1301z1 c1301z1 = C1301z1.this;
            if (c1301z1.f3178R != null) {
                c1301z1.m3827O();
            }
            C1301z1.this.mo3724D();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            C1301z1.this.f3174N = mediaPlayer;
            mediaPlayer.setOnInfoListener(C1301z1.this.f3185Y);
            mediaPlayer.setOnErrorListener(C1301z1.this.f3185Y);
            float f = !C1301z1.this.f3192f0 ? 1 : 0;
            mediaPlayer.setVolume(f, f);
            C1301z1.this.f2503u = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            C1301z1.this.mo3730d(mediaPlayer.getDuration());
            C1301z1.this.mo3725N();
            C1240o c1240o = C1301z1.this.f2485c;
            if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3211a("AppLovinFullscreenActivity", "MediaPlayer prepared: " + C1301z1.this.f3174N);
            }
        }

        public /* synthetic */ e(C1301z1 c1301z1, a aVar) {
            this();
        }
    }

    /* renamed from: com.applovin.impl.z1$f */
    public class f implements View.OnClickListener {
        private f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1301z1 c1301z1 = C1301z1.this;
            if (view == c1301z1.f3178R) {
                c1301z1.m3844S();
                return;
            }
            if (view == c1301z1.f3180T) {
                c1301z1.mo3728T();
            } else if (C1240o.m3200a()) {
                C1301z1.this.f2485c.m3214b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }

        public /* synthetic */ f(C1301z1 c1301z1, a aVar) {
            this();
        }
    }

    public C1301z1(AbstractC1207b abstractC1207b, Activity activity, Map map, C1220k c1220k, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC1207b, activity, map, c1220k, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f3173M = new C0955a2(this.f2483a, this.f2486d, this.f2484b);
        this.f3184X = null;
        e eVar = new e(this, null);
        this.f3185Y = eVar;
        d dVar = new d(this, null);
        this.f3186Z = dVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f3187a0 = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.f3188b0 = handler2;
        C0954a1 c0954a1 = new C0954a1(handler, this.f2484b);
        this.f3189c0 = c0954a1;
        this.f3190d0 = new C0954a1(handler2, this.f2484b);
        boolean zMo1358O0 = this.f2483a.mo1358O0();
        this.f3191e0 = zMo1358O0;
        this.f3192f0 = AbstractC1078k7.m1239e(this.f2484b);
        this.f3195i0 = -1;
        this.f3198l0 = new AtomicBoolean();
        this.f3199m0 = new AtomicBoolean();
        this.f3200n0 = -2L;
        this.f3201o0 = 0L;
        if (!abstractC1207b.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.f3176P = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        abstractC1207b.m2603h().putString("video_view_address", AbstractC0989b8.m425a(appLovinVideoView));
        View view = new View(activity);
        this.f3175O = view;
        boolean z = false;
        view.setBackgroundColor(Color.argb(254, 0, 0, 0));
        if (((Boolean) c1220k.m2866a(C1268v4.f2821k1)).booleanValue()) {
            view.setOnTouchListener(new AppLovinTouchToClickListener(c1220k, C1268v4.f2796h0, activity, eVar));
        } else {
            appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(c1220k, C1268v4.f2796h0, activity, eVar));
            view.setOnTouchListener(new com.applovin.impl.adview.OooO0OO(1));
        }
        f fVar = new f(this, null);
        if (abstractC1207b.m2620n0() >= 0) {
            C0972g c0972g = new C0972g(abstractC1207b.m2595e0(), activity);
            this.f3178R = c0972g;
            c0972g.setVisibility(8);
            c0972g.setOnClickListener(fVar);
        } else {
            this.f3178R = null;
        }
        if (m3833a(this.f3192f0, c1220k)) {
            ImageView imageView = new ImageView(activity);
            this.f3180T = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(fVar);
            m3837e(this.f3192f0);
        } else {
            this.f3180T = null;
        }
        String strM2613k0 = abstractC1207b.m2613k0();
        if (StringUtils.isValidString(strM2613k0)) {
            C1069j8 c1069j8 = new C1069j8(c1220k);
            c1069j8.m1110a(new WeakReference(dVar));
            C0977l c0977l = new C0977l(abstractC1207b.m2610j0(), abstractC1207b, c1069j8, activity);
            this.f3181U = c0977l;
            c0977l.m297a(strM2613k0);
        } else {
            this.f3181U = null;
        }
        if (zMo1358O0) {
            C0952a c0952a = new C0952a(activity, ((Integer) c1220k.m2866a(C1268v4.f2806i2)).intValue(), R.attr.progressBarStyleLarge);
            this.f3177Q = c0952a;
            c0952a.setColor(Color.parseColor("#75FFFFFF"));
            c0952a.setBackgroundColor(Color.parseColor("#00000000"));
            c0952a.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.f3177Q = null;
        }
        int iM3466b = m3466b();
        if (((Boolean) c1220k.m2866a(C1268v4.f2676S1)).booleanValue() && iM3466b > 0) {
            z = true;
        }
        if (this.f3179S == null && z) {
            this.f3179S = new C1051i0(activity);
            int iM2634t = abstractC1207b.m2634t();
            this.f3179S.setTextColor(iM2634t);
            this.f3179S.setTextSize(((Integer) c1220k.m2866a(C1268v4.f2668R1)).intValue());
            this.f3179S.setFinishedStrokeColor(iM2634t);
            this.f3179S.setFinishedStrokeWidth(((Integer) c1220k.m2866a(C1268v4.f2660Q1)).intValue());
            this.f3179S.setMax(iM3466b);
            this.f3179S.setProgress(iM3466b);
            c0954a1.m80a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new a(iM3466b));
        }
        if (!abstractC1207b.m2637u0()) {
            this.f3182V = null;
            return;
        }
        Long l = (Long) c1220k.m2866a(C1268v4.f2782f2);
        Integer num = (Integer) c1220k.m2866a(C1268v4.f2790g2);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.f3182V = progressBar;
        m3830a(progressBar, abstractC1207b.m2635t0(), num.intValue());
        c0954a1.m80a("PROGRESS_BAR", l.longValue(), new b(num));
    }

    /* renamed from: G */
    public /* synthetic */ void m3820G() {
        C0952a c0952a = this.f3177Q;
        if (c0952a != null) {
            c0952a.m65b();
        }
    }

    /* renamed from: H */
    public /* synthetic */ void m3821H() {
        C0952a c0952a = this.f3177Q;
        if (c0952a != null) {
            c0952a.m64a();
            C0952a c0952a2 = this.f3177Q;
            Objects.requireNonNull(c0952a2);
            m3461a(new o0OO00O(c0952a2, 13), 2000L);
        }
    }

    /* renamed from: I */
    public /* synthetic */ void m3822I() {
        this.f3200n0 = -1L;
        this.f3201o0 = SystemClock.elapsedRealtime();
    }

    /* renamed from: J */
    public /* synthetic */ void m3823J() {
        C0952a c0952a = this.f3177Q;
        if (c0952a != null) {
            c0952a.m64a();
        }
    }

    /* renamed from: K */
    public /* synthetic */ void m3824K() {
        this.f2499q = SystemClock.elapsedRealtime();
    }

    /* renamed from: L */
    private void m3825L() {
        C0977l c0977l;
        C0961a8 c0961a8M2616l0 = this.f2483a.m2616l0();
        if (c0961a8M2616l0 == null || !c0961a8M2616l0.m148j() || this.f3196j0 || (c0977l = this.f3181U) == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.sdk.OooOOOO(this, c0977l.getVisibility() == 4, c0961a8M2616l0.m146h(), 1));
    }

    /* renamed from: M */
    public void m3826M() {
        if (this.f3196j0) {
            if (C1240o.m3200a()) {
                this.f2485c.m3218k("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f2484b.m2911n0().isApplicationPaused()) {
            if (C1240o.m3200a()) {
                this.f2485c.m3218k("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        if (this.f3195i0 < 0) {
            if (C1240o.m3200a()) {
                this.f2485c.m3211a("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (C1240o.m3200a()) {
            this.f2485c.m3211a("AppLovinFullscreenActivity", "Resuming video at position " + this.f3195i0 + "ms for MediaPlayer: " + this.f3174N);
        }
        this.f3176P.seekTo(this.f3195i0);
        this.f3176P.start();
        this.f3189c0.m81b();
        this.f3195i0 = -1;
        m3461a(new o000O(this, 0), 250L);
    }

    /* renamed from: O */
    public void m3827O() {
        if (this.f3199m0.compareAndSet(false, true)) {
            m3459a(this.f3178R, this.f2483a.m2620n0(), new o000O(this, 1));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m3831a(View view, MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: e */
    private void m3837e(boolean z) {
        if (AbstractC1141o0.m1949e()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f2486d.getDrawable(z ? C1333R.drawable.applovin_ic_unmute_to_mute : C1333R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f3180T.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f3180T.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        ImageViewUtils.setImageUri(this.f3180T, z ? this.f2483a.m2553Q() : this.f2483a.m2607i0(), this.f2484b);
    }

    /* renamed from: f */
    private void m3838f(boolean z) {
        this.f3194h0 = m3840B();
        if (z) {
            this.f3176P.pause();
        } else {
            this.f3176P.stopPlayback();
        }
    }

    /* renamed from: h */
    public /* synthetic */ void m3839h(String str) {
        AbstractC1089l8.m1421a(this.f3181U, str, "AppLovinFullscreenActivity", this.f2484b);
    }

    /* renamed from: B */
    public int m3840B() {
        long currentPosition = this.f3176P.getCurrentPosition();
        if (this.f3197k0) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.f3193g0) * 100.0f) : this.f3194h0;
    }

    /* renamed from: C */
    public void mo3723C() {
        this.f2507y++;
        if (this.f2483a.m2534E()) {
            if (C1240o.m3200a()) {
                this.f2485c.m3211a("AppLovinFullscreenActivity", "Dismissing ad on video skip...");
            }
            mo3462a("video_skip");
        } else {
            if (C1240o.m3200a()) {
                this.f2485c.m3211a("AppLovinFullscreenActivity", "Skipping video...");
            }
            mo3727R();
        }
    }

    /* renamed from: D */
    public void mo3724D() {
        AppLovinSdkUtils.runOnUiThread(new o000O(this, 5));
    }

    /* renamed from: E */
    public boolean m3841E() {
        if (this.f2480J && this.f2483a.m2621n1()) {
            return true;
        }
        return m3842F();
    }

    /* renamed from: F */
    public boolean m3842F() {
        return m3840B() >= this.f2483a.m2626p0();
    }

    /* renamed from: N */
    public void mo3725N() {
        long jM2569Z;
        long millis;
        if (this.f2483a.m2567Y() >= 0 || this.f2483a.m2569Z() >= 0) {
            if (this.f2483a.m2567Y() >= 0) {
                jM2569Z = this.f2483a.m2567Y();
            } else {
                C1206a c1206a = (C1206a) this.f2483a;
                long j = this.f3193g0;
                long j2 = j > 0 ? j : 0L;
                if (c1206a.m2611j1()) {
                    int iM2489t1 = (int) ((C1206a) this.f2483a).m2489t1();
                    if (iM2489t1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iM2489t1);
                    } else {
                        int iM2632s = (int) c1206a.m2632s();
                        if (iM2632s > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iM2632s);
                        }
                    }
                    j2 += millis;
                }
                jM2569Z = (long) ((this.f2483a.m2569Z() / 100.0d) * j2);
            }
            m3469c(jM2569Z);
        }
    }

    /* renamed from: P */
    public boolean m3843P() {
        return (this.f2504v || this.f3196j0 || !this.f3176P.isPlaying()) ? false : true;
    }

    /* renamed from: Q */
    public void mo3726Q() {
        AppLovinSdkUtils.runOnUiThread(new o000O(this, 4));
    }

    /* renamed from: R */
    public void mo3727R() {
        C1301z1 c1301z1;
        if (C1240o.m3200a()) {
            this.f2485c.m3211a("AppLovinFullscreenActivity", "Showing postitial...");
        }
        m3838f(this.f2483a.m2630q1());
        long jM2563W = this.f2483a.m2563W();
        if (jM2563W > 0) {
            this.f2500r = 0L;
            Long l = (Long) this.f2484b.m2866a(C1268v4.f2846n2);
            Integer num = (Integer) this.f2484b.m2866a(C1268v4.f2870q2);
            ProgressBar progressBar = new ProgressBar(this.f2486d, null, R.attr.progressBarStyleHorizontal);
            this.f3183W = progressBar;
            m3830a(progressBar, this.f2483a.m2561V(), num.intValue());
            c1301z1 = this;
            this.f3190d0.m80a("POSTITIAL_PROGRESS_BAR", l.longValue(), c1301z1.new c(jM2563W, num, l));
            c1301z1.f3190d0.m81b();
        } else {
            c1301z1 = this;
        }
        c1301z1.f3173M.m96a(c1301z1.f2493k, c1301z1.f2492j, c1301z1.f2491i, c1301z1.f3183W);
        StringBuilder sb = new StringBuilder("javascript:al_onPoststitialShow(");
        sb.append(c1301z1.f2507y);
        sb.append(",");
        mo3463a(OooO0oO.OooOo.OooOOO(sb, c1301z1.f2508z, ");"), c1301z1.f2483a.m2540H());
        if (c1301z1.f2493k != null) {
            if (c1301z1.f2483a.m2632s() >= 0) {
                m3459a(c1301z1.f2493k, c1301z1.f2483a.m2632s(), new o000O(this, 3));
            } else {
                c1301z1.f2493k.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        C0972g c0972g = c1301z1.f2493k;
        if (c0972g != null) {
            arrayList.add(new C1015e4(c0972g, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        C0976k c0976k = c1301z1.f2492j;
        if (c0976k != null && c0976k.m295a()) {
            C0976k c0976k2 = c1301z1.f2492j;
            arrayList.add(new C1015e4(c0976k2, FriendlyObstructionPurpose.NOT_VISIBLE, c0976k2.getIdentifier()));
        }
        ProgressBar progressBar2 = c1301z1.f3183W;
        if (progressBar2 != null) {
            arrayList.add(new C1015e4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        c1301z1.f2483a.getAdEventTracker().m469b(c1301z1.f2491i, arrayList);
        m3483o();
        c1301z1.f3196j0 = true;
    }

    /* renamed from: S */
    public void m3844S() {
        this.f3200n0 = SystemClock.elapsedRealtime() - this.f3201o0;
        if (C1240o.m3200a()) {
            this.f2485c.m3211a("AppLovinFullscreenActivity", OooO0oO.OooOo.OooOOOO(new StringBuilder("Attempting to skip video with skip time: "), this.f3200n0, "ms"));
        }
        mo3723C();
    }

    /* renamed from: T */
    public void mo3728T() {
        MediaPlayer mediaPlayer = this.f3174N;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f2 = this.f3192f0 ? 1.0f : 0.0f;
            mediaPlayer.setVolume(f2, f2);
            boolean z = !this.f3192f0;
            this.f3192f0 = z;
            m3837e(z);
            m3464a(this.f3192f0, 0L);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public void mo3730d(long j) {
        this.f3193g0 = j;
    }

    /* renamed from: g */
    public void mo3731g(String str) {
        if (C1240o.m3200a()) {
            C1240o c1240o = this.f2485c;
            StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("Encountered media error: ", str, " for ad: ");
            sbOooOoO0.append(this.f2483a);
            c1240o.m3214b("AppLovinFullscreenActivity", sbOooOoO0.toString());
        }
        if (this.f3198l0.compareAndSet(false, true)) {
            if (((Boolean) this.f2484b.m2866a(C1268v4.f2643O0)).booleanValue()) {
                this.f2484b.m2837H().m3036d(this.f2483a, C1220k.m2824o());
            }
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f2476F;
            if (appLovinAdDisplayListener instanceof InterfaceC1073k2) {
                ((InterfaceC1073k2) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            String str2 = this.f2483a instanceof C1088l7 ? "handleVastVideoError" : "handleVideoError";
            this.f2484b.m2832E().m2150a(str2, str, this.f2483a);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", str2);
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f2484b.m2897g().m706a(C0993c2.f539s, this.f2483a, mapHashMap);
            mo3462a("media_error");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: l */
    public void mo3480l() {
        super.m3456a(m3840B(), this.f3191e0, m3841E(), this.f3200n0);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.f2483a.getAdIdNumber() && this.f3191e0) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !AbstractC1175r0.m2291a(i)) || this.f3197k0 || this.f3176P.isPlaying()) {
                    return;
                }
                mo3731g("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: q */
    public void mo3485q() {
        if (C1240o.m3200a()) {
            this.f2485c.m3215d("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f2484b.m2866a(C1268v4.f2818j6)).booleanValue()) {
                AbstractC1089l8.m1423b(this.f3181U);
                this.f3181U = null;
            }
            if (this.f3191e0) {
                AppLovinCommunicator.getInstance(this.f2486d).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.f3176P;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.f3176P.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.f3174N;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            C1240o.m3204c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.mo3485q();
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: u */
    public void mo3489u() {
        if (C1240o.m3200a()) {
            this.f2485c.m3211a("AppLovinFullscreenActivity", "Pausing video");
        }
        this.f3195i0 = this.f3176P.getCurrentPosition();
        this.f3176P.pause();
        this.f3189c0.m82c();
        if (C1240o.m3200a()) {
            this.f2485c.m3211a("AppLovinFullscreenActivity", "Paused video at position " + this.f3195i0 + "ms");
        }
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: v */
    public void mo3490v() {
        mo3458a((ViewGroup) null);
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: z */
    public void mo3493z() {
        this.f3173M.mo95a(this.f2494l);
        this.f2499q = SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: b */
    public void mo3468b(boolean z) {
        super.mo3468b(z);
        if (z) {
            mo3467b(0L);
            if (this.f3196j0) {
                this.f3190d0.m81b();
                return;
            }
            return;
        }
        if (this.f3196j0) {
            this.f3190d0.m82c();
        } else {
            mo3489u();
        }
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: d */
    public void mo3471d() {
        super.mo3471d();
        mo3493z();
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: a */
    public void mo3458a(ViewGroup viewGroup) {
        String str;
        this.f3173M.m94a(this.f3180T, this.f3178R, this.f3181U, this.f3177Q, this.f3182V, this.f3179S, this.f3176P, this.f3175O, this.f2491i, this.f2492j, this.f3184X, viewGroup);
        if (AbstractC1141o0.m1952h() && (str = this.f2484b.m2912o0().getExtraParameters().get("audio_focus_request")) != null) {
            this.f3176P.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (((Boolean) this.f2484b.m2866a(C1268v4.f2624L5)).booleanValue() || !m3465a(!this.f3191e0)) {
            this.f3176P.setVideoURI(this.f2483a.mo1370v0());
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            C0976k c0976k = this.f2492j;
            if (c0976k != null) {
                c0976k.m296b();
            }
            this.f3176P.start();
            if (this.f3191e0) {
                mo3726Q();
            }
            this.f2491i.renderAd(this.f2483a);
            if (this.f3178R != null) {
                this.f2484b.m2918r0().m405a(new C1156p6(this.f2484b, "scheduleSkipButton", new o000O(this, 2)), C0987b6.b.TIMEOUT, this.f2483a.m2623o0(), true);
            }
            super.m3470c(this.f3192f0);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m3835b(boolean z, long j) {
        if (z) {
            AbstractC0989b8.m426a(this.f3181U, j, (Runnable) null);
        } else {
            AbstractC0989b8.m434b(this.f3181U, j, null);
        }
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: e */
    public void mo3474e() {
        super.mo3474e();
        this.f3173M.mo93a(this.f3181U);
        this.f3173M.mo93a((View) this.f3178R);
        if (!m3477g() || this.f3196j0) {
            mo3493z();
        }
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: b */
    public void mo3467b(long j) {
        m3461a(new o000O(this, 6), j);
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: a */
    public void mo3463a(String str, long j) {
        super.mo3463a(str, j);
        if (this.f3181U == null || j < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        m3461a(new OooO(24, this, str), j);
    }

    /* renamed from: a */
    private void m3830a(ProgressBar progressBar, int i, int i2) {
        progressBar.setMax(i2);
        progressBar.setPadding(0, 0, 0, 0);
        if (AbstractC1141o0.m1949e()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // com.applovin.impl.AbstractC1265v1
    /* renamed from: a */
    public void mo3462a(String str) {
        this.f3189c0.m79a();
        this.f3190d0.m79a();
        this.f3187a0.removeCallbacksAndMessages(null);
        this.f3188b0.removeCallbacksAndMessages(null);
        if (!((Boolean) this.f2484b.m2866a(C1268v4.f2561D6)).booleanValue()) {
            AbstractC1207b abstractC1207b = this.f2483a;
            if (abstractC1207b != null) {
                abstractC1207b.m2576a(str);
            }
            mo3480l();
        }
        super.mo3462a(str);
    }

    /* renamed from: a */
    public void mo3729a(MotionEvent motionEvent, Bundle bundle) {
        Context context;
        if (this.f2483a.mo1357N0()) {
            if (C1240o.m3200a()) {
                this.f2485c.m3211a("AppLovinFullscreenActivity", "Clicking through video");
            }
            Uri uriMo1366m0 = this.f2483a.mo1366m0();
            if (uriMo1366m0 != null) {
                if (!((Boolean) this.f2484b.m2866a(C1268v4.f2923x)).booleanValue() || (context = this.f2486d) == null) {
                    AppLovinAdView appLovinAdView = this.f2491i;
                    context = appLovinAdView != null ? appLovinAdView.getContext() : C1220k.m2824o();
                }
                this.f2484b.m2905k().trackAndLaunchVideoClick(this.f2483a, uriMo1366m0, motionEvent, bundle, this, context);
                AbstractC1168q2.m2180a(this.f2475E, this.f2483a);
                this.f2508z++;
                return;
            }
            return;
        }
        m3825L();
    }

    /* renamed from: a */
    private static boolean m3833a(boolean z, C1220k c1220k) {
        if (!((Boolean) c1220k.m2866a(C1268v4.f2716X1)).booleanValue()) {
            return false;
        }
        if (!((Boolean) c1220k.m2866a(C1268v4.f2724Y1)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) c1220k.m2866a(C1268v4.f2740a2)).booleanValue();
    }
}

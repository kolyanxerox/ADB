package com.applovin.impl.sdk.nativeAd;

import OooO0oO.OooOo;
import android.app.Activity;
import android.content.Context;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.AbstractC0980b;
import com.applovin.impl.AbstractC0989b8;
import com.applovin.impl.AbstractC1000d;
import com.applovin.impl.AbstractC1048h7;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.AbstractC1175r0;
import com.applovin.impl.AbstractC1280w7;
import com.applovin.impl.AbstractC1289x7;
import com.applovin.impl.C0954a1;
import com.applovin.impl.C1088l7;
import com.applovin.impl.C1182r7;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1271v7;
import com.applovin.impl.C1307z7;
import com.applovin.impl.EnumC1173q7;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1333R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final C0954a1 countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private boolean isViewAttached;
    private int lastVideoPositionFromPauseMillis;
    private final AbstractC0980b lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private MediaPlayer mediaPlayer;
    private ImageView muteButtonImageView;
    private ImageView playPauseButtonImageView;
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final C1088l7 vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set<C1271v7> videoProgressTrackers;
    private final C1231e videoUiEventHandler;
    private final AppLovinVideoView videoView;
    private boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$a */
    public class C1227a extends AbstractC0980b {
        public C1227a() {
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                AppLovinVastMediaView.this.maybeHandlePause();
            }
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (!activity.equals(AppLovinVastMediaView.this.viewActivity) || AppLovinVastMediaView.this.isVideoPausedByUser) {
                return;
            }
            AppLovinVastMediaView.this.maybeHandleResume();
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$b */
    public class C1228b implements C0954a1.b {
        public C1228b() {
        }

        @Override // com.applovin.impl.C0954a1.b
        /* renamed from: a */
        public void mo83a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - (AppLovinVastMediaView.this.videoView.getDuration() - AppLovinVastMediaView.this.videoView.getCurrentPosition()));
            int videoPercentViewed = AppLovinVastMediaView.this.getVideoPercentViewed();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(AppLovinVastMediaView.this.videoProgressTrackers).iterator();
            while (it.hasNext()) {
                C1271v7 c1271v7 = (C1271v7) it.next();
                if (c1271v7.m3576a(seconds, videoPercentViewed)) {
                    hashSet.add(c1271v7);
                    AppLovinVastMediaView.this.videoProgressTrackers.remove(c1271v7);
                }
            }
            AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
            if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().m1000x();
                return;
            }
            if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().m1001y();
            } else if (videoPercentViewed >= 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().m993C();
            }
        }

        @Override // com.applovin.impl.C0954a1.b
        /* renamed from: b */
        public boolean mo84b() {
            return !AppLovinVastMediaView.this.videoWasCompleted;
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$c */
    public class ViewOnClickListenerC1229c implements View.OnClickListener {
        private ViewOnClickListenerC1229c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri uriM2350c;
            C1182r7 c1182r7M1372x1 = AppLovinVastMediaView.this.vastAd.m1372x1();
            if (c1182r7M1372x1 == null || (uriM2350c = c1182r7M1372x1.m2350c()) == null) {
                return;
            }
            C1240o c1240o = AppLovinVastMediaView.this.logger;
            if (C1240o.m3200a()) {
                AppLovinVastMediaView.this.logger.m3211a(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + uriM2350c);
            }
            AppLovinVastMediaView.this.maybeFireTrackers(C1088l7.d.INDUSTRY_ICON_CLICK);
            AbstractC1048h7.m948a(uriM2350c, view.getContext(), AppLovinVastMediaView.this.sdk);
        }

        public /* synthetic */ ViewOnClickListenerC1229c(AppLovinVastMediaView appLovinVastMediaView, C1227a c1227a) {
            this();
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$d */
    public class C1230d implements AppLovinTouchToClickListener.OnClickListener {

        /* renamed from: a */
        private final AppLovinNativeAdImpl f2229a;

        public C1230d(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f2229a = appLovinNativeAdImpl;
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            Uri uriMo1366m0;
            AppLovinVastMediaView.this.maybeFireTrackers(C1088l7.d.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().m998v();
            if (AppLovinVastMediaView.this.vastAd.mo1357N0() && (uriMo1366m0 = AppLovinVastMediaView.this.vastAd.mo1366m0()) != null) {
                C1240o c1240o = AppLovinVastMediaView.this.logger;
                if (C1240o.m3200a()) {
                    AppLovinVastMediaView.this.logger.m3211a(AppLovinVastMediaView.TAG, "Clicking through video");
                }
                AppLovinVastMediaView.this.sdk.m2905k().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.this.vastAd.m2579b(motionEvent, false));
                this.f2229a.handleNativeAdClick(uriMo1366m0, null, motionEvent, (!((Boolean) AppLovinVastMediaView.this.sdk.m2866a(C1268v4.f2923x)).booleanValue() || AppLovinVastMediaView.this.viewActivity == null) ? AppLovinVastMediaView.this.getContext() : AppLovinVastMediaView.this.viewActivity);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$e */
    public class C1231e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener {
        private C1231e() {
        }

        /* renamed from: a */
        public /* synthetic */ void m3060a() {
            AppLovinVastMediaView.this.videoView.seekTo(0);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            C1240o c1240o = AppLovinVastMediaView.this.logger;
            if (C1240o.m3200a()) {
                AppLovinVastMediaView.this.logger.m3211a(AppLovinVastMediaView.TAG, "Video completed");
            }
            AppLovinVastMediaView.this.videoWasCompleted = true;
            AppLovinVastMediaView.this.finishVideo();
            if (AppLovinVastMediaView.this.replayIconContainer != null) {
                AbstractC0989b8.m426a(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new OooO0O0(this, 0));
            } else {
                AppLovinVastMediaView.this.showMediaImageView();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            AppLovinVastMediaView.this.handleMediaError(OooOo.OooO("Video view error (", i, ",", i2, ")"));
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i != 3) {
                return false;
            }
            AppLovinVastMediaView.this.countdownManager.m81b();
            if (AppLovinVastMediaView.this.isViewAttached) {
                return false;
            }
            AppLovinVastMediaView.this.pauseVideo();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            AppLovinVastMediaView.this.mediaPlayer = mediaPlayer;
            AppLovinVastMediaView.this.mediaPlayer.setOnInfoListener(AppLovinVastMediaView.this.videoUiEventHandler);
            AppLovinVastMediaView.this.mediaPlayer.setOnErrorListener(AppLovinVastMediaView.this.videoUiEventHandler);
            float f = !AppLovinVastMediaView.this.isVideoMuted ? 1 : 0;
            AppLovinVastMediaView.this.mediaPlayer.setVolume(f, f);
            AppLovinVastMediaView.this.videoDurationMillis = r4.mediaPlayer.getDuration();
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().m994b(TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), AbstractC1078k7.m1239e(AppLovinVastMediaView.this.sdk));
            C1240o c1240o = AppLovinVastMediaView.this.logger;
            if (C1240o.m3200a()) {
                AppLovinVastMediaView.this.logger.m3211a(AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + AppLovinVastMediaView.this.mediaPlayer);
            }
            if (AppLovinVastMediaView.this.isViewAttached) {
                AppLovinVastMediaView.this.videoView.start();
            }
        }

        public /* synthetic */ C1231e(AppLovinVastMediaView appLovinVastMediaView, C1227a c1227a) {
            this();
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$f */
    public class ViewOnClickListenerC1232f implements View.OnClickListener {
        private ViewOnClickListenerC1232f() {
        }

        /* renamed from: a */
        public /* synthetic */ void m3061a() {
            AppLovinVastMediaView.this.videoWasCompleted = false;
            AppLovinVastMediaView.this.automaticResumeHandled.set(false);
            AppLovinVastMediaView.this.sdk.m2893e().m438a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
            AppLovinVastMediaView.this.maybeHandleResume();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.videoView.isPlaying()) {
                    AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                } else {
                    AppLovinVastMediaView.this.isVideoPausedByUser = false;
                    AppLovinVastMediaView.this.maybeHandleResume();
                    return;
                }
            }
            if (view != AppLovinVastMediaView.this.muteButtonImageView) {
                if (view == AppLovinVastMediaView.this.replayIconContainer) {
                    AbstractC0989b8.m434b(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new OooO0O0(this, 1));
                }
            } else {
                if (AppLovinVastMediaView.this.mediaPlayer == null) {
                    return;
                }
                try {
                    AppLovinVastMediaView.this.isVideoMuted = !r4.isVideoMuted;
                    float f = !AppLovinVastMediaView.this.isVideoMuted ? 1 : 0;
                    AppLovinVastMediaView.this.mediaPlayer.setVolume(f, f);
                    AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
                    appLovinVastMediaView.populateMuteImage(appLovinVastMediaView.isVideoMuted);
                } catch (Throwable unused) {
                }
            }
        }

        public /* synthetic */ ViewOnClickListenerC1232f(AppLovinVastMediaView appLovinVastMediaView, C1227a c1227a) {
            this();
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, C1220k c1220k, Context context) {
        super(appLovinNativeAdImpl, c1220k, context);
        C1231e c1231e = new C1231e(this, null);
        this.videoUiEventHandler = c1231e;
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new C0954a1(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new C1227a();
        C1088l7 vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean zMo1358O0 = vastAd.mo1358O0();
        this.isVideoStream = zMo1358O0;
        if (zMo1358O0) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        if (vastAd.m1347D1()) {
            this.industryIconImageView = C1182r7.m2346a(vastAd.m1372x1().m2352e(), context, c1220k);
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) c1220k.m2866a(C1268v4.f2631M4)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx, iDpToPx, ((Integer) c1220k.m2866a(C1268v4.f2647O4)).intValue()));
            this.industryIconImageView.setOnClickListener(new ViewOnClickListenerC1229c(this, null));
            addView(this.industryIconImageView);
        }
        if (((Boolean) c1220k.m2866a(C1268v4.f2687T4)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            int iDpToPx2 = 0;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(C1333R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) c1220k.m2866a(C1268v4.f2679S4)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            ViewOnClickListenerC1232f viewOnClickListenerC1232f = new ViewOnClickListenerC1232f(this, null);
            this.playPauseButtonImageView.setOnClickListener(viewOnClickListenerC1232f);
            int iDpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) c1220k.m2866a(C1268v4.f2663Q4)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3, iDpToPx3));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                iDpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) c1220k.m2866a(C1268v4.f2655P4)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(viewOnClickListenerC1232f);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            }
            int iDpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) c1220k.m2866a(C1268v4.f2671R4)).intValue());
            this.videoWidgetLinearLayout.setPadding(iDpToPx4, iDpToPx4, iDpToPx4, iDpToPx4);
            int i = iDpToPx4 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx3 + iDpToPx2 + i, Math.max(iDpToPx3, iDpToPx2) + i, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) c1220k.m2866a(C1268v4.f2695U4)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new ViewOnClickListenerC1232f(this, null));
            ImageView imageView2 = new ImageView(getContext());
            int iDpToPx5 = AppLovinSdkUtils.dpToPx(context, ((Integer) c1220k.m2866a(C1268v4.f2703V4)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(iDpToPx5, iDpToPx5, 17));
            imageView2.setImageResource(C1333R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(getContext());
        this.videoView = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(c1231e);
        appLovinVideoView.setOnCompletionListener(c1231e);
        appLovinVideoView.setOnErrorListener(c1231e);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(c1220k, C1268v4.f2804i0, getContext(), new C1230d(appLovinNativeAdImpl)));
        addView(appLovinVideoView);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(appLovinVideoView);
        hashSet.addAll(vastAd.m1362a(C1088l7.d.VIDEO, AbstractC1280w7.f3013a));
    }

    private void checkCachedAdResourcesImmediately(boolean z) {
        if (AbstractC1078k7.m1179a(z, this.vastAd, this.sdk, getContext()).isEmpty()) {
            return;
        }
        handleUnavailableCachedResources();
    }

    public void finishVideo() {
        maybeFireTrackers(C1088l7.d.VIDEO, "close");
        maybeHandlePause();
        this.sdk.m2893e().m440b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.getAdEventTracker().m999w();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.m2905k().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    public int getVideoPercentViewed() {
        int currentPosition = this.videoView.getCurrentPosition();
        if (this.videoWasCompleted) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.videoDurationMillis) * 100.0f) : this.savedVideoPercentViewed;
    }

    public void handleMediaError(String str) {
        if (C1240o.m3200a()) {
            this.logger.m3214b(TAG, str);
        }
        maybeFireTrackers(C1088l7.d.ERROR, EnumC1173q7.MEDIA_FILE_ERROR);
        this.vastAd.getAdEventTracker().m470b(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            this.sdk.m2832E().m2150a("handleVastVideoError", str, this.vastAd);
            finishVideo();
            showMediaImageView();
        }
    }

    private void handleUnavailableCachedResources() {
        if (C1240o.m3200a()) {
            this.logger.m3214b(TAG, "Video failed due to unavailable resources");
        }
        finishVideo();
        showMediaImageView();
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() < this.vastAd.m2626p0() || this.videoProgressTrackers.isEmpty()) {
            return;
        }
        if (C1240o.m3200a()) {
            this.logger.m3218k(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
        }
        maybeFireTrackers(this.videoProgressTrackers);
    }

    public void maybeFireTrackers(Set<C1271v7> set) {
        maybeFireTrackers(set, EnumC1173q7.UNSPECIFIED);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.m1347D1()) {
                maybeFireTrackers(C1088l7.d.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = SystemClock.elapsedRealtime();
            maybeFireTrackers(C1088l7.d.IMPRESSION);
            maybeFireTrackers(C1088l7.d.VIDEO, "creativeView");
            this.vastAd.getAdEventTracker().m475g();
            this.vastAd.setHasShown(true);
            this.sdk.m2905k().trackImpression(this.vastAd);
            this.viewActivity = AbstractC1000d.m502a(AbstractC0989b8.m433b(this));
            this.sdk.m2893e().m438a(this.lifecycleCallbacksAdapter);
            this.videoView.start();
            this.countdownManager.m80a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1L), new C1228b());
        }
    }

    public void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(C1088l7.d.VIDEO, "pause");
            this.vastAd.getAdEventTracker().m1002z();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    public void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(C1088l7.d.VIDEO, "resume");
            this.vastAd.getAdEventTracker().m991A();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                if (C1240o.m3200a()) {
                    this.logger.m3211a(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
                }
                this.videoView.start();
                this.countdownManager.m81b();
                this.lastVideoPositionFromPauseMillis = -1;
            } else if (C1240o.m3200a()) {
                this.logger.m3211a(TAG, "Invalid last video position");
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    public void pauseVideo() {
        if (C1240o.m3200a()) {
            this.logger.m3211a(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.videoView.getCurrentPosition();
        this.videoView.pause();
        this.countdownManager.m82c();
        if (C1240o.m3200a()) {
            this.logger.m3211a(TAG, "Paused video at position " + this.lastVideoPositionFromPauseMillis + " ms");
        }
    }

    public boolean populateMuteImage(boolean z) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        if (AbstractC1141o0.m1949e()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(z ? C1333R.drawable.applovin_ic_unmute_to_mute : C1333R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return true;
            }
        }
        Uri uriM2553Q = z ? this.vastAd.m2553Q() : this.vastAd.m2607i0();
        if (uriM2553Q == null) {
            return false;
        }
        ImageViewUtils.setImageUri(this.muteButtonImageView, uriM2553Q, this.sdk);
        return true;
    }

    private void populatePlayPauseImage(boolean z) {
        ImageView imageView = this.playPauseButtonImageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(z ? C1333R.drawable.applovin_ic_play_icon : C1333R.drawable.applovin_ic_pause_icon);
    }

    private void prepareMediaPlayer() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        checkCachedAdResourcesImmediately(!this.isVideoStream);
        this.videoView.setVideoURI(this.vastAd.mo1370v0());
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.pause();
            this.videoView.stopPlayback();
        }
        this.videoView.setOnTouchListener(null);
        this.viewActivity = null;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.vastAd.getAdEventTracker().m474f();
        this.countdownManager.m79a();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return TAG;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isViewAttached = true;
        maybeHandleOnAttachedToWindow();
        if (this.isVideoPausedByUser) {
            return;
        }
        maybeHandleResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isViewAttached = false;
        maybeHandlePause();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !AbstractC1175r0.m2291a(i)) || this.videoWasCompleted || this.videoView.isPlaying()) {
                    return;
                }
                handleMediaError("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    public void maybeFireTrackers(C1088l7.d dVar) {
        maybeFireTrackers(dVar, EnumC1173q7.UNSPECIFIED);
    }

    private void maybeFireTrackers(C1088l7.d dVar, String str) {
        maybeFireTrackers(dVar, str, EnumC1173q7.UNSPECIFIED);
    }

    private void maybeFireTrackers(C1088l7.d dVar, EnumC1173q7 enumC1173q7) {
        maybeFireTrackers(dVar, "", enumC1173q7);
    }

    private void maybeFireTrackers(C1088l7.d dVar, String str, EnumC1173q7 enumC1173q7) {
        maybeFireTrackers((Set<C1271v7>) this.vastAd.m1361a(dVar, str), enumC1173q7);
    }

    private void maybeFireTrackers(Set<C1271v7> set, EnumC1173q7 enumC1173q7) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.videoView.getCurrentPosition());
        C1307z7 c1307z7M1346C1 = this.vastAd.m1346C1();
        Uri uriM3898d = c1307z7M1346C1 != null ? c1307z7M1346C1.m3898d() : null;
        if (C1240o.m3200a()) {
            this.logger.m3211a(TAG, "Firing " + set.size() + " tracker(s): " + set);
        }
        AbstractC1289x7.m3671a(set, seconds, uriM3898d, enumC1173q7, this.sdk);
    }
}

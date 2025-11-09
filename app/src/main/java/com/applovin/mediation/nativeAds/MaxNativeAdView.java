package com.applovin.mediation.nativeAds;

import OooO0oO.OooOo;
import OooOo0o.o000oOoO;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.C0956a3;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.mediation.ads.C1119b;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.C1333R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {

    /* renamed from: a */
    private final View f3288a;

    /* renamed from: b */
    private final TextView f3289b;

    /* renamed from: c */
    private final TextView f3290c;

    /* renamed from: d */
    private final TextView f3291d;

    /* renamed from: e */
    private final Button f3292e;

    /* renamed from: f */
    private final ImageView f3293f;

    /* renamed from: g */
    private final FrameLayout f3294g;

    /* renamed from: h */
    private final ViewGroup f3295h;

    /* renamed from: i */
    private final FrameLayout f3296i;

    /* renamed from: j */
    private final ViewGroup f3297j;

    /* renamed from: k */
    private final ViewGroup f3298k;

    /* renamed from: l */
    private final FrameLayout f3299l;

    /* renamed from: m */
    private C1119b f3300m;

    /* renamed from: com.applovin.mediation.nativeAds.MaxNativeAdView$a */
    public class ViewTreeObserverOnPreDrawListenerC1328a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ WeakReference f3301a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f3302b;

        public ViewTreeObserverOnPreDrawListenerC1328a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f3301a = weakReference;
            this.f3302b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f3301a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                C1220k.f2089D0.m2847O();
                if (C1240o.m3200a()) {
                    C1220k.f2089D0.m2847O().m3218k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f3301a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3302b.getLayoutParams();
            layoutParams.height = ((View) this.f3302b.getParent()).getWidth();
            this.f3302b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    /* renamed from: b */
    private void m3931b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f3289b.setText(maxNativeAd.getTitle());
        } else {
            this.f3289b.setVisibility(8);
        }
        if (this.f3290c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f3290c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f3290c.setVisibility(8);
            }
        }
        if (this.f3291d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f3291d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f3291d.setVisibility(8);
            } else {
                this.f3291d.setVisibility(4);
            }
        }
        if (this.f3292e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f3292e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f3292e.setVisibility(8);
            } else {
                this.f3292e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f3294g;
        if (frameLayout != null) {
            if (icon == null || this.f3293f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f3294g.removeAllViews();
                    this.f3294g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f3293f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f3294g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f3293f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f3296i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f3296i.addView(optionsView);
            this.f3296i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f3299l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f3299l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f3299l.setVisibility(8);
            }
        }
        if (this.f3297j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f3297j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f3297j.addView(appLovinStarRatingView);
            } else {
                this.f3297j.setVisibility(8);
            }
        }
        m3930b();
        postDelayed(new o000oOoO(this, 14), 2000L);
    }

    public C1119b getAdViewTracker() {
        return this.f3300m;
    }

    public TextView getAdvertiserTextView() {
        return this.f3290c;
    }

    public TextView getBodyTextView() {
        return this.f3291d;
    }

    public Button getCallToActionButton() {
        return this.f3292e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f3289b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f3290c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f3291d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f3292e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f3293f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f3294g;
    }

    public ImageView getIconImageView() {
        return this.f3293f;
    }

    public View getMainView() {
        return this.f3288a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f3299l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f3298k;
        return viewGroup != null ? viewGroup : this.f3299l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f3296i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f3295h;
        return viewGroup != null ? viewGroup : this.f3296i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f3297j;
    }

    public TextView getTitleTextView() {
        return this.f3289b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1119b c1119b = this.f3300m;
        if (c1119b != null) {
            c1119b.m1678c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        C1240o.m3209j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        C1119b c1119b = this.f3300m;
        if (c1119b != null) {
            c1119b.m1676a();
            this.f3300m = null;
        }
        View view = this.f3288a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f3288a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f3288a);
    }

    public void render(C0956a3 c0956a3, AbstractC1118a.a aVar, C1220k c1220k) {
        recycle();
        if (!c0956a3.m104p0().get() || !c0956a3.m103o0().get()) {
            this.f3300m = new C1119b(c0956a3, this, aVar, c1220k);
        }
        MaxNativeAd nativeAd = c0956a3.getNativeAd();
        if (c0956a3.m105q0() && nativeAd.isContainerClickable()) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3211a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new OooO00o(nativeAd, 0));
        }
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3211a("MaxNativeAdView", "Rendering custom ad view");
        }
        m3928a(nativeAd);
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    /* renamed from: a */
    private int m3926a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? C1333R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? C1333R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? C1333R.layout.max_native_ad_vertical_media_banner_view : C1333R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? C1333R.layout.max_native_ad_vertical_leader_view : C1333R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return C1333R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException(OooOo.OooOO0("Attempting to render MAX native ad with invalid template: ", str));
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        this(maxNativeAd, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(C1333R.id.applovin_native_title_text_view).setAdvertiserTextViewId(C1333R.id.applovin_native_advertiser_text_view).setBodyTextViewId(C1333R.id.applovin_native_body_text_view).setCallToActionButtonId(C1333R.id.applovin_native_cta_button).setIconImageViewId(C1333R.id.applovin_native_icon_image_view).setIconContentViewId(C1333R.id.applovin_native_icon_view).setOptionsContentViewGroupId(C1333R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(C1333R.id.applovin_native_options_view).setStarRatingContentViewGroupId(C1333R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(C1333R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(C1333R.id.applovin_native_media_content_view).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        int iM3926a;
        super(context);
        boolean z = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f3288a = view;
        } else {
            if (z) {
                iM3926a = m3926a(maxNativeAdViewBinder.templateType, format);
            } else {
                iM3926a = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f3288a = LayoutInflater.from(context).inflate(iM3926a, (ViewGroup) this, false);
        }
        addView(this.f3288a);
        this.f3289b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f3290c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f3291d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f3292e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f3293f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f3294g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f3295h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f3296i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f3297j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f3298k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f3299l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            m3931b(maxNativeAd);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m3927a() {
        setSelected(true);
    }

    /* renamed from: a */
    private void m3928a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f3289b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f3291d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f3290c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f3292e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f3293f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f3293f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f3293f, icon.getUri());
                } else {
                    this.f3293f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f3298k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f3298k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f3295h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f3295h.addView(optionsView);
                this.f3295h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f3297j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f3297j.addView(appLovinStarRatingView);
            }
        }
    }

    /* renamed from: b */
    private void m3930b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(C1333R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1328a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }
}

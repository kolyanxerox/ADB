package com.applovin.sdk;

import OooO0oO.OooOo;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.mediationsdk.C3395l;
import java.util.Locale;

/* loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* renamed from: a */
    private final String f3341a;

    /* renamed from: b */
    private final int f3342b;

    /* renamed from: c */
    private final int f3343c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, C3395l.f9866a);
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i, int i2, String str) {
        this.f3342b = i;
        this.f3343c = i2;
        this.f3341a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if (C3395l.f9866a.equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException(OooOo.OooOO0("Unknown Ad Size: ", str));
    }

    public int getHeight() {
        return this.f3343c;
    }

    public String getLabel() {
        return this.f3341a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f3342b;
    }

    public String toString() {
        return getLabel();
    }
}

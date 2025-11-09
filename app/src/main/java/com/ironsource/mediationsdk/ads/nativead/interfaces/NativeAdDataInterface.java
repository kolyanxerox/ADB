package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes2.dex */
public interface NativeAdDataInterface {

    public static class Image {

        /* renamed from: a */
        private final Drawable f9575a;

        /* renamed from: b */
        private final Uri f9576b;

        public Image(Drawable drawable, Uri uri) {
            this.f9575a = drawable;
            this.f9576b = uri;
        }

        public final Drawable getDrawable() {
            return this.f9575a;
        }

        public final Uri getUri() {
            return this.f9576b;
        }
    }

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Image getIcon();

    String getTitle();
}

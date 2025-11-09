package com.applovin.impl.sdk.utils;

import OooOo0O.OooO0O0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class ImageViewUtils {
    /* renamed from: a */
    public static /* synthetic */ void m3259a(String str, C1220k c1220k, ImageView imageView, Uri uri) {
        try {
            InputStream inputStreamOpenStream = new URL(str).openStream();
            try {
                AppLovinSdkUtils.runOnUiThread(new androidx.webkit.OooO00o(c1220k, BitmapFactory.decodeStream(inputStreamOpenStream), imageView, 17));
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } finally {
            }
        } catch (Throwable th) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3212a("ImageViewUtils", "Failed to fetch image: " + uri, th);
            }
            c1220k.m2847O().m3213a("ImageViewUtils", th);
            c1220k.m2832E().m2148a("ImageViewUtils", "setImageUri", th);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m3260b(ImageView imageView, Uri uri) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        imageView.setImageURI(uri);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public static void setAndDownscaleBitmap(ImageView imageView, Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        C1220k c1220k = C1220k.f2089D0;
        if (c1220k == null) {
            C1240o.m3207h("ImageViewUtils", "SDK has not been initialized");
        } else {
            c1220k.m2918r0().m410c().execute(new OooO00o(uri, imageView));
        }
    }

    public static void setAndDownscaleImageUri(ImageView imageView, Uri uri) {
        if (uri == null || imageView == null) {
            return;
        }
        if (imageView.getHeight() <= 0 || imageView.getWidth() <= 0) {
            imageView.post(new OooO00o(imageView, uri, 2));
        } else {
            setAndDownscaleBitmap(imageView, uri);
        }
    }

    public static void setImageUri(ImageView imageView, Uri uri, C1220k c1220k) {
        if (imageView == null || uri == null) {
            return;
        }
        String string = uri.toString();
        if (URLUtil.isFileUrl(string) || URLUtil.isContentUrl(string)) {
            AppLovinSdkUtils.runOnUiThread(new OooO00o(imageView, uri, 0));
            return;
        }
        if (c1220k == null) {
            return;
        }
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3211a("ImageViewUtils", "Fetching image: " + uri);
        }
        c1220k.m2918r0().m410c().execute(new OooO0O0(string, c1220k, imageView, uri, 12));
    }

    /* renamed from: a */
    public static /* synthetic */ void m3258a(C1220k c1220k, Bitmap bitmap, ImageView imageView) {
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3211a("ImageViewUtils", "Image fetched");
        }
        imageView.setImageDrawable(new BitmapDrawable(C1220k.m2824o().getResources(), bitmap));
    }

    /* renamed from: a */
    public static /* synthetic */ void m3255a(Uri uri, ImageView imageView) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        int height = imageView.getHeight();
        int width = imageView.getWidth();
        if (height <= 0 || width <= 0) {
            Point pointM1938b = AbstractC1141o0.m1938b(imageView.getContext());
            height = Math.min(pointM1938b.x, pointM1938b.y);
            width = height;
        }
        int i2 = options.outHeight;
        int i3 = options.outWidth;
        if (i2 > height || i3 > width) {
            while (true) {
                int i4 = i * 2;
                if (i2 / i4 < height && i3 / i4 < width) {
                    break;
                } else {
                    i = i4;
                }
            }
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        C1220k.f2089D0.m2847O();
        if (C1240o.m3200a()) {
            C1220k.f2089D0.m2847O().m3211a("ImageViewUtils", "Loading image: " + uri.getLastPathSegment() + "...");
        }
        AppLovinSdkUtils.runOnUiThread(new OooO0Oo.OooO0O0(16, imageView, BitmapFactory.decodeFile(uri.getPath(), options)));
    }
}

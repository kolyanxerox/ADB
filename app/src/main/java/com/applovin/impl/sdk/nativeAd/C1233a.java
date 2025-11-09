package com.applovin.impl.sdk.nativeAd;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.AbstractC1013e2;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/* renamed from: com.applovin.impl.sdk.nativeAd.a */
/* loaded from: classes.dex */
public class C1233a extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final AppLovinNativeAdImpl f2233g;

    /* renamed from: h */
    private final a f2234h;

    /* renamed from: i */
    private final String f2235i;

    /* renamed from: com.applovin.impl.sdk.nativeAd.a$a */
    public interface a {
        /* renamed from: a */
        void mo3064a(AppLovinNativeAdImpl appLovinNativeAdImpl);
    }

    public C1233a(AppLovinNativeAdImpl appLovinNativeAdImpl, C1220k c1220k, a aVar) {
        super("TaskCacheNativeAd", c1220k);
        this.f2235i = UUID.randomUUID().toString();
        this.f2233g = appLovinNativeAdImpl;
        this.f2234h = aVar;
    }

    /* renamed from: a */
    private float m3062a(Uri uri) throws IOException {
        FileInputStream fileInputStream;
        int i;
        int i2;
        File file = new File(uri.getPath());
        if (!file.exists()) {
            return -1.0f;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(fileInputStream, null, options);
                i = options.outWidth;
                i2 = options.outHeight;
            } finally {
            }
        } catch (IOException e) {
            if (C1240o.m3200a()) {
                this.f778c.m3212a(this.f777b, "Failed to calculate aspect ratio", e);
            }
        }
        if (i <= 0 || i2 <= 0) {
            fileInputStream.close();
            return -1.0f;
        }
        float f = i / i2;
        fileInputStream.close();
        return f;
    }

    /* renamed from: b */
    private Uri m3063b(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Attempting to cache resource: " + uri);
        }
        String strM3026a = this.f776a.m2837H().m3026a(m791a(), uri.toString(), this.f2233g.getCachePrefix(), Collections.EMPTY_LIST, false, false, 1, this.f2235i, AbstractC1013e2.m677a(this.f2233g));
        if (TextUtils.isEmpty(strM3026a)) {
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unable to cache resource for uri: " + uri);
            }
            return null;
        }
        File fileM3023a = this.f776a.m2837H().m3023a(strM3026a, m791a());
        if (fileM3023a != null) {
            Uri uriFromFile = Uri.fromFile(fileM3023a);
            if (uriFromFile != null) {
                return uriFromFile;
            }
            if (C1240o.m3200a()) {
                this.f778c.m3214b(this.f777b, "Unable to extract Uri from image file");
            }
            return null;
        }
        if (C1240o.m3200a()) {
            this.f778c.m3214b(this.f777b, "Unable to retrieve File from cached image filename = " + strM3026a);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Begin caching ad #" + this.f2233g.getAdIdNumber() + "...");
        }
        Uri uriM3063b = m3063b(this.f2233g.getIconUri());
        if (uriM3063b != null) {
            this.f2233g.setIconUri(uriM3063b);
        }
        Uri uriM3063b2 = m3063b(this.f2233g.getMainImageUri());
        if (uriM3063b2 != null) {
            this.f2233g.setMainImageUri(uriM3063b2);
            float fM3062a = m3062a(uriM3063b2);
            if (fM3062a > 0.0f) {
                this.f2233g.setMainImageAspectRatio(fM3062a);
            }
        }
        Uri uriM3063b3 = m3063b(this.f2233g.getPrivacyIconUri());
        if (uriM3063b3 != null) {
            this.f2233g.setPrivacyIconUri(uriM3063b3);
        }
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Finished caching ad #" + this.f2233g.getAdIdNumber());
        }
        this.f2234h.mo3064a(this.f2233g);
    }
}

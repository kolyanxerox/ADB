package com.applovin.impl;

import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.applovin.impl.b2 */
/* loaded from: classes.dex */
public class C0983b2 {

    /* renamed from: a */
    private final Map f345a;

    /* renamed from: b */
    private final C1220k f346b;

    public C0983b2(Map map, C1220k c1220k) {
        this.f345a = map == null ? Collections.EMPTY_MAP : map;
        this.f346b = c1220k;
    }

    /* renamed from: a */
    public Drawable m330a() {
        Object obj = this.f345a.get("google_watermark");
        if (!m329a(obj)) {
            this.f346b.m2847O();
            if (C1240o.m3200a()) {
                this.f346b.m2847O().m3214b("GoogleWatermarkGenerator", "Unable to render invalid watermark: " + obj);
            }
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(C1220k.m2824o().getResources(), BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            return bitmapDrawable;
        } catch (Throwable th) {
            this.f346b.m2847O();
            if (C1240o.m3200a()) {
                this.f346b.m2847O().m3212a("GoogleWatermarkGenerator", "Failed to render watermark", th);
            }
            return null;
        }
    }

    /* renamed from: b */
    public String m331b() {
        return "google watermark";
    }

    /* renamed from: c */
    public boolean m332c() {
        return m329a(this.f345a.get("google_watermark"));
    }

    /* renamed from: a */
    private boolean m329a(Object obj) {
        return (obj instanceof String) && StringUtils.isValidString((String) obj);
    }
}

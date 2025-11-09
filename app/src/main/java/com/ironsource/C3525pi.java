package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.ironsource.pi */
/* loaded from: classes2.dex */
public final class C3525pi implements InterfaceC3560qi {

    /* renamed from: a */
    private final InterfaceC3794w8 f10830a;

    public C3525pi() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: b */
    private final Object m11410b(String str) {
        Exception exc;
        File file = new File(str);
        if (file.exists()) {
            Drawable drawableCreateFromPath = Drawable.createFromPath(file.getPath());
            if (drawableCreateFromPath != null) {
                return drawableCreateFromPath;
            }
            exc = new Exception("failed to create a drawable");
        } else {
            exc = new Exception("file does not exists");
        }
        return o00O0.o000OOo.OooO0O0(exc);
    }

    /* renamed from: c */
    private final Object m11411c(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        InputStream inputStreamMo9660a = this.f10830a.mo9660a(str);
        try {
            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamMo9660a, new File(str).getName());
            o0OO0O0.OooOO0(inputStreamMo9660a, null);
            return drawableCreateFromStream == null ? o00O0.o000OOo.OooO0O0(new Exception("failed to create a drawable")) : drawableCreateFromStream;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0OO0O0.OooOO0(inputStreamMo9660a, th);
                throw th2;
            }
        }
    }

    /* renamed from: d */
    private final boolean m11412d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.InterfaceC3560qi
    /* renamed from: a */
    public Object mo11413a(String url) {
        kotlin.jvm.internal.OooOo.OooO0o0(url, "url");
        try {
            return m11412d(url) ? m11411c(url) : m11410b(url);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return o00O0.o000OOo.OooO0O0(e);
        }
    }

    public C3525pi(InterfaceC3794w8 connectionFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(connectionFactory, "connectionFactory");
        this.f10830a = connectionFactory;
    }

    public /* synthetic */ C3525pi(InterfaceC3794w8 interfaceC3794w8, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? C3284ka.f9253a : interfaceC3794w8);
    }
}

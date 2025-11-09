package com.iab.omid.library.unity3d.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

/* renamed from: com.iab.omid.library.unity3d.devicevolume.d */
/* loaded from: classes2.dex */
public final class C2586d extends ContentObserver {

    /* renamed from: a */
    private final Context f3740a;

    /* renamed from: b */
    private final AudioManager f3741b;

    /* renamed from: c */
    private final C2583a f3742c;

    /* renamed from: d */
    private final InterfaceC2585c f3743d;

    /* renamed from: e */
    private float f3744e;

    public C2586d(Handler handler, Context context, C2583a c2583a, InterfaceC2585c interfaceC2585c) {
        super(handler);
        this.f3740a = context;
        this.f3741b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f3742c = c2583a;
        this.f3743d = interfaceC2585c;
    }

    /* renamed from: a */
    private float m4523a() {
        return this.f3742c.m4520a(this.f3741b.getStreamVolume(3), this.f3741b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m4525b() {
        this.f3743d.mo4522a(this.f3744e);
    }

    /* renamed from: c */
    public void m4526c() {
        this.f3744e = m4523a();
        m4525b();
        this.f3740a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m4527d() {
        this.f3740a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fM4523a = m4523a();
        if (m4524a(fM4523a)) {
            this.f3744e = fM4523a;
            m4525b();
        }
    }

    /* renamed from: a */
    private boolean m4524a(float f) {
        return f != this.f3744e;
    }
}

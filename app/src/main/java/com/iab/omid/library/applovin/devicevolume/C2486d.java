package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

/* renamed from: com.iab.omid.library.applovin.devicevolume.d */
/* loaded from: classes2.dex */
public final class C2486d extends ContentObserver {

    /* renamed from: a */
    private final Context f3469a;

    /* renamed from: b */
    private final AudioManager f3470b;

    /* renamed from: c */
    private final C2483a f3471c;

    /* renamed from: d */
    private final InterfaceC2485c f3472d;

    /* renamed from: e */
    private float f3473e;

    public C2486d(Handler handler, Context context, C2483a c2483a, InterfaceC2485c interfaceC2485c) {
        super(handler);
        this.f3469a = context;
        this.f3470b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f3471c = c2483a;
        this.f3472d = interfaceC2485c;
    }

    /* renamed from: a */
    private float m4014a() {
        return this.f3471c.m4011a(this.f3470b.getStreamVolume(3), this.f3470b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m4016b() {
        this.f3472d.mo4013a(this.f3473e);
    }

    /* renamed from: c */
    public void m4017c() {
        this.f3473e = m4014a();
        m4016b();
        this.f3469a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m4018d() {
        this.f3469a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fM4014a = m4014a();
        if (m4015a(fM4014a)) {
            this.f3473e = fM4014a;
            m4016b();
        }
    }

    /* renamed from: a */
    private boolean m4015a(float f) {
        return f != this.f3473e;
    }
}

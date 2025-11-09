package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.services.core.device.MimeTypes;

/* renamed from: com.iab.omid.library.ironsrc.devicevolume.d */
/* loaded from: classes2.dex */
public final class C2537d extends ContentObserver {

    /* renamed from: a */
    private final Context f3604a;

    /* renamed from: b */
    private final AudioManager f3605b;

    /* renamed from: c */
    private final C2534a f3606c;

    /* renamed from: d */
    private final InterfaceC2536c f3607d;

    /* renamed from: e */
    private float f3608e;

    public C2537d(Handler handler, Context context, C2534a c2534a, InterfaceC2536c interfaceC2536c) {
        super(handler);
        this.f3604a = context;
        this.f3605b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f3606c = c2534a;
        this.f3607d = interfaceC2536c;
    }

    /* renamed from: a */
    private float m4267a() {
        return this.f3606c.m4264a(this.f3605b.getStreamVolume(3), this.f3605b.getStreamMaxVolume(3));
    }

    /* renamed from: b */
    private void m4269b() {
        this.f3607d.mo4266a(this.f3608e);
    }

    /* renamed from: c */
    public void m4270c() {
        this.f3608e = m4267a();
        m4269b();
        this.f3604a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: d */
    public void m4271d() {
        this.f3604a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fM4267a = m4267a();
        if (m4268a(fM4267a)) {
            this.f3608e = fM4267a;
            m4269b();
        }
    }

    /* renamed from: a */
    private boolean m4268a(float f) {
        return f != this.f3608e;
    }
}

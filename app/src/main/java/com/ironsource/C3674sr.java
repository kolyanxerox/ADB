package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.sr */
/* loaded from: classes2.dex */
public final class C3674sr implements InterfaceC3749uw {

    /* renamed from: a */
    private final C3083en f11930a;

    /* renamed from: com.ironsource.sr$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final a f11931a = new a();

        public a() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3797wb.f12445a.m12870d("Load task config is null");
        }
    }

    public C3674sr(C3083en c3083en) {
        this.f11930a = c3083en;
    }

    @Override // com.ironsource.InterfaceC3749uw
    /* renamed from: a */
    public void mo8283a() {
        m12724a(this.f11930a != null, a.f11931a);
    }
}

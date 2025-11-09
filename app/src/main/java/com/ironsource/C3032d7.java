package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;

/* renamed from: com.ironsource.d7 */
/* loaded from: classes2.dex */
public final class C3032d7 implements InterfaceC3749uw {

    /* renamed from: a */
    private final C3083en f7886a;

    /* renamed from: b */
    private final AdSize f7887b;

    /* renamed from: com.ironsource.d7$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final a f7888a = new a();

        public a() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3797wb.f12445a.m12862a("Load task config is null");
        }
    }

    /* renamed from: com.ironsource.d7$b */
    public static final class b extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {

        /* renamed from: a */
        public static final b f7889a = new b();

        public b() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3797wb.f12445a.m12878l();
        }
    }

    public C3032d7(C3083en c3083en, AdSize adSize) {
        this.f7886a = c3083en;
        this.f7887b = adSize;
    }

    @Override // com.ironsource.InterfaceC3749uw
    /* renamed from: a */
    public void mo8283a() {
        m12724a(this.f7886a != null, a.f7888a);
        m12724a(this.f7887b != null, b.f7889a);
    }
}

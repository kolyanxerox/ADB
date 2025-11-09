package com.ironsource;

import android.view.View;

/* renamed from: com.ironsource.ax */
/* loaded from: classes2.dex */
public final class C2953ax extends AbstractC3231iq {

    /* renamed from: f */
    public static final a f7566f = new a(null);

    /* renamed from: g */
    private static final String f7567g = "ViewVisibilityTrigger";

    /* renamed from: d */
    private final b f7568d;

    /* renamed from: e */
    private final C3023cx f7569e;

    /* renamed from: com.ironsource.ax$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.ax$b */
    public static final class b implements InterfaceC3707tp {
        public b() {
        }

        @Override // com.ironsource.InterfaceC3707tp
        /* renamed from: a */
        public void mo7854a(boolean z) {
            C2953ax.this.m9375a(!z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2953ax(View view) {
        super(false, 1, null);
        kotlin.jvm.internal.OooOo.OooO0o0(view, "view");
        b bVar = new b();
        this.f7568d = bVar;
        C3023cx c3023cx = new C3023cx(bVar);
        this.f7569e = c3023cx;
        c3023cx.m8249a(view);
        m9375a(!c3023cx.m8251c());
    }

    @Override // com.ironsource.AbstractC3231iq
    /* renamed from: b */
    public String mo7852b() {
        return f7567g;
    }

    /* renamed from: e */
    public final void m7853e() {
        this.f7569e.m8250b();
    }
}

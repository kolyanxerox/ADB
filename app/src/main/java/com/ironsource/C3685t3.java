package com.ironsource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.t3 */
/* loaded from: classes2.dex */
public final class C3685t3 implements InterfaceC3352m4 {

    /* renamed from: com.ironsource.t3$a */
    public static final class a implements LifecycleEventObserver {

        /* renamed from: a */
        private final InterfaceC3737uk f11994a;

        /* renamed from: com.ironsource.t3$a$a */
        public /* synthetic */ class C4587a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f11995a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f11995a = iArr;
            }
        }

        public a(InterfaceC3737uk listener) {
            kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
            this.f11994a = listener;
        }

        /* renamed from: a */
        public static final void m12359a(Lifecycle.Event event, a this$0) {
            kotlin.jvm.internal.OooOo.OooO0o0(event, "$event");
            kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
            int i = C4587a.f11995a[event.ordinal()];
            if (i == 1) {
                this$0.f11994a.mo4892c();
                return;
            }
            if (i == 2) {
                this$0.f11994a.mo4890a();
            } else if (i == 3) {
                this$0.f11994a.mo4893d();
            } else {
                if (i != 4) {
                    return;
                }
                this$0.f11994a.mo4891b();
            }
        }

        public boolean equals(Object obj) {
            InterfaceC3737uk interfaceC3737uk = this.f11994a;
            a aVar = obj instanceof a ? (a) obj : null;
            return kotlin.jvm.internal.OooOo.OooO00o(interfaceC3737uk, aVar != null ? aVar.f11994a : null);
        }

        public int hashCode() {
            return this.f11994a.hashCode();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            kotlin.jvm.internal.OooOo.OooO0o0(source, "source");
            kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new o00000O0(0, event, this), 0L, 2, null);
        }
    }

    /* renamed from: c */
    public static final void m12357c(InterfaceC3737uk observer) {
        kotlin.jvm.internal.OooOo.OooO0o0(observer, "$observer");
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(new a(observer));
    }

    /* renamed from: d */
    public static final void m12358d(InterfaceC3737uk observer) {
        kotlin.jvm.internal.OooOo.OooO0o0(observer, "$observer");
        ProcessLifecycleOwner.Companion.get().getLifecycle().removeObserver(new a(observer));
    }

    @Override // com.ironsource.InterfaceC3352m4
    /* renamed from: a */
    public void mo9735a(InterfaceC3737uk observer) {
        kotlin.jvm.internal.OooOo.OooO0o0(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new o00000(observer, 0), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3352m4
    /* renamed from: b */
    public void mo9736b(InterfaceC3737uk observer) {
        kotlin.jvm.internal.OooOo.OooO0o0(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new o00000(observer, 1), 0L, 2, null);
    }
}

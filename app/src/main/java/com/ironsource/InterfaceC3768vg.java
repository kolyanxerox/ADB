package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* renamed from: com.ironsource.vg */
/* loaded from: classes2.dex */
public interface InterfaceC3768vg<T> {

    /* renamed from: com.ironsource.vg$a */
    public static class a<ListenerType> implements InterfaceC3768vg<ListenerType> {

        /* renamed from: a */
        private ListenerType f12365a;

        /* renamed from: com.ironsource.vg$a$a, reason: collision with other inner class name */
        public static final class C4588a extends AbstractRunnableC3302ks {

            /* renamed from: a */
            final /* synthetic */ Runnable f12366a;

            public C4588a(Runnable runnable) {
                this.f12366a = runnable;
            }

            @Override // com.ironsource.AbstractRunnableC3302ks
            /* renamed from: a */
            public void mo8710a() {
                this.f12366a.run();
            }
        }

        /* renamed from: a */
        public final ListenerType m12780a() {
            return this.f12365a;
        }

        /* renamed from: b */
        public final void m12783b(ListenerType listenertype) {
            this.f12365a = listenertype;
        }

        /* renamed from: a */
        public static /* synthetic */ void m12779a(a aVar, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.m12781a(runnable, z);
        }

        @Override // com.ironsource.InterfaceC3768vg
        /* renamed from: a */
        public void mo12778a(ListenerType listenertype) {
            this.f12365a = listenertype;
        }

        /* renamed from: a */
        public final void m12781a(Runnable runnable, boolean z) {
            kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
            if (z) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C4588a(runnable), 0L, 2, null);
            }
        }

        /* renamed from: a */
        public final void m12782a(String instanceId, String message) {
            kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
            kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }
    }

    /* renamed from: a */
    void mo12778a(T t);
}

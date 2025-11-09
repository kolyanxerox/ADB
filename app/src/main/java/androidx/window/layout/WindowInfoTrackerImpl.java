package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.core.text.HtmlCompat;
import androidx.core.util.Consumer;
import androidx.window.layout.adapter.WindowBackend;
import kotlin.jvm.internal.Oooo000;
import o000O00.o00O0O0O;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0oOo.o000O0O0;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import o00O0ooo.o0O0000O;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00OO000.Oooo0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    @OooO(m13471c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", m13472f = "WindowInfoTrackerImpl.kt", m13473l = {50}, m13474m = "invokeSuspend")
    /* renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1 */
    public static final class C08591 extends OooOOOO implements o00O0O {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$2 */
        public static final class AnonymousClass2 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ Consumer<WindowLayoutInfo> $listener;
            final /* synthetic */ WindowInfoTrackerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(WindowInfoTrackerImpl windowInfoTrackerImpl, Consumer<WindowLayoutInfo> consumer) {
                super(0);
                this.this$0 = windowInfoTrackerImpl;
                this.$listener = consumer;
            }

            @Override // o00O0Oo.OooO0O0
            public /* bridge */ /* synthetic */ Object invoke() {
                m13539invoke();
                return OooOo.f33195OooO00o;
            }

            /* renamed from: invoke */
            public final void m13539invoke() {
                this.this$0.windowBackend.unregisterLayoutChangeCallback(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08591(Context context, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$context = context;
        }

        public static final void invokeSuspend$lambda$0(o00oOoo o00oooo, WindowLayoutInfo windowLayoutInfo) {
            ((o0O0ooO) o00oooo).OooO(windowLayoutInfo);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C08591 c08591 = WindowInfoTrackerImpl.this.new C08591(this.$context, oooO0OO);
            c08591.L$0 = obj;
            return c08591;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o00oOoo o00oooo = (o00oOoo) this.L$0;
                OooO00o oooO00o = new OooO00o(o00oooo, 0);
                WindowInfoTrackerImpl.this.windowBackend.registerLayoutChangeCallback(this.$context, new androidx.arch.core.executor.OooO00o(2), oooO00o);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(WindowInfoTrackerImpl.this, oooO00o);
                this.label = 1;
                if (o00O0O0O.OooO00o(o00oooo, anonymousClass2, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o00oOoo o00oooo, OooO0OO oooO0OO) {
            return ((C08591) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", m13472f = "WindowInfoTrackerImpl.kt", m13473l = {HtmlCompat.FROM_HTML_MODE_COMPACT}, m13474m = "invokeSuspend")
    /* renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2 */
    public static final class C08602 extends OooOOOO implements o00O0O {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2$2 */
        public static final class AnonymousClass2 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ Consumer<WindowLayoutInfo> $listener;
            final /* synthetic */ WindowInfoTrackerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(WindowInfoTrackerImpl windowInfoTrackerImpl, Consumer<WindowLayoutInfo> consumer) {
                super(0);
                this.this$0 = windowInfoTrackerImpl;
                this.$listener = consumer;
            }

            @Override // o00O0Oo.OooO0O0
            public /* bridge */ /* synthetic */ Object invoke() {
                m13540invoke();
                return OooOo.f33195OooO00o;
            }

            /* renamed from: invoke */
            public final void m13540invoke() {
                this.this$0.windowBackend.unregisterLayoutChangeCallback(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08602(Activity activity, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$activity = activity;
        }

        public static final void invokeSuspend$lambda$0(o00oOoo o00oooo, WindowLayoutInfo windowLayoutInfo) {
            ((o0O0ooO) o00oooo).OooO(windowLayoutInfo);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C08602 c08602 = WindowInfoTrackerImpl.this.new C08602(this.$activity, oooO0OO);
            c08602.L$0 = obj;
            return c08602;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o00oOoo o00oooo = (o00oOoo) this.L$0;
                OooO00o oooO00o = new OooO00o(o00oooo, 1);
                WindowInfoTrackerImpl.this.windowBackend.registerLayoutChangeCallback(this.$activity, new androidx.arch.core.executor.OooO00o(2), oooO00o);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(WindowInfoTrackerImpl.this, oooO00o);
                this.label = 1;
                if (o00O0O0O.OooO00o(o00oooo, anonymousClass2, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o00oOoo o00oooo, OooO0OO oooO0OO) {
            return ((C08602) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        kotlin.jvm.internal.OooOo.OooO0o0(windowMetricsCalculator, "windowMetricsCalculator");
        kotlin.jvm.internal.OooOo.OooO0o0(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public o0OoOoOo windowLayoutInfo(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        o0O0000O o0o0000oOooO0oo = o0o0000.OooO0oo(new C08591(context, null));
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        return o0o0000.OooOOOO(o0o0000oOooO0oo, Oooo0.f31951OooO00o);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public o0OoOoOo windowLayoutInfo(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        o0O0000O o0o0000oOooO0oo = o0o0000.OooO0oo(new C08602(activity, null));
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        return o0o0000.OooOOOO(o0o0000oOooO0oo, Oooo0.f31951OooO00o);
    }
}
